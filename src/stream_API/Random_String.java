package stream_API;

import java.util.Arrays;
import java.util.List;


/**
 * Created by 984886 on 1/27/2016.
 */
public class Random_String {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("I", "am", "legend");
        String[] finalString = strings.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(finalString));


    }
}
