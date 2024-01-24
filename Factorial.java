public class Factorial
{
    public static void fact(int n)
{
   int fact=1;
   while(n>0)
   {
       fact=fact*n;
       n=n-1;
   }
    System.out.println(fact);
}

        public static void main(String[] args) {
            Factorial f=new Factorial();
            f.fact(5);

        }
}

