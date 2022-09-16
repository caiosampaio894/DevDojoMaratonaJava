package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Caio";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Gustavo";
        estudante02.idade = 28;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }

}
