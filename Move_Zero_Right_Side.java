import java.util.*;
public class Move_Zero_Right_Side {
    public static int[] pushZerosToEnd(int[] arr) {
        int a[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                a[k]=arr[i];
                k=k+1;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(j<a.length)
            {
                arr[j]=a[j];
            }
            else
            {
                arr[j]=0;
            }
        }
        return arr;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=pushZerosToEnd(a);
        System.out.println("The Soution Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
