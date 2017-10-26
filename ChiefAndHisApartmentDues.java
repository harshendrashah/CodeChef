import java.util.*;
class ChiefAndHisApartmentDues
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            int due=0,f=0;
            for(int k=0;k<n;k++)
            {
                if(arr[k]==0)
                {
                    f=1;
                    due=due+1100;
                }
                else if(arr[k]==1)
                {
                    if(f==1)
                    due=due+100;
                }
            }
            System.out.println(due);
        }
    }
} 
