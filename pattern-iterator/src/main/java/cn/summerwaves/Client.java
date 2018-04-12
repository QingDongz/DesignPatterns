package cn.summerwaves;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Iterator{
    public Object next();

    public boolean hasNext();

}

class ConcreteIterator implements Iterator {
    private List list = new ArrayList();
    private int cursor = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }



    public Object next() {
        Object object = null;
        if (this.hasNext()) {
            object = this.list.get(cursor++);
        }
        return object;
    }

    public boolean hasNext() {
        if (cursor == list.size()) {
            return false;
        }
        return true;
    }
}

interface Aggregate{

    public void add(Object object);

    public void remove(Object object);

    public Iterator iterator();

}

class ConcreteAggregate implements Aggregate{

    private List list = new ArrayList();


    public void add(Object object) {
        list.add(object);
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public Iterator iterator() {
        return new ConcreteIterator(list);
    }

}


public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("fuck");
        aggregate.add("test");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }
}
