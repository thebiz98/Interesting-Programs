//get a binary number and convert it into octal
import java.io.*;
class bin_oct
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        System.out.println("Enter the binary number:");
        String a= ob.readLine();
        int l=a.length();
        int r=l%3;
        if(r!=0)
        for(int i=1;i<=(3-r);i++)
        {
            a="0"+a;
        }
        l=a.length();
        int p=l-3,q=l;
        int c;
        String t="",oct="";
        while(p>=0)
        {
            t=a.substring(p,q);
            c=Integer.valueOf(t);
            oct=octal(c)+oct;
            p=p-3;
            q=q-3;
        }
        System.out.println("The octal value is: "+oct);
    }
    private int octal(int n)
    {
        int c=n;
        int s=0,r,i=0;
        while(c>0)
        {
            r=c%10;
            s=s+r*(int)Math.pow(2,i);
            c=c/10;
            i++;
        }
        return s;
    }
}
