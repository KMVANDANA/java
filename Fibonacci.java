public class Fibonacci {
    public static void fibo(int n)
    {

        int a=0;
        int b=1;
        int c;
        System.out.print(""+a+""+b);
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c);
            a++;
            b++;
        }
    }

    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        f.fibo(8);

    }
}
