import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите данные: ");
        Scanner scanner = new Scanner(System.in);
        int x1Coordinate = scanner.nextInt();
        int x2Coordinate = scanner.nextInt();
        int y1Coordinate = scanner.nextInt();
        int y2Coordinate = scanner.nextInt();

        Rectangle myRectangle = new Rectangle(x1Coordinate,x2Coordinate,y1Coordinate,y2Coordinate);
        System.out.println(myRectangle);
        System.out.println("Площадь: "+ myRectangle.getArea());
        System.out.println("Периметр: "+ myRectangle.getPerimeter());

        int firstxCoordinate = scanner.nextInt();
        int secondxCoordinate = scanner.nextInt();
        int firstyCoordinate = scanner.nextInt();
        int secondyCoordinate = scanner.nextInt();

        Rectangle secondRectangle = new Rectangle(firstyCoordinate, secondxCoordinate, firstyCoordinate, secondyCoordinate);
        System.out.println("Расстояние между двумя прямоугльниками:  " + myRectangle.getDistanceTo(secondRectangle));
    }
}