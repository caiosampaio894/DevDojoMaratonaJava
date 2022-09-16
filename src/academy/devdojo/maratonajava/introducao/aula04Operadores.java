package academy.devdojo.maratonajava.introducao;

public class aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado);

        int rest = 20 % 7;
        System.out.println(rest);

        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezMaiorVinte = 10 > 20;
        boolean isVinteIgualDez = 20 == 10;
        boolean isVinteMaiorDez = 20 > 10;

        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);
        System.out.println(isDezMaiorVinte);
        System.out.println(isVinteIgualDez);
        System.out.println(isVinteMaiorDez);

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystaionCinco = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystaionCinco || valorTotalContaPoupanca > valorPlaystaionCinco;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

    }
}
