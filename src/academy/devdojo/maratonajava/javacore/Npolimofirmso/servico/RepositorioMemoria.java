package academy.devdojo.maratonajava.javacore.Npolimofirmso.servico;

import academy.devdojo.maratonajava.javacore.Npolimofirmso.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
