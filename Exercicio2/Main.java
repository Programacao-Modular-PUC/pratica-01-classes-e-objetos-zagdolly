package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome, sobrenome;
        Double peso, imc;
        Integer idade;
        float altura;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe o Sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Informe a idade: ");
        idade = scanner.nextInt();
        System.out.println("Informe a altura (em metros): ");
        altura = scanner.nextFloat();
        System.out.println("Informe o peso: ");
        peso = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

        pessoa.informaObesidade();

        scanner.close();

    }

}
