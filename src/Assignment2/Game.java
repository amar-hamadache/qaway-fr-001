package Assignment2;

import java.util.Random;

public class Game {
    String yn;

    int[] array = {1, 0, 1};

    void disp() {
        System.out.println("-------------welcome to shuffle game----------");
        System.out.println("guess where the 0 is ?");
    }

    void ready() {
        System.out.println("are you ready to play? 1-yes or 2-no");
    }

    int[] shuffleTheGame() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int shuffle = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = shuffle;
        }
        return (array);
    }
}
