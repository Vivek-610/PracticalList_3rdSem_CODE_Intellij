package Part1;
import java.util.Scanner;
import java.lang.Math;

public class Code7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int arr[];
        arr=new int[n];
        int j,k;
        Double i;
        for(i=0.0,j=0;j<n;i++,j++)
        {
            arr[j]=(int)Math.pow(3,i);
        }
        for(j=0;j<n;j++)
        {
            for(k=n-j-1;k>=0;k--)
            {
                System.out.print("   ");
            }
            for(k=0;k<=j;k++)
            {
                System.out.printf("%2d ", arr[k]);
            }
            for(k=j-1;k>=0;k--)
            {
                System.out.printf("%2d ",arr[k]);
            }
            
            System.out.print("\n");
        }
       
        System.out.print("Prepared by : Vivek D Kapadia");
        System.out.print("19CE055");
    }
    
}
