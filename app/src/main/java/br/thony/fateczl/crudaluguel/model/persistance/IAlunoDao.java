package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;

public interface IAlunoDao {

    public AlunoDao open() throws SQLException;

    public void close();
}
