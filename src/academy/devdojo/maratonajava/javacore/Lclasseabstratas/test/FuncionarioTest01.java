package academy.devdojo.maratonajava.javacore.Lclasseabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Tsunaga", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Caio", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
