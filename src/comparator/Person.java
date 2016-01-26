package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by yubraj pokharel on 1/26/2016.
 */
public class Person {

    String fname, lname;
    int age;
    String email;

    public static ArrayList<Person> persons = new ArrayList<Person>();

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(String fname, String lname, int age, String email) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.email = email;
    }



    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        persons.add( new Person("yubraj","pokharel", 26, "a@gmail.com"));
        persons.add(  new Person("sudhan","pokharel", 26, "s@gmail.com"));
        persons.add( new Person("pitamber","pokharel", 26, "p@gmail.com"));
        persons.add(  new Person("radhika","pokharel", 26, "y@gmail.com"));

        //Sorting without using the lambda Expression
        System.out.println("\nWithout Lambda Expression");
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.fname.compareTo(o2.fname);
            }
        });
        for (Person p: persons) {
            System.out.println(p);
        }

        System.out.println("\nSorting using the lambda Expression");
        Collections.sort(persons, (Person p1, Person p2) -> p1.email.compareTo(p2.email));
        for (Person p2: persons) {
            System.out.println(p2);
        }

    }
}
