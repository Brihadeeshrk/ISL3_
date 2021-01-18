import java.util.*;

class Personal {
    public float basic, da, hra, total;
    Personal(float basic) {
        this.basic = basic;
        hra = (float) (basic *0.4);
        da = (float) (basic * 0.6);
        total = basic+hra+da;
    }
}

class Employee {
    public static String name, education;
    public static int age, exp, loans, loanamt, tax;
    float basic; 
    Personal salary;
    static Scanner ob = new Scanner(System.in);

    Employee(String name, String education, int age, int exp, int loans, int loanamt, int tax, float basic) {
        this.name  = name;
        this.education = education;
        this.age = age;
        this.exp = exp;
        this.loans = loans;
        this.loanamt = loanamt;
        this.tax = tax;
        this.basic = basic;
        salary = new Personal(basic);
    }

    void isEligible() {
        if((loanamt <= salary.total / 2) && (loans < 5))
            System.out.println("Eligible for loan");
        else
            System.out.println("Not Eligible for loan");
    }

    void taxPay() {
		if (salary.total < 250000)
			tax = 0;
		else if ((salary.total > 250000) && (salary.total < 500000))
			tax = (int) (0.1 * salary.total);
		else if ((salary.total > 500000) && (salary.total < 1000000))
			tax = (int) (0.2 * salary.total);
		else if (salary.total > 1000000)
			tax = (int) (0.3 * salary.total);
	}

    void isEligiblePromotion() {
		if (exp > 10)
			System.out.println("Eligible for promotion ");
		else
			System.out.println("Not eligible for promotion");
	}

    void Display() {
		System.out.println("name: " + name);
		System.out.println("age :" + age);
		System.out.println("education :" + education);
		System.out.println("Years of Experience: " + exp);
		System.out.println("Number of Loans: " + loans);
		System.out.println("Salary: " + salary.total);
		isEligible();
		System.out.println("The tax to be paid is " + tax);
		isEligiblePromotion();
	}

    public static void main(String[] args) {
        System.out.println("Enter the number of employees to be created");
		int num = ob.nextInt();
		Employee employees[] = new Employee[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the information for employee number "+(i+1));
			System.out.println("Enter the name");
			ob.nextLine();
			String name = ob.nextLine();
			System.out.println("Enter the age");
			int age = ob.nextInt();
			System.out.println("Enter Education");
			ob.nextLine();
			String education = ob.nextLine();
			System.out.println("Enter years of experience");
			int exp = ob.nextInt();
			System.out.println("Enter number of Loans");
			int loans = ob.nextInt();
			System.out.println("Enter the basic salary");
			int basic = ob.nextInt();
			System.out.println("Enter the loan amount");
			int loanamt = ob.nextInt();
			employees[i] = new Employee(name, education, age,  exp, loans, basic, loanamt, basic);
		}
		for (int j = 0; j < num; j++) {
			System.out.println("This is employee number "+(j+1)+"'s Information");
			employees[j].Display();
			System.out.println("\n\n\n");
		}
    }
}