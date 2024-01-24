public class Recursion1 {

    static  int fact(int x)
    {
       if(x==0 || x==1)
       {
           return 1;
       }
       else {
           return x * fact(x - 1);
       }
    }

    public static void main(String[] args) {
        int c=fact(5);
        System.out.println(c);

    }
}
