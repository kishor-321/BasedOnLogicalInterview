package Programs;

public class averageOfSunAndOddNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int c = 0;
		int num = 52;
		for (int i = 1; i <= num; i++) 
			if (i % 2== 0) {//using the ! for even nd odd number
				sum = sum + i;
				c++;
			}
			double avg = sum / c;
			System.out.println(avg);
			System.out.println(c);
		}

	}
