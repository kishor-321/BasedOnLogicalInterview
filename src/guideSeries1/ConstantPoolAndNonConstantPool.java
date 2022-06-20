package guideSeries1;

public class ConstantPoolAndNonConstantPool {

	public static void main(String[] args) {
//		Create new objects 
		String n1=new String("Hello World");
		String n2=new String("Hello World");
		
//		Create same Literals  object
		String str1="Hello World";
		String str2="Hello World";
		
//		Comparing new objects
		System.out.println(n1==n2);
		System.out.println(n2==n1);
		
//		Comparing Literals Objects
		System.out.println(str1==str2);
		System.out.println(str2==str1);
	}

}
