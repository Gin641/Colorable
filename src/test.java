public class test {
    public static void main(String[] args) {
        shape[] shapes = new shape[2];
        shapes[0] = new circle(1.2);
        shapes[1] = new square(2.0);
        for (shape shape : shapes){
            System.out.println(shape.toString());
            if (shape instanceof square){
                Colorable colorable = (square) shape;
                colorable.howToColor();
            }
        }
    }
}
