package codesoft;
import java.util.Scanner;
public class task2 {
	
		public static void main(String[] args)
		{
			int CL,CD,DE,java,CN;
			float total,percentage;

		
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the marks of all subject : ");
			System.out.println("Enter marks of C Language : ");
			CL=scan.nextInt();
			System.out.println("Enter the marks of Compiler design : ");
			CD=scan.nextInt();
			System.out.println("Enter the marks of Development engineering : ");
			DE=scan.nextInt();
			System.out.println("Enter the marks of java : ");
			java=scan.nextInt();
			System.out.println("Enter the marks of Computer network : ");
			CN=scan.nextInt();
			
			
			total=CL+CD+DE+java+CN;
			percentage=total/5;
			
			
			System.out.println("Total Marks are : "+total);
			System.out.println("Percentage is : "+percentage);
			
			if(percentage>=90){
				System.out.println("The Grade is : A+");
			}
			else if(percentage>=80){
				System.out.println("The Grade is : A");
			}
			else if(percentage>=70){
				System.out.println("The Grade is : B+");
			}
			else if(percentage>=50){
				System.out.println("The Grade is : B");
			}
			else if(percentage>=35){
				System.out.println("The Grade is : C");
			}
			else{
				System.out.println("Result is : Fail...");
			}
			
			
			
			
		}

	}
