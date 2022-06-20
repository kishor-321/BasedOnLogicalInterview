package guideSeries1;

public class ReverseUsingRecursionMethodNumber {

	public static void main(String[] args) {
		//Recursion Method For Reverse For Number
		rev(123456);
		
//		using simple way for reverse the number
		int num=123;
		while (num> 0) {
			int rev=num%10;
			System.out.print(rev); // run with new line
			num=num/10;	
		}
	
	
		
	}

	private static void rev(int number) {
	//Recursion Method 
		if (number <10) {
			System.out.println(number);
			return;
		}
		else {
			System.out.print(number%10);
			rev(number/10);
		}
	}
}
