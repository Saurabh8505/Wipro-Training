import java.util.Scanner;

public class customExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        
        try{
            int num = sc.nextInt();
            if(num >10){
             throw new MyCustomException("Error: Your input is greater then 10 or less then 10.");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        

    }
}
class MyCustomException extends Exception{
        public MyCustomException(String message){
            super(message);
        }
}
