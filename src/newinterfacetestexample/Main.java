package newinterfacetestexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


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