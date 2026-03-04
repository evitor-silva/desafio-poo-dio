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
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 =  new Dev();
        dev1.setNome("Nao sei");
        dev1.inscreverBootcamp(bootcamp);

        Dev dev2 =  new Dev();
        dev2.setNome("Nao sei2");
        dev2.inscreverBootcamp(bootcamp);

        bootcamp.BootcampPrint();
    }
}