package figure;

public class Square extends Figure{
    private Double side;

    public Square(String color, Double side) {
        super(color);
        this.side = side;
    }

    @Override
    public Double calculateArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Drawing Square");
    }
    @Override
    public void paintFigure() {
        System.out.println("Painting " + this.getColor() + " square");
    }
}
