package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    public static int divisao(int a, int b) {
        if( a == 0 || b == 0) {
            throw new IllegalArgumentException("Argumento Ilegal, nao pode ser 0");
        }
            return a/b;

    }
}
