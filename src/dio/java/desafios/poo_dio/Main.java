package dio.java.desafios.poo_dio;

import dio.java.desafios.poo_dio.dominio.Bootcamp;
import dio.java.desafios.poo_dio.dominio.Curso;
import dio.java.desafios.poo_dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMaurício = new Dev();
        devMaurício.setNome("Maurício");
        devMaurício.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos instricos" + devMaurício.getConteudosInscritos());
        devMaurício.progredir();
        devMaurício.progredir();
        System.out.println("----");
        System.out.println("Conteúdos instricos" + devMaurício.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devMaurício.getConteudosConcluidos());
        System.out.println("XP: " + devMaurício.calcularTotalXp());

        System.out.println("------------------------------");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos instricos" + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("----");
        System.out.println("Conteúdos instricos" + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devMarcos.getConteudosConcluidos());
        System.out.println("XP: " + devMarcos.calcularTotalXp());

    }
}
