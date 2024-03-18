import java.util.Scanner;

class BloodDonation 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();

		if (age < 20 )
		{
			System.out.println("You are kid . Try after " + (18-age)+ " years");
		}
		else
		{
			System.out.print("Have you consume alcohole or cigar : (yes/no) : ");
			String nasha  =sc.next().toLowerCase();
			if(nasha.equals("no"))
			{
            System.out.print("Enter your weight : ");
            double wt = sc.nextDouble();
            if(wt>=50)
            {
                System.out.println("we can pump your blood ");
            }
            else 
            {
            	System.out.println("Go and have some food and increase your weight");
            }
			}
			else
			{
				System.out.println("You can not donate the blood because you are in nasha");
			}
		}
	}
}