package stream_API.lambdaLibrary;

/**
 * Created by 984886 on 2/2/2016.
 */
@FunctionalInterface
public interface TriFunction<S, T, U, R>{
    R apply(S s, T t, U u);
}