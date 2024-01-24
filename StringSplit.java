public class StringSplit {
    public static void main(String[] args) {
        String str="hello_leintathem";
         String[] temp;
         String delimeter=" ";
         temp=str.split(delimeter);
         for(int i=0;i<temp.length;i++)
         {
             System.out.println(temp[i]);
         }
        System.out.println(" ");
         str="hello_leintathem";
         delimeter="\\.";
         temp=str.split(delimeter);
         for(int i=0;i<temp.length;i++)
         {
             System.out.println(temp[i]);
         }
        System.out.println(" ");
         temp=str.split(delimeter,2);
         for (int i=0;i< temp.length;i++)
         {
             System.out.println(temp[i]);
         }
    }
}
