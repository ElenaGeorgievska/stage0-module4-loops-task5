package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {

        int i, j;
        for (i = 1; i <= length; i++) {
            for (j = 1; j <= height; j++) {
                if (i == 1 || i == length ||
                        j == 1 || j == height)
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        Rectangle r = new Rectangle();
        r.printRectangleFrom8s(6,5);
    }

    //Rectangle.
    //Write a program write to console an empty rectangle of a given sizeS(it should consist of '8'-s).
}
