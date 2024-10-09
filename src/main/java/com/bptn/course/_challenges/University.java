package com.bptn.course._challenges;

import java.util.*;
import java.util.stream.Collectors;


class University {

    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public Student getStudent(long studentId) {
        for (Student s : students) {
            if (s.getStudentId() == studentId) {
                return s;
            }
        }
        return null;
    }

    public List<Student> searchStudent(String userNamePrefix) {
        return students.stream()
                .filter(s -> s.getUserName().startsWith(userNamePrefix))
                .collect(Collectors.toList());
    }

    public boolean deleteStudent(long studentId) {
        return students.removeIf(s -> s.getStudentId() == studentId);
    }

    @Override
    public String toString() {
        return "University{" +
                "students=" + students +
                '}';
    }
}