package academy.devdojo.maratonajava.javacore.Npolimofirmso.servico;

import academy.devdojo.maratonajava.javacore.Npolimofirmso.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
