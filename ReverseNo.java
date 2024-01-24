import java.util.Scanner;

public class ReverseNo {
    public static void reverse(int n)
    {
        int s=0;
        int k=n;

        while(n>0)
        {

            int mod=n%10;
             s=s*10+mod;
              n=n/10;

        }
        System.out.println(s);

    }

    public static void main(String[] args) {

        ReverseNo rs=new ReverseNo();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        rs.reverse(a);

    }
}
