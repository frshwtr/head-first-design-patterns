package uk.frshwtr.ItEnum;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {
    Iterator<?> it;

    public IteratorEnumeration(Iterator<?> it) {
        this.it = it;
    }
    @Override
    public boolean hasMoreElements() {
        return this.it.hasNext();
    }

    @Override
    public Object nextElement() {
        return this.it.next();
    }
}
