package triangles;

import java.util.Comparator;

public class ShapeAreaComparator implements Comparator<Shape> {

    public int compare(Shape o1, Shape o2) {
        if(o1.getArea() > o2.getArea()) {
            return -1;
        } else if(o1.getArea() < o2.getArea()) {
            return 1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
