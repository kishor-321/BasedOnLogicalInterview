package sagarGivenPrograms;

class RemoveJunkInString {

	public static void main(String[] args) {
		//removing the special character
		String str="ADFSdsa DSDadas sdasda ada ^&*()";

		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}
}
