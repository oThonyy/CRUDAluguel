package br.thony.fateczl.crudaluguel.model;

public class Revista {

    private String ISSN;

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "ISSN='" + ISSN + '\'' +
                '}';
    }
}
