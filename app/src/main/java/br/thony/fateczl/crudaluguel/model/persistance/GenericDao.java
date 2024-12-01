package br.thony.fateczl.crudaluguel.model.persistance;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GenericDao extends SQLiteOpenHelper {

    private static final String DATABASE = "alugueldb";

    private static final int DATABASE_VER = 1;

    private static final String CREATE_TABLE_ALUNO =
            "CREATE TABLE aluno (" +
                    "RA INT(10) UNIQUE PRIMARY KEY NOT NULL," +
                    "nome VARCHAR(100) NOT NULL," +
                    "email VARCHAR(100) NOT NULL);";

    private static final String CREATE_TABLE_ALUGUEL =
            "CREATE TABLE aluguel (" +
                    "dataRetirada VARCHAR(10) PRIMARY KEY NOT NULL," +
                    "dataDevolucao VARCHAR(10) NOT NULL," +
                    "alunoRA INT(10) NOT NULL," +
                    "exemplarCodigo INT(10) NOT NULL," +
                    "FOREIGN KEY (alunoRA) REFERENCES aluno(alunoRA)," +
                    "FOREIGN KEY (exemplarCodigo) REFERENCES exemplar(exemplarCodigo));";

    private static final String CREATE_TABLE_EXEMPLAR =
            "CREATE TABLE exemplar (" +
                    "codigo INT UNIQUE PRIMARY KEY NOT NULL," +
                    "nome VARCHAR(50) NOT NULL," +
                    "qntPaginas INT(10) NOT NULL);";

    private static final String CREATE_TABLE_LIVRO =
            "CREATE TABLE livro (" +
                    "ISBN CHAR(13) NOT NULL," +
                    "edicao INT(10) NOT NULL," +
                    "exemplarCodigo INT(10) NOT NULL," +
                    "FOREIGN KEY (exemplarCodigo) REFERENCES exemplar(exemplarCodigo));";

    private static final String CREATE_TABLE_REVISTA =
            "CREATE TABLE revista (" +
                    "ISSN CHAR(8) NOT NULL," +
                    "exemplarCodigo INT(10) NOT NULL," +
                    "FOREIGN KEY (exemplarCodigo) REFERENCES exemplar(exemplarCodigo));";


    public GenericDao(Context context) {
        super(context, DATABASE, null, DATABASE_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_ALUNO);
        sqLiteDatabase.execSQL(CREATE_TABLE_EXEMPLAR);
        sqLiteDatabase.execSQL(CREATE_TABLE_ALUGUEL);
        sqLiteDatabase.execSQL(CREATE_TABLE_LIVRO);
        sqLiteDatabase.execSQL(CREATE_TABLE_REVISTA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int antigaVersao, int novaVersao) {
        if (novaVersao > antigaVersao) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS aluno");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS aluguel");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS exemplar");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS livro");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS revista");
            onCreate(sqLiteDatabase);
        }
    }
}
