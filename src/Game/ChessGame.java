package Game;

import javax.swing.*;

public class ChessGame {

    static String board[][] = new String[][]{                                                                       // This string array represents the chessboard.  Each time we make a move this board is updated
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

        UserInterface gui = new UserInterface();

        JFrame jf = new JFrame("Superior");
        jf.add(gui);
        jf.setSize(475, 500);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}


