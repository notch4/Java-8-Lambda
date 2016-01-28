package basic1.excercise_1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by 984886 on 1/26/2016.
 */
public class LambdaFuncRef2 {

    Function<Employee, String> empName = e->e.getName();
    Function<Employee, String> empName2 = Employee :: getName;

    //setters


    public void evaluater(){
        System.out.println("For getter");
        System.out.println(empName.apply(new Employee("yubraj")));
        System.out.println(empName2.apply(new Employee("Sudhan")));
    }

    public static void pickName(List<String> list, String startingLetter){
        Optional<String> found =
            list.stream()
                    .filter(name -> name.startsWith(startingLetter))
                    .findFirst();
        found.ifPresent(name->System.out.println(name));
    }

    public static void main(String[] args) {
        LambdaFuncRef2 lf2 = new LambdaFuncRef2();
        lf2.evaluater();
        System.out.println("----------------------------------");
        List<String> list = Arrays.asList("yubraj", "pokharel");
        pickName(list, "yubaj");
    }



}
