package DevClass;

import CursoClass.Bootcamp;

import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;

    private final Set<Bootcamp> bootcamps = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void InscreverBootcamp(Bootcamp bootcamp){
       this.bootcamps.add(bootcamp);
    }

    public String getBootcamp(){
        return this.bootcamps.toString();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}