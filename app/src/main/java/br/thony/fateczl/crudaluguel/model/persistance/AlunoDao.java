package br.thony.fateczl.crudaluguel.model.persistance;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import br.thony.fateczl.crudaluguel.model.Aluno;

public class AlunoDao implements IAlunoDao, ICRUDDao<Aluno> {


    @Override
    public AlunoDao open() throws SQLException {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void insert(Aluno aluno) throws SQLException {

    }

    @Override
    public int update(Aluno aluno) throws SQLException {
        return 0;
    }

    @Override
    public void delete(Aluno aluno) throws SQLException {

    }

    @Override
    public Aluno findOne(Aluno aluno) throws SQLException {
        return null;
    }

    @Override
    public List<Aluno> findAll() throws SQLException {
        return Collections.emptyList();
    }
}
