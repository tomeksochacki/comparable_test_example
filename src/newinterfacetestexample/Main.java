package newinterfacetestexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

/*
        Employee[] employee = new Employee[3];
        employee[0] = new Employee(100);
        employee[1] = new Employee(400);
        employee[2] = new Employee(21);

        System.out.println("Before sort");
        for (Employee emp: employee) {
            System.out.println(emp.salary);
        }

        Arrays.sort(employee, Collections.reverseOrder());
        System.out.println(employee[0].compareTo(employee[1]));

        System.out.println("After sort");
        for (Employee emp2: employee) {
            System.out.println(emp2.salary);
        }
*/
        Student[] student = new Student[4];
        student[0] = new Student(1000);
        student[1] = new Student(34);
        student[2] = new Student(321);
        student[3] = new Student(21);

        System.out.println("After sort");
        for (Student s2: student) {
            System.out.println(s2.salary);
        }

        System.out.println("Before sort");
        Arrays.sort(student);
        for (Student s:student) {
            System.out.println(s.salary);
        }

        Teacher[] teacher = new Teacher[4];
        teacher[0] = new Teacher(34, 1500);
        teacher[1] = new Teacher(45, 3500);
        teacher[2] = new Teacher(36, 3000);
        teacher[3] = new Teacher(20, 1000);

        System.out.println("Before sort");
        for (Teacher t: teacher) {
            System.out.println("salary is: " + t.salary + " "+ ", age is: " + t.age);
        }

        Arrays.sort(teacher);
        System.out.println("After sort");
        for (Teacher t2: teacher) {
            System.out.println("salary is: " + t2.salary + " " + "age is: " + t2.age);

        }



/*
        int[] tab = new int[3];
        tab[0] = 30;
        tab[1] = -1;
        tab[2] = 3;
        Arrays.sort(tab);
        System.out.println(tab);
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
*/
    }
}

interface nameInterface{

    double PI = 3.14;

    void something();
}

interface somethingTwo{

}

class A{

}

class Student implements Comparable{

    Student(double salary){
        this.salary = salary;
    }
    double salary;

    double getSalary(){
        return this.salary;
    }

    @Override
    public int compareTo(Object o) {

        Student sent = (Student)o;
        if (this.salary<sent.salary){
            return -1;
        } else if (this.salary>sent.salary){
            return 1;
        }
        return 0;
    }
}

class Employee implements nameInterface, somethingTwo, Comparable  {

    @Override
    public void something() {

    }
    Employee(double salary){
        this.salary = salary;
    }
    double salary;
    double getSalary(double salary){
        return this.salary;
    }

    @Override
    public int compareTo(Object o) {

        Employee sent = (Employee)o;
        if(this.salary< sent.salary){
            return -1;
        } else if (this.salary > sent.salary){
            return 1;
        }
        return 0;
    }

}

class Teacher implements Comparable{

    double age;
    double salary;
    Teacher(double age, double salary){
        this.age = age;
        this.salary = salary;
    }

    double getAge(){
        return this.age;
    }

    double getSalary(){
        return this.salary;
    }

    @Override
    public int compareTo(Object o) {
        Teacher sent = (Teacher)o;
        if (this.salary < sent.salary){
            return -1;
        }
        if (this.salary > sent.salary){
            return 1;
        }
        return 0;
    }

}