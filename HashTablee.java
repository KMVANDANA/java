import java.util.Hashtable;
import java.lang.Integer;

public class HashTablee {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put("one",1);
        ht.put(2,"one");
        ht.put("one",3);
        ht.put("one",4);
        System.out.println(ht.get("one"));

        System.out.println(ht.get(2));
        System.out.println(ht.size());



    }
}
