import java.util.Scanner;

public class SwapTwo {
    public static void swapNo(int a,int b)
    {
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a+"b="+b);
    }
    public  static void swapTwoNo(int a,int b)
    {
        a=a+b;
        a=a-b;
        b=b-a;
        System.out.println("a="+a+"b="+b);
    }

    public static void main(String[] args) {

        SwapTwo st=new SwapTwo();
        Scanner sc1=new Scanner(System.in);
        int x=sc1.nextInt();
        int y=sc1.nextInt();
        st.swapNo(x,y);
        st.swapTwoNo(x,y);


    }
}
