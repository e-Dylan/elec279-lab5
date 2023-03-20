public class Pair<T> {
    private T first; // first member of pair
    private T second; // second member of pair

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (!(other instanceof Pair))
            return false;

        Pair<?> otherPair = (Pair<?>) other;

        return (this.first == otherPair.getFirst() && this.second == otherPair.getSecond());
    }

    public String toString() {
        return "Wife's name: " + this.first + "; Husband's name: " + this.second;
    }
}