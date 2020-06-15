//get an array and search the element given by user in it using binary search
import java.io.*;
class binary_search
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    int a[], n, t, up, lp, mid,x;
    void main()throws IOException
    {
        System.out.println("Enter the length of the array:");
        n=Integer.parseInt(ob.readLine());
        a=new int[n];
        System.out.println("Enter the terms of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(ob.readLine());
        }
        System.out.println("Enter the term to be searched:");
        t=Integer.parseInt(ob.readLine());
        int min, pos;
        for(int i=0;i<n-1;i++)
        {
            min=a[i];
            pos=i;
            for(int j=i;j<n;j++)
            {
                if(min>a[j])
                {
                    min=a[j];
                    pos=j;
                }
            }
            a[pos]=a[i];
            a[i]=min;
        }
        int lp=0,up=n-1,mid=(lp+up)/2;
        int p=search(lp,up,mid);
        if(p==-1)
        {
            System.out.println("The term is not present in the string");
        }
        else
        {
            System.out.println("The term is at position: "+(p+1));
        }
    }
    private int search(int lb,int ub,int mid)
    {
        if(lb>ub)
        {
            x=-1;
        }
        else
        if(a[mid]==t)
        {
            x=mid;
        }
        else if(a[mid]<t)
        {
            x=search(mid+1,ub,(lb+ub)/2);
        }
        else if(a[mid]>t)
        {
            x=search(lb,mid-1,(lb+ub)/2);
        }
        return x; 
    }
}
