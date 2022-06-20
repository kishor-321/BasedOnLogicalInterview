package Programs;

public class factorOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int fact = 1;
		for (int i = 1; i <=num ; i++) {
			fact = fact *i;
		}
		System.out.println("Factor of given number "+num+ "is : "+fact);
	}

}
