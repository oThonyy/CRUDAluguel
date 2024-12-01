package br.thony.fateczl.crudaluguel.model;

public class Exemplar {

    private int codigo;
    private String nome;
    private int qntPaginas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntPaginas() {
        return qntPaginas;
    }

    public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
    }

    @Override
    public String toString() {
        return "Exemplar{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", qntPaginas=" + qntPaginas +
                '}';
    }
}
