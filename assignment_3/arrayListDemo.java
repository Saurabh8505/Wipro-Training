package assignment_3;

import java.util.ArrayList;
import java.util.List;

public class arrayListDemo {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
    
        System.out.println("Elements in the ArrayList: "+ list);
        list.remove(2);
        list.set(1,60);
        
        System.out.println("Updated Elements in the ArrayList:");
        for (int num : list) {
            System.out.print(" "+ num);
        }
        
    }
}
    
