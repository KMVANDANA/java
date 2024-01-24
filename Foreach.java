public class Foreach {
    public static void main(String args[])
    {
//       /*  int arr[]={1,3,5,6,7,95,3,3};
//        float arr2[]={23.5f,67.8f,34.8f};
//        String arr3[]={"sokia","vansika","david"};
//        int b=arr.length;
//        System.out.println(b);
//        System.out.println(arr2.length);
//        System.out.println(arr3.length); */
//
//        //for(int i=0;i< arr3.length;i++)
//        /* for(int i= arr3.length-1;i>=0;i--)//for revers order
//        {
//            System.out.println(arr3[i]);
//        }
//        for(int j:arr)
//        {
//            System.out.println(j);
//        }*/
//
//        //multi arr
        int arr[];
        int arr1[][];
        arr1=new int[2][2];
        arr1[0][0]=23;
        arr1[0][1]=45;
        arr1[1][0]=35;
        arr1[1][1]=15;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }
    }
}
