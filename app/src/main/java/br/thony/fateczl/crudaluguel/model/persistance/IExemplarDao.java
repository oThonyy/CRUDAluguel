package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;

public interface IExemplarDao {

    public ExemplarDao open() throws SQLException;

    public void close();

}
