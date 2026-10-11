package assignments;

public class CommonElements_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[]= {10,20,30,40,50};
		int num2[]= {30,40,60,70,50};
		System.out.print("Common elements :");
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(num1[i]==num2[j]) {
					int cm=num1[i];
					System.out.print(cm+ " ");
				}
				
			}
		}
	}

}
