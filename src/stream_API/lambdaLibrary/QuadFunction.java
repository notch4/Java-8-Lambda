package stream_API.lambdaLibrary;

/**
 * Created by 984886 on 2/2/2016.
 */
@FunctionalInterface
public interface QuadFunction<S,T,U,V, R> {
    R apply(S s, T t, U u, V v);
}
