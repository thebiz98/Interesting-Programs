//get today's date and the date of birth of a person and calculate the person's age
import java.io.*;
class age
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        System.out.println("Enter today's date (in the format dd/mm/yyyy):");
        String day=ob.readLine();
        System.out.println("Enter the date of birth (in the format dd/mm/yyyy):");
        String dob=ob.readLine();
        int d1=Integer.parseInt(day.substring(0,2));
        int d2=Integer.parseInt(dob.substring(0,2));
        int m1=Integer.parseInt(day.substring(3,5));
        int m2=Integer.parseInt(dob.substring(3,5));
        int y1=Integer.parseInt(day.substring(6,10));
        int y2=Integer.parseInt(dob.substring(6,10));
        int y=y1-y2;
        int m=m1-m2;
        int d=d1-d2;
        if(d<0)
        {
            d=d+30;
            if(m<0)
            {
                m=12+m-1;
                y=y-1;
            }
        }
        else if(d>0)
        {
            if(m<0)
            {
                m=12+m;
                y=y-1;
            }
        }
        System.out.println("The age of the person is: "+y+" years "+m+" months "+d+" days.");
        System.out.println("Enter y to run the program again or anything else to exit:");
        String ch=ob.readLine();
        ch=ch.trim();
        ch=ch.toLowerCase();
        char c=ch.charAt(0);
        switch (c)
        {
            case 'y': main();
                      break;
            default:  System.exit(0);
        }
    }
}