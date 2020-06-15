//find the product of the left and right diagonals of a 5x5 matrix
import java.io.*;
class matrix_5x5
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    int a[][]=new int[5][5];
    int p=1;
    void main()throws IOException
    {
        System.out.println("Enter the terms of the matrix:");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                a[i][j]=Integer.parseInt(ob.readLine());
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==j)
                {
                    p=p*a[i][j];
                }
                if((i+j==4)&&(i!=2))
                {
                    p=p*a[i][j];
                }
            }
        }
        System.out.println("The product of the left and right diagonals is:"+p);
    }
}
