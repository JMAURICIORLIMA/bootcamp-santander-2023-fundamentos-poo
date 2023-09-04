package aulaquatro.lanchonete.atendimento.cozinha;

public class Cozinheiro {

    //pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
    }
    //pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    //pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    //pode ser private
    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
    }
    //pode ser private
    private void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    //pode ser private
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    //pode ser private
    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }
    //pode ser private
    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }
    //pode ser private
    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }
    //pode ser private
    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    //pode ser private
    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
    }

    //pode ser default
    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    //pode ser default
    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

}