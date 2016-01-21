// CS210 Assignment #2 "Space Needle"
//this program prints an ascii space needle to console, to a specified size.
// Cameron Cooks

public class SpaceNeedle {
    public static final int SIZE = 4;


    public static void main(String[] args) {
        drawSpaceNeedle();
    }

    public static void drawSpaceNeedle() {

        column();
        topAndBottom();

        //Start of saucer bottom
        for(int j = 0; j < SIZE; j++) {
            printSpaces(j * 2);
            System.out.print("\\_");
            for(int x = 0; x < ((SIZE * 3) - 1 - (j * 2)); x++) {
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
        //End of Saucer bottom

        //Start of middle
        column();
        for(int h = 0; h < SIZE * SIZE; h++) {
            printSpaces(SIZE * 2 + 1);
            System.out.print("|");
            for(int g = 0; g < SIZE - 2; g++) {
                System.out.print("%");
            }
            System.out.print("||");
            for(int g = 0; g < SIZE - 2; g++) {
                System.out.print("%");
            }
            System.out.println("|");
        }
        //End of middle

        topAndBottom();
    }


    public static void printSpaces(int spaces) {
        for(int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }
    public static void topAndBottom() {
        for(int c = 0; c < SIZE; c++) {
            printSpaces((SIZE - (c + 1)) * 3);
            System.out.print("__/");
            for(int z = 0; z < c; z++) {
                System.out.print(":::");
            }
            System.out.print("||");
            for(int z = 0; z < c; z++) {
                System.out.print(":::");
            }
            System.out.print("\\__");
            System.out.println();
        }
        System.out.print("|");
        for(int i = 0; i < SIZE * 6; i++) {
            System.out.print("\"");
        }
        System.out.println("|");

    }

    public static void column() {
        for(int i = 0; i < SIZE; i++) {
            printSpaces(3 * SIZE);
            System.out.println("||");
        }
    }
}
