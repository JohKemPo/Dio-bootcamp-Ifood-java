package DesafioDeProjeto.src;

import java.time.LocalDate;
import DesafioDeProjeto.src.br.com.dio.desafio.dominio.Bootcamp;
import DesafioDeProjeto.src.br.com.dio.desafio.dominio.Curso ;
import DesafioDeProjeto.src.br.com.dio.desafio.dominio.Dev;
import DesafioDeProjeto.src.br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(8);

        //System.out.println(curso1);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descrição");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescrição("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Cam");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos de Cam: " + devCamila.getConteudoInscrito());
        devCamila.progredir();
        System.out.println("----------------\n");
        System.out.println("Conteudo inscritos de Cam: " + devCamila.getConteudoInscrito());
        System.out.println("Conteudos concluidos de Cam: " + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("\n");


        Dev devJo = new Dev();
        devJo.setNome("Joh");
        devJo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos de Joh" + devJo.getConteudoInscrito());
        devJo.progredir();
        devJo.progredir();
        devJo.progredir();
        System.out.println("----------------\n");
        System.out.println("Conteudo inscritos de Joh" + devJo.getConteudoInscrito());
        System.out.println("Conteudos concluidos de Joh " + devJo.getConteudoConcluidos());
        System.out.println("XP: " + devJo.calcularTotalXp());


    }
}
