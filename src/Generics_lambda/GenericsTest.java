package Generics_lambda;

import java.util.stream.Stream;

/**
 * Created by 984886 on 2/1/2016.
 */
public class GenericsTest {


        public static <T> int countOccurrences(T[] arr, T occ){
            int count = 0;
            for (T a: arr){
                if(occ == null){
                    if (a == null) count++;
                }else{
                    if(a == occ) count++;
                }

            }

            return count;
        }

        public static<T> int countOccurrences2(T[] arr, T occ){
            return
                    (int) Stream.of(arr).filter
                            ( x -> {
                                        if(occ == null) return (x == null);
                                        return (x.equals(occ));
                                    }
                            ).count();
        }

        public static void main(String[] args) {
            String[] arr = {"a", "b", "c", "b"};
            System.out.println(countOccurrences(arr, "b"));
            System.out.println(countOccurrences2(arr, "b"));

            Object[] arr2 = {"a", null, "c", null, null};
            System.out.println(countOccurrences(arr2, null));
            System.out.println(countOccurrences2(arr2, null));
        }
}
