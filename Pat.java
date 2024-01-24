public class Pat {
    static void pat(int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sum(int n)
    {
        int s=0;
        for(int i=0;i<n;i++)
        {
            s=s+i;
        }
        return s;
    }
    public static void main(String[] args) {
         pat(6);
         System.out.println(sum(10));



    }
}
