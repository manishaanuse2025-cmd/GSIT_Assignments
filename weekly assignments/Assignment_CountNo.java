package assignments;

public class Assignment_CountNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int reverse=0;
		int count=0;
		for(;num>0;)
		{
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
			count++;
		}
		   System.out.println(reverse);
		   System.out.println(count);


	}

}
