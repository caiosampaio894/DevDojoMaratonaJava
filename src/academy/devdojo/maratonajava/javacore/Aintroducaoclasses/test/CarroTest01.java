package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Honda";
        carro.modelo = "Civic";
        carro.ano = 2022;

        carro2.nome = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2021;


        System.out.println("Carro1" + "\nNome: " + carro.nome
                + "\nModelo: " + carro.modelo + "\nAno: " + carro.ano);

        System.out.println("\nCarro2" + "\nNome: " + carro2.nome
                + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}
