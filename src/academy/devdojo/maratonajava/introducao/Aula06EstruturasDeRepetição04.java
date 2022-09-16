package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição04 {
    public static void main(String[] args) {
        int valorDoCarro = 30000;
        int numeroDeMeses = 2;
        int result = valorDoCarro / numeroDeMeses;
        if(result >= 1000) {
            System.out.println("O valor da parcela é R$" + result);
        } else {
            System.out.println("O valor mínimo da parcela é R$ 1000");
        }
    }
}

