package assignment_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args){
        Map<Integer,String> student = new HashMap<>();

        student.put(1,"Rahul");
        student.put(2,"Anurag");
        student.put(3,"Saurabh");
        student.put(4,"Yogesh");
        student.put(5,"Ankit");

        
        if (student.containsKey(2)) {
            System.out.println("Student with roll number "+ student.get(2));
        } else {
            System.out.println("Student with roll number 2 is not found.");
        }
        
        
        
        student.remove(3);
        
       
        System.out.println("All student records:");
        for (Map.Entry<Integer, String> record : student.entrySet()) {
            System.out.println("Roll Number: " + record.getKey() + ", Name: " + record.getValue());
        }
    }
}
