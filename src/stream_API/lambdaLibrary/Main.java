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
        emp.add(new Employee("Brad", "Pitt", 56, "male"));
        emp.add(new Employee("Jared", "Leto", 48, "male"));
        emp.add(new Employee("Jared", "Leto", 46, "male"));
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

        //problem 5
        //sort list according to first name
        System.out.println("\n\n[Problem 5] Sorted list: "+Library.sort_according_to_fname.apply(emp));

        //problem 6 first name then age
        System.out.println("[Problem 6] Sorted list: "+Library.sort_according_to_fname_then_age.apply(emp));

        //problem 7 first name then age but in desc order
        System.out.println("[Problem 7] Sorted list: "+Library.sort_according_to_fname_then_age_in_decending.apply(emp));


//          OutPut
//        [Problem 1] Total Result: 0 matching results
//        [Problem 2] List of results: Yubraj Pokharel , Christain bale , Brad Pitt , Brad Pitt , Jared Leto , Jared Leto
//
//        [Problem 3] Total number of Filtered Employee, Male: 6
//        [Problem 3] Total number of Filtered Employee, Female: 1
//
//        [Problem 4] List of results: [Brad Pitt, Brad Pitt]
//
//        [Problem 5] Sorted list: Brad Pitt[52] , Brad Pitt[56] , Christain bale[42] , Jared Leto[48] , Jared Leto[46] , Jolie Queen[48] , Yubraj Pokharel[26]
//        [Problem 6] Sorted list: Brad Pitt[52] , Brad Pitt[56] , Christain bale[42] , Jared Leto[46] , Jared Leto[48] , Jolie Queen[48] , Yubraj Pokharel[26]
//        [Problem 7] Sorted list: Brad Pitt[56] , Brad Pitt[52] , Christain bale[42] , Jared Leto[48] , Jared Leto[46] , Jolie Queen[48] , Yubraj Pokharel[26]*/

    }
}
