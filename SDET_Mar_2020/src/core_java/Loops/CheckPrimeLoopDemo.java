package core_java.Loops;
import java.util.*;

public class CheckPrimeLoopDemo {

	public static void main(String[] args)
   {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the no:");
		int num = scan.nextInt();
		
		scan.close();
		
		boolean flag = false;
		int i=2;
		while(i<=num/2) //No number is divisible by more than its half
		{
		  if(num%i ==0)
		  {
			flag=true;
		  }
		  else
		  {
			flag= false;
		  }
		  i++;
		}
		
		if(flag)
		{
			System.out.println(num + " is not a prime number");
		}
		else
		{
			System.out.println(num + " is a prime number");
		}
	}

}
