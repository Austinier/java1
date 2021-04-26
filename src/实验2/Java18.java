package 实验2;
public class Java18 {
	public static void main(String[] args) {
		int num=30000-5000;
		double n=num/12;
		double a=5000*0.08+5000*0.1;
		int x=1;
		while(true)
		{
			if(x*0.12>n-a)
				break;
			else
				x++;
		}
		System.out.println("最小营业额应为"+(x+10000));
	}

}
