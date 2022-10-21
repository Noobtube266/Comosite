public class Rectangle implements Shape{
    //A leaf on the branch/ base
    @Override
    public void fillColor(String color) {
        System.out.println("Fill Rectangle with color: "+color);
    }
}
