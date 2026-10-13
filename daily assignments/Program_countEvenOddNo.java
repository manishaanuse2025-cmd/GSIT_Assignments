package assignments;

public class Program_countEvenOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {11,24,35,42,56,67,80,93};
		
		int counteven=0;
		int countodd=0;

		
		for(int index=0;index<num.length;index++)
		{
//			System.out.print(num[index]+" ");
			if(num[index]%2==0) {
				counteven++;
				} else 
					countodd++;
		} 
		System.out.println("count of even no :" + counteven +" ");
		
		System.out.println("count of odd no :" + countodd +" ");

	}

}
