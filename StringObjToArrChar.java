public class StringObjToArrChar {
    public static void main(String[] args) {
        String s="Hello World";
        char[] StringArray;
        StringArray=s.toCharArray();
        for(int i=0;i<=StringArray.length-1;i++)
        {
            System.out.println(StringArray[i]);
        }
    }
}
