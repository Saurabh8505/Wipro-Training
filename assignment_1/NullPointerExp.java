// NullPointerException
public class NullPointerExp {
    public static void main(String[] args) {
        try {
            
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: String is null " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NullPointerException.");
        }
    }
}