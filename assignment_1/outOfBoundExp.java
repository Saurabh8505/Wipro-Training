 // ArrayIndexOutOfBoundsException
public class outOfBoundExp {
    public static void main(String[] args){
        try {
           
            int[] arr = new int[10];
            System.out.println(arr[100]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: (array only contain 10 elements) " + e.getMessage());
        } finally {
            System.out.println("Finally block execut everytime after ArrayIndexOutOfBoundsException .");
        }

    }
}
