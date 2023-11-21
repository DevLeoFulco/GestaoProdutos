package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangule;

public class Program {
	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangule x,y;

        x= new Triangule();
        y= new Triangule();

        System.out.println("Entre com os lados do Triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com os lados do Triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        
        double areaX= x.area();
        
        double areaY= y.area();
        System.out.printf("A area do Triangulo X: %.4f%n", areaX);
        System.out.printf("A area do Triangulo Y: %.4f%n", areaY);

        if (areaX>areaY){
            System.out.println("A maior área é a do triangulo X");
        }else {
            System.out.println("A maior área é a do triangulo Y");
        }


        sc.close();
    }
}

