package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by 984886 on 2/2/2016.
 */
public class SortingUsingLambda {
    //sort by decreasing lengths of words
//    List<String>words = Arrays.asList("Tom", "Joseph", "Richard");
//    Stream<String>longestFirst
//            = words.stream().sorted((String x, String y) ->
//            (new Integer(y.length()).compareTo(new Integer(x.length()))));
//    System.out.println(longestFirst.collect(Collectors.toList()));
//output: Richard, Joseph, Tom


    public static void main(String[] args) {
        List<String> words = Arrays.asList("Tom", "Joseph", "Richard");
        Stream<String> finalList = words.stream()
                                    .sorted((String first, String second) ->
                                            (new Integer (second.length()).compareTo(new Integer(first.length()))));

        System.out.println(finalList.collect(Collectors.toList()));

    }
}
