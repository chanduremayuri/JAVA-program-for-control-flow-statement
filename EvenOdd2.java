import java.util.Scanner;
class EvenOdd2
{
 public static void main(String[] args) 
 {
 	Scanner sc = new Scanner(System.in);
 	int num = sc.nextInt();
 	//System.out.println(((num/2)*2==num)?"Even":"odd");
 	System.out.println((( num/2.0)==(num/2))?"Even":"odd");
 }
}