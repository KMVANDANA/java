public class StringArray {
    public static void main(String[] args) {
        String[] firstSArr=new String[] {"VAndana","sokia","vansika"};
        String[] secSArr=new String[3];
        secSArr[0]="hello";
        secSArr[1]="this is";
        secSArr[2]="sookia ";
        System.out.println(firstSArr[1]);
        for (int i=0;i<secSArr.length;i++)
        {
            System.out.println(secSArr[i]);
        }

    }
}

