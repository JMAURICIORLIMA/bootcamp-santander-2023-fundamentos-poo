# Programação Orientada a Objetos

## Aula 01
### Orientação a Objetos

Você já ouviu falar a expressão, linguagem de baixo e de alto nível?

À medida que a tecnologia vem evoluindo, as linguagens de programação também, e é esta transição natural que determina,
quando estamos nos referindo a linguagem de baixo e alto nível.

**Baixo nível**: São linguagens que estão mais próximas da interpretação da máquina, diante do algoritmo desenvolvido.
Exemplo: **Linguagem Assembly e C**.

**Alto nível**: São linguagens que disponibilizam uma proposta de sintaxe (forma de escrever processos para serem
executados pelo computador) mais próxima da interpretação humana. Exemplo: **Java, JavaScript, Python e C++**

Exemplo de um simples `Hello World` em **Assembly** versus **Python**:

Assembly
```assembly
section	.text

   global _start   

_start: 

   mov	edx, len  

   mov	ecx, msg  

   mov	ebx, 1 

   mov	eax, 4  

   int	0x80   

   mov	eax, 1 

   int	0x80   

section	.data

msg	db	'Hello, world!',0xa

len	equ	$ - msg

```
Java
```java
System.out.print("Hello, world!");
```
Python
```python
print('Hello, world!')
```

> É bem notória a diferença entre as duas perspectivas de linguagem.

### Programação estruturada

A programação estruturada é um **paradigma de programação**, que visa melhorar a clareza, a qualidade e o tempo de
desenvolvimento de um **programa de computador**, fazendo uso extensivo, das construções de fluxo de controle
estruturado de seleção ( **if / then / else** ) e repetição (**while e for** ), **estruturas de bloco** e **sub -
rotinas**.

O que devemos ter em mente, é que na programação estruturada, implementamos algoritmos com estruturas sequenciais
denominados de procedimentos lineares, podendo afetar o valor das variáveis de escopo local ou global em uma aplicação.

### Programação orientada a objetos

POO é um **paradigma de programação**, baseado no conceito de "**objetos**", que podem conter **dados** na forma de
**campos**, também conhecidos como atributos, e códigos, na forma de **procedimentos**, também conhecidos como métodos.

O que precisamos entender, é que cada vez mais as linguagens se adequam ao cenário real, proporcionando assim, que o
programador desenvolva algoritmos mais próximo de fluxos comportamentais, logo, tudo ao nosso redor é representado como
Objeto.
 
> Enquanto a programação estruturada é voltada a procedimentos e funções definidas pelo usuário, a programação orientada
> a objetos é voltada a conceitos, como o de classes e objetos.

## Aula 02
### Classes e Objetos

Para compreendermos exatamente do que se trata a orientação a objetos, vamos entender quais são os requerimentos de uma
linguagem para ser considerada nesse paradigma. Para isso, a linguagem precisa atender sobre o conceito de classes e os
quatro pilares da orientação a objetos.

Primeiramente, devemos compreender que o conceito orientado a objetos, recomenda que toda estrutura de nosso código
baseada a objeto seja um **Identificador**, **Características** e **Comportamentos**.

Toda a estrutura de código na linguagem Java é distribuído em arquivos com extensão **.java** denominados de **classe**.

As classes existentes em nosso projeto, serão composta por:

**Identificador**, **Características** e **Comportamentos**.

* **Classe** (class): A estrutura e/ou representação que direciona a criação dos objetos de mesmo tipo.
* **Identificador** (identity): Propósito existencial aos objetos que serão criados.
* **Características** (states): Também conhecido como atributos ou propriedades, é toda informação que representa o
estado do objeto.
* **Comportamentos** (behavior): Também conhecido como ações ou métodos, é toda parte comportamental que um objeto
dispõe.
* **Instanciar** (new): É o ato de criar um objeto a partir de estrutura, definida em uma classe. 


### Estrutura

Para ilustrar as etapas de desenvolvimento orientada a objetos em Java, iremos reproduzir a imagem abaixo em forma de
código para explicar que primeiro criamos a estrutura correspondente, para assim criá-los com as características e a
possibilidade de realização de ações (comportamentos), como se fosse no "mundo real".

![ilustração_de_poo](https://sintaxe.netlify.app/assets/poo-1.540cde34.png)

```java
// Criando a classe Student
// Com todas as características e compartamentos aplicados
public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Lunch lunch){
      //NOSSO CÓDIGO AQUI
    }
    void drinking(Juice juice){
      //NOSSO CÓDIGO AQUI
    }
    void running(){
      //NOSSO CÓDIGO AQUI
    }
}
```
#
### Instâncias

Uma instância é ação de criar um objeto. Quando dizemos que `John` pertence a classe `Student`, podemos dizer que `John`
é uma instância da classe `Student`, da mesma forma, `Sophia` e `Lily` também são instâncias da classe `Student`.

```java
// Criando objetos a partir da classe Student
public class School {
    public static void main(String[] args) throws Exception {
      Student student1 = new Student(); 
      student1.name= "John";
      student1.age= 12;
      student1.color= Color.FAIR;
      student1.sex= Sex.MALE;

      Student student2 = new Student();
      student2.name= "Sophia";
      student2.age= 10;
      student2.color= Color.FAIR;
      student2.sex= Sex.FEMALE;

      Student student3 = new Student();
      student3.name= "Lily";
      student3.age= 11;
      student3.color= Color.DARK;
      student3.sex= Sex.FEMALE;
    }
}
```

````
🔔 Atenção

No exemplo acima, NÃO estruturamos a classe Student com o padrão Java Beans getters e setters.
````

Seguindo algumas convenções, as nossas classes são classificadas como:

* **Classe de modelo (model)**: classes que representam estrutura de domínio da aplicação, exemplo: Cliente, Pedido,
Nota Fiscal e etc.
* **Classe de serviço (service)**: classes que contém regras de negócio e validação de nosso sistema.
* **Classe de repositório (repository)**: classes que contém uma integração com banco de dados.
* **Classe de controle (controller)**: classes que possuem a finalidade de disponibilizar alguma comunicação externa, à
nossa aplicação, como http web ou webservices.
* **Classe utilitária (util)**: classe que contém recursos comuns, à toda nossa aplicação.

![imagem_demonstração_aplicação](https://sintaxe.netlify.app/assets/poo-2.81c7d25c.png)

````
🏆 Sucesso

Exercite a distribuição de classes, por papéis dentro da sua aplicação, para que se possa determinar a estrutura mais
conveniente, em cada arquivo do seu projeto.
````

## Aula 03
### Pacotes e Importações

A linguagem Java, é composta por milhares de classes, com as finalidades de por exemplo: Classes de tipos de dados,
representação de texto, números, datas, arquivos e diretórios, conexão com banco de dados, entre outras. Imagina todas
estas classes, existindo em um único nível de documentos? E as classes desenvolvidas por nós meros desenvolvedores nas
aplicações de variadas finalidades? Imagina como ficaria este diretório **hein!?**

### Conceito 

![img-exemplo-area_de_trabalho_desorganizada](https://sintaxe.netlify.app/assets/poo-3.c92c55d7.png)

Para prevenir este acontecimento, a linguagem dispõe de um recurso que organiza as classes padrões versus as criadas
por nós ou pelo resto do mundo que conheceremos a partir de agora como pacote (package). Os pacotes são subdiretórios,
a partir da pasta src do nosso projeto, onde estão localizadas as classes da linguagem e novas que forem criadas para o
projeto. Existem algumas convenções para criação de pacotes já utilizadas no mercado.

![img-exemplo-organização_de_pacotes](https://sintaxe.netlify.app/assets/poo-4.c7395835.png)

### Ilustração

Vamos imaginar, que sua empresa se chama **Power Soft** e ela está desenvolvendo software comercial, governamental e um
software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:

* **Comercial**: com.powersoft;
* **Governamental**: gov.powersoft;
* **Código aberto**: org.powersoft.

Bem, acima já podemos perceber que existe uma definição, para o uso do nome dos pacotes, porém, podemos organizar ainda
mais um pouco as nossas classes, mediante a proposta de sua existência:

* **model**: Classes que representam a camada e modelo da aplicação : Cliente, Pedido, NotaFiscal, Usuario;
* **repository**: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados:
ClienteRepository;
* **service**: Classes que contém regras de negócio do sistema : ClienteService possui o método validar o CPF, do
cliente cadastrado;
* **controller**: Classes que possuem a finalidade de, disponibilizar os nossos recursos da aplicação, para outras
aplicações via padrão HTTP;
* **view**: Classes que possuem alguma interação, com a interface gráfica acessada pelo usuário;
* **util**: Pacote que contém, classes utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil.

### Identificação

Uma das características de uma classe é a sua identificação: Cliente, NotaFiscal, TituloPagar. Porém quando esta classe
é organizada por pacotes, ela passa a ter duas identificações. O nome simples (**próprio nome**) e agora o nome
qualificado (**endereçamento do pacote + nome**), exemplo: Considere a classe `Usuario`, que está endereçada no pacote
`com.controle.acesso.model`, o nome qualificado desta classe é  **com.controle.acesso.model.Usuario**.

### package vs import

A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém, uma definição de
package no arquivo, sempre na primeira linha do código. Para a utilização de classes existentes em outros pacotes,
necessitamos realizar a importação das mesmas seguindo a recomendação abaixo:

```java
package

import ... 
import ...

public class MinhaClasse {
}
```

### Por que é tão importante compreender de pacotes?

A linguagem Java, é composta por milhares de classes internas, classes desenvolvidas em projetos disponíveis através de
bibliotecas e as classes do nosso projeto. Logo, existe uma enorme possibilidade da existência de classes de mesmo nome.

É nesta hora, que nós desenvolvedores precisamos detectar, qual classe iremos importar em nosso projeto.

Um exemplo clássico é, a existência das classes **java.sql.Date** e **java.util.Date** da própria linguagem, recomendo
você leitor, pesquisar sobre a diferença das duas classes.

## Aula 04
### Modificadores

Em Java, utilizamos três palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir os
quatro tipo de visibilidade de atributos, métodos e até mesmo classes, no que se refere ao acesso por outras classes.
Iremos ilustrar do mais visível ao mais restrito tipo de visibilidade nos arquivos em nosso projeto.

Para uma melhor ilustração iremos representar os conceitos de visibilidade de recursos através do contexto em uma
lanchonete que vende lanche natural e suco.

![img-exemplo-abstração_de_atendimento_de_lanchonete](https://sintaxe.netlify.app/assets/modificadores-1.69c5be68.png)

````
ℹ️ Informação

Primeiro, iremos criar o pacote lanchonete
````
```java
package lanchonete;

public class Estabelecimento {
  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();
    //ações que não precisam estarem disponíveis para toda a aplicação
    cozinheiro.lavarIngredientes();
    cozinheiro.baterVitaminaLiquidificador();
    cozinheiro.selecionarIngredientesVitamina();
    cozinheiro.prepararLanche();
    cozinheiro.prepararVitamina();
    cozinheiro.prepararVitamina();

    //ações que estabelecimento precisa ter ciência
    cozinheiro.adicionarSucoNoBalcao();;
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Almoxarife almoxarife = new Almoxarife();
    //ações que não precisam estarem disponíveis para toda a aplicação
    almoxarife.controlarEntrada();
    almoxarife.controlarSaida();
    //ação que somente o seu pacote cozinha precisa conhecer (default)
    almoxarife.entregarIngredientes();
    almoxarife.trocarGas();

    Atendente atendente = new Atendente();
    atendente.pegarPedidoBalcao();
    atendente.receberPagamento();
    atendente.servindoMesa();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

    //não deveria, mas o estabelecimento
    //ainda não definiu normas de atendimento
    cliente.pegarPedidoBalcao();

    //esta ação é muito sigilosa, qua tal ser privada ?
    cliente.consultarSaldoAplicativo();

    //já pensou os clientes ouvindo que o gás acabou ?
    cozinheiro.pedirParaTrocarGas(almoxarife);

  }
}
```
```java
package lanchonete;

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
  public void prepararLanche() {
    System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
  }
  //pode ser private
  public void prepararVitamina() {
    System.out.println("PREPARANDO SUCO");
  }

  //pode ser private
  public void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }
  //pode ser private
  public void selecionarIngredientesLanche() {
    System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
  }
  //pode ser private
  public void selecionarIngredientesVitamina() {
    System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
  }
  //pode ser private
  public void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
  }
  //pode ser private
  public void baterVitaminaLiquidificador() {
    System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
  }
  //pode ser private
  public void fritarIngredientesLanche() {
    System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
  }

  //pode ser default
  public void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }
  //pode ser default
  public void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }
  
}
```
```java
package lanchonete;

public class Almoxarife {
  //pode ser private
  public void controlarEntrada() {
    System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
  }
  //pode ser private
  public void controlarSaida() {
    System.out.println("CONTROLANDO A SAIDA DOS ITENS");
  }
  //pode ser default
  public void entregarIngredientes() {
    System.out.println("ENTREGANDO INGREDIENTES");
    //...?
  }
  //pode ser default
  public void trocarGas() {
    System.out.println("ALMOXARIFE TROCANDO O GÁS");
  }
}
```
```java
package lanchonete;

public class Atendente {

  public void servindoMesa() {
    //...?
    System.out.println("SERVINDO A MESA");
  }
  public void receberPagamento() {
    System.out.println("RECEBENDO PAGAMENTO");
  }

  //poder ser private, complemento do servindo a mesa
  public void pegarPedidoBalcao() {
    System.out.println("PEGANDO O PEDIDO NO BALCÃO");
  }
  
}
```
```java
package lanchonete;

public class Cliente {
  public void escolherLanche() {
    System.out.println("ESCOLHENDO O LANCHE");
  }
  public void fazerPedido() {
    System.out.println("FAZENDO O PEDIDO");
  }
  public void pagarConta() {
    System.out.println("PAGANDO A CONTA");
  }
  public void pegarPedidoBalcao() {
    System.out.println("PEGANDO O PEDIDO NO BALCÃO");
  }

  //poder ser private
  public void consultarSaldoAplicativo() {
    System.out.println("CONSULTANDO SALDO NO APLICATIVO");
  }
}
```
````
📌 Para fixar

Acredite! Nem tudo precisa ser visto por todos. 😉
````

### Modificador default

O modificador `default`, está fortemente associado a organização das classes por pacotes ONDE algumas implementações
não precisam estar disponíveis para todo o projeto, e este modificador de acesso, restringe a visibilidade por pacotes.

Dentro do pacote `lanchonete`, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

* **lanchonete.atendimento.cozinha**: Pacote que contém classes da parte da cozinha da lanchonete e atendimentos.
* **lanchonete.area.cliente**: Pacote que contém classes relacionadas ao espaço do cliente.

Após criar os pacotes, em sua IDE mova as as classes conforme imagem ilustrativa abaixo:

![img](https://sintaxe.netlify.app/assets/modificadores-2.a3304398.jpeg)

#### Hora de praticar a visibilidade de nossos recursos

```java
// Cozinheiro.java

//ANTES
public void lavarIngredientes() {
   System.out.println("LAVANDO INGREDIENTES");
}

//nível de pacote
//sem nenhuma palavra reservada de acesso
void lavarIngredientes() {
   System.out.println("LAVANDO INGREDIENTES");
}
```
````
🔔 Atenção

Alguns erros poderão ser apresentados na sua tela, não se preocupe iremos corrigí-los.
````

### Modificador private

Depois de reestruturar nosso estabelecimento (projeto), onde temos as divisões (pacotes), espaço do cliente e
atendimento, chegou a hora de uma reflexão sobre visibilidade ou modificadores de acesso.

Conhecemos as ações disponíveis nas classes `Cozinheiro, Almoxarife, Atendente e Cliente`, mesmo com a organização da
visibilidade por pacote, será que realmente estas classes precisam ser tão explícitas?

* Será que o `Cozinheiro` precisa saber que\como o `Almoxarife` controla as entradas e saídas ?
* Que o `Cliente` precisa saber como o `Atendente` recebe o pedido para servir sua mesa ?
* Que o `Atendente` precisa saber que antes de pagar o `Cliente` consulta o saldo no App ?

Diante destes questionamentos, é que nossas classes precisam continuar mantendo suas ações (métodos), mas nem todas
precisam ser vistas por alguém.

````
✔️ Conclusão

A visibilidade de recursos da linguagem não está associada a interface gráfica, mas sim, o que as classes conseguem
acessar umas das outras.😏
````

### Modificador protected

O que precisamos compreender sobre o modificador `protected` inicialmente? Que o mesmo está fortemente relacionado a
herança, um dos princípios disponível no conceito de P O O - Paradígma da Orientação à Objetos.