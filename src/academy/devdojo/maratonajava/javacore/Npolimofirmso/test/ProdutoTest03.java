package academy.devdojo.maratonajava.javacore.Npolimofirmso.test;


import academy.devdojo.maratonajava.javacore.Npolimofirmso.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
