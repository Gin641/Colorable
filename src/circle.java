public class circle extends shape {
    private double radius;
    public circle(){
    }
    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
    @Override
    public String toString(){
        return "circle{"
                +"radius = " +radius
                + " area = " + this.getArea()
                +" } ";
    }
}
