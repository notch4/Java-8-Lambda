package basic1.excercise_1;

import java.util.function.Function;

/**
 * Created by 984886 on 1/26/2016.
 */
public class LambdaFuncRef2 {

    Function<Employee, String> empName = e->e.getName();
    Function<Employee, String> empName2 = e->e.getName();

    public void evaluater(){
        System.out.println(empName.apply(new Employee("yubraj")));
        System.out.println(empName2.apply(new Employee("Sudhan")));
    }

    public static void main(String[] args) {
        LambdaFuncRef2 lf2 = new LambdaFuncRef2();
        lf2.evaluater();
    }



}
