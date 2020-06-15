//enter an array and check if it is a palindromic array
class pali_array
{
    void main(int a[])
    {
        int l=a.length;
        int b[]=new int[l];
        int c=0;
        for(int i=l-1;i>=0;i--)//or for(int i=0,j=l-1;i++;j--){b[i]=a[j];}
        {
            b[l-1-i]=a[i];
        }
        for(int i=0;i<l;i++)
        {
            if(a[i]==b[i])
            {
                c++;
            }
        }
        if(c==l)
        {
            System.out.println("The array is palindromic");
        }
        else
        {
            System.out.println("The array is not palindromic");
        }
    }
}