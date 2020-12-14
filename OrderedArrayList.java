public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
        super();
    }

    public OrderedArrayList(int capacity) {
        super(capacity);
    }

    public boolean add(T value) {
        if (value == null) {
            throw new IllegalArgumentException("null is not a valid input");
        }
        for (int i = 0; i < this.size(); i++) {
            if (value.compareTo(this.get(i)) <= 0) {
               super.add(i, value);
               return true;
            }
            super.add(0, value);
            return true;
        }
    }

    public void add(int i, T value) {

    }

    public T set(int i, T value) {

    }
}