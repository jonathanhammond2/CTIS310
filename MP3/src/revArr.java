package MP3.src;

/**
 *
 * @author jonn
 */
public class revArr {
    int[][] twoDimHW;
    public revArr(int[][]arr) {
        this.twoDimHW = arr;
    }

//reverse the array and then transpose it, given the 2d input array and 
    //the output array to read the values to.
    public static int[][] reverseTransposeArray(int[][]arrIn,
            int[][]arrOut){
        //create a new temp array
        int[][] temp = new int[arrIn.length][arrIn[0].length];
        reverseArray(arrIn, temp); //flip the array and read to the temp array
        transposeArray(temp, arrOut); //read from the temp array to transpose to the output array
        return arrOut; //return the output array
    }
    
    //take an input array and transpose it/flip it on its side
    //this requires that the output array have the inverse shape of the input array
    public static int[][] transposeArray(int[][]arrIn,
            int[][]arrOut){
        try{
            for (int i=0;i<arrIn.length;i++){
                for (int j=0;j<arrIn[0].length;j++){
                    arrOut[j][i] = arrIn[i][j];//for each element in the array,
                    //flip the row & column indicies.
            }}
        }
        catch (ArrayIndexOutOfBoundsException e){//if the shapes of the input and 
            //output arrays to not match, catch the exception and print it
            System.out.println("Error in transposeArray method: "
                    + "input and output arrays must have complementary shapes");
            System.out.println(e);
        }
        
        return arrOut; //return the transposed array
    }
    
    //reverse an array - this can be done by flipping the array
    //vertically and horizontally
    public static int[][] reverseArray(int[][]arrIn,
            int[][]arrOut){
        //flip the input array vertically & write to a temp array
        int[][] temp = new int[arrIn.length][arrIn[0].length];
        flipArrayVertically(arrIn, temp);
        //flip the temp array horizontally and write to the output array
        flipArrayHorizontally(temp, arrOut);
        return arrOut;//return the output array
    }
    
    //flip the arry vertically - flip the row indicies
    public static int[][] flipArrayVertically(int[][]arrIn,
            int[][]arrOut){
        try{
            //read each value from the input array
            //and write it to the output array with the row indicies flipped
            for (int i=0;i<arrIn.length;i++){
                for (int j=0;j<arrIn[0].length;j++){
                    arrOut[i][j] = arrIn[i][arrIn[0].length-j-1];//the -1 prevents outofbounds
                }
            }
        }
        //if the input and output array shapes do not match, catch and print the error
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error in flipArrayVertically method: "
                    + "input and output arrays must have the same shape");
            System.out.println(e);
        }
        
        return arrOut;//return the flipped output array
    }
    
    //flip the array horizontally - flip the column indicies
    public static int[][] flipArrayHorizontally(int[][]arrIn, 
            int[][]arrOut){
        try{
            //read from the input array and write to the output array
            //with the column indicies flipped
            for (int i=0; i<arrIn.length; i++){
                System.arraycopy(
                    arrIn[arrIn.length-i-1], 0, 
                    arrOut[i], 0, arrOut[0].length);
                }
        }
        //if the input and output array shapes do not match, catch and print the error
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error in flipArrayHorizontally method: "
                    + "input and output arrays must have the same shape");
            System.out.println(e);
        }
        return arrOut;//return the flipped output array
    }
    
    //----------------------------------------------------------------------------------
    //the following methods take an input array and flip it 
    //without reading to a new object. this conserves memory
    //but does not preserve the original array - a deep clone
    //would be needed for that. These methods aren't used
    //in the driver program bc we need to preserve the original array
   
    public static void flipArrayVertically2(int[][]arr){ 
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length/2;j++){
                  swapRowElements(arr, i, j);
            }}
    }
    
    public static void flipArrayHorizontally2(int[][] arr){ 
        for (int i=0;i<arr[0].length;i++){
            for (int j=0;j<arr.length/2;j++){
                  swapColElements(arr, i, j);
            }}
    }
    
    public static void reverseArray2(int[][] arr){
        flipArrayHorizontally2(arr);
        flipArrayVertically2(arr);
    }
    
    
    public static void swapRowElements(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[i][arr[0].length-j-1];
        arr[i][arr[0].length-j-1] = temp;
    }
    
    public static void swapColElements(int[][]arr, int i, int j){
        int temp = arr[j][i];
        arr[j][i] = arr[arr.length-j-1][i];
        arr[arr.length-j-1][i] = temp;
    }
}
   