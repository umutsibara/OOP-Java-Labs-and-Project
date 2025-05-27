import java.util.Date;

public class GeometriObject {
    String color = null;
    boolean filled = false;
    java.util.Date dateCreated = null;

    public GeometriObject(){

    }

    public String getColor(){
        return "";
    }

    public void setColor(){

    }

    public boolean isFilled(){
        return true;
    }

    public void setFilled(boolean filled){

    }

    public java.util.Date getDateCreated(){
       return null;
    }

    public String toString(){
        return "";
    }
}

class Circle extends GeometriObject{

    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        radius = 2*Math.PI*
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public double getDiameter(){
        return 0;
    }
}

class Rectangle extends GeometriObject{
    private double width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        width = 0;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        height = 0;
    }
    public double getArea(){
        return  height*width;
    }
    public double getPerimeter(){
        return  2 * (height + width);
    }

}
