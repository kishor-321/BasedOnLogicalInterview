package sagarGivenPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		for (int i = 1; i <=num ; i++) {
			fact = fact * i;
		}
		System.out.println("Factor of given number "+num+ "is : "+fact);
	}

}
