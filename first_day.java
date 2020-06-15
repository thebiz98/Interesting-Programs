//get today's date and day and print the first day of the year
import java.io.*;
class first_day
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        String days[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        int mon[]={31,29,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter today's date int the format dd/mm/yyyy:");
        String date=ob.readLine();
        System.out.println("Enter today's day:");
        String day=ob.readLine();
        String fday="";
        int d=Integer.parseInt(date.substring(0,2));
        int m=Integer.parseInt(date.substring(3,5));
        int y=Integer.parseInt(date.substring(6,10));
        int nd=0;
        for(int i=0;i<m-1;i++)
        {
            nd=nd+mon[i];
        }
        nd=nd+d;
        int ndx=(nd%7)-1;
        System.out.println(ndx);
        int c=0;
        for(int i=0;i<7;i++)
        {
            if(day.equalsIgnoreCase(days[i]))
            {
                c=i;
            }
        }
        int p=c-ndx;
        if(p==0)
        {
            fday=day;
        }
        else if(p<0)
        {
            fday=days[7+p];
        }
        else if(p>0)
        {
            fday=days[p];
        }
        System.out.println("The first day of the year was: "+fday);
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
