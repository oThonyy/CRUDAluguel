package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;

public interface IAluguelDao {

    public AluguelDao open() throws SQLException;

    public void close();

}
