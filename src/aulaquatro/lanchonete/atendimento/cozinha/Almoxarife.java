package aulaquatro.lanchonete.atendimento.cozinha;

public class Almoxarife {

    //pode ser private
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    //pode ser private
    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    //pode ser default
    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        //...?
        controlarSaida();
    }

    //pode ser default
    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}