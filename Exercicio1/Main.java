package Pratica1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double c1, c2, h;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor dos catetos:");
        c1 = scanner.nextDouble();
        c2 = scanner.nextDouble();

        triangulo triangulo = new triangulo(c1, c2);

        System.out.print("Valor da Hipotenusa: " + triangulo.getH());
    }
}
