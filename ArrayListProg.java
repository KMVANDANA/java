import java.util.ArrayList;

public class ArrayListProg {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");

            System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        arrayList.clear();
        System.out.println("After Removing"+arrayList.size());

    }
}
