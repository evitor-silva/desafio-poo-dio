package DevClass;

import AbstractClass.Conteudo;

import java.util.LinkedHashSet;
import java.util.Set;

public class DevConteudos {
    private final Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
    private final Set<Conteudo> conteudosConcluidos = new LinkedHashSet<Conteudo>();

    public void InscreverConteudo(Conteudo conteudo){
        conteudosInscritos.add(conteudo);
    }

    public void concluirConteudo(Conteudo conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            conteudosInscritos.remove(conteudo);
            conteudosConcluidos.add(conteudo);
        } else {
            System.out.println("Conteúdo não está inscrito.");
        }
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
}
