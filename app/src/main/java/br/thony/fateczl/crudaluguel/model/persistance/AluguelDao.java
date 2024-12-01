package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import br.thony.fateczl.crudaluguel.model.Aluguel;

public class AluguelDao implements IAluguelDao, ICRUDDao<Aluguel> {

    @Override
    public AluguelDao open() throws SQLException {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void insert(Aluguel aluguel) throws SQLException {

    }

    @Override
    public int update(Aluguel aluguel) throws SQLException {
        return 0;
    }

    @Override
    public void delete(Aluguel aluguel) throws SQLException {

    }

    @Override
    public Aluguel findOne(Aluguel aluguel) throws SQLException {
        return null;
    }

    @Override
    public List<Aluguel> findAll() throws SQLException {
        return Collections.emptyList();
    }
}
