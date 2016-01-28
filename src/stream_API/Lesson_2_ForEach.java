package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 984886 on 1/28/2016.
 */

/**
 * here what are we doing
 * 1. convert the list into stream by using .stream()
 * 2. map each element like n = n*n  : map(n -> n*n)
 * 3. get the distinct result after mapping : distinct()
 * 4. we limit our result into 3 : limit(3)
 * 5. then we store the result as a list
 *
 * Its much similar like a sql statement:
 * SELECT DISTINCT feild*feild as output from list LIMIT(3)
 */

public class Lesson_2_ForEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3,5,6,2,1,5,2,6,3,9);
        List<Integer> output = list.stream().map(n -> n*n).distinct().limit(3).collect(Collectors.toList());
       output.forEach(n -> System.out.println(n));
        System.out.println("Out put as array");
        Integer[] numbers = list.stream().map(n->n*n).distinct().limit(3).toArray(Integer[]::new);

        for (Integer i:numbers) {
                System.out.println(i);
            }
    }
}
