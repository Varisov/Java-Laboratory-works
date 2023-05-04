import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 8;
        int y = 9;
        int z = 10;
        int x2 = 4;
        int y2 = 5;
        int z2 = 6;

        HashMap<Point3D, String> myHashMap = new HashMap();
        Point2D mypoint2d = new Point2D(0, 0);
        Point3D mypoint3d = new Point3D(x, y, z);

        myHashMap.put(mypoint3d, "3D");
        System.out.println("INITIAL - " + myHashMap.size() + " " + myHashMap.get(mypoint3d));

        Point3D samePoint = new Point3D(x, y, z);
        myHashMap.put(mypoint3d, "SAME POINT");
        System.out.println("ADDED NEW POINT WITH THE SAME VALUE " + myHashMap.size() + " " + myHashMap.get(mypoint3d));

        Point3D anotherpoint = new Point3D(x2, y2, z2);
        myHashMap.put(anotherpoint, "ANOTHER POINT");
        System.out.println("NEW POINT " + myHashMap.size() + " " + myHashMap.get(mypoint3d));

        for (Map.Entry<Point3D, String> entry : myHashMap.entrySet()) {
            Point3D key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}






