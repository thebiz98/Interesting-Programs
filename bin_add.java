//get two binary numbers and find their sum
import java.io.*;
class bin_add
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
        int a1[]=new int[l];
        int a2[]=new int[l];
        for(int i=l-1;i>=0;i--)
        {
            a1[i]=b1%10;
            a2[i]=b2%10;
            b1=b1/10;
            b2=b2/10;
        }
        int r1,r2,c=0,s;
        String r="";
        while(l>0)
        {
            r1=a1[l-1];
            r2=a2[l-1];
            System.out.println("r1= "+r1);
            System.out.println("r2= "+r2);
            System.out.println("c=  "+c);
            s=c+r1+r2;
            System.out.println("s=  "+s);
            if(s==0)
            {
                r="0"+r;
                c=0;
            }
            else if(s==1)
            {
                r="1"+r;
                c=0;
            }
            else if(s==2)
            {
                r="0"+r;
                c=1;
            }
            else if(s==3)
            {
                r="1"+r;
                c=1;
            }   
            l--;
            s=0;
        }
        if(c==1)
        {
            r="1"+r;
        }
        System.out.println("The binary addition of the given numbers is: "+r);
        System.out.println("Enter y to run the program again or anything else to exit:");
        String ch=ob.readLine();
        ch=ch.toLowerCase();
        char cho=ch.charAt(0);
        if(cho=='y')
        {
            main();
        }
        else
        {
            System.exit(0);
        }
    }
}
