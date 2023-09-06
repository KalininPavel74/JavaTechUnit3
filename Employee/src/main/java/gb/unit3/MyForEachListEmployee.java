package gb.unit3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyForEachListEmployee<Employee> implements Iterable<Employee> {

    private List<Employee> list;
    public MyForEachListEmployee() {
        this.list = new ArrayList<>();
    }

    public List<Employee> add(List<Employee> list) {
        this.list.addAll(list);
        return this.list;
    }
    public int size() { return this.list.size(); }

    public Employee get(int i) { return this.list.get(i); }

    public Iterator<Employee> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Employee> {

        private int index = 0;

        public boolean hasNext() {
            return index < size();
        }

        public Employee next() {
            return get(index++);
        }

        public void remove() {
            throw new UnsupportedOperationException("not supported yet");
        }
    }
}