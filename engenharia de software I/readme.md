# ATIVIDADE 1 

## Primeiro trecho
We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. 
In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. 
Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

- O trecho ressalta uma distinção importante entre programação e engenharia de software, destacando as diferenças de tempo, escala e os trade-offs envolvidos. Um engenheiro de software deve desenvolver projetos que consigam ter bons desempenhos e alta capacidade de escabilidade, atendendo as demandas e suportando melhorias, sendo elas complexas ou não. 

## Segundo trecho
Within Google, we sometimes say, “Software engineering is programming integrated over time.”
Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place.
If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance).
The addition of time adds an important new dimension to programming. 
Cubes aren’t squares, distance isn’t velocity.
Software engineering isn’t programming.

- A engenharia de software não é sobre apenas criar um software, mas também, seu desenvolvimento, modificação e a manutenção do mesmo. Abrange muito mais que só a programação, é sempre buscar inovar em tecnologias e se adaptar a novas demandas, evidenciando a qualidade e eficiência.

# ATIVIDADE 2

## Comentando trade-offs
*JAVA X PYTHON* <br>
-Desempenho: Java oferece melhor desempenho em termos de velocidade de execução devido à sua natureza compilada. Python é interpretado e não compilado, o que geralmente resulta em uma execução mais lenta. Se o desempenho for crítico, Java pode ser a escolha preferida. <br>
-Escalabilidade: Em Java, sua escalabilidade pode ser mais eficiente para grandes sistemas, pois é possivel escalá-la verticalmente. Python pode ser mais pesado, podendo acabar afetando o sistema. <br>
-Segurança: Java possui um conjunto de recursos de segurança integrados, como controles de acesso a objetos e mecanismos de criptografia. Embora Python também ofereça bibliotecas para segurança, Java tem uma vantagem, especialmente em ambientes corporativos. <br>

*WINDOWS X LINUX* <br>
-Desempenho: Windows geralmente é mais exigente em termos de recursos do sistema, pode ser mais lento em hardware mais antigo. Ele é otimizado para rodar bem em dispositivos modernos, mas pode não ser a escolha ideal para sistemas com recursos limitados. Linux é conhecido por sua eficiência em termos de recursos. <br>
-Segurança: O Windows tem sido mais alvo de malware, vírus e outras ameaças de segurança devido à sua popularidade. Considerado mais seguro por design, Linux tem uma arquitetura de permissões mais robusta e é menos visado por atacantes, em parte devido à sua menor base de usuários. Windows pode ser a melhor escolha se você precisar de suporte de software amplo, integração com outros produtos Microsoft, ou uma interface mais amigável. Linux, por outro lado, oferece maior controle, personalização e segurança. <br>

*ANDROID X IOS* <br>
-Segurança: O Android em sua natureza aberta e a variedade de lojas de aplicativos de terceiros aumentam o risco de malware. iOS é geralmente considerado mais seguro devido ao controle rigoroso da Apple sobre a App Store e as permissões de aplicativos. <br>
-Custo: Android está disponível em uma ampla gama de preços, isso o torna acessível a uma maior variedade de consumidores. Os dispositivos Apple são geralmente mais caros, especialmente os modelos mais recentes e de ponta. Se a flexibilidade e variedade de dispositivos são importantes, o Android pode ser a melhor opção. Por outro lado, se a segurança, a consistência da experiência do usuário, o iOS pode ser a escolha ideal. <br>

# ATIVIDADE 3

## Análise de trade-offs: Arquitetura Netflix

<img src="/img/netflix.jpg" height="500">

### Escalabilidade x Complexidade
A arquitetura permite que cada componente do sistema seja escalado de forma independente. Isso é crucial para a Netflix, que precisa suportar milhões de usuários simultâneos em todo o mundo. No entanto, essa escalabilidade vem com um aumento significativo na complexidade, pois gerenciar milhares de microserviços distribuídos requer uma infraestrutura robusta para orquestração, monitoramento, e comunicação.

### Performance x Consistência
A arquitetura da Netflix é otimizada para alta performance, utilizando técnicas para reduzir a latência e garantir uma experiência de streaming suave para os usuários. Porém, manter a consistência entre serviços em um ambiente global, é complicado. Assim, a Netflix adota o princípio de consistência eventual.

### Custo x Benefício de Negócio
Operar uma arquitetura distribuída em escala global envolve custos significativos. Isso inclui o custo de infraestrutura em nuvem (a Netflix utiliza AWS), ferramentas de monitoramento, segurança, e a manutenção de uma equipe qualificada para gerenciar o sistema. Apesar disso, os benefícios são enormes, permitindo uma experiência de usuário excepcional, com alta disponibilidade, rápida recuperação de falhas, e capacidade de suportar mudanças no mercado. 

### Inovação x Monitoramento
A arquitetura de microserviços permite uma rápida inovação, pois novos serviços e recursos podem ser desenvolvidos e implantados rapidamente sem impactar o sistema como um todo. Isso é crucial em um mercado competitivo como o de streaming. A Netflix investe pesadamente em ferramentas de teste de integração e monitoramento em tempo real.

# ATIVIDADE 4

## Diagrama de Classes UML

<img src="/img/classeUML.png" height="250">

### Código JAVA

#### Biblioteca

     import java.util.ArrayList;
     import java.util.List;

    public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }
    }

#### Livro

    public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int anoPublicacao, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean emprestar(){
        if (this.disponibilidade) {
            this.disponibilidade = false;
            System.out.println("Livro emprestado com sucesso.");
            return true;
        } else {
            System.out.println("O livro já está emprestado.");
            return false;
        }
    }

    public void devolver() {
        this.disponibilidade = true;
        System.out.println("Livro devolvido com sucesso.");
    }

    public void exibirInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação:" + this.anoPublicacao);
        System.out.println("Disponível: " + (this.disponibilidade? "Sim" : "Não"));
    }
    }





