package practice.pro.review_dataStructureAndAlgorithms.collection;

import java.util.*;


public class ArrayListReview {


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jora"));
        students.add(new Student(2, "Chris"));
        students.add(new Student(3, "Jessica"));
        students.add(new Student(4, "Thomas"));

        System.out.println(" = For i loop ===================== =");
        // iterate over the list using for loop:
        for(int i=0; i<students.size(); i++){
            System.out.println(students.get(i));
        }

        System.out.println(" = Iterator looping ===================== =");
        // using iterator
        Iterator it= students.iterator();
        while(it.hasNext()) System.out.println(it.next());

        System.out.println(" = ===================== =");
//        while(((ListIterator<?>) it).hasPrevious()) System.out.println(((ListIterator<?>) it).previous());

        System.out.println(" = For each loop ===================== =");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println(" = Lambda ===================== =");
        students.forEach(System.out::println);

        System.out.println(" = Sorting Elements ===================== =");
        students.sort(Comparator.comparing(Student::name));
        students.forEach(System.out::println);

        System.out.println(" = Sorting Elements ===================== =");
        students.sort(Comparator.comparing(Student::id).reversed());
        students.forEach(System.out::println);


    }



}
