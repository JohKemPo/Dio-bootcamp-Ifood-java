package DesafioDeProjeto.src.br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d; // protected - so quem vai poder ter acesso a constante vao ser os filhos de conteudo
    private String titulo;
    private String descricao;

    public abstract double calcularXp();// abstract - para q nn seja possivel instanciar em outras classes alem das filhas de conteudo


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
