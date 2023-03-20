public class Triple<T1, T2> {
    private T1 first;
    private T2 second;
    private T1 third;

    public Triple(T1 first, T2 second, T1 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public void setThird(T1 third) {
        this.third = third;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public T1 getThird() {
        return third;
    }

    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (!(other instanceof Triple))
            return false;

        Triple<?, ?> otherTriple = (Triple<?, ?>) other;

        if (this.first == otherTriple.getFirst() && this.third == otherTriple.getThird())
            return true;

        return false;
    }

    public String toString() {
        return "Departure city: " + this.first + "; Distance: " + this.second + "; Arrival city: " + this.third;
    }

}
