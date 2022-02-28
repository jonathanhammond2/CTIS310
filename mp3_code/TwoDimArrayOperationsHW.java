package com.mycompany.mp3;

/**
 *
 * @author jonn
 */
public class TwoDimArrayOperationsHW {

    public TwoDimArrayOperationsHW() {
    }
    
    
//get the lowest value in a given row, given the 2d input array and the row index
    public static int getLowestInRow(int[][] arr, int row){
        int min = arr[row][0]; //set the inital min as the first value in the row
        for (int i:arr[row]){//for each int in the row, 
            //if it's lower than the min, update the min
            if (i<min)
                min = i;
        }
        return min;//return the minimum
    }
    
    //get the highest value in a given row, given the 2d input array and the row index
    public static int getHighestInRow(int[][] arr, int row){
        int max = arr[row][0];//set the inital max as the first value in the row
        for (int i:arr[row]){//for each int in the row, if it's higher than the
            //max, update the max
            if (i>max)
                max = i;
        }
        return max;//return the maximum
    }
    
    //get the sum of a column, given the 2d input array and the column index
    public static int getColumnTotal(int[][]arr, int col){
        int colTotal = 0; //instantiate an integer which will be the sum
        try{
            for (int i[]:arr)//for each element in a given column, add the element to the total
                colTotal = colTotal + i[col];
        }
        catch (ArrayIndexOutOfBoundsException e){//if col index is out of bounds,
            //catch and print the expection
            e.printStackTrace();
        }
        
        return colTotal;//return the total
    }
    
    //get the sum of a row, given the 2d input array and the row index
    public static int getRowTotal(int[][]arr, int row){
        int rowTotal = 0;//instantiate a value which will hold the row sum
        try{
            for (int i:arr[row])//add each element in the row to the sum
                rowTotal = rowTotal + i;
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//if the row index is out of bounds,
            //catch the error and print the stacktrace
        }
        return rowTotal;//return the total sum of the row
    }
    
    //get the mean/average/expected value of a 2d array
    public static int getAverage(int[][] arr){
        //use the getTotal method to get the total. divide by the number of elements in the array
        return getTotal(arr)/(arr.length*arr[0].length);
    }
    
    //get the sum of a 2d array
    public static int getTotal(int[][] arr){
        int sum = 0;
        //add each element in each row to the sum
        for (int i[]:arr){for (int j:i){sum = sum + j;}}
        return sum; //return the sum
    }
    
    //the printarray method - prints 2d arrays (int)
    public static void printArray(int[][] arr){
       
        System.out.println("Printing the array: ");
        String spaces = "";
        //loop through each element in the array and print the row & column indicies and the value
        for (int j = 0; j < arr.length; j++){
            for (int i = 0; i < arr[0].length; i++){
                //this is an attempt at formatting - keeping the columns inline
                if (arr[j][i]>9||arr[j][i]<0){spaces="   ";} 
                else{spaces="    ";}
                System.out.print("["+j+"]"+"["+i+"] = " + arr[j][i] + spaces);
            }
            System.out.println(); //print a new line after the row finishes
        }
    }
    
   
    //get the lowest value in a given row, given the 2d input array and the row index (double)
    public static double getLowestInRow(double[][] arr, int row){
        double min = arr[row][0]; //set the inital min as the first value in the row
        for (double i:arr[row]){//for each int in the row, 
            //if it's lower than the min, update the min
            if (i<min)
                min = i;
        }
        return min;//return the minimum
    }
    
    //get the highest value in a given row, given the 2d input array and the row index (double)
    public static double getHighestInRow(double[][] arr, int row){
        double max = arr[row][0];//set the inital max as the first value in the row
        for (double i:arr[row]){//for each int in the row, if it's higher than the
            //max, update the max
            if (i>max)
                max = i;
        }
        return max;//return the maximum
    }
    
    //get the sum of a column, given the 2d input array and the column index (double)
    public static double getColumnTotal(double[][]arr, int col){
        double colTotal = 0; //instantiate an integer which will be the sum
        try{
            for (double i[]:arr)//for each element in a given column, add the element to the total
                colTotal = colTotal + i[col];
        }
        catch (ArrayIndexOutOfBoundsException e){//if col index is out of bounds,
            //catch and print the expection
            e.printStackTrace();
        }
        
        return colTotal;//return the total
    }
    
    //get the sum of a row, given the 2d input array and the row index (double)
    public static double getRowTotal(double[][]arr, int row){
        double rowTotal = 0;//instantiate a value which will hold the row sum
        try{
            for (double i:arr[row])//add each element in the row to the sum
                rowTotal = rowTotal + i;
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//if the row index is out of bounds,
            //catch the error and print the stacktrace
        }
        return rowTotal;//return the total sum of the row
    }
    
    //get the mean/average/expected value of a 2d array of type double
    public static double getAverage(double[][] arr){
        //use the getTotal method to get the total. divide by the number of elements in the array
        return getTotal(arr)/(arr.length*arr[0].length);
    }
    
    //get the sum of a 2d array of type double
    public static double getTotal(double[][]arr){
        double sum = 0;
        //add each element in each row to the sum
        for (double i[]:arr){for (double j:i){sum = sum + j;}}
        return sum; //return the sum
    }
    
    //these two methods get the total element count of a double/int array
    public static int getElementCount(int[][] arr){
        return arr.length*arr[0].length; //length * width
    }
    
    public static int getElementCount(double[][] arr){
        return arr.length*arr[0].length; //length * width
    }
    
     //the printarray method - prints 2d arrays (double)
    public static void printArray(double[][] arr){
       
        System.out.println("Printing the array: ");
        String spaces = "";
        //loop through each element in the array and print the row & column indicies and the value
        for (int j = 0; j < arr.length; j++){
            for (int i = 0; i < arr[0].length; i++){
                //this is an attempt at formatting - keeping the columns inline
                if (arr[j][i]>9||arr[j][i]<0){spaces="   ";} 
                else{spaces="    ";}
                System.out.println("["+j+"]"+"["+i+"] = " + 
                        String.format("%.2f", arr[j][i]) + spaces);//prints formatted double values
            }
            System.out.println(); //print a new line after the row finishes
        }
    }
    
    
    
    
     
}
