package org.example.lab2.additional;

public class Ball {
    public static class Point{
        private final int x;
        private final int y;
        private final int z;
        public Point() {
            this.x=0;
            this.y=0;
            this.z=0;
        }
        public Point(int x,int y,int z) {
            this.x=x;
            this.y=y;
            this.z=z;
        }

        public double distance(Point a) {
            return Math.sqrt(Math.pow((this.x-a.x),2)+Math.pow((this.y-a.y),2)+Math.pow((this.z-a.z),2));
        }
    }
    private final Point center;
    private final int radius;
    Ball(){
      this.center = new Point();
      this.radius = 0;
    }
    Ball(int x, int y, int z,int radius) {
        this.center = new Point(x,y,z);
        this.radius = radius;
    }

    public double distance(Ball a) {
        return center.distance(a.center);
    }

    public double innerArea(Ball a) {
        double distance = distance(a);

        if (distance >= radius+a.radius)
            return 0;
        if(radius>=distance+a.radius){
            return Math.PI*Math.pow(a.radius,2);
        }
        if(a.radius>=distance+radius){
            return Math.PI*Math.pow(radius,2);
        }
        double Radius= Math.sqrt(
                Math.pow(radius,2) - Math.pow(((double) (radius + a.radius) / 2 - distance / 2),2)
        );
        return Math.PI*Math.pow(Radius,2);
    }
}
