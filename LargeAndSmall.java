public class LargeAndSmall {
    public static void main(String[] args) {
        int[] arr={12,56,21,1,45,78,99,98};
        int l=arr.length;
        int a=arr[0];
        int b=arr[0];

        {
            for (int i = 0; i < l - 1; i++) {

                if(a>arr[i])
                {
                    a=arr[i];
                }
                if(b<arr[i])
                {
                    b=arr[i];
                }


            }
            System.out.println("small "+a+" large "+b);

        }

    }
}
