package academy.devdojo.maratonajava.javacore.Npolimofirmso.test;

import academy.devdojo.maratonajava.javacore.Npolimofirmso.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell Latitude", 12000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
