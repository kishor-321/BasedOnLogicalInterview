package guideSeries1;

public class ReversePreservingString {
public static void main(String[] args) {
	String inputstring ="I Am Not String";
	char[] inputArray=inputstring.toCharArray();
	char[] resultArray=new char[inputstring.length()];
	// for inserting spaces in array in result
	for(int i=0; i<inputstring.length();i++) {
		if (inputArray[i]==' ') {
			resultArray[i]=' ';
		}
	}
	int j=resultArray.length-1;
	for(int i=0; i<inputstring.length();i++) {
		if (inputArray[i]!=' ') {
			if (resultArray[j]==' '){
				j--;
			}
			resultArray[j]=inputArray[i];
			j--;
		}
	}
	System.out.println(inputstring+" : "+String.valueOf(resultArray));
}
}
