package com.company;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Customer{
    int cid,camount;
    String cname;

    Customer(){
        cid = -1;
        camount = -1;
        cname = "";
    }

    Customer(String name, int amt, int id){
        cname = name;
        camount = amt;
        cid = id;
    }
}

class AmountMin extends Exception {
    public AmountMin(String s) {
        super(s);
    }
}

class Withdrawl extends Exception {
    public Withdrawl(String s) {
        super(s);
    }
}

class IdRange extends Exception {
    public IdRange(String s) {
        super(s);
    }
}

class PositiveAmount extends Exception {
    public PositiveAmount(String s) {
        super(s);
    }
}

public class bank {
    public static void main(String[] args) {
        int withAmt, choice;
        Scanner sc = new Scanner(System.in);
        Customer cstm = new Customer();
        System.out.println("Enter name:");
        cstm.cname = sc.nextLine();

        while(true) {
            System.out.println("1.ID\n2.Amount\n3.Withdrawal\n4.Exit\n");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    try{
                        System.out.println("Enter ID:");
                        cstm.cid = sc.nextInt();
                        if(cstm.cid>1 && cstm.cid<20) {
                            System.out.println("Correct ID Entered!");
                        }
                        else {
                            throw new IdRange("Exception");
                        }
                    } catch(IdRange e) {
                        System.out.println(e.getMessage());
                        System.out.println("ID not in given range(1 to 20), please RENTER!");
                    }
                    break;

                case 2:

                    try {
                        System.out.println("Enter amount:");
                        cstm.camount = sc.nextInt();
                        if (cstm.camount > 1000) {
                            throw new AmountMin("Exception!");
                        }
                        else if(cstm.camount<0) {
                            throw new PositiveAmount("Exception!");
                        }
                        else {
                            System.out.println("Amount debited successfully!");
                        }
                    } catch (AmountMin e) {
                        System.out.println(e.getMessage());
                        System.out.println("Minimum amount exceeded(1000)");
                    }
                    catch(PositiveAmount e) {
                        System.out.println(e.getMessage());
                        System.out.println("Negative amount entered!");
                    }
                    break;

                case 3:
                try {
                    System.out.println("Enter withdrawal amount:");
                    withAmt = sc.nextInt();
                    if (withAmt > cstm.camount) {
                        throw new Withdrawl("Exception!");
                    } else {
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Balance: " + (cstm.camount - withAmt));
                        cstm.camount = cstm.camount - withAmt;
                    }
                } catch (Withdrawl e) {
                    System.out.println(e.getMessage());
                    System.out.println("Withdrawal amount exceeds balance!");
                }
                break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
