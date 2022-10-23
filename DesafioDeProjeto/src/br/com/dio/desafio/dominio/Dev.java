package DesafioDeProjeto.src.br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Objects;
import java.util.Optional;
import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp( Bootcamp bootcamp){
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        }else{
            System.err.println("Non matricula");
        }
    }

    public double calcularTotalXp(){
        return this.conteudoConcluidos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return this.conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return this.conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Dev)) {
            return false;
        }
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoConcluidos);
    }

}
