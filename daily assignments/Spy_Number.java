package assignments;

public class Spy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1124;
		int original=num;
		int sum=0;
		int product=1;
		for(;num>0;)
		{
			int lastDigitNo=num%10;
			sum=sum+lastDigitNo;
			product=product*lastDigitNo;
			num=num/10;
		}
		System.out.println("Sum of digits:" + sum);
		System.out.println("Product of digits:" + product);

			if(sum==product) {
				System.out.println(original +" is a spy number");
			}else {
				System.out.println(original +" is not a spy number");
		}

	}

}
