package stream_API.lambdaLibrary;

import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Function;
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


    public static final Function<List<Employee>, String> sort_according_to_fname =
            (list) -> list.stream()
                        .sorted((x,y) ->
                                x.getFname().compareTo(y.getFname())
                        )
                        .map(e -> e.getFname() +" "+e.getLname() + "["+e.getAge()+"]")
                        .collect(Collectors.joining(" , "));

    public static final Function<List<Employee>, String> sort_according_to_fname_then_age =
            (list) -> list.stream()
                    .sorted(
                            Comparator.comparing(Employee::getFname).thenComparing(Employee::getAge)
                    )
                    .map(e -> e.getFname() +" "+e.getLname() + "["+e.getAge()+"]")
                    .collect(Collectors.joining(" , "));


    public static final Function<List<Employee>, String> sort_according_to_fname_then_age_in_decending =
            (list) -> list.stream()
                    .sorted(
                            (o1, o2) -> {
                                if(o1.getFname().compareToIgnoreCase(o2.getFname()) == 0){
                                    return o1.getAge()<o2.getAge()?1:o1.getAge()>o2.getAge()?-1:0;
                                }else
                                    return o1.getFname().compareToIgnoreCase(o2.getFname());
                            }
                    )
                    .map(e -> e.getFname() +" "+e.getLname() + "["+e.getAge()+"]")
                    .collect(Collectors.joining(" , "));

}
