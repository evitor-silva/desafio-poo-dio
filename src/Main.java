import CursoClass.Bootcamp;
import CursoClass.Curso;
import CursoClass.Mentoria;
import DevClass.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("Mentoria js");
        mentoria.setDescricao("descrição Mentoria js");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.addConteudos(curso2);
        bootcamp.addConteudos(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Nao sei");
        dev1.InscreverBootcamp(bootcamp);
        System.out.println(dev1.getBootcamp());


        Dev dev2 = new Dev();
        dev2.setNome("Nao sei2");
        dev2.InscreverBootcamp(bootcamp);

    }
}