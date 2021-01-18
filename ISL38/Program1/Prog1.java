/*
1. Write Java programs
a. To print Fibonacci series without using recursion and using recursion.(concept of
loops, data types)
b. To check prime numbers.
c. To sort an array elements using bubble sort algorithm.
*/

import java.util.*;

class Prog1 {
    public static void iterativeFib ( int n ) {
        int t1 = 0, t2 = 1, t3;
        System.out.print(t1+" "+t2);
        for(int i = 1; i <=n; i++) {
            t3 = t1 + t2;
            System.out.print(" "+t3);
            t1 = t2;
            t2 = t3;
        }
    }
    public static void recursiveFib( int n ) {
        if(n == 1 || n == 0)
            return n;
        else return recursiveFib(n-1) + recursiveFib(n-2);
    }
    public static boolean isPrime( int n ) {
        boolean flag = false;
        if ( n == 1 ) System.out.println("Neither");
        else if (n <= 0)  System.out.println("Negative Number");
        
        for(int i = 2; i < n; i++) {
            if (n%i == 0) return flag;
        }
        return !flag;
    }
    public static void bSort (int a[] ) {
        int l = a.length;
        for(int i = 0; i < l-1; i++) {
            for(int j = 0; j < l-i-1; j++) {
                if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
            }
        }
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner (System.in);
        int ch, n;
        int[] a = new int[100];
        System.out.println("1. Iterative Fibonacci");
        System.out.println("2. Recursive FIbonacci");
        System.out.println("3. isPrime");
        System.out.println("4. Bubble Sort");
        ch = ob.nextInt();
        switch(ch) {
            case 1:
                System.out.println("Enter n value");
                n = ob.nextInt();
                iterativeFib(n);
                break;

            case 2:
                System.out.println("Enter n value");
                n = ob.nextInt();
                for(int i = 1;  i<= n; i++)
                    System.out.println(recursiveFib(i)+"\t");
                break;

            case 3:
                System.out.println("Enter n value");
                n = ob.nextInt();
                System.out.println("Is "+n+" Prime? "+isPrime(n));
                break;

            case 4:
                System.out.println("Enter Length of Array");
                n = ob.nextInt();
                System.out.println("Enter Array Elements");
                for(int i = 0; i<n; i++)
                    a[i] = ob.nextInt();
                bSort(a);
                System.out.println("Array after sorting");
                for(int i = 0; i<n; i++)
                    System.out.print(a[i]+" ");
                break;

            default: System.out.println("Invalid Choice, Choose 1-4");
        }
    }
}