package org.example;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String str = "abc";
        str = "xyz";
        System.out.println(str);
        Student s1 = new Student("sam", 10);
        Student s2 = new Student("sam", 10);
        Student s3 = new Student("sam", 10);
        System.out.println(s1.count);
        System.out.println(s2.count);
        System.out.println(s3.count);
        System.out.println(s1.equals(s2));
        Map<Student, Student> newMap = new HashMap<>();
        Map<Integer, Integer> integerMap = new HashMap<>();
        newMap.put(s1, s1);
        newMap.put(s2,s2);
        integerMap.put(1,1);
        integerMap.put(2,2);
        integerMap.put(3,3);
        for(Map.Entry<Student, Student> entry : newMap.entrySet()){
            System.out.println("{" + entry.getKey() + ":" + entry.getValue() + "}");
        }

        integerMap.entrySet().removeIf(entry -> entry.getKey() % 2 == 1);
        System.out.println("Size of map: " + integerMap.size());

        System.out.println("String Matched " + patternMatched("abcxyz","xyww"));
    }

    private static boolean patternMatched(String str1, String str2){
        if(str1.isEmpty() || str2.isEmpty() || str1.length() < 3 || str2.length() < 3){
            return false;
        }
        return str1.length() > str2.length() ? str1.contains(str2): str2.contains(str1);
    }
}

class Student {
    private String name;
    private int rollno;
    static int count = 0;

    public Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
        count ++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

}
