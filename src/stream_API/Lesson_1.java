package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 984886 on 1/28/2016.
 */
public class Lesson_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("i", "am", "legend");
        List<String> list2 = list.stream() //convert the list into the stream   --default is serial stream
                                .filter(s->s.length() > 2)  //filter thw word which length is greater then 2
                                .filter(s -> !s.contains(""+'a')) //filter the words which does not start with a
                                .collect(Collectors.toList()); //makes the list of the filtered elements

        System.out.println(list2);
    }
}
