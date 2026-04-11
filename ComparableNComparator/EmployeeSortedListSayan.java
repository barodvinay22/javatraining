import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortedListSayan {
        public static void main(String[]args){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(0);
            list.add(3);
            list.add(5);
            list.add(10);
            Collections.sort(list); //collections used to sort integer
            System.out.println(list);
//sorting of emplyees
            List<EmplyeeSayanDemo> emplyees = new ArrayList<>();
            emplyees.add(new EmplyeeSayanDemo(1,"Sayan"));
            emplyees.add(new EmplyeeSayanDemo(2,"tani"));
            emplyees.add(new EmplyeeSayanDemo(3,"Neel"));
            Collections.sort(emplyees);// need to implement Comparable
//            public class EmplyeeSayanDemo implements Comparable<EmplyeeSayanDemo>
//            also this
//            @Override
//            public int compareTo(EmplyeeSayanDemo emplyeeSayanDemo) {
//                return this.empId - emplyeeSayanDemo.empId;
//            }
            System.out.println(emplyees);
//            Collections.sort(emplyees,new EmployeComparatorSayan());
            System.out.println(emplyees);
//            lambda expresiion java 8
            Collections.sort(emplyees,(EmplyeeSayanDemo emplyeeSayanDemo1, EmplyeeSayanDemo emplyeeSayanDemo2)-> emplyeeSayanDemo1.getEmpName().compareTo(emplyeeSayanDemo2.getEmpName()));
            System.out.println(emplyees);
//            method referance
            Collections.sort(emplyees, Comparator.comparing(EmplyeeSayanDemo::getEmpName));
            System.out.println(emplyees);
            //sorting of emplyees using name and address
            List<EmplyeeSayanDemo> emplyeesWithAddressSayan = new ArrayList<>();
            emplyeesWithAddressSayan.add(new EmplyeeSayanDemo(1,"Sayan", "Ind"));
            emplyeesWithAddressSayan.add(new EmplyeeSayanDemo(2,"tani", "Australia"));
            emplyeesWithAddressSayan.add(new EmplyeeSayanDemo(3,"Neel", "Canada"));
            Collections.sort(emplyeesWithAddressSayan, Comparator.comparing(EmplyeeSayanDemo::getEmpName).thenComparing(EmplyeeSayanDemo::getEmpAddress));
            System.out.println(emplyeesWithAddressSayan);
        }
    }

