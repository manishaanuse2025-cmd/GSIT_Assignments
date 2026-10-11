package assignments;

public class Seperate_PositiveNegative_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]= {-4,7,0,-2,9,0,-8,5};
		
		for(int i=0;i<no.length;i++)
		{
			if(no[i]>0) { 

				System.out.print(no[i]+ " ");
			}
		}
		for(int i=0;i<no.length;i++) {
			if(no[i]<0) {
			System.out.print(no[i] +" ");
			}
		}
		for(int i=0;i<no.length;i++) {
			if(no[i]==0) {
				
			System.out.print(no[i] +" ");
			}
		}
	}

}
