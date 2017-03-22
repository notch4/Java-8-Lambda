import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by ypokhrel on 3/20/2017.
 */
public class SummaryStatitics {

    public static List<Integer> myNumbers = new ArrayList<>();

    public static void addNumber(int num){
        myNumbers.add(num);
    }

    public static void main(String[] args) {
        SummaryStatitics summaryStatitics = new SummaryStatitics();
        summaryStatitics.addNumber(32);
        summaryStatitics.addNumber(22);
        summaryStatitics.addNumber(25);
        summaryStatitics.addNumber(52);
        summaryStatitics.addNumber(28);
        summaryStatitics.addNumber(82);
        summaryStatitics.addNumber(92);

        IntSummaryStatistics intSummaryStatistics = myNumbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getMax());

    }

}
