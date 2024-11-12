package bootcamp;

import java.time.LocalDate;

import bootcamp.dominio.Bootcamp;
import bootcamp.dominio.Curso;
import bootcamp.dominio.Dev;
import bootcamp.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("desricao mentoria java");
        mentoria.setData(LocalDate.now());
        System.out.println("---------------");

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println("---------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootecamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRamon = new Dev();
        devRamon.setNome("Ramon");
        devRamon.inscreverBootcamp(bootcamp);
        System.out.println("---------------");
        System.out.println("Conteudos Inscritos Ramon:" + devRamon.getConteudosInscritos());
        devRamon.progredir();
        devRamon.progredir();
        devRamon.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Ramon:" + devRamon.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Ramon" + devRamon.getConteudosConcluidos());
        System.out.println("XP:" + devRamon.calcularXp());


        System.out.println("---------------");
        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularXp());


    }
}