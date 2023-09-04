package aulaquatro.lanchonete.atendimento;

public class Atendente {

    public void servindoMesa() {
        pegarPedidoBalcao();
        System.out.println("SERVINDO A MESA");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }

    //poder ser private, complemento do servindo a mesa
    private void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCÃO");
    }

}