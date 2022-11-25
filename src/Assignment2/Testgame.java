package Assignment2;

import java.util.Scanner;

public class Testgame {

    public static void main(String[] args) {

        Scanner vl = new Scanner(System.in);

        Game sc = new Game();
        sc.disp();
        sc.ready();

            sc.yn = vl.nextLine();
            while (!(sc.yn == ("1")) && !(sc.yn == ("2"))) {
                sc.ready();
                sc.yn = vl.nextLine();
        }



        while (!(sc.yn == ("1")) && !(sc.yn == ("2")) && !(sc.yn == ("3"))) {
            System.out.println("pick 1, 2 or 3");
            sc.shuffleTheGame();
            sc.yn = vl.nextLine();
        }




    }

    }










