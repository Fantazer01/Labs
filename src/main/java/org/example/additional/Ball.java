package org.example.additional;

public class Ball {
    private static class Point{
       private final int x;
        private final int y;
        private final int z;
        Point(){
            this.x=0;
            this.y=0;
            this.z=0;
        }
        Point(int x,int y,int z){
            this.x=x;
            this.y=y;
            this.z=z;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }
    }
    private Point center;
    private int radius;
    Ball(){
      this.center = new Point();
      this.radius =0;
    }
    Ball(int x, int y, int z,int radius){
        this.center = new Point(x,y,z);
        this.radius =radius;
    }

    public double InerArea(Ball a){
        double distance= Math.sqrt(Math.pow((this.center.x-a.center.x),2)+Math.pow((this.center.y-a.center.y),2)+Math.pow((this.center.z-a.center.z),2));
        if(distance>=this.radius+a.radius)
            return 0;
        else{
            double Radius= Math.sqrt(Math.pow(this.radius,2) - Math.pow(((double) (this.radius + a.radius) / 2 - distance / 2),2));
            return  Math.PI*Math.pow(Radius,2);
        }
    }
}
