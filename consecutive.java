//get an array and print the number of times each digit occurs consecutively
class consecutive
{
    int l, c=0;
    void main(int a[])
    {
        l=a.length;
        for(int i=0;i<l-1;i++)
        {
            if(a[i]==a[i+1])
            {
                c++;
            }
        }
        System.out.println("The number of consecutive pairs are: "+c);
    }
}
