package Chapter8.Cylinder;

public class CylinderClass{
    private int radius = 1;
    private int height = 1;

    public CylinderClass(int radius,int height){
        if(radius >= 0)  this.radius=radius;
        if(radius >= 0) this.height=height;
    }

    public int getRadius( ){
        return radius;
    }

    public void setRadius(int radius){
        if(radius >= 0) this.radius=radius;
    }

    public int getHeight( ){
        return height;
    }

    public void setHeight(int height){
        if(radius >= 0) this.height=height;
    }

    public double getVolume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

}
