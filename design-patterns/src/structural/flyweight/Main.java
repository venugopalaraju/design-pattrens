package structural.flyweight;

public class Main {
    //Extrinsic state
    private static final String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};
    public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
                circle.setRadius(getRandomRadius());
                circle.draw();
            }
        }
        private static String getRandomColor() {
            return colors[(int) (Math.random() * colors.length)];
        }
        private static int getRandomRadius() {
            return (int) (Math.random() * 10) + 1;
        }

}
