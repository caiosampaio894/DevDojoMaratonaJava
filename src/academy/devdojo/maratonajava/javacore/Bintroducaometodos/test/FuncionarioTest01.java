package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Caio");
        funcionario.setIdade(27);
        funcionario.setSalarios(new int[]{1000, 1200, 1500});

        funcionario.imprimeDados();
        System.out.println("\n----------");
        funcionario.mediaDosSalarios();
    }
}
