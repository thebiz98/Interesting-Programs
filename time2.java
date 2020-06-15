//get the time in 24 hr format and print it in 12 hr format. eg: 13:30:10hrs  1:30:10 p.m
import java.io.*;
class time2
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        System.out.println("Get the time:");
        String t=ob.readLine();
        int h=Integer.parseInt(t.substring(0,2));
        int m=Integer.parseInt(t.substring(3,5));
        int s=Integer.parseInt(t.substring(6,8));
        int hrs,min=m,sec=s;
        String pd="";
        if(h>12)
        {
            hrs=h-12;
            pd="p.m.";
        }
        else
        {
            hrs=h;
            pd="a.m.";
        }
        System.out.println("The time in 12 hr format is: "+hrs+":"+min+":"+sec+" "+pd);
    }
}

            