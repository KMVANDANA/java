import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String[] strNames=new String[] {"vandal","Nokia","vanish"};
                Arrays.sort(strNames);
        System.out.println("sorted list case sensitive");
        for(int i=0;i<strNames.length;i++)
        {
            System.out.println(strNames[i]);
        }


    }
}
