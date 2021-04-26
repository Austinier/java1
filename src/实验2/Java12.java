package สตั้2;

public class Java12 {
	public static void main(String[] args) {
		int n = 8;
		for(int i = 1; i <= n; i++)
		{
		
			for(int j = 1;j <= n-i ; j++)
			{
				System.out.print("    ");
			}
			
			for(int k = 1; k <= i; k++)
			{
				System.out.printf("%4d",(int)Math.pow(2,k-1));			
			}
			
			for(int x = i - 1; x > 0; x--)
			{
				System.out.printf("%4d",(int)Math.pow(2,x-1));
			}
			System.out.println();
		}
	
	}
}

