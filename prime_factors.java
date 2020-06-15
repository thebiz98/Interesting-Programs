//get a number and print its prime factorisation
import java.io.*;
class prime_factors
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        System.out.println("Enter the number:");
        int a=Integer.parseInt(ob.readLine());
        int r=a,p=1,c=1;
        String f="";
        while(p<a)
        {
            if((r%c)==0)
            {
                if(prime(c)==true)
                {
                    r=r/c;
                    p=p*c;
                    f=f+c+" ";
                    c=1;
                }
            }
            c++;
        }
        f=f.trim();
        System.out.println("f initial: "+f);
        f=f.replace(" ","x");
        System.out.println("The prime factorisation is: "+f);
    }
    private boolean prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if((n%i)==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
