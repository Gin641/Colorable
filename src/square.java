public class square extends shape implements Colorable {
    private double size;
    public square(){
    }
    public square(double size){
        this.size = size;
    }
    public double getSize(){
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    @Override
    public double getArea(){
        return this.size * this.size;
    }
    @Override
    public void howToColor(){
        System.out.println("color all size");
    }
    @Override
    public String toString(){
        return "Square{ "
                +" side = " + size
                + " area = " + this.getArea()
                + "}";
    }
}
