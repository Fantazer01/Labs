package org.example.lab4.Danildop.Instanceof;

import org.example.lab4.Task1_3.Points.LabeledPoint;
import org.example.lab4.Task1_3.Points.Point;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5,5,5);
        Shape shape = new Shape(5,5);
        Square square = new Square(5,5);
        if(shape.equals(square)){
            System.out.println("Они равны!");
        }
        else{
            System.out.println("Они не равны!");
        }/*
        if(circle.equals(shape)){
            System.out.println("Они равны!");
        }
        else{
            System.out.println("Они не равны!");
        }*/
        if(square.equals(circle)){
            System.out.println("Они равны!");
        }
        else{
            System.out.println("Они не равны!");
        }
    }
}
