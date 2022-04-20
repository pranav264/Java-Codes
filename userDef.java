package com.company;
import java.lang.Exception;
import java.util.Scanner;

class AgeNotWithinException extends Exception {
    public AgeNotWithinException(String s) {
        super(s);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String s) {
        super(s);
    }
}

class Employee {
    int eid,age;
    String name,department;

    Employee() {
        eid = -1;
        age = -1;
        name = "";
        department = "";
    }

    Employee(int id, int a, String n, String dep){
        eid = id;
        age = a;
        name = n;
        department = dep;

        try {
            if(age>25 && age<50) {
                throw new AgeNotWithinException("Caught Exception for age!");
            }
        } catch(AgeNotWithinException e) {
            System.out.println(e);
        }

        try {
            int count = 0;
            for (int i = 0; i < name.length(); i++) {

                // Checking the character for not being a
                // letter,digit or space
                if (!Character.isDigit(name.charAt(i))
                        && !Character.isLetter(name.charAt(i))
                        && !Character.isWhitespace(name.charAt(i))) {
                    // Incrementing the countr for spl
                    // characters by unity
                    count++;
                }
            }

            if(count!=0) {
                throw new NameNotValidException("Caught Exception for name!");
            }
        } catch(NameNotValidException e) {
            System.out.println(e);
        }
    }
}

public class userDef {
    public static void main(String[] args){
        Employee emp = new Employee(1,2,"Pranav","WebDev");
    }
}
