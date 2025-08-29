package figure;

public class Circle  extends Figure{
    private Double radio;

    public Circle(String color, Double radio) {
        super(color);
        this.radio = radio;
    }
    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    @Override
    public void drawFigure() {
        System.out.println("Drawing Circle");
    }
    @Override
    public void paintFigure() {
        System.out.println("Painting " + this.getColor() + " circle");
    }
}
