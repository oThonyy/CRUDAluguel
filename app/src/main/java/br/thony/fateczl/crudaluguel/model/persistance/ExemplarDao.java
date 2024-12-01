package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import br.thony.fateczl.crudaluguel.model.Exemplar;

public class ExemplarDao implements IExemplarDao, ICRUDDao<Exemplar>{

    @Override
    public ExemplarDao open() throws SQLException {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void insert(Exemplar exemplar) throws SQLException {

    }

    @Override
    public int update(Exemplar exemplar) throws SQLException {
        return 0;
    }

    @Override
    public void delete(Exemplar exemplar) throws SQLException {

    }

    @Override
    public Exemplar findOne(Exemplar exemplar) throws SQLException {
        return null;
    }

    @Override
    public List<Exemplar> findAll() throws SQLException {
        return Collections.emptyList();
    }
}
