package com.matteomalvezzi.OOP.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("John", "Doe", 24),
                new Student("Dimebag", "Darrell", 25),
                new Student("Eric", "Baret", 28),
                new Student("Tyler", "Durden", 20),
                new Student("Jack", "Napier", 22),
                new Student("Diana", "Krall", 27),
                new Student("Rosa", "Luxemburg", 30)));

        List<Student> new_student = students.stream()
                .peek((s) -> s.age = s.age+10)
                .filter( (s) -> s.age > 35)
                .peek( (s) -> {
                    System.out.println("Studente : "+ s.name + " " + s.surname + " " + s.age);
                })
                .toList();

        //Creiamo delle matricole

        List<String> matricole =  new_student.stream()
                .map( s -> s.age+s.name+s.surname)
                .peek(System.out::println)
                .toList();



    }
    public static class Student{
        private String name;
        private String surname;
        private Integer age;

        public Student(String name, String surname, Integer age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

    }


}
