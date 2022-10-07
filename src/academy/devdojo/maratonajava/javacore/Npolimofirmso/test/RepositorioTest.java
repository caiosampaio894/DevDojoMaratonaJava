package academy.devdojo.maratonajava.javacore.Npolimofirmso.test;

import academy.devdojo.maratonajava.javacore.Npolimofirmso.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioArquivo();
        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
