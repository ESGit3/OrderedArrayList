import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    public NoNullArrayList() {
        super();
    }

    public boolean add(T value) {
        if (value == null) {
            throw new IllegalArgumentException("null is not a valid input");
        }
        return super.add(value);
    }

    public void add(int i, T value) {
        if (value == null) {
            throw new IllegalArgumentException("null is not a valid input");
        }
        super.add(i, value);
    }

    public T set(int i, T value) {
        if (value == null) {
            throw new IllegalArgumentException("null is not a valid input");
        }
        return super.set(i, value);
    }
}


