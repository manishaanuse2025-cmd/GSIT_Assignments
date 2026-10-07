package assignments;

public class MagicNo_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=172;
		int original=num;
		for(;num>=10;)
		{ 		int sum=0;

			for(;num>0;)  {
			int lastDigit=num%10;
			sum=sum+lastDigit;
			num=num/10;
			} 
			num=sum;
			sum=0;
		}
		System.out.println(num);
		if(num==1)
		{
			System.out.println(original +" is a magic number");
		} else
		{
			System.out.println(original +" is not a magic number");

		}
	}

}
