package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import br.thony.fateczl.crudaluguel.model.Revista;

public class RevistaDao implements IRevistaDao, ICRUDDao<Revista> {

    @Override
    public RevistaDao open() throws SQLException {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void insert(Revista revista) throws SQLException {

    }

    @Override
    public int update(Revista revista) throws SQLException {
        return 0;
    }

    @Override
    public void delete(Revista revista) throws SQLException {

    }

    @Override
    public Revista findOne(Revista revista) throws SQLException {
        return null;
    }

    @Override
    public List<Revista> findAll() throws SQLException {
        return Collections.emptyList();
    }
}
