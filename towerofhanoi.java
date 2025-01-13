/*import java.util.Scanner;
public class towerofhanoi
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of rings");
        int n=sc.nextInt();

        fun(n,"a","b","c");
    }
    public static void fun(int n, String source, String auxiliary, String destination)
    {
        if(n==1)
        {
            System.out.println("Move ring from " + source + " to " + destination);
           return;
        }
        fun(n-1,source,destination,auxiliary);
        System.out.println("Move ring from " + source + " to " + destination);
        fun(n-1,auxiliary,source,destination);
    }
}*/
