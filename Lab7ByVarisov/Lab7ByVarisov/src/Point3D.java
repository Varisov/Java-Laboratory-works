public class Point3D extends Point2D{
    float z;

    public Point3D(float x, float y) {
        super(x, y);
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(float z){
        super();
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[3];
    }
    public void setXYZ(float x, float y){
        this.x = x;
        this.y = y;
        this.z = z;
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
        return z == getZ();
    }


    @Override
    public int hashCode() {
        float result = 23;
        int change = (int) result;
        if (z != 0) {
            change = (int) (37 * change * z);
        }
        return change;
    }


    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
