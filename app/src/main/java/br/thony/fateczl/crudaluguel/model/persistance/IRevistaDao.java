package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;

public interface IRevistaDao {

    public RevistaDao open() throws SQLException;

    public void close();

}
