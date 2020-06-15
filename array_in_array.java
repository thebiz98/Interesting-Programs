//get an array and another shorter array and insert the shorter array in the larger array at the position specified by the user
import java.io.*;
class array_in_array
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    int a[], b[], c[], p;
    void main()throws IOException
    {
        System.out.println("Enter the number of terms in the first array:");
        int l1=Integer.parseInt(ob.readLine());
        System.out.println("Enter the number of terms in the second array:");
        int l2=Integer.parseInt(ob.readLine());
        a=new int[l1];
        b=new int[l2];
        System.out.println("Enter the first array:");
        for(int i=0;i<l1;i++)
        {
            a[i]=Integer.parseInt(ob.readLine());
        }
        System.out.println("Enter the second array:");
        for(int i=0;i<l2;i++)
        {
            b[i]=Integer.parseInt(ob.readLine());
        }
        System.out.println("Enter the position of insertion:");
        p=Integer.parseInt(ob.readLine());
        int l=l1+l2;
        c=new int[l];
        int x=0;
        for(int i=0;i<p;i++)
        {
            c[x]=a[i];
            x++;
        }
        for(int i=0;i<l2;i++)
        {
            c[x]=b[i];
            x++;
        }
        for(int i=p;i<l1;i++)
        {
            c[x]=a[i];
            x++;
        }
        System.out.println("The array after insertion is:");
        for(int i=0;i<l;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
