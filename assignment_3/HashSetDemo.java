package assignment_3;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("Bhopal");
        set.add("Mumbai");
        set.add("Kolkata");
        set.add("Indore");
        set.add("Bhopal");

        for(String city : set){
            System.out.println(city);
        }
            
        System.out.println("Does the set contain 'Mumbai'? " + set.contains("Mumbai"));
            
        set.remove("Mumbai");
        System.out.println("Updated HashSet after removal:");
        for (String city : set) {
            System.out.println(city);
        }
    }
    

}
