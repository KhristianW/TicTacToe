import java.util.Scanner;

class Human extends player {

    public Human() {

    }
    public void takeTurn(String[][] board)
    {

        Scanner s = new Scanner(System.in);

        boolean turn = true;

        //while statement to determine where the user will place their marker.
        while(turn){
            System.out.println("please enter row");
            int row = s.nextInt();
            System.out.println("please enter col");
            int col = s.nextInt();
            System.out.print("you entered "+row+" "+col);
            System.out.println();
            if(board[row - 1][col - 1] != "x" && board[row - 1][col - 1] != "o")
            {
                board[row - 1][col - 1] = Marker;
                turn = false;
            }
            else
            {
                System.out.println("Already Marker here! please guess again!");
            }
        }
    }
}



