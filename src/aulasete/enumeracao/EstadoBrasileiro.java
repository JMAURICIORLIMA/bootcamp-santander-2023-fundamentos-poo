package aulasete.enumeracao;

// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", "11"),
    RIO_JANEIRO("RJ", "Rio de Janeiro", "21"),
    PIAUI("PI", "Piauí", "86"),
    MARANHAO("MA", "Maranhão", "99");

    private String nome;
    private String sigla;

    private String ddd;

    private EstadoBrasileiro(String sigla, String nome, String ddd) {
        this.sigla = sigla;
        this.nome = nome;
        this.ddd = ddd;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}