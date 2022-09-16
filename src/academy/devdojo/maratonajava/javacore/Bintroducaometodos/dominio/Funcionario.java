package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public int[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(int num : salarios) {
            System.out.print(num + " ");
        }
    }

    public void mediaDosSalarios() {
        int soma = 0;
        for(int num : salarios) {
            soma += num;
        }
        soma /= salarios.length;
        System.out.println(soma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int[] getSalarios() {
        return salarios;
    }

    public void setSalarios(int[] salarios) {
        this.salarios = salarios;
    }
}
