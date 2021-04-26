package สตั้2;

public class Java14 {

	public static void main(String[] args) {
		double num=3;
		double sum=0;
		for(double i=1;i<=97;i+=2,num+=2)
		{
			sum+=i/num;
		}
		System.out.println(sum);
	}

}
