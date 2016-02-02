package stream_API.lambdaLibrary;

/**
 * Created by 984886 on 2/2/2016.
 */
public class Employee {
    String fname;
    String lname;
    int age;
    String sex;

    public Employee(String fname, String lname, int age, String sex) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.sex = sex;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
