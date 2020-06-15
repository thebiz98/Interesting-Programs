//get an array and print the number of multiples of each digit
class multiples
{
    int l,c=0;
    void main(int a[])
    {
        l=a.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                if(a[j]%a[i]==0)
                {
                    c++;
                }
            }
            System.out.println(a[i]+" has "+c+" multiples in the array.");
            c=0;
        }
    }
}
