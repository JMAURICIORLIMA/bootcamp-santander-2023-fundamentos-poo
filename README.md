# Programação Orientada a Objetos

## Orientação a Objetos

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


## Classes e Objetos

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