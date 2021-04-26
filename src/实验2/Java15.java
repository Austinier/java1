package สตั้2;
public class Java15 {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
		{		
			int sum=0;
			for(int j=1;j<i/2+1;j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(sum==i)
				System.out.print(i+",");
		}
	}

}
