/*
Write a java program to work with strings. 
a. Extract a portion of the string and print it. Variable m indicates the amount of characters 
to be extracted from the string starting from the nth position.
b. Read a text and count all the occurrences of a particular word.
c. Replace a substring in the given string.
d. Rearrange the string and rewrite in alphabetical order.
e. Compare two strings ignoring case.
f. Concatenate two strings.
*/
import java.util.*;

class prog6 {
    static Scanner ob = new Scanner(System.in);
    public static void extract() {
        System.out.println("Input a string");
		String string =ob.nextLine();
		System.out.println("Input position reference base 1");
		int m=ob.nextInt();
		System.out.println("Input number of characters");
		int n=ob.nextInt();
		char[] charArray = string.toCharArray();
		char[] extPor = new char[n];
		for(int i=m-1;i<m-1+n;i++)
			extPor[i-m+1] = charArray[i];
		String extPorString = new String(extPor);
		System.out.println(extPorString);
    }

    public static void occurences() {
        System.out.println("Input a string ");
		String str = ob.nextLine();
		System.out.println("Input the word to be found");
		String word = ob.next();
        String a[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i]))
				count++;
		}
        System.out.println("Occurences: "+count);
    }

    public static void replace(){
        System.out.println("Enter the string ");
		String str = ob.nextLine();
		System.out.println("Enter the string to be replaced ");
		String old_str = ob.nextLine();
		System.out.println("Enter the new string ");
		String new_str = ob.nextLine();
		String replaced = str.replace(old_str, new_str);
		System.out.println("replaced string: " + replaced);
    }

    public static void arrange() {
        System.out.println("Enter a string ");
		String str = ob.nextLine();
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
    }

    public static void compare() {
        System.out.println("Enter the first string");
		String firstString = ob.next();
		System.out.println("Enter the second string ");
		String secondString = ob.next();
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		if (firstString.equals(secondString))
			System.out.println("Both strings are equal ");
		else
			System.out.println("Strings are not equal");
    }

    public static void concatenate() {
        System.out.println("Enter the first string");
		String one = ob.nextLine();
		System.out.println("Enter the second string");
		String two = ob.nextLine();
		String three = one.concat(two);
		System.out.println("Conacttenated two strings \nThe string is now " + three);
    }

    public static void main(String[] args) {
        int ch;
        while(true) {
            System.out.println("1. Extraction");
            System.out.println("2. Occurences");
            System.out.println("3. Replace");
            System.out.println("4. Arrange");
            System.out.println("5. Compare");
            System.out.println("6. Concatenate");
            System.out.println("7. Exit");
            ch = ob.nextInt();
            if(ch == 7) break;
            switch(ch) {
                case 1:
                    extract();
                    break;
                case 2:
                    occurences();
                    break;
                case 3:
                    replace();
                    break;
                case 4:
                    arrange();
                    break;
                case 5:
                    compare();
                    break;
                case 6:
                    concatenate();
                    break;

                default: System.out.println("Error");
            }
        }
    }
}