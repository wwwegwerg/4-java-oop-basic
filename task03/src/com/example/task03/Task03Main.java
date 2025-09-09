package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex z1 = new Complex(2.0, 3.0);
        Complex z2 = new Complex(1.5, -4.0);

        Complex sum = z1.add(z2);
        Complex product = z1.multiply(z2);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        System.out.println("sum = " + sum);
        System.out.println("product = " + product);
    }
}
