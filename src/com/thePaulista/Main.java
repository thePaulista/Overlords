//Method overloading

package com.thePaulista;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Piper", 500);
        System.out.println("New score is " + newScore);
        int newScore1 = calculateScore(4);
        System.out.println("New score for unnamed player is " + newScore1);
        calculateScore();
    }

        public static int calculateScore(String playerName, int score) {
            System.out.println("Player " + playerName + " score " + score + " points");
            return score * 1000;
        }

         public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
         }

        public static int calculateScore() {
            System.out.println("No player name, no player score.");
            return 0;
        }

}

