package DesafioDeProjeto.src;

import java.time.LocalDate;

import DesafioDeProjeto.src.br.com.dio.desafio.dominio.Curso ;
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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descrição");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
