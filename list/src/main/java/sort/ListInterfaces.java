package sort;

import java.util.LinkedList;

public class ListInterfaces {
    public static void main(String[] args) {
        java.util.ArrayList student= new java.util.ArrayList<>();
        student.add("sahas");
        student.add("jashwanth");
        student.add("aman");
        student.add("sahas");

        System.out.println(student);
        System.out.println(student.get(1));
        System.out.println(student.remove(2));
        System.out.println(student);

        System.out.println("linked list:");
        LinkedList employee=new LinkedList<>();
        employee.add("greesh");
        employee.add("ravi");
        employee.add("lakhan");

        System.out.println(employee);
        System.out.println(employee.get(1));
        System.out.println(employee.remove(2));
        System.out.println(employee);
    }
}
