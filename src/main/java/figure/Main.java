package figure;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle("Red", 5.0);
        Figure square = new Square("Blue", 4.0);
        Figure rectangle = new Rectangle("Green", 3.0, 6.0);

        printFigure(circle);
        printFigure(square);
        printFigure(rectangle);

        circle.drawFigure();
        square.drawFigure();
        rectangle.drawFigure();

        circle.paintFigure();
        square.paintFigure();
        rectangle.paintFigure();
    }
    static void printFigure(Figure figure){
        System.out.println("Figure color: " + figure.getColor() + ", Area: " + figure.calculateArea());
    }
}
