package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();

    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            System.out.println("Fechando recurso liberado pelo SO");
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado SO");
        }
        return null;
    }
}
