package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import br.thony.fateczl.crudaluguel.model.Livro;

public class LivroDao implements ILivroDao, ICRUDDao<Livro> {

    @Override
    public LivroDao open() throws SQLException {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void insert(Livro livro) throws SQLException {

    }

    @Override
    public int update(Livro livro) throws SQLException {
        return 0;
    }

    @Override
    public void delete(Livro livro) throws SQLException {

    }

    @Override
    public Livro findOne(Livro livro) throws SQLException {
        return null;
    }

    @Override
    public List<Livro> findAll() throws SQLException {
        return Collections.emptyList();
    }
}
