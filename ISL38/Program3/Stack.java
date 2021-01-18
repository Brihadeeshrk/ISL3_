/*
Define a Stack class to implement the stack data structure. Include constructors to perform initialization, 
method push to push an element into the stack, method pop to remove an element from the stack and
 display method to display the elements of the stack.
*/
import java.util.*;

class Stack {
    public static int top = -1;
    public static int MAX = 100;
    public static int[] a = new int[MAX];
    public static Scanner ob = new Scanner (System.in);

    public static void push(int n) {
        if(top == (MAX-1)) {
            System.out.println("Overflow");
            System.exit(0);
        } else {
            a[top++] = n;
            System.out.println("Element Pushed");
        }
    }

    public static int pop() {
        if (top < 0) {
			System.out.println("Underflow");
			return -1;
		} else {
			int n = a[top--];
			return n;
		}
    }

    public static void Display() {
        System.out.println("Stack Elements: ");
        for(int i = 0; i<=top; i++)
            System.out.print(a[i]+" ");
    }

    public static void main(String[] args) {
        int ch, n;
        while(true) {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
            ch = ob.nextInt();
            if (ch == 4) break;
            switch(ch) {
                case 1:
                    System.out.println("Enter Element to be Pushed");
                    n = ob.nextInt();
                    push(n);
                    break;

                case 2:
                    System.out.println(pop()+" has been popped:");
                    break;

                case 3:
                    Display();
                    break;

                default: System.out.print("Error");
            }
        }
    }
}