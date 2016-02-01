package Generics_lambda.using_interfaces;

/**
 * Created by 984886 on 2/1/2016.
 */
public interface Pair<K,V> {
    public K getKey();
    public V getValue();

    default String defaultToString() {
        return "(" + getKey().toString() + ", " + getValue().toString() + ")";
    }

}
