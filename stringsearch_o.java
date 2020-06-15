//get a large string and find the occurence of a small string in it. (as a complete word)
import java.io.*;
class stringsearch_o
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    String s, t, sc="";
    int l,cd=0;
    char c;
    void main()throws IOException
    {
        System.out.println("Ënter the large string:");
        s=ob.readLine();
        s=s.trim();
        s=s+" ";
        l=s.length();
        System.out.println("Enter the string to be searched:");
        t=ob.readLine();
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            {
                sc=sc+c;
            }
            else
            {
                if(sc.equalsIgnoreCase(t))
                {
                    cd++;
                }
                sc="";
            }
        }
        System.out.println(t+" occurs "+cd+" times in "+s);
        cd=0;
        
    }
}
