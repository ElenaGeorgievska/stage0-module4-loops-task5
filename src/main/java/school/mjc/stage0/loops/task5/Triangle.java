package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; ++i) {  //Outer loop for rows
            for (int j = 1; j <= i;++j) { //Inner loop for Col
                System.out.print("8 "); //Print *
            }
            System.out.println(); //New line
        }
    }

    public static void main(String[]args){
        Triangle t = new Triangle();
        t.printTriangle(5);
    }

    //Triangle.
    // Write a program will write to console a rectangular triangle(cathetus should be of a given size)
    // of a given length(it should consist of '8'-s).
}
