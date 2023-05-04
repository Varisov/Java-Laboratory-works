public class Rectangle {
    public int x1Coordinate,x2Coordinate, y1Coordinate, y2Coordinate;

    public Rectangle(int x1Coordinate, int x2Coordinate, int y1Coordinate, int y2Coordinate){
        this.x1Coordinate = x1Coordinate;
        this.x2Coordinate = x2Coordinate;
        this.y1Coordinate = y1Coordinate;
        this.y2Coordinate = y2Coordinate;
    }

    public int getArea(){
        return (x2Coordinate - x1Coordinate) * (y2Coordinate - y1Coordinate);
    }
    public int getPerimeter(){
        return 2 * (x2Coordinate - x1Coordinate) + 2 * (y2Coordinate - y1Coordinate);
    }

    public int getX1Coordinate() {
        return x1Coordinate;
    }

    public void setX1Coordinate(int x1Coordinate) {
        this.x1Coordinate = x1Coordinate;
    }

    public int getX2Coordinate() {
        return x2Coordinate;
    }

    public void setX2Coordinate(int x2Coordinate) {
        this.x2Coordinate = x2Coordinate;
    }

    public int getY1Coordinate() {
        return y1Coordinate;
    }

    public void setY1Coordinate(int y1Coordinate) {
        this.y1Coordinate = y1Coordinate;
    }

    public int getY2Coordinate() {
        return y2Coordinate;
    }

    public void setY2Coordinate(int y2Coordinate) {
        this.y2Coordinate = y2Coordinate;
    }

    public int getDistanceTo(Rectangle secondRectangle) {
        int result = ((x2Coordinate - x1Coordinate) / 2 + (y2Coordinate - y1Coordinate) / 2) + ((secondRectangle.getX2Coordinate() - secondRectangle.getX1Coordinate()) / 2 + (secondRectangle.getY2Coordinate() - secondRectangle.getY1Coordinate()) / 2);
        return result;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "x1Coordinate=" + x1Coordinate +
                ", x2Coordinate=" + x2Coordinate +
                ", y1Coordinate=" + y1Coordinate +
                ", y2Coordinate=" + y2Coordinate +
                '}';
    }
}