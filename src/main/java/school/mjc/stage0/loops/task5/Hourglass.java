package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        //Upper Inverted Pyramid
        for (int i = 0; i <= height-1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // Print blank space
            }

            for (int k = i; k <= height - 1; k++) {
                if (i == height / 2 || i == 0 || i == height-1)
                System.out.print("8" + " "); //Print star and blank space
            }

            System.out.println(""); //New line
        }

        //For lower Pyramid
        for (int i = height-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "); //Print spaces
            }

            for (int k = i; k <= height-1; k++) {
                if (i == height / 2 || i == height || i == 0)
                    System.out.print("8" + " "); //Print Star and Space
            }
            System.out.println(""); //Print New line
        }
    }

    public static void main(String[] args) {
        Hourglass h = new Hourglass();
        h.printHourglassOfGivenSize(5);
    }

    //Hourglass.
    // Write a program write to console filled Hourglass of a given length(it should consist of '8'-s).
}
