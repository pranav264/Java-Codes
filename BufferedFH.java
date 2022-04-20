package com.company;
import java.io.*;

public class BufferedFH {
    public static void main(String[] args) throws IOException {
        FileWriter write = new FileWriter("bfWrite.txt");
        // Buffered Reading
        try {
            BufferedWriter writeFile = new BufferedWriter(write);
            String text = "Hello and Welcome to File Handling!";
            System.out.println("Buffered Writer has started writing!");
            writeFile.write(text);

            // Close the buffer file
            writeFile.close();
            System.out.println("Write Successful!");
        } catch(IOException e) {
            e.printStackTrace();
        }

        // Buffered Writing
        FileReader read = new FileReader("bfRead.txt");
        try {
            BufferedReader readFile = new BufferedReader(read);
            System.out.print(readFile.readLine());

            // Close the buffer file
            readFile.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
