/*
Create a class called account with the data members(Accno – integer, name String, Phone_No: integer, balance_amt:float), and following methods :
a. getinput() to get input from the user
b. Deposit() method which takes the amount to be deposited in to his/her account and
do the calculation.
c. Withdraw() method which gets the amount to be withdrawn from his/her account.
d. Print the appropriate results.
*/

import java.util.*;

class Account {
    public static int accno, phoneno;
    public static String name;
    public static float balance;
    public static Scanner ob = new Scanner (System.in);

    public static void getInput() {
        System.out.println("Enter Name");
        ob.nextLine();
        name = ob.nextLine();
        System.out.println("Enter Accno");
        accno = ob.nextInt();
        System.out.println("Enter Phoneno");
        phoneno = ob.nextInt();
        System.out.println("Enter Balance");
        balance = ob.nextFloat();
    }

    public static void Deposit (float amt) {
        balance += amt;
        System.out.println("Account Balance after Deposit: "+balance);
    }

    public static void Display() {
        System.out.println("Name: "+name);
        System.out.println("Phone No: "+phoneno);
        System.out.println("Acc No: "+accno);
        System.out.println("Balance: "+balance);
    }

    public static void Withdraw (float amt) {
        if(amt>balance) {
            System.out.println("Insufficient Funds");
            System.exit(0);
        }
        balance -= amt;
        System.out.println("Account Balance after Withdrawing: "+balance);
    }

    public static void main (String[] args) {
        int ch;
        float amt;
        while(true) {
            System.out.println("1. Enter Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter choice");
            ch = ob.nextInt();
            if (ch == 5) {
                System.exit(0);
            }
            switch(ch) {
                case 1:
                    getInput();
                    break;
                
                case 2:
                    System.out.println("Enter Amount to Deposit");
                    amt = ob.nextFloat();
                    Deposit(amt);
                    break;

                case 3:
                    System.out.println("Enter Amount to Withdraw");
                    amt = ob.nextFloat();
                    Withdraw(amt);
                    break;

                case 4:
                    Display();
                    break;

                default: System.out.print("Error");
            }
        }
    }
}