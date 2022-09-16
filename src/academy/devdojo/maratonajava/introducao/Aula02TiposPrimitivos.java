package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 1000000L;
        double salarioDouble = 2000;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Goku";

        System.out.println("A idade é: " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("caractere " + caractere);
        System.out.println("salarioFloat " + salarioFloat);
        System.out.println("Oi meu nome é: " + nome);

        int contador = 0;
        System.out.println(contador++);
        System.out.println(contador);
    }
}
