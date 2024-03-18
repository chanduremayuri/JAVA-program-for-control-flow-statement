import java.util.Scanner;
class Army 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age :");
		int age = sc.nextInt();

		if(age >= 18)
		{
			System.out.print("Enter the height :");
			double ht = sc.nextDouble();
			if(ht >= 162)
			{
              System.out.print("Enter your weight ");
              double wt = sc.nextDouble();
              if(wt >=56)
              {
              	System.out.println(" Congratulations !! You are eligible for joining army");
              }
              else 
              {
              	System.out.println("Sorry you are not eligible");
              }
			}
			else 
			{
				System.out.println("Your height is not matched with army criteria ");
			}
		}
	    else 
	    {
	    	System.out.println("Your height does not fit with critera of army ");
	    	System.out.println("Try after " + (18 - age)+ " years.");
	    }
	}
}