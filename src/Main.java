import br.com.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso em java");
        curso1.setDescricao("descrição do curso em java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();


        curso2.setTitulo("curso em java script");
        curso2.setDescricao("descrição do curso em java script");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("decrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcapm Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devVitor.getConteusoInscritos());
        devVitor.progredir();
        devVitor.progredir();
        System.out.println("Conteúdos concluídos" + devVitor.getConteudosConcluidos());
        System.out.println("XP" + devVitor.calcularXp());

        System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devJoao.getConteusoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos concluídos" + devJoao.getConteudosConcluidos());
        System.out.println("Xp" + devJoao.calcularXp());

    }
}