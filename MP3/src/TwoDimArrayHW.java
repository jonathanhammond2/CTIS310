package MP3.src;

import java.util.InputMismatchException;
import java.util.Scanner;
import MP3.src.revArr.*;
import MP3.src.twoDOps.*;

/**
 *
 * @author jonn
 */
public class TwoDimArrayHW {
    //create two final integers which will determine the shape of the R
    //twoDimHW array
    static final int NUMROWS = 3;
    static final int NUMCOLS = 5;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//instantiate a new scanner 
        //with system input
        int[][] twoDimHW = new int[NUMROWS][NUMCOLS];//create the twoDimHW 2d array
        //as is, it has shape (NUMROWS, NUMCOLS) and is full of zeroes
        
        //The following code prompts the user to fill out the array
        System.out.println("Please fill out the (" + NUMROWS 
                + "x" + NUMCOLS + ") array:");
       
        //an integer which keeps track of the row
        int j = 0;
//        int k = 0;
        for (int[] twoDimHW1 : twoDimHW) {//for each row in twoDimHW, execute the following:
            //for each of the ints within each row, execute the following:
            for (int i = 0; i<twoDimHW1.length; i++){
                //This while loop prompts the user for input until that input is valid
                //if the input is an integer, that value is stored in the twoDimHW array
                //if it's not an integer, a try-catch statement catches the
                //InputMismatchExeption and prompts the user for another input.
//              k++;
                while(true){
                    System.out.println("Please enter an integer "
                        + "value for twoDimHW["+j+"]"+"["+i+"]: ");
                    try{
                        twoDimHW1[i] = scan.nextInt();
//                        twoDimHW1[i] = k;
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.print("Invalid input; ");
                        scan.nextLine(); //this statement is critical;
                        //it clears the current line so another InputMismatchExpection isn't thrown
                    }
                }
            }
            j++; //update the row index
        }
        System.out.println(); //Some whitespace
        System.out.println();
        
        twoDOps.printArray(twoDimHW); //print the twoDimHW array
        
        System.out.println(); //Some whitespace
        System.out.println();
        
        //Each of the following methods creates a new array and then reads values
        //from the original twoDimHW array. This is not memory efficient
        //but it does allow for multiple operations and also makes the code
        //simpler + easier
        
        int[][] numbersReverse = new int[NUMROWS][NUMCOLS]; //insantiate the numbersReverse array
        System.out.println("Flipping the array Horizontally:");
        revArr.flipArrayHorizontally(twoDimHW, numbersReverse); //call the flipArrayHorizontally method
        twoDOps.printArray(numbersReverse); //print the horizontally flipped array
        
        System.out.println(); //More whitespace
        System.out.println();
        
//        int[][] flipArrVer = new int[NUMROWS][NUMCOLS]; //instantiate the flipArrVer 2d array
        int[][] flipArrVer = new int[NUMROWS][NUMCOLS];
        System.out.println("Flipping the array Vertically:");
        revArr.flipArrayVertically(twoDimHW,flipArrVer);//call the flipArrayVertically method
        twoDOps.printArray(flipArrVer);//print the resulting flipArrVer array


        
        System.out.println(); //Whitespace again
        System.out.println();
        
        int[][] reverseArr = new int[NUMROWS][NUMCOLS]; //instantiate the reverseArr 2d array
        System.out.println("Reversing the array:");
        revArr.reverseArray2(twoDimHW);//call the reverseArr method
        twoDOps.printArray(twoDimHW);//print the resulting array
        
        System.out.println();//whitespace
        System.out.println();
        
        //to transpose the twoDimHW array, the shape must be flipped (flip numrows&numcols)
        int[][] transpArr = new int[NUMCOLS][NUMROWS];//instantiate the transpArr array
        System.out.println("Transposing the array:");
        revArr.transposeArray(twoDimHW, transpArr);//call the transposeArray method
        twoDOps.printArray(transpArr);//print the resulting array
        
        System.out.println();//whitespace
        System.out.println();
        
        int[][] reverseTranspArr = new int[NUMCOLS][NUMROWS];//instantiate the reverseTranspArr array
        System.out.println("Reversing and transposing the array:");
        revArr.reverseTransposeArray(twoDimHW, reverseTranspArr);//call the reverseTransposeArray method
        twoDOps.printArray(reverseTranspArr);//print the resulting array
        
        System.out.println();//whitespace
        System.out.println();
        
        twoDOps.printArray(twoDimHW);//print the original twoDimHW array
        
        System.out.println();//whitespace
        System.out.println();
        
        //Each of these print statements prints a various statistic and calls the
        //corresponding method. 
        System.out.println("Total of twoDimHW: " 
                + twoDOps.getTotal(twoDimHW));
        System.out.println("Average of twoDimHW: "
                + twoDOps.getAverage(twoDimHW));
        System.out.println("Total of row 0 of twoDimHW: "
                + twoDOps.getRowTotal(twoDimHW,0));
        System.out.println("Total of row 1 of twoDimHW: "
                + twoDOps.getRowTotal(twoDimHW,1));
        System.out.println("Total of col 0 of twoDimHW: "
                + twoDOps.getColumnTotal(twoDimHW,0));
        System.out.println("Total of col 2 of twoDimHW: "
                + twoDOps.getColumnTotal(twoDimHW,2));
        System.out.println("Highest in row 0 of twoDimHW:"
                + twoDOps.getHighestInRow(twoDimHW, 0));
        System.out.println("Highest in row 1 of twoDimHW:"
                + twoDOps.getHighestInRow(twoDimHW, 1));
        System.out.println("Lowest in row 0 of twoDimHW:"
                + twoDOps.getLowestInRow(twoDimHW, 0));
        System.out.println("Lowest in row 1 of twoDimHW:"
                + twoDOps.getLowestInRow(twoDimHW, 1));
    }
    
    
}
