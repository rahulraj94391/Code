package LinkList;

public class Pair<V,T> {
    private V first;
    private T second;

    Pair(V first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public V getFirst() {
        return first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getSecond() {
        return second;
    }

}
