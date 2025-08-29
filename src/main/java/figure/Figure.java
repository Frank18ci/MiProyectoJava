package figure;

public abstract class Figure implements FigureInterface {
    private String color;
    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public abstract Double calculateArea();

    @Override
    public void drawFigure() {
        System.out.println("Drawing");
    }

    @Override
    public void paintFigure() {
        System.out.println("Painting " + this.color + " figure");
    }
}
