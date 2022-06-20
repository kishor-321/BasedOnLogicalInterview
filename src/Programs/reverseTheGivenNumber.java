package Programs;

public class reverseTheGivenNumber {

	public static void main(String[] args) {
		int  rem, rev=0, num=4521521;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
}
