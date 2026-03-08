package Pratica1;
import java.math.*;

public class triangulo {
    private double c1;
    private double c2;
    private double h;
        
    triangulo(Double c1, Double b) {
        this.c1 = c1;
        this.c2 = b;
        this.h = calculaHipotenusa();
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getH() {
        return h;
    }

    public double calculaArea() {
        return ((c1 * c2) / 2);
    }

    private double calculaHipotenusa()
    {
        return (Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2)));
    }


}