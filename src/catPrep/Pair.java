package catPrep;

public class Pair<K,T> {
    private K key;
    private T value;
    public Pair(K key, T value) {}
    void setK(K k) {
        key = k;
    }
    void setV(T v) {
        value = v;
    }
    public K getK() {
        return key;
    }
    public T getV() {
        return value;
    }
}



class Main {
    public static void main(String[] args) {
        Pair<String,Integer> v1 = new Pair<String,Integer>("Isaac",12);
    }
}
