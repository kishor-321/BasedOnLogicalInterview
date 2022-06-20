package Programs;

public class sumOfDivisibleBy7 {

	public static void main(String[] args) {
		int sum=0, count=0;
				for(int i=100;i<200;i++) {
					if(i%7==0) {
						sum=sum+i;
						count++;
					}
				}
		System.out.println("addition Of 100 to 200 which are divisible by 7 is : "+sum);
		System.out.println("For count the number between 100 to 200 divisible by 7 : "+count);
	}

}
