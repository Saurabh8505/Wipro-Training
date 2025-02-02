import java.util.Scanner;

public class customExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        
        try {
            int num = sc.nextInt();
            if (num != 10) { 
                throw new MyCustomException("Error: Your input is not equal to 10.");
            }
            System.out.println("Your input is valid: " + num);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage()); // Printing only the custom error message
        }  finally {
            System.out.println("Program execution completed.");
            sc.close(); 
        }
        

    }
}
class MyCustomException extends Exception{
        public MyCustomException(String message){
            super(message);
        }
}
