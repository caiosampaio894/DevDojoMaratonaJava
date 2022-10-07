package academy.devdojo.maratonajava.javacore.Npolimofirmso.servico;

import academy.devdojo.maratonajava.javacore.Npolimofirmso.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimofirmso.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago:  " + imposto);
        if(produto instanceof Tomate) {
            Tomate tomate =(Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}

