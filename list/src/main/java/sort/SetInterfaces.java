package sort;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaces {
    public static void main(String[] args) {
        Set stud=new HashSet();
        stud.add("apple");
        stud.add("banana");
        stud.add("orange");
        stud.add("banana");
        System.out.println("hash set:"+stud);

        Set stud1=new TreeSet();
        stud1.add("apple");
        stud1.add("banana");
        stud1.add("orange");
        stud1.add("banana");
        System.out.println("tree set:"+stud1);

        Set stud2=new LinkedHashSet();
        stud2.add("orange");
        stud2.add("apple");
        stud2.add("banana");
        stud2.add("banana");
        System.out.println("linkedhash set:"+stud2);
    }
}
