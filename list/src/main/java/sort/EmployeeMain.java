package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emp= new ArrayList<>();
        Employee emp1=new Employee(101,"sahas",20000);
        Employee emp2=new Employee(104,"jashwanth",22000);
        Employee emp3=new Employee(102,"aman",25000);

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        System.out.println("before sorting");
        System.out.println(emp);

        Collections.sort(emp,new IdComparator());
        System.out.println("after sorting on id");
        System.out.println(emp);

        System.out.println("sorting based on name");
        Collections.sort(emp,new NameComparator());
        System.out.print(emp);

        System.out.println();
        System.out.println("sorting based on salary");
        Collections.sort(emp,new SalaryComparator());
        System.out.println(emp);

    }
}
