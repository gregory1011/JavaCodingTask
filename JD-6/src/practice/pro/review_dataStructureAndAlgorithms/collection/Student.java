package practice.pro.review_dataStructureAndAlgorithms.collection;

import java.util.Objects;

public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    // if we ever work with hashTable, hashSet or hashMap, then we need to override hashCode method!
    // why we need to implement the hashCode: because of Set data structure to make sure duplicates are not allowed!
   // if we don't override the hashCode method then the Student objects stored in Set can have duplicates!
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
