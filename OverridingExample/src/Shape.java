/**
 * Created by William Lin on 3/22/2016.
 */
public class Shape {

    public static void main(String[] args){
        Shape sh1 = null;

        sh1 = new Shape();
        Circle c1 = new Circle();

        c1 = (Circle)sh1;

        int k = 2;
        if(k == 0){
            sh1 = new Shape();
        }
        else if(k == 1){
            sh1 = new Rectangle();
        }
        else if(k == 2){
            sh1 = new Circle();
        }
        else if(k == 3){
            sh1 = new Triangle();
        }
        else sh1 = new Triangle();

        sh1.draw("red");
    }

    void draw(String color){
        System.out.print(color + "Shape");
    }
}
