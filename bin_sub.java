//get two binary numbers and subtract them using binary subtraction
import java.io.*;
class bin_sub
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        System.out.println("Enter the first binary number:");
        int b1=Integer.parseInt(ob.readLine());
        System.out.println("Enter the second binary number:");
        int b2=Integer.parseInt(ob.readLine());
        int max;
        if(b1>b2)
        {
            max=b1;
        }
        else
        {
            max=b2;
        }
        int l=0;
        while(max>0)
        {
            max=max/10;
            l++;
        }
        int l1=l;
        int a1[]=new int[l];
        int a2[]=new int[l];
        int x=0;
        for(int i=l-1;i>=0;i--)
        {
            a1[i]=b1%10;
            if(b2%10==1)
            {
                x=0;
            }
            else
            {
                x=1;
            }
            a2[i]=x;
            b1=b1/10;
            b2=b2/10;
        }
        int r1,r2,c=0,s;
        int r[]=new int[l];
        while(l>0)
        {
            r1=a1[l-1];
            r2=a2[l-1];
            s=c+r1+r2;
            if(s==0)
            {
                r[l-1]=0;
                c=0;
            }
            else if(s==1)
            {
                r[l-1]=1;
                c=0;
            }
            else if(s==2)
            {
                r[l-1]=0;
                c=1;
            }
            else if(s==3)
            {
                r[l-1]=1;
                c=1;
            }
            l--;
        }
        int a,b;
        int p=l1-1;
        if(c==1)
        {
            while(p>=0)
            {
                a=r[p];
                b=a+c;
                if(b==1)
                {
                    r[p]=1;
                    c=0;
                }
                else if(b==2)
                {
                    r[p]=0;
                    c=1;
                }
                p--;
            }
            System.out.print("The difference is: ");
            for(int i=0;i<l1;i++)
            {
                System.out.print(r[i]);
            }
        }
        else if(c==0)
        {
            System.out.print("The difference is: -");
            for(int i=0;i<l1;i++)
            {
                if(r[i]==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
        }
    }
}
