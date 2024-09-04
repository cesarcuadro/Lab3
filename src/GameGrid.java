public class GameGrid {
    //create a run method
        //create game grid method
        //create two dimensional int array
        //fill array with 1's and 0's using SecureRandom
            //there should be less chances for a one to appear than zero 10%-20%
        //change value of [0][0] to 0 so first space is open
        //create two variables for user's position
            //iUserRow == 0
            //iUserCol == 0
        //create a boolean value for the following loop
        //create a while loop for moving that will ask if user wants to go right or down
            //if user chooses down
                //will affect first array value (row)
            //if user chooses right
                //will affect second array value (column)
        //check users location in grid array
            //if aiGrid[iUserRow][iUserCo] equals 1
                //tell the user they failed
                //exit loop
            //if aiGrid[iUserRow][iUserCo] does not equal 1
                //check if either iUserRow or iUserCol is now a 9
                //if either is 9
                    //tell user they have won and exit loop
        //outside of for loop, print out 10x10 grid
            //before printing out a 0 or 1 from array position, check if cell value equals iUserRow and iUserCol
                //if the values equal, print an X in that position



}
