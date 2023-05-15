class Computer extends player {

    public Computer() {

    }

    public void takeTurn(String[][] board, Human human) {

        int vertical = 0;
        int horizontal = 0;
        int diagonal = 0;
        boolean mademove = false;

        // check if the computer can take a win horizontally
        if (board[0][0].equals(board[0][1]) && board[0][0].equals(Marker))
        {
            if (board[0][2] != human.getMarker() && board[0][2] != Marker)
            {
                board[0][2] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[1][0].equals(board[1][1]) && board[1][0].equals(Marker))
        {
            if (board[1][2] != human.getMarker() && board[1][2] != Marker)
            {
                board[1][2] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[2][0].equals(board[2][1]) && board[2][0].equals(Marker))
        {
            if (board[2][2] != human.getMarker() && board[2][2] != Marker)
            {
                board[2][2] = Marker;
                mademove = true;
                return;
            }
        }

        // check if the computer can take a win vertically
        if (board[0][0].equals(board[1][0]) && board[0][0].equals(Marker))
        {
            if (board[2][0] != human.getMarker() && board[2][0] != Marker)
            {
                board[2][0] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[0][1].equals(board[1][1]) && board[0][1].equals(Marker))
        {
            if (board[2][1] != human.getMarker() && board[2][1] != Marker)
            {
                board[2][1] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[0][2].equals(board[1][2]) && board[0][2].equals(Marker))
        {
            if (board[2][2] != human.getMarker() && board[2][2] != Marker)
            {
                board[2][2] = Marker;
                mademove = true;
                return;
            }
        }

        // check if the computer can take a win diagonally from top left to bottom right
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(Marker)) {

            if (board[2][2] != human.getMarker() && board[2][2] != Marker) {
                board[2][2] = Marker;
                mademove = true;
                return;
            }
        }

        if (board[0][0].equals(board[2][2]) && board[0][0].equals(Marker)) {

            if (board[1][1] != human.getMarker() && board[1][1] != Marker) {
                board[1][1] = Marker;
                mademove = true;
                return;
            }
        }

        if (board[2][2].equals(board[1][1]) && board[2][2].equals(Marker))
        {
            if (board[0][0] != human.getMarker() && board[0][0] != Marker)
            {
                board[0][0] = Marker;
                mademove = true;
                return;
            }
        }

        //check if the computer can take a win diagonally from top right to bottom left
        if (board[0][2].equals(board[1][1]) && board[0][2].equals(Marker))
        {
            if (board[2][0] != human.getMarker() && board[2][0] != Marker)
            {
                board[2][0] = Marker;
                mademove = true;
                return;
            }
        }

        if (board[2][0].equals(board[1][1]) && board[2][0].equals(Marker))
        {
            if (board[0][2] != human.getMarker() && board[0][2] != Marker)
            {
                board[0][2] = Marker;
                mademove = true;
                return;
            }
        }

        if (board[0][2].equals(board[2][0]) && board[0][2].equals(Marker))
        {
            if (board[1][1] != human.getMarker() && board[1][1] != Marker)
            {
                board[1][1] = Marker;
                mademove = true;
                return;
            }
        }

        //This section checks if the computer can block a win in any line.

        // check if the computer can block a win horizontally
        if (board[0][0].equals(board[0][1]) && board[0][0].equals(human.getMarker()))
        {
            if (board[0][2] != Marker && board[0][2] != human.getMarker())
            {
                board[0][2] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[1][0].equals(board[1][1]) && board[1][0].equals(human.getMarker()))
        {
            if (board[1][2] != Marker && board[1][2] != human.getMarker())
            {
                board[1][2] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[2][0].equals(board[2][1]) && board[2][0].equals(human.getMarker()))
        {
            if (board[2][2] != Marker && board[2][2] != human.getMarker())
            {
                board[2][2] = Marker;
                mademove = true;
                return;
            }
        }

        // check if the computer can block a win vertically
        if (board[0][0].equals(board[1][0]) && board[0][0].equals(human.getMarker()))
        {
            if (board[2][0] != Marker && board[2][0] != human.getMarker())
            {
                board[2][0] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[0][1].equals(board[1][1]) && board[0][1].equals(human.getMarker()))
        {
            if (board[2][1] != Marker && board[2][1] != human.getMarker())
            {
                board[2][1] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[0][2].equals(board[1][2]) && board[0][2].equals(human.getMarker()))
        {
            if (board[2][2] != Marker && board[2][2] != human.getMarker())
            {
                board[2][2] = Marker;
                mademove = true;
                return;
            }
        }


        // check if the computer can block a win diagonally from top left to bottom right
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(human.getMarker()))
        {
            if (board[2][2] != Marker && board[2][2] != human.getMarker())
            {
                board[2][2] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[2][2].equals(board[1][1]) && board[2][2].equals(human.getMarker()))
        {
            if (board[0][0] != Marker && board[0][0] != human.getMarker())
            {
                board[0][0] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[0][0].equals(board[2][2]) && board[0][0].equals(human.getMarker()))
        {
            if (board[1][1] != Marker && board[1][1] != human.getMarker())
            {
                board[1][1] = Marker;
                mademove = true;
                return;
            }
        }

        //check if the computer can block a win diagonally from top right to bottom left
        if (board[0][2].equals(board[1][1]) && board[0][2].equals(human.getMarker()))
        {
            if (board[2][0] != Marker && board[2][0] != human.getMarker())
            {
                board[2][0] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[2][0].equals(board[1][1]) && board[2][0].equals(human.getMarker()))
        {
            if (board[0][2] != Marker && board[0][2] != human.getMarker())
            {
                board[0][2] = Marker;
                mademove = true;
                return;
            }
        }
        if (board[0][2].equals(board[2][0]) && board[0][0].equals(human.getMarker()))
        {
            if (board[1][1] != Marker && board[1][1] != human.getMarker())
            {
                board[1][1] = Marker;
                mademove = true;
                return;
            }
        }

        //Makes a random move if the block statements above don't apply
        int rand1 = 0;
        int rand2 = 0;

        while (!mademove)
        {
            rand1 = (int) (Math.random() * 3);
            rand2 = (int) (Math.random() * 3);
            if (board[rand1][rand2] != "x" && board[rand1][rand2] != "o")
            {
                board[rand1][rand2] = Marker;
                mademove = true;
            }
        }
    }
}