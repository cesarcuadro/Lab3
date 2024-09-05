import java.security.SecureRandom;

public class GameGrid {
    //create a run method
    public void run() {
        int gridSize = 10;
        int wallChance = 30;
        //create game grid method
        int[][] createGameGrid(int size, int chance) {
            //create two dimensional int array
            int[][] grid = new int[size][size];
            //fill array with 1's and 0's using SecureRandom
            SecureRandom randomNum = new SecureRandom();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    grid[i][j] = 1;
                } else {
                    grid[i][j] = 0;
                }
            }
            //change value of [0][0] to 0 so first space is open
            grid[0][0] = 0;
            return grid;
        }
        //there should be less chances for a one to appear than zero 10%-20%
        int[][] gameGridArray = createGameGrid(gridSize, wallChance);
        //create two variables for user's position
        int iUserRow == 0;
        int iUserCol == 0;
        //create a boolean value for the following loop
        boolean exitGame = false;
        //create a while loop for moving that will ask if user wants to go right or down
        while (!exitGame) {
            System.out.println("Press (D) for down. Press (R) for right.");
            Scanner scanner = new Scanner(System.in);
            char move = scanner.nextLine().toUpperCase().charAt(0);
            //if user chooses down
            if (move == 'D') {
                //will affect first array value (row)
                iUserRow++;
            }
            //if user chooses right
            if (move == 'R') {
                //will affect second array value (column)
                iUserCol++;
            }
            //check users location in grid array
            //if aiGrid[iUserRow][iUserCo] equals 1
            if (gameGridArray[iUserRow][iUserCol] == 1) {
                //tell the user they failed
                System.out.println("You lose!");
                //exit loop
                exitGame = true;
            }
            //if aiGrid[iUserRow][iUserCo] does not equal 1
            if (gameGridArray[iUserRow][iUserCol] != 1) {
                //check if either iUserRow or iUserCol is now a 9
                //if either is 9
                if (iUserRow == 9 || iUserCol == 9) {
                    //tell user they have won and exit loop
                    System.out.println("You win!");
                }

            }

        }
        //outside of for loop, print out 10x10 grid
        //before printing out a 0 or 1 from array position, check if cell value equals iUserRow and iUserCol
        //if the values equal, print an X in that position

    }



}
