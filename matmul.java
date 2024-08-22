package huuu;

public class matmul {
	public static void main(String[] args) {
		int [][] a= {{1,1},{1,1}};
		int [][] b= {{1,1},{1,1}};
		int [][] c= new int[2][2];
		
		int rows = a.length;
		int cols = a[0].length;
		int cols2 = b[0].length;
		 int i,j,k;
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				for(k=0;k<cols2;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
	
		}
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		

}
}
