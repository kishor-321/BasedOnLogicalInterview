package sagarGivenPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int from=1;
		int end =100;
		int sum=0;
		
		for(int i=from; i<=end; i++) {
			int n=i;
			int temp=0;
			int a=2;
		
			
			while(a<=(n/2)) {
				if((n%a)==0) {
					temp++;
					break;
				}
				a++;
			}
			if(temp==0 && i !=1) {
				sum=sum+i;
			}
		}
		System.out.println("The Sum of all Prime number is : "+sum);
	}

}
