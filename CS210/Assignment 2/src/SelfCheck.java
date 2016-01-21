/**
 * Created by CamC on 1/20/2016.
 */
public class SelfCheck {
    public static void main(String[] args) {
        System.out.println(2 + 2 + 3 + 4);
        System.out.println("2 + 2" + 3 + 4);
        System.out.println(2 + " 2 + 3 " + 4);
        System.out.println(3 + 4 + " 2 + 2");
        System.out.println("2 + 2 " + (3 + 4));
        System.out.println("(2 + 2) " + (3 + 4));
        System.out.println("hello 34 " + 2 * 4);
        System.out.println(2 + "(int 2.0" + 2 * 2 + 2);
        System.out.println(4 + 1 + 9 + "." + (-3 + 10) + 11 / 3);
        System.out.println(8 + 6 * -2 + 4 + "0" + (2 + 5));
        System.out.println(1 + 1 + "8 - 2" + (8 - 2) + 1 + 1);
        System.out.println(5 + 2 + "(1 + 1)" + 4 + 2 * 3);
        System.out.println("1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9));


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        int max;
        int min = 10;
        max = 17 - 4 / 10;
        max = max + 6;
        min = max - min;
        System.out.println(max * 2);
        System.out.println(max + min);
        System.out.println(max);
        System.out.println(min);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        for(int i = 1; i <= 6; i++) {
            System.out.println(-22 + (i * 18));
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        for(int i = 1; i <= 2; i++) {
            for(int j = 1; j <= 3; j++) {
                for(int k = 1; k <= 4; k++) {
                    System.out.print("*");
                    System.out.print("!");
                }
                System.out.println();

            }
        }




    }
}
