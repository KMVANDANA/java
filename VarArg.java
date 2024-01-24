public class VarArg {

    static int sum(int ...arr)
    //static  int sum(int x,int ...arr)// x must be included
    {
        int result=0;
        for(int a:arr)
        {
            result=result+a;
        }
        //System.out.println(result);
        return result;
    }
    public static void main(String args[])
    { int c;
        c=sum(1,2,3,45,5);
       int d=sum();

        System.out.println(c);
        System.out.println(d);

    }
}
