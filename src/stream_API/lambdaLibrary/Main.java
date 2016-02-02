package stream_API.lambdaLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 984886 on 2/2/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Yubraj", "Pokharel", 26, "male"));
        emp.add(new Employee("Christain", "bale", 42, "male"));
        emp.add(new Employee("Brad", "Pitt", 52, "male"));
        emp.add(new Employee("Jared", "Leto", 44, "male"));
        emp.add(new Employee("Jolie", "Queen", 48, "female"));

        //problem 1
        //total number of emp whose lastname starts with letter "p" and are male
        System.out.println("[Problem 1] Total Result: "+
                emp.stream()
                    .filter(x -> x.getSex().equals("male"))
                    .filter(x -> x.lname.startsWith("p"))
                        .map(e -> e.fname)
                    .count()
                +" matching results"
        );

        //problem 2:
        //list of employee whose first letter of last name is greater then D and are male
        System.out.println(
                "[Problem 2] List of results: "+
                        emp.stream()
                            .filter(x -> x.getSex().equals("male"))
                             .filter(x -> x.getLname().charAt(0) > 'D')
                            .map(x -> x.getFname()+" "+x.getLname())
                            .collect(Collectors.joining(" , "))
        );

        //problem 3
        //create lambda library to find total number of employee who are male and first letter of last name is greater
        // then D and are male
        System.out.printf("\n[Problem 3] Total number of Filtered Employee, Male: " + Library.count_total_using_library.apply(emp, "male", 'D'));
        //same for female
        System.out.printf("\n[Problem 3] Total number of Filtered Employee, Female: " + Library.count_total_using_library.apply(emp, "female", 'D'));


        //problem 4
        //list the employee who are male and total length of first name letter count is4 and first letter of last name is greater the E
        System.out.printf("\n\n[Problem 4] List of results: " + Library.list_total_after_filter.apply(emp, 4, "male", 'D'));

    }
}
