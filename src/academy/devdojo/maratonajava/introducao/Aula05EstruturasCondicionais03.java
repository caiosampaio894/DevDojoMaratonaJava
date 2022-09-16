package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 2000;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Eu nao vou doar 500 reais";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
