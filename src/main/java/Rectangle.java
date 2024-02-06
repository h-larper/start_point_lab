public class Rectangle {

    int length;
    int width;

    public Rectangle(int inputLength, int inputWidth) {
        this.length = inputLength;
        this.width = inputWidth;
    }

    public int getAreaRectangle() {
        return this.length * this.width;
    }

    public boolean isRectangleSquare() {
        if (this.length == this.width) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        return (true || false);
    }

}
