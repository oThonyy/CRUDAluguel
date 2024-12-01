package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;

public interface ILivroDao {

    public LivroDao open() throws SQLException;

    public void close();

}
