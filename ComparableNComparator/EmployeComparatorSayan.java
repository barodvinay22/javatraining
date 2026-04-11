import java.util.Comparator;

public class EmployeComparatorSayan implements Comparator<EmplyeeSayanDemo> {

    @Override
    public int compare(EmplyeeSayanDemo emplyeeSayanDemo1, EmplyeeSayanDemo emplyeeSayanDemo2) {
        return emplyeeSayanDemo1.getEmpName().compareTo(emplyeeSayanDemo2.getEmpName());
//        name of first employee getting compared to name of second employee
    }
}
