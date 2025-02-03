package assignment_2;
abstract class shape{
   abstract void draw();
}
class circles extends shape{
    void draw(){
        System.out.println("Drawing a circle..");
    }
}
class rectangle extends shape{
    void draw(){
        System.out.println("Drawing a rectangle..");
    }
}

public class ShapeDrawApp {
    public static void main(String[] args){
        shape[] shapes = new shape[2]; 
        shapes[0] = new circles();
        shapes[1] = new rectangle();

        // Display details and calculate salaries using polymorphism
        for (shape shape : shapes) {
            shape.draw();
            System.out.println();
        }
}
    }

    