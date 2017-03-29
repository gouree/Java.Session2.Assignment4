import java.util.*;
public class TestDemo {
	
	public static void main(String args[])
	{
		int num;
		int age, marks, grade;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number");
		num=input.nextInt();
		if(num==0)
			System.out.println("You have entered zero");
		else if (num>0)
			System.out.println(+num+" is positive..You have entered positive number");
		else
			System.out.println(+num+" is negative.. You have enetered negative number");
		
		System.out.println("Enter your age");
		age= input.nextInt();
		
		System.out.println("Enter your marks");
		marks= input.nextInt();
				
				
	}

}
