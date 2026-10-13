package assignments;

public class Program_secondLargestNo_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {99,99,12,45,7,89,34,89,56};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			} else if(arr[i]>secondLargest && arr[i]!=largest)
			{
				secondLargest=arr[i];
			}
		}
		System.out.println("Largest:" +largest);
		System.out.println("Second Largest:" +secondLargest);
	}

}
