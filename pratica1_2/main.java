package Pratica1_2;

import java.util.*;

public class main {

    public static void main(String[] args) {
        String nome, sobrenome;
        int idade;
        Data dataNascimento;
        float altura;
        Double peso;

        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa[] = new Pessoa[10];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Informe o nome e sobrenome da pessoa: ");
            nome = scanner.nextLine();
            if (i > 0 && pessoa[i - 1].getNome().equals(nome)) {
                break;
            }
            sobrenome = scanner.nextLine();
            System.out.println("Informe a idade da pessoa: ");
            idade = scanner.nextInt();
            System.out.println("Informe a data de nascimento da pessoa: (Dia Mes Ano) ");
            dataNascimento = new Data(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("Informe a altura da pessoa: (Em Metros)");
            altura = scanner.nextFloat();
            System.out.println("Informe o peso da pessoa: (Em Kg) ");
            peso = scanner.nextDouble();

            pessoa[i] = new Pessoa(nome, sobrenome, idade, dataNascimento, altura, peso);
            scanner.nextLine();
        }

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] != null) {
                System.out.print("Nome Completo: " + pessoa[i].getNome() + " " + pessoa[i].getSobrenome() + "\n");
                System.out.print("Nome de referência: " + pessoa[i].getSobrenome() + ", "
                        + pessoa[i].getNome().toUpperCase() + "\n");
                System.out.print("Idade: " + pessoa[i].getIdade() + "\n");
                System.out.print("Peso: " + pessoa[i].getPeso() + "\n");
                System.out.print("Altura: " + pessoa[i].getAltura() + "\n");
                pessoa[i].informaObesidade();
            }
        }
    }
}
