package assignments;

public class Assignment_ArmStrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int original=num;
		int armNo=0;
		
		for(;num>0;)
		{
			int lastDigit=num%10;
			armNo=armNo+lastDigit*lastDigit*lastDigit;
			num=num/10;
		}
			System.out.println(armNo);
			if(original==armNo)
			{
				System.out.println("No is ArmStrom No");
			} else
			{ 
				System.out.println("No is not ArmStrom No");

			}
	}

}
