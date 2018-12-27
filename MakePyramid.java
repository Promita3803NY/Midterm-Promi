package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */

        for (int i=1; i<8; i++)
        {
            for (int j=0; j<8-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}