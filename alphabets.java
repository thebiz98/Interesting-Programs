//get a string and arrange its words and alphabets in alphabetical order
import java.io.*;
class alphabets
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    String s;
    int wn=0;
    int l;
    void main()throws IOException
    {
        input();
    }
    void input()throws IOException
    {
        System.out.println("Enter the string:");
        s=ob.readLine();
        s=s.trim();
        s=s+" ";
        l=s.length();
        convert();
    }
    int wordnum(String st)
    {
        for(int i=0;i<l;i++)
        {
           if(st.charAt(i)==' ')
           {
               wn++;
            }
        }
        return wn;
    }
    void convert()
    {
        String sarray[]=new String[wordnum(s)];
        int p=0;
        int x=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                sarray[x]=s.substring(p,i);
                p=i+1;
                x++;
            }
        }
        sort(sarray);
    }
    void sort(String w[])
    {
        String t="";
        for(int i=0;i<wn-1;i++)
        {
            for(int j=0;j<wn-1;j++)
            {
                if(w[j].compareTo(w[j+1])>0)
                {
                    t=w[j];
                    w[j]=w[j+1];
                    w[j+1]=t;
                }
            }
        }
        System.out.println("The sorted word array:");
        for(int i=0;i<wn;i++)
        {
            System.out.println(w[i]);
        }
        display(w);
    }
    String wordsort(String x)
    {
        char ch[]=x.toCharArray();
        char tmp;
        String t="";
        int len=ch.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-1;j++)
            {
                if(ch[j]>ch[j+1])
                {
                    tmp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            t=t+ch[i];
        }
        return t;
    }
    void display(String a[])
    {
        System.out.println("The words and their alphabets in ascending order are:");
        for(int i=0;i<wn;i++)
        {
            System.out.println(wordsort(a[i]));
        }
    }
}
