//Write a Java program that demonstrates the use of lambda expressions to sort a list of strings in reverse alphabetical order. Then, implement a functional interface StringProcessor with a method process(String str) that takes a string and returns its uppercase version. Use this functional interface in conjunction with a lambda expression to process a list of strings and print their uppercase forms.
 
//Hint: Use List.sort(), lambda expressions, and String::toUpperCase



package assignment_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface ReverseStringInter {
    String revString(String str);
    
        
    }
    public class lembdaInter {
        public static void main(String[] args){
            List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Pineapple", "Jackfruit"));

          
            fruits.sort((s1, s2) -> s2.compareTo(s1));
            System.out.println("Sorted in reverse order: " + fruits);
    
            
            ReverseStringInter toUpperCaseProcessor = String::toUpperCase;
    
           
            fruits.forEach(word -> System.out.println(toUpperCaseProcessor.revString(word)));
    }

}


        
