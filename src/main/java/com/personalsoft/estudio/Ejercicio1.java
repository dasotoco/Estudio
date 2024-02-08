package com.personalsoft.estudio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio1 {

    public static Stream<Group> createGroupStream() {
        Group groupA = new Group();
        groupA.setGroupName("Group A");
        Group groupB = new Group();
        groupB.setGroupName("Group B");
        Student s1 = new Student("Juan", 5);
        Student s2 = new Student("Carlos", 7);
        Student s3 = new Student("Luis", 8);
        Student s4 = new Student("Santiago", 8);
        Student s5 = new Student("Felipe", 9);
        Student s6 = new Student("Leo", 10);
        List<Student> studentA = new ArrayList<>();
        studentA.add(s1);
        studentA.add(s2);
        studentA.add(s3);
        List<Student> studentB = new ArrayList<>();
        studentB.add(s4);
        studentB.add(s5);
        studentB.add(s6);
        groupA.setStudents(studentA);
        groupB.setStudents(studentB);
        List<Group> groups = new ArrayList<Group>();
        groups.add(groupA);
        groups.add(groupB);
        return groups.stream();
    }
}
