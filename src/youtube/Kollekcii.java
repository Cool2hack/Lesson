package youtube;

import java.util.*;

public class Kollekcii {
    public static void main(String[] args) {
        //Collection, add, size, remove, iterator, toArray;
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection.remove("4");

        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
