package Pratica1_2;

import java.math.*;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private Data dataNascimento;
    private float altura;
    private Double peso;
    private Double imc;

    public Pessoa(String nome, String sobrenome, int idade, Data dataNascimento, float altura, Double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.imc = calculaImc(altura, peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public Double calculaImc(Float altura, Double peso) {
        return (peso / Math.pow(altura, 2));
    }

    public void informaObesidade() {
        if (imc < 18.5) {
            System.out.printf("Imc: %.2f\nFaixa corporal: Abaixo do peso\n", this.imc);
        } else if (imc >= 18.5 && imc < 25) {
            System.out.printf("Imc: %.2f\nFaixa corporal: Peso Normal\n", this.imc);
        } else if (imc >= 25 && imc < 30) {
            System.out.printf("Imc: %.2f\nFaixa corporal: Sobrepeso\n", this.imc);
        } else if (imc >= 30 && imc < 35) {
            System.out.printf("Imc: %.2f\nFaixa corporal: Obesidade grau 1\n", this.imc);
        } else if (imc >= 35 && imc < 40) {
            System.out.printf("Imc: %.2f\nFaixa corporal: Obesidade grau 2\n", this.imc);
        } else {
            System.out.printf("Imc: %.2f\nFaixa corporal: Obesidade grau 3\n", this.imc);
        }
    }

    public int calculaIdade(Data dataNascimento) {
        Integer anoNascimento = dataNascimento.getAno();
        Integer mesNascimento = dataNascimento.getMes();
        Integer diaNascimento = dataNascimento.getDia();

        anoNascimento = Calendar.YEAR - anoNascimento;
        if (Calendar.MONTH < mesNascimento) {
            anoNascimento--;
        } else if (Calendar.DAY_OF_MONTH < diaNascimento && Calendar.MONTH == mesNascimento) {
            anoNascimento--;
        }

        return anoNascimento;
    }

}
