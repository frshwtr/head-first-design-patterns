package uk.frshwtr.IteratorPattern;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {
    public MenuItem next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
