public class CompositePatternTest {
    public static void main(String args[]){
        //Composite, contains leaves and provides the implementation of the base to the leaves
        Shape square = new Square();
        Shape rectangle = new Rectangle();

        FillColor fillColorObj = new FillColor();
        fillColorObj.add(square);
        fillColorObj.add(rectangle);
        fillColorObj.fillColor("Red");

        fillColorObj.remove(rectangle);

        fillColorObj.fillColor("Blue");
    }
}
