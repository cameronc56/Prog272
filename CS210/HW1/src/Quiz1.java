/**
 * Created by CamC on 1/10/2016.
 */
public class Quiz1 {
    public static void main(String[] args) {

        System.out.println(9 / 5);
        System.out.println((5 - 7) * 4);
        System.out.println(248 % 100 / 5);
        System.out.println(6 + 18 % (17 - 12));
        System.out.println(89 % 10 / 4 * 2.0 / 5);
        System.out.println(23 / 5 * 2.5 + 3);
        System.out.println(23 / 5 * (int) 2.5 + 3);
        System.out.println(("welcome " + 6 / 3 + " CS 210").getClass());
        System.out.println(("1" + 8 / 3 + 3).getClass());
        System.out.println((37 % 4 + "2" + 3 + 4).getClass());

        System.out.println("\n\n\n-------------------------------------\n\n\n\n\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("\n\n\n--------------------------------\n\n\n\n\n");



        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (-1 * line + 5); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= line; k++) { System.out.print(line); }
            System.out.println();
        }


    }
}
