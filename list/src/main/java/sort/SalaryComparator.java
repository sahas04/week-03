package sort;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e3,Employee e4) {
        return Double.compare(e3.getSalary(),e4.getSalary());
    }
}
