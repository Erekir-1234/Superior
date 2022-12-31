package Game;

import javax.swing.*;

public class ChessGame {
    
    //The Board
    //smallcase means black
    //uppercase means white

    static String board[][] = new String[][]{    
            {"r", "n", "b", "q", "k", "b", "n", "r"},
            {"p", "p", "p", "p", "p", "p", "p", "p"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {"P", "P", "P", "P", "P", "P", "P", "P"},
            {"R", "N", "B", "Q", "K", "B", "N", "R"}
    };


    static int blackKing, whiteKing, moves;

    public static void main(String[] args) {
        
        //The screen

        UserInterface gui = new UserInterface();

        JFrame jf = new JFrame("Superior"); //initiatated screen and screen title
        jf.add(gui);
        jf.setSize(475, 500); //screen size
        jf.setVisible(true); // makes the screen visisble
        jf.setResizable(false); //does not allow the screen to be resized
        jf.setLocationRelativeTo(null); //centres the screen to the middle
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //makes sure that the window is closed when you press the 'x' 
    }
}


