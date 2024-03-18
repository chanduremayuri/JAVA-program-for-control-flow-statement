import java.util.Scanner ;
class Licenes
 {
	public static void main(String[] args) {
		{
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the age :");
           int age = sc.nextInt();
           if (age >=18)
           {
           	System.out.println("Enter the marks :");
           	double marks = sc.nextDouble();
            if(marks > 60)
            {
            	System.out.println("You passed the RTO test with more than 60% ");
            	System.out.println("So you are eligible for driving licenes ");
            }
            else 
            {
                System.out.println("You failes the test ");
                System.out.println("Now you have to reappear for the test ");
            }
           }
           else
           {
           	System.out.println("You are not eligible now try after " + (18 - age ) +" Years");
           }
		}
	}
}