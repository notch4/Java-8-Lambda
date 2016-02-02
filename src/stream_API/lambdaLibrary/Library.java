package stream_API.lambdaLibrary;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Created by 984886 on 2/2/2016.
 */
public class Library {

    public static final TriFunction<List<Employee>, String, Character, Long> count_total_using_library =
        (list, sex, ch) -> list.stream()
                            .filter(x -> x.getSex().equals(sex))
                            .filter(x -> x.getLname().charAt(0) > ch)
                            .count();


    public static final QuadFunction<List<Employee>, Integer, String, Character, List<String>> list_total_after_filter =
            (list, len, sex, ch) ->
                    list.stream()
                        .filter(x->x.getSex().equals(sex))
                        .filter(x -> x.getFname().length() ==len)
                        .filter(x -> x.getLname().charAt(0) > ch)
                        .map(x -> x.getFname()+" "+x.getLname())
                        .collect(Collectors.toList());


}
