package StudentPackage;

import java.util.*;
import p11.*;

public class RegisterStudent implements Student {
    public String Name, Branch, JoinDate;
	public int Semester, n, creditSum = 0;
	Scanner scan = new Scanner(System.in);
	public List<Subject> subjectlist = new ArrayList<Subject>();

	@Override
	public void getDetails() {
		System.out.println("Enter the name");
		Name = scan.nextLine();
		System.out.println("Enter your branch");
		Branch = scan.nextLine();
		System.out.println("Enter join date");
		JoinDate = scan.nextLine();// change it to date format
		System.out.println("Enter Semester");
		Semester = scan.nextInt();
		System.out.println("Enter the number of subjects ");
		n = scan.nextInt();

		try {
			for (int i = 0; i < n; i++) {
				Subject subject = new Subject();
				System.out.println("Enter the name of " + (i + 1) + " subject");
				scan.nextLine();
				subject.name = scan.nextLine();
				System.out.println("Enter the Credits of subject");
				subject.credits = scan.nextInt();
				System.out.println("Enter the grade of subject");
				subject.grade = scan.nextInt();
				creditSum += subject.credits;

				if(creditSum > 30)
					throw new CreditLimitException(creditSum);
				else
					subjectlist.add(subject);
			}
		} catch (CreditLimitException c) {
			System.out.println("Error Encountered: "+c);
		}
	}
}