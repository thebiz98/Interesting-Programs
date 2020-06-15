//get a string and count the number of palindromic words in it
import java.io.*;
class pali_words
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    String s,t="",w="";
    char c;
    int l,count=0;
    void main()throws IOException
    {
        System.out.println("Ënter the string:");
        s=ob.readLine();
        s=s.trim();
        s=s+" ";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            {
                w=w+c;
                t=c+t;
            }
            else
            {
                if(w.equalsIgnoreCase(t))
                {
                    count++;
                }
                w="";
                t="";
            }
        }
        System.out.println("There are "+count+" palindromic numbers in the given string");
    }
}