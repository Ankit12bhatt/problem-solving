import java.util.*;
public class PlusMinus   //Solution
{
    public static void main(String args[])
    {
        int c0=0,c1=0,c2=0,i,n;
        double rc0=0.00, rc1=0.00, rc2=0.00;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                c0=c0+1;
            }
            else if(arr[i]<0)
            {
            c1=c1+1;
            }
            else
            {
                c2=c2+1;
            }
        }
        rc0= c0;
        rc1= c1;
        rc2= c2;
        System.out.println(+(rc2/n));
        System.out.println(+(rc1/n));
        System.out.println(+(rc0/n));

    }
}
