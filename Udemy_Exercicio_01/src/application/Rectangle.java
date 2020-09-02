package application;

public class Rectangle {
    private double width, height;

    //constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //methods

    public double area(){
        return this.width * this.height;
    }

    public double perimeter(){
        return 2 * (this.width + this.height);
    }

    public double diagonal(){
        double newWidth = Math.pow(this.width, 2);
        double newHeight = Math.pow(this.height, 2);
        double result = newHeight + newWidth;
        return Math.sqrt(result);
    }

    //to string


    @Override
    public String toString() {
        String strArea = String.format("%.2f", this.area());
        String strPerimeter = String.format("%.2f", this.perimeter());
        String strDiagonal = String.format("%.2f", this.diagonal());
        return "Area: " + strArea + "\nPerimeter: " + strPerimeter + "\nDiagonal: " + strDiagonal;
    }

    // getter and setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
