//print the sentence "RAM IS A BOY" as "UDP LV D ERB" (R+3=U, A+3=D, ......)
class coding
{
    String s="RAM IS A BOY",st="";
    int l;
    void main()
    {
        s=s.toUpperCase();
        l=s.length();
        for(int i=0;i<l;i++)
        {
            if((int)s.charAt(i)!=32)
            {
                if((int)s.charAt(i)>87)
                {
                    st=st+(char)((s.charAt(i)+3)-26);
                }
                else
                {
                    st=st+(char)(s.charAt(i)+3);
                }
            }
            else
            {
                st=st+' ';
            }
        }
        System.out.println("The coded string is: "+st);
    }
}
