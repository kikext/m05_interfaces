package com.company;

public class triangulo extends poligono{
    posicion[] pos;

    public triangulo(int base, int altura, posicion[] pos) {
        super(base, altura);
        this.pos = pos;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}

