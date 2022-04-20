package com.company;
import java.io.*;
import java.util.Scanner;

public class studentInfo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        FileWriter write = new FileWriter("info.txt");
        File myObj = new File("info.txt");
        Scanner myReader = new Scanner(myObj);
        FileWriter output = new FileWriter("write.txt");

        try {
            BufferedWriter writeFile = new BufferedWriter(write);
            BufferedWriter writeAgain = new BufferedWriter(output);
            for(int i=0; i<=n; i++) {
                System.out.println("Enter student's data in the format: Rno Name M1 M2 M3 M4 M5");
                String text = sc.nextLine();
                writeFile.write(text);
                writeAgain.write(text);
                writeFile.newLine();
            }

            writeFile.write("Grades of the students:");
            for(int i=0; i<n; i++) {
                System.out.println("\nPlease enter the marks for grade calculation: ");
                int m1 = sc.nextInt();
                int m2 = sc.nextInt();
                int m3 = sc.nextInt();
                int m4 = sc.nextInt();
                int m5 = sc.nextInt();
                int marks = (m1+m2+m3+m4+m5);
                if(marks<100) {
                    writeFile.write("\nE Grade");
                    writeAgain.write("\nE Grade");
                }
                else if(marks<200) {
                    write.write("\nD Grade");
                    writeAgain.write("\nD Grade");
                }
                else if(marks<300) {
                    write.write("\nC Grade");
                    writeAgain.write("\nC Grade");
                }
                else if(marks<400) {
                    write.write("\nB Grade");
                    writeAgain.write("\nB Grade");
                }
                else if(marks<500) {
                    write.write("\nA Grade");
                    writeAgain.write("\nA Grade");
                }
            }
            writeFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
