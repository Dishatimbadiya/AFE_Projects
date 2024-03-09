package app;

public class Board {
	int board[][];
	Board()
	{
		int n=10,data=n*n;
		board=new int [n][n];
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<n;j++)
				{
					board[i][j]=data;
					data--;
				}
			}
			else
			{
				for(int j=n-1;j>=0;j--)
				{
					board[i][j]=data;
					data--;
				}
			}
		}
	}
	public void printBoard()
	{
		int n=board.length;
	    int len = String.valueOf(n * n).length();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				String format = String.format("%-" + len + "s", board[i][j]);
	            System.out.print(format + " ");
			}
			System.out.println("");
		}
	}
}
