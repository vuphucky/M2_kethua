import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){}

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }
    public  void  setX( float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    public float [] getArrXY(){
      return new float[] {x,y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                 x + ", " +
                 y +
                '}';
    }
}
