package br.thony.fateczl.crudaluguel.model;

import java.time.LocalDate;

public class Aluguel {

    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "dataRetirada=" + dataRetirada +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
