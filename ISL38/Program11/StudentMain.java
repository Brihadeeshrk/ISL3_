package p11;

import StudentPackage.*;

public class StudentMain {
    public static void main(String[] args) {
		RegisterStudent regstud = new RegisterStudent();
		regstud.getDetails();
		try {
			displayStudent(regstud);
		} catch (SGPAException e) {
			e.printStackTrace();
		}catch (CreditLimitException c) {
			c.printStackTrace();
		}
	}

	static void displayStudent(RegisterStudent regstud) throws CreditLimitException, SGPAException{
		int SGPA = 0;

		System.out.println("Name: " + regstud.Name);
		System.out.println("Branch: " + regstud.Branch);
		System.out.println("Join Date: " + regstud.JoinDate);
		System.out.println("Semester number: " + regstud.Semester);
		System.out.println("Subjects: ");
		for (int i = 0; i < regstud.subjectlist.size(); i++) {
			System.out.println("Subject name: "+regstud.subjectlist.get(i).name);
			SGPA=SGPA+regstud.subjectlist.get(i).grade*regstud.subjectlist.get(i).credits;
		}
		
		if(SGPA>10)
			throw new SGPAException(SGPA);
	}
}