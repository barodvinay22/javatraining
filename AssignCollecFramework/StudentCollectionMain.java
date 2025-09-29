import java.util.*;
import java.util.stream.Collectors;

public class StudentCollectionMain {
    public static void main(String args[]){
//        remove duplicate using HashSet()
        Set<StudentCollectionSayan> students = new HashSet<>();
        students.add(new StudentCollectionSayan(1,"sayan","maths",85));
        students.add(new StudentCollectionSayan(2,"tani","maths",65));
        students.add(new StudentCollectionSayan(3,"kate","english",95));
        students.add(new StudentCollectionSayan(4,"ram","history",85));
        students.add(new StudentCollectionSayan(1,"sayan","maths",90));
        System.out.println("Student list using Hashset: " +students);
// add to list
        List<StudentCollectionSayan> students1 = new ArrayList<>();
        students1.add( new StudentCollectionSayan(1,"sayan","maths", 85));
        students1.add(new StudentCollectionSayan(2,"tani","maths",65));
        students1.add(new StudentCollectionSayan(3,"kate","english",95));
        students1.add(new StudentCollectionSayan(4,"ram","history",85));
        students1.add(new StudentCollectionSayan(1,"sayan","maths",90));
//        remove duplicates without using HashSet()
        List<StudentCollectionSayan> uniqueStudents1 = new ArrayList<>();
        for(StudentCollectionSayan element : students1){//Iterate through original list students1
            if(!uniqueStudents1.equals(element)){
                 uniqueStudents1.add(element);
            }
        }
        System.out.println("Unique student list without HashSet():" +uniqueStudents1);

// remove duplicate using HashSet()
        Set<StudentCollectionSayan> uniqueStudents = new HashSet<>(students1);
        System.out.println("Unique student list: " +uniqueStudents);
        List<StudentCollectionSayan> uniqueStudentList = new ArrayList<>(uniqueStudents);
//   display all the students sorted by marks (highest first)
        Collections.sort(uniqueStudentList, Comparator.comparing(StudentCollectionSayan::getMarks).thenComparing(StudentCollectionSayan::getMarks));
        Collections.sort(uniqueStudentList,Collections.reverseOrder());
        System.out.println("Student list sorted by hight marks first:" +uniqueStudentList);

// group the students by course using a Map<String , List<Student>>
        Map<String,List<StudentCollectionSayan>> studentByCourse = uniqueStudentList.stream().collect(Collectors.groupingBy(StudentCollectionSayan::getCourse));
        System.out.println("Student list by course:" +studentByCourse);

//       group the students by course using a Map<String , List<Student>> without using stream()

        Map<String, List<StudentCollectionSayan>> groupedStudent = new HashMap<>();
        for(StudentCollectionSayan element : students1){//Iterate through original list students1
             //String course = "";
            if(!groupedStudent.containsKey(element)){
//                StudentCollectionSayan obj = new StudentCollectionSayan(1,"sayan","maths", 95);
                StudentCollectionSayan obj = new StudentCollectionSayan("maths");
                String course = obj.getCourse();
                groupedStudent.put(course,new ArrayList<>());
                groupedStudent.get(course).add(element);
            }

        }

        System.out.println("Grouped students without stream:" +groupedStudent);
        System.out.println(groupedStudent.keySet());


//        display name of the student who scored more than 75
        List<StudentCollectionSayan> studentlist = new ArrayList<>();
        for (StudentCollectionSayan val : uniqueStudentList){
            if(val.getMarks() > 75 ){
                studentlist.add(val);
            }
        }

        System.out.println("Students having more than 75%" +studentlist);









    }
}
