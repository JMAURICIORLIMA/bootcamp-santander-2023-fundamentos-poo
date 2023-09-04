package aulaseis.construtor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Criamos um objeto LocalDate representando a data que desejamos formatar.
 * Em seguida, criamos um DateTimeFormatter usando o padrão "dd/MM/yyyy" para o formato brasileiro de data.
 * Usamos new Locale("pt", "BR") para definir o locale como português do Brasil, o que garante que os nomes dos meses e outros detalhes sejam formatados de acordo com o padrão brasileiro.
 * Utilizamos o método format() para formatar a data usando o formatador e armazenamos o resultado em uma string.
 * Imprimimos a data formatada.
 */
public class ConstrutorPessoa {
    public static void main(String[] args) {
        Pessoa carlos = new Pessoa();
        Pessoa lucas = new Pessoa();
        Pessoa diego = new Pessoa();
        //Existem 3 pessoas no sistema sem nenhuma característica

        System.out.println("Objeto sem parametro");
        System.out.printf("Nome: %s%n", carlos.getNome());
        System.out.println("Idade: " + carlos.dataNascimento);
        System.out.printf("Endereço: %s%n", carlos.getEndereco());
        System.out.printf("Telefone: %d%n", carlos.getTelefone());

        System.out.println("\n-----------------------------------\n");

        LocalDate dataNascimento = LocalDate.of(2000, 10, 25);

        Pessoa carlosComParametros = new Pessoa("Carlos", dataNascimento);

        DateTimeFormatter dataNascimentoFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy",
                new Locale("pt", "BR"));

        String dataFormatada = dataNascimento.format(dataNascimentoFormatada);

        System.out.println("Objeto com parametro");
        System.out.printf("Nome: %s%n", carlosComParametros.getNome());
        System.out.printf("Idade: %s%n", dataFormatada);
        System.out.printf("Endereço: %s%n", carlosComParametros.getEndereco());
        System.out.printf("Telefone: %d%n", carlosComParametros.getTelefone());

    }
}


