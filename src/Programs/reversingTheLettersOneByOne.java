package Programs;

public class reversingTheLettersOneByOne {

	public static void main(String[] args) {

		String words = "Name Is James";
		String rev="";
		int leng=words.length();
		for(int i=leng-1;i>=0;i--) {
			rev=rev+words.charAt(i);
		}
		System.out.println("Reverse String is : "+rev);
		
		reversingTheLettersOneByOne.ReverseTypetwo("Name Is James");
	}
public static void ReverseTypetwo(String Letters) {
	
		StringBuffer word = new StringBuffer(Letters);
		System.out.println(word.reverse());
	}

}
