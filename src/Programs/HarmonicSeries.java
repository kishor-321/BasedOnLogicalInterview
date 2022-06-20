package Programs;

public class HarmonicSeries {

	public static void main(String[] args) {
		int i=1,num=5;
		double hhrm=0.0;
		while(i<=num) {
			System.out.println("1/"+i+"+");
			hhrm=hhrm+(double)1/i;
			i++;
		}
		System.out.println("sum of harmonic series is : "+hhrm);
	}

}
