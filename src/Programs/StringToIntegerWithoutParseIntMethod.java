package Programs;

public class StringToIntegerWithoutParseIntMethod {

	public static void main(String[] args) {
		String s = "123";
	
		System.out.println(StringToNumber(s) + 10);
		System.out.println(converts(s) + 20);
		
//		StringToNumber(s);
//		int age=Integer.parseInt(s);
//		System.out.println(s+10);
//		System.out.println(age+10);

	}

	public static int converts(String ars) {
		char ch[] = ars.toCharArray();
		int sum = 0;
		int zeroasc = (int) '0';// 48 default
		for (int i = 0; i < ch.length; i++) {
			int asc = (int) ch[i];
			sum = sum * 10 + (asc - zeroasc);
		}
		return sum;
	}

	public static int StringToNumber(String ar) {
		int num = 0;
		int len = ar.length();
		for (int i = 0; i < len; i++) {
			num = num * 10 + ((int) ar.charAt(i) - 48);
		}
		return num;
	}
}
