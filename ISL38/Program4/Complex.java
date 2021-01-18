/*
Define a class Complex with data members as two real numbers, constructors for initialization these numbers, 
methods to add, subtract and multiply 2 complex numbers.
*/
import java.util.*;

class Complex {
    public static float x1,x2,y1,y2,real,imag;
    static Scanner ob = new Scanner (System.in);
    Complex() {
        System.out.println("Enter x1 and y1 values");
	    x1=ob.nextFloat();
	    y1=ob.nextFloat();
	    System.out.println("Enter x2 and y2 values");
    	x2=ob.nextFloat();
	    y2=ob.nextFloat();
    }

    public static void add() {
        real = x1+x2;
        imag = y1+y2;
        System.out.println("Solution is: "+real+"i("+imag+")");
    }

    public static void sub() {
        real = x2-x1;
        imag = y2-y1;
        System.out.println("Solution is: "+real+"i("+imag+")");
    }

    public static void mul() {
        real = x1*x2;
        imag = y1*y2;
        System.out.println("Solution is: "+real+"i("+imag+")");
    }

    public static void main(String[] args) {
        int ch;
        Complex c = new Complex();
        while(true) {
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Exit");
            ch = ob.nextInt();
            if(ch == 4) break;
            switch(ch) {
                case 1:
                    c.add();
                    break;

                case 2:
                    c.sub();
                    break;

                case 3:
                    c.mul();
                    break;

                default: System.out.print("Error");
            }
        }
    }
}