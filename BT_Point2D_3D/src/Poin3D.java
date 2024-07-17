public class Poin3D extends Point2D {
    private float z;

    public Poin3D() {}

    public Poin3D( float z){
        this.z =z;
    }

    public Poin3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ(){
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public float[] getArrXYZ() {
        return new  float [] {getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "Poin3D{" + getX() + ", "
                 + getY() + ", " + z +
                '}';
    }
}

