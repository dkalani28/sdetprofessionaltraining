package core_java.Conditional_Statements;

//if-elseif ladder : single if, single else but multiple elseif
// where there are independent multiple conditions to test

public class FindDigitsInNumber 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12121215;
		
		if(n<100 && n>=10)
		{
			System.out.println("2-digit");
		}
		else if(n>=100 && n<1000)
		{
			System.out.println("3-digit");
		}
		else if(n<10000 && n>=1000)
		{
			System.out.println("4-digit");
		}
		else if(n<100000 && n>=10000)
		{
			System.out.println("5-digit");
		}
		else
		{
			System.out.println("number is not in 1 & 99999");
		}
	}

}
