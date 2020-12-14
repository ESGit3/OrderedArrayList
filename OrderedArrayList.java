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
        boolean temp = false;
        int i = 0;
        while (!temp && i < size()) {
            if (value.compareTo(this.get(i)) <= 0) {
                temp = true;
            } else {
                i++;
            }
        }
        super.add(i, value);
        return true;
    }

    public void add(int i, T value) {
        this.add(value);
    }

    public T set(int i, T value) {
        if (value == null) {
            throw new IllegalArgumentException("null is not a valid input");
        }
        T temp = this.get(i);
        super.remove(i);
        this.add(value);
        return temp;
    }
}