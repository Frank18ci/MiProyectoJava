package figure;

public class Rectangle extends Figure{
    private Double base;
    private Double height;

    public Rectangle(String color, Double base, Double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return this.base * this.height;
    }
    @Override
    public void drawFigure() {
        System.out.println("Drawing Rectangle");
    }
    @Override
    public void paintFigure() {
        System.out.println("Painting " + this.getColor() + " rectangle");
    }
}
