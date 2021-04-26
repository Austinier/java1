package 实验2;
public class Java9 {

	public static void main(String[] args) {
		double rate=1.609f;
		int num=20;
		System.out.println("千米    英里          千米         英里");
		for(int i=1;i<=10;i++,num+=5)
		{
			System.out.printf("%-4d    %-6.3f        %-3d        %-3.3f\n",i,i*rate,num,num/rate);
		}
	}

}
