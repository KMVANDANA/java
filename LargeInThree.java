import java.util.Scanner;

public class LargeInThree {
    public static void large(int a,int b,int c) {
        if(a>b && a>c){
            System.out.println("A is greater");
        }
        if(b>a && b>c)
        {
            System.out.println("B is greater");
        }

        else {
            System.out.println("C is greater");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        large(a,b,c);


    }
}
