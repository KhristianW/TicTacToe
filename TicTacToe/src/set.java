import java.util.Random;
import java.util.Scanner;

public class set
{
    // setup variables default board size and board
    private int N = 3;
    public String[][] board = new String [N][N];

    //method to check whether someone has won.
    public boolean hasWon (String [] [] board)
    {
        //horizontal line
        for(int i = 0; i<3; i++)
        {
            if(board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]))
            {
                return true;
            }
        }
        //vertical line
        for(int i = 0; i<3; i++)
        {
            if(board [0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]))
            {
                return true;
            }
        }
        //diagonal line
        if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) || board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]))
        {
            return true;
        }
        return false;
    }
    int x = 1;

    //creates the board
    public void createBoard(){
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board.length; j++)
            {
                board[i][j] = "" + (x);
                x++;
            }
        }
    }

    //print the board
    public void printBoard()
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board.length; j++)
            {
                System.out.print("[" + board[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }
    public String[][] getBoard()
    {
        return board;
    }
}
