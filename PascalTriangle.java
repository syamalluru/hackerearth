import java.util.*;
public class PascalTriangle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n+1][n+1];
		for(int line=1;line<=n;line++)
		{
			for(int space=1;space<=n-line;space++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=line;i++)
			{
				if(i==1 || i==line)
					arr[line][i]=1;
				else
				{
					arr[line][i]=arr[line-1][i-1]+arr[line-1][i];
				}
				System.out.print(arr[line][i]+" ");
			}
			System.out.println();
		}
	}
}