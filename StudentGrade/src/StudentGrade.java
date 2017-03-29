import java.util.*;
/*
 * A student has A grade if marks are more than 70 (marks > 60 if age is less than 15), B
grade, if marks are between 61 and 70 (marks between 45 and 60 for age < 15) and C
grade, if marks are less than 61 (marks less than 45 for age < 15) Write a program to
print the grade for given marks and age
 */
public class StudentGrade {
	
	public static void main(String args[])

	{
		Grade a= new Grade();
		a.getMarks();
		a.calGrade();
		a.displayMarks();
	}
	
}

class Grade
{
	int mks,age;
	String g;
	Scanner input= new Scanner(System.in);
	
	void getMarks()
	{
		System.out.println("Enter marks of student");
		mks=input.nextInt();
		
		System.out.println("Enter age of student");
		age=input.nextInt();
		
				
	}
	
	void displayMarks()
	{
		System.out.println("Marks of student --->"+mks);
		
		System.out.println("Age of student --->"+age);
		
		System.out.println("Grade of student --->"+g);
				
	}
	
	/*
	 * A student has A grade if marks are more than 70 (marks > 60 if age is less than 15), B
	grade, if marks are between 61 and 70 (marks between 45 and 60 for age < 15) and C
	grade, if marks are less than 61 (marks less than 45 for age < 15) Write a program to
	print the grade for given marks and age
	 */
	void calGrade()
	{
		if(mks>70 && age<15)
			g="A";
		else 
		if(mks>61 && mks <=70 && age<15)
			g="B";
		else 
		if(mks<61 && mks>=45 && age<15)
			g="C";
		else if(mks<45)
			g="fail";
		else if(age>=15)
		{
			System.out.println("Invalid age");
			g="invalid";
		}
	}
}
