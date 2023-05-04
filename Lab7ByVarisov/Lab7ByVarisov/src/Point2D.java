public class Point2D {
    float x;
    float y;




    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(){
        x = 0;
        y = 0;
    }


    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        return new float[2];
    }
    public void setXY(float x, float y){
       this.x = x;
       this.y = y;
    }





    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point2D point2D = (Point2D) obj;
        return x == point2D.getX() && y == point2D.getY();
    }


    @Override
    public int hashCode() {
        float result = 23;
        int change = (int) result;
        if (x != 0) {
            change = (int) (37 * change * x);
        }
        if (y != 0) {
            change = (int) (37 * change * y);
        }
        return change;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

