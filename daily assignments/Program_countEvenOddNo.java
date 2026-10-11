package assignments;

public class Program_countEvenOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {11,24,35,42,56,67,80,93};
		int even=num[0];
		int odd=num[0];
		int counteven=0;
		int countodd=0;

		
		for(int index=0;index<num.length;index++)
		{
//			System.out.print(num[index]+" ");
			if(num[index]%2==0) {
				even=num[index];
				counteven++;
				System.out.print(even +" ");
				
			}
		} 
		System.out.print("\n"+ "count of even no :" + counteven +" ");
		
		System.out.println("\n");
		//for odd no
		for(int index=0;index<num.length;index++)
		{
//			System.out.print(num[index]+" ");
			if(num[index]%2!=0) {
				odd=num[index];
				countodd++;
				System.out.print(odd +" ");
				
			}
		} 
		System.out.print("\n"+ "count of odd no :" + countodd +" ");

	}

}
