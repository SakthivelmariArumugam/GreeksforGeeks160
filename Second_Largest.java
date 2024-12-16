import java.util.*;
public class Second_Largest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int large1=Integer.MIN_VALUE;
        int large2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]==large1 || a[i]==large2)
            {
                continue;
            }
            else if(a[i]>large1)
            {
                large2=large1;
                large1=a[i];
            }
            else if(a[i]>large2)
            {
                large2=a[i];
            }
            else
            {
                continue;
            }
        }
       if(a.length<2 ||large2==Integer.MIN_VALUE || large1==Integer.MIN_VALUE)
       {
           System.out.println(-1);
       }
       else
       {
           System.out.println(large2);
       }
    }

}
