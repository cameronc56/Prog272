
// CS210 Assignment #1
// Cameron Cooks

public class Chapter1Ex11 {
    public static void main(String[] args) {
        // TODO fill in your code to output the exact figure as specified in the problem
        System.out.println(triangle());
        System.out.println(horizontal());
        System.out.println(vertical());
        System.out.println(horizontal());
        System.out.println(nameplate());
        System.out.println(horizontal());
        System.out.println(vertical());
        System.out.println(horizontal());
        System.out.println(triangle());
    }

    public static String triangle() {
        return "   /\\       /\\  \n  /  \\     /  \\ \n /    \\   /    \\";
    }

    public static String horizontal() {
        return "+------+ +------+";
    }

    public static String vertical() {
        return "|      | |      |\n|      | |      |";
    }

    public static String nameplate() {
        return "|United| |United|\n|States| |States|";
    }

}