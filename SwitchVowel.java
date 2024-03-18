import java.util.Scanner;
class SwitchVowel
{
  public static void main(String[] args)
   {
  	Scanner sc = new Scanner(System.in);
  	System.out.print("Entrt the Character : ");
  	char ch = sc.next().toLowerCase().charAt(0);

  	switch(ch)
  	{
  	case 'a':
  	case 'e':
  	case 'i':
  	case 'o':
  	case 'u':System.out.println(ch +" is a VOWEL");break;
  	default : System.out.println(ch +" is a CONSONENT");break;
  	}
  }
}