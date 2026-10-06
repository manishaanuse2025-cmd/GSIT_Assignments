package assignments;

public class Assigment_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int num=12345;
			int originalNum=num;
			int reverse=0;
			for(;num>0;)
			{
				int lastDigit=num%10;
				reverse=reverse*10+lastDigit;
				num=num/10;
			 
			}
			  System.out.println("Reverse:"+reverse);
			  if(reverse==originalNum)
			  {
				  System.out.println("No is palindrom");
			  } else
				  System.out.println("No is not palindrom");

		
	}

}
