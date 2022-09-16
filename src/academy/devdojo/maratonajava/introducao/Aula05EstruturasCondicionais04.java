package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 100000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        double salarioLiquido;

        if(salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if(salarioAnual <= 68507 && salarioAnual > 34712) {
            valorImposto = salarioAnual * segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        salarioLiquido = salarioAnual - valorImposto;

        System.out.println("valor do imposto: " + valorImposto);
        System.out.println("salário líquido: " + salarioLiquido);
    }
}
