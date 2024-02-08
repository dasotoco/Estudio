package com.personalsoft.estudio.ejercicios;

public interface Polygon {
    Double area();

    static void main(String[] args){

        Square square = new Square(5.0);
        System.out.println("Area del cuadrado: " + square.area());

        Rectangle rectangle = new Rectangle(5.0, 8.0);
        System.out.println("Area del rectangulo: " + rectangle.area());

        Triangle triangle = new Triangle(8.0, 5.0);
        System.out.println("Area del triangulo: " + triangle.area());
    }
}

class Square implements Polygon {
    Double side;
    public Square(Double side) {
        this.side = side;
    }
    @Override
    public Double area() {
        return side * side;
    }
}

class Rectangle implements Polygon {
    Double length;
    Double width;
    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public Double area() {
        return length*width;
    }
}

class Triangle implements Polygon {
    Double base;
    Double height;
    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public Double area() {
        return (base*height)/2;
    }
}

