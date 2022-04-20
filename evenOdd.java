package com.company;

import java.util.Scanner;

class Print extends Thread{
    public void run() {
        for(int i=0; i<=10; i++) {
            if(i%2 == 0) {
                System.out.println("Even- "+i);
            }
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
            if(i%2 != 0) {
                System.out.println("Odd- "+i);
            }
        }
    }
}

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Print t1 = new Print();
        Print t2 = new Print();

        t1.start();
        try {
            t1.join();
        } catch(InterruptedException e) {
        }
        t2.start();
    }
}
