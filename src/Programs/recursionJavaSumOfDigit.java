package Programs;

public class recursionJavaSumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sumOfDigit(259));//1+2+3+4=10  2+5+9=16
	}	
	public static int sumOfDigit(int num) {	
		if(num==0) {
			return 0;
		} else {
			return (num%10+sumOfDigit(num/10));
		}
	}
}
