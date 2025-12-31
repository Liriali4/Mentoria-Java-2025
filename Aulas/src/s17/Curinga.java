package s17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
import s17.entidades.Circulo;
import s17.entidades.Rectangulo;
import s17.entidades.Shape;
 */

public class Curinga {

    public static void curingaDelimitados() {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    /* List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangulo(3.0, 2.0));
        myShapes.add(new Circulo(2.0));
        
        
        List<Circulo> myCircles = new ArrayList<>();
        myShapes.add(new Circulo(3.0));
        myShapes.add(new Circulo(2.0));
        
        System.out.println("Total area:" + totalArea(myCircles));

    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;*/
}
