import java.util.Scanner;
class IncreasePay 
{
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the monthly target :");
		 int target = sc.nextInt();
		 if(target>90)
		 {
		 	System.out.println("Increase the pay of employee by 3%");
		 }
		 else 
		 {
		    System.out.println("Increase the pay of employee by 1%");	
		 }
	}
}