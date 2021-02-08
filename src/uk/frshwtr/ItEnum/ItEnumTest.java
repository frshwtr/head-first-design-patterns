package uk.frshwtr.ItEnum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ItEnumTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("NextItem");
        IteratorEnumeration it = new IteratorEnumeration(list.iterator());

        while(it.hasMoreElements()) {
            System.out.println(it.nextElement());
        }
    }
}
