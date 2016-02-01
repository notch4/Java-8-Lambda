package Generics_lambda.using_interfaces;

/**
 * Created by 984886 on 2/1/2016.
 */
public class Impl1<K,V> implements Pair<K,V>{
    private K key;
    private V value;

    public Impl1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }

    @Override
    public String toString() {
        return defaultToString();
    }
    public static void main(String[] args) {
        Impl1<String, Integer> p = new Impl1("Bob", 1001);
        System.out.println(p);
    }
}
