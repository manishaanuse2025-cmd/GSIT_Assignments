package assignments;

public class Array_DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]= {10,20,30,20,40,10,50,30,60};
		System.out.print("Duplicate elements: ");

		for(int i=0;i<no.length;i++)
		{
			for(int j=i+1;j<no.length;j++) {
				if(no[i]==no[j]) {
					System.out.print(no[i] + " ");
					

					 
				}
				;


			}

		}	


	}

}
