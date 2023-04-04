package Year2.lynn;

public class rectangle {

    private float X_Coordinate;
    private float Y_Coordinate;
    private float width;
    private float height;

    public rectangle(float X_Coordinate, float Y_Coordinate, float width, float height){
        this.X_Coordinate = X_Coordinate;
        this.Y_Coordinate  = Y_Coordinate;
        this.width = width;
        this.height = height;

    }

    public float getArea(float width, float height){
        return width * height;
    }

    public boolean containsPoint(float X, float Y){
        if((X < X_Coordinate || X > (X_Coordinate + X_Coordinate)) || (Y > Y_Coordinate || Y < (Y_Coordinate - Y_Coordinate))){
            return false;
        }
        return true;
    }

}
