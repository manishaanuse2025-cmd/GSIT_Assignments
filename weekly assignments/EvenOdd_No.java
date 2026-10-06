package assignments;

public class EvenOdd_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even Numbers are: ");

		for(int i=1;i<=20;i++)
		{
			if(i%2==0) {
				System.out.print(i +" ");
			} 
			
		}
		System.out.println("\n");
		System.out.println("Odd Numbers are: ");

		for(int i=1;i<=20;i++)
		{
			if(i%2!=0) {
				System.out.print(i +" ");
			} 
			
		}

	}

}
