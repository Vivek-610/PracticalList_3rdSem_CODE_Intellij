package Part1;
import java.util.Scanner;
import java.util.Arrays;

public class Code8 {
    static int min(int a,int b)
    {
        return (a<b) ? a : b;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[30];
        Scanner sc=new Scanner(System.in);
        int i=0;
        int t=0;
        int size=0;
        System.out.println("Enter heights of tree in clock wise fashion"+ '\n' +"Enter zero to end entering the numbers");
        while(true)
        {
            t=sc.nextInt();
            if(t==0)
            break;
            arr[i]=t;
            i++;
            size++;
        }
        sc.close();
        int[] a= new int[size+2];
        int[] b= new int[size+2];
        for(i=1;i<=size;i++)
        {
            a[i]=arr[i-1];
        }
        for(i=1;i<=size;i++)
        {
            b[i]=arr[i-1];
        }
        Arrays.sort(a);

        int[] Final = new int [6];
        for(i=2;i<5;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(a[i]==b[j])
                {
                    if(j==1)
                    {
                        t=b[j+1];
                    }
                    else if(j==size)
                    {
                        t=b[j-1];
                    }
                    else{
                    t=min(b[j-1],b[j+1]);
                    }
                    Final[i]=t + b[j] +1;
                }
            }
        }
        
        Arrays.sort(Final);
        System.out.print("\n");
        System.out.println("Miniumum possible travel time is : "+Final[3]);
        System.out.println("Coded by Vivek D Kapadia \n19CE055");
    }
    
}


 

 

