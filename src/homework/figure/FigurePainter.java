package homework.figure;

public class FigurePainter {

    char c = '*';

        /*
    Figure 1
    *
    * *
    * * *
    * * * *
    * * * * *
    */
    void figureOne(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    /*
             Figure 2
                   *
                 * *
               * * *
             * * * *
           * * * * *
        */
    void figureTwo() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    /*
            Figure 3
           * * * * *
           * * * *
           * * *
           * *
           *
        */
    void figureThree() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureFour() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }

    void figureFive(){
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }

}
