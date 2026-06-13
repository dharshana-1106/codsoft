import java.util.*;

public class Calculator1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String calculate;
		do {
			System.out.println("STUDENT GRADE CALCULATOR");
			System.out.println();
			System.out.println("Select the Student Academic Level (SSS/CSS):");
			System.out.println("1. School Student System(SSS).");
			System.out.println("2. College Student System(CSS).");
			String ch = s.nextLine();
			
			if(ch.equalsIgnoreCase("SSS") || ch.equalsIgnoreCase("school student system") || ch.equals("1"))
			{ 
				System.out.println("specify the school academic standard(SSLC/HSC):");
				String ch2 = s.nextLine();
				if(ch2.equalsIgnoreCase("SSLC") || ch2.equalsIgnoreCase("10th"))
					Calculator1.schoolGradeSSLC(s);
				else
					Calculator1.schoolGradeHSC(s);
			}
			else
			{
				Calculator1.collegeGrade(s);
			}
			
			System.out.println("do you continue the calculation?(yes/no)");
			calculate = s.nextLine();
		}
		while(calculate.equalsIgnoreCase("yes") || calculate.equalsIgnoreCase("y"));
		
		System.out.println("Thank You...Good Luck!");
		s.close();
	}

	public static void schoolGradeSSLC(Scanner s)
	{
		double tot = 0;
		int mark;
		String grade;
		System.out.println("Enter Your Name:");
		String name = s.nextLine();
		System.out.println("Enter Your RollNo:");
		int rollno = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Your Marks:");
		String sub[] = {"Tamil","English","Maths","Science","SocialScience"};
		for(int i=0; i<5; i++)
		{
			System.out.print(sub[i] + ": ");
			mark = s.nextInt();
			tot = tot + mark;
		}
		s.nextLine(); 
		double avg = tot / 5;
		
		if(avg >= 95) grade = "A+";
		else if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else if(avg >= 50) grade = "E";
		else grade = "F";
		
		printResult(name, rollno, tot, avg, grade);
	}

	public static void schoolGradeHSC(Scanner s)
	{
		double tot = 0;
		int mark;
		String grade;
		System.out.println("Enter Your Name:");
		String name = s.nextLine();
		System.out.println("Enter Your RollNo:");
		int rollno = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Your Marks:");
		String sub[] = {"Tamil","English","Maths","Physics","Chemistry","Biology/ComputerScience"};
		for(int i=0; i<6; i++)
		{
			System.out.print(sub[i] + ": ");
			mark = s.nextInt();
			tot = tot + mark;
		}
		s.nextLine();
		double avg = tot / 6;
		

		if(avg >= 95) grade = "A+";
		else if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else if(avg >= 50) grade = "E";
		else grade = "F";
		
		printResult(name, rollno, tot, avg, grade);
	}

	public static void collegeGrade(Scanner s)
	{
		System.out.println("Enter Your Name:");
		String name = s.nextLine();
		System.out.println("Enter Your RollNo:");
		int rollno = s.nextInt();
		s.nextLine();
		
		System.out.print("Enter the number of subjects in this semester: ");
		int numSubjects = s.nextInt();
		
		int[] credits = new int[numSubjects];
		double[] gradePoints = new double[numSubjects];
		
		double totalEarnedPoints = 0;
		int totalCredits = 0;
		
		System.out.println("Enter Details for Each Subject:");
		for (int i = 0; i < numSubjects; i++) 
		{
			System.out.println("Subject " + (i + 1) + ":");
			System.out.print("  Enter Subject Credit (e.g., 3 or 4): ");
			credits[i] = s.nextInt();
			
			System.out.print("  Enter Grade Point Obtained (0.0 to 10.0): ");
			gradePoints[i] = s.nextDouble();
			
			totalEarnedPoints += (credits[i] * gradePoints[i]);
			totalCredits += credits[i];
		}
		s.nextLine(); // Clear buffer
		
		double cgpa = 0;
		if (totalCredits > 0) {
			cgpa = totalEarnedPoints / totalCredits;
		}
		
		String grade;
		if (cgpa >= 9.0)
			grade = "Outstanding First Class";
		else if (cgpa >= 7.5)
			grade = "First Class with Distinction";
		else if (cgpa >= 6.0)
			grade = "First Class";
		else if (cgpa >= 5.0)
			grade = "Second Class";
		else
			grade = "Reappear (RA)";
	
		printResult(name, rollno, totalCredits, cgpa, grade);
	}

	public static void printResult(String name, int rollno, double tot, double avg, String grade)
	{
		System.out.println();
		System.out.println("_______________________________________");
		System.out.println("       STUDENT GRADE CALCULATOR        ");
		System.out.println("_______________________________________");
		System.out.println("Name         : " + name);
		System.out.println("RollNo       : " + rollno);
		
		
		if (grade.contains("Class") || grade.contains("RA")) {
			System.out.println("Total Credits: " + (int)tot);
			System.out.printf("CGPA         : %.2f\n", avg);
		} else {
			System.out.println("Total Mark   : " + tot);
			System.out.printf("Average      : %.2f\n", avg);
		}
		
		System.out.println("Grade        : " + grade);
		System.out.println("_______________________________________");
		System.out.println("\n");
	}
}