import java.util.ArrayList;
import java.util.List;

public class FillColor implements Shape{
    //A leaf on the branch/ base
    //List of Shapes
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void fillColor(String color) {
        for(Shape shape : shapes) {
            shape.fillColor(color);
        }
    }

    //Add shape to FillColor
    public void add(Shape shape){
        this.shapes.add(shape);
    }

    //Remove shape from FillColor
    public void remove(Shape shape){
        shapes.remove(shape);
    }
}
