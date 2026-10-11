package assignments;

public class MissingNo_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,3,4,5,7,8,9,10};
		int n=num.length+1;
		int expectedNum=0;
		int sum=0;
		
		 expectedNum=n*(n+1)/2;
		
//		System.out.println(expectedNum);
		for(int i=0;i<num.length;i++) {
		 sum=sum+num[i];
		 
		}
		System.out.println("Missing Number:" + (expectedNum-sum));
	}

}
