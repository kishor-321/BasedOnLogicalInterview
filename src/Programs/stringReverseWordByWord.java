package Programs;

public class stringReverseWordByWord {

	public static void main(String[] args) {
		
	
	String name = "My Name Is Kishor";
	String a[] = name.split(" ");
	{

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
}