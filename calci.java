package com.company;

import java.util.Scanner;

class Addition extends Thread{
    int n1,n2;
    public void run() {
        System.out.println("Addition: "+(n1+n2));
    }
}

class Subtraction extends Thread{
    int n1,n2;
    public void run() {
        System.out.println("Subtraction: "+(n1-n2));
    }
}

class Multiplication extends Thread{
    int n1,n2;
    public void run() {
        System.out.println("Multiplication: "+(n1*n2));
    }
}

class Division extends Thread{
    int n1,n2;
    public void run() {
        try{
            if(n2 == 0) {
                throw new ArithmeticException();
            }
            else {
                System.out.println("Division: "+(n1/n2));
            }
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Addition t1 = new Addition();
        Subtraction t2 = new Subtraction();
        Multiplication t3 = new Multiplication();
        Division t4 = new Division();

        System.out.println("Enter two integers:");
        t1.n1 = sc.nextInt();
        t1.n2 = sc.nextInt();
        t1.start();
        try{
            t1.join();
        } catch(InterruptedException e) {}

        System.out.println("Enter two integers:");
        t2.n1 = sc.nextInt();
        t2.n2 = sc.nextInt();
        t2.start();
        try{
            t2.join();
        } catch(InterruptedException e) {}


        System.out.println("Enter two integers:");
        t3.n1 = sc.nextInt();
        t3.n2 = sc.nextInt();
        t3.start();
        try{
            t3.join();
        } catch(InterruptedException e) {}

        System.out.println("Enter two integers:");
        t4.n1 = sc.nextInt();
        t4.n2 = sc.nextInt();
        t4.start();
    }
}
