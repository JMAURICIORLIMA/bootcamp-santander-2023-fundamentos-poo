package aulasete.enumeracao;

public class SistemaIbge {

    public static void main(String[] args) {

        for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
            System.out.println(uf.getSigla() + " - " + uf.getNomeMaiusculo() + " - " + uf.getDdd());
        }

        EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;

        System.out.println("O estado selecionado foi: " + ufSelecionado);
    }
}
