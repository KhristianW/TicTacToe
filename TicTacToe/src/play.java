import java.util.Scanner;

public class play {
    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe");
        System.out.println();

        //create markers
        String marker1 = "x";
        String marker2 = "o";
        boolean playAgain = true;

        Scanner s = new Scanner(System.in);


        //create player objects
        Human human = new Human();
        Computer computer = new Computer();

        while (playAgain)
        {
            //run board setup
            set Setup = new set();

            Setup.createBoard();
            Setup.printBoard();

            System.out.println("please choose your marker");
            System.out.println("type 1 for 'x' or 2 for 'o'");

            //user chooses marker that they want to use.
            if (s.nextInt() == 1)
            {
                human.setMarker("x");
                computer.setMarker("o");
            }
            else
            {
                human.setMarker("o");
                computer.setMarker("x");

            }



            int first = (int) (Math.random() * 2);


            boolean won = false;
            int turns = 0;

            //if statement to check whether the computer or the user goes first.
            //This if statement also checks the conditions on if you lose,win or draw against the computer while nobody has won.
            if (first == 0) {
                System.out.println("You go first!");
                System.out.println();
                while (!won) {
                    human.takeTurn(Setup.getBoard());
                    turns++;
                    Setup.printBoard();
                    if (Setup.hasWon(Setup.getBoard())) {
                        won = true;
                        System.out.println("Congrats you won!");
                    }
                    if (turns == 9)
                    {
                        won = true;
                        System.out.println("Its a draw!");
                        break;
                    }
                    if(!won){
                        computer.takeTurn(Setup.getBoard(), human);
                        turns++;
                        System.out.println();
                        Setup.printBoard();
                        System.out.println();
                        if(Setup.hasWon(Setup.getBoard()))
                        {
                            won = true;
                            System.out.println("You lost!");
                        }
                        else if (turns == 9)
                        {
                            won = true;
                            System.out.println("Its a draw!");
                        }
                    }

                }
            }
            else
            {
                System.out.println("Computer goes first!");
                System.out.println();
                while (!won)
                {
                    computer.takeTurn(Setup.getBoard(), human);
                    turns++;
                    Setup.printBoard();
                    if (Setup.hasWon(Setup.getBoard()))
                    {
                        won = true;
                        System.out.println("You lost!");
                    }
                    if (turns == 9)
                    {
                        won = true;
                        System.out.println("Its a draw!");
                        break;
                    }
                    if (!won)
                    {
                        human.takeTurn(Setup.getBoard());
                        turns++;
                        System.out.println();
                        Setup.printBoard();
                        System.out.println();
                        if (Setup.hasWon(Setup.getBoard()))
                        {
                            won = true;
                            System.out.println("Congrats you won!");
                        }
                    }
                }
            }
            //This just checks if the user inputted 2 then the program will stop.
            System.out.println("Would you like to play again? Type 1 for yes or 2 to quit");
            System.out.println();
            if (s.nextInt() == 2)
            {
                playAgain = false;
            }
        }
    }
}

