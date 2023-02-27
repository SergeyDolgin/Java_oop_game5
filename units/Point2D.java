package units;

public class Point2D {
    protected int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }


// *нахождение расстояния между персонажами */

    public double Distance(Point2D targetCoordinate) {
        return Math.sqrt(Math.pow(this.x - targetCoordinate.x, 2) + Math.pow(this.y - targetCoordinate.y, 2));
    }
  

}
