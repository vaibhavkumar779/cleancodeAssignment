public class CodeChanged {

    // static class to contain both values
    static class NumberToCheck{
        int SmallestNumber;
        int LargestNumber;
    }

    // method to give the Largest and Smallest numbers in a given array
    static NumberToCheck findLargestSmallest (int[] array, int sizeArray){

        NumberToCheck objCheck = new NumberToCheck();

        int TempNumber;

        if (sizeArray == 1) {
            objCheck.LargestNumber = array[0];
            objCheck.SmallestNumber = array[0];
            return objCheck;
        }

        if (array[0] > array[1]) {
            objCheck.LargestNumber = array[0];
            objCheck.SmallestNumber = array[1];
        }
        else {
            objCheck.LargestNumber = array[1];
            objCheck.SmallestNumber = array[0];
        }

        for (TempNumber = 2; TempNumber < sizeArray; TempNumber++) {

            if (array[TempNumber] > objCheck.LargestNumber) {
                objCheck.LargestNumber = array[TempNumber];
            }
            else if (array[TempNumber] < objCheck.SmallestNumber) {
                objCheck.SmallestNumber = array[TempNumber];
            }
        }

        return objCheck;
    }

    public static void main(String args[]){

        int givenArray[] = {1000, 11, 445, 1, 330, 3000};
        int arraySize = 6;

        NumberToCheck objCheck = findLargestSmallest(givenArray,arraySize); // method calling

        // printing the given array
        System.out.printf("Given Array is:\n");
        for (int tempNum = 0; tempNum < arraySize; tempNum++){
            System.out.printf(givenArray[tempNum] + " ");
        }

        // print the  Smallest and Largest Number
        System.out.printf("\nThe Samllest Number in the array is %d", objCheck.SmallestNumber);
        System.out.printf("\nThe Largest Number in the Array is %d\n", objCheck.LargestNumber);
    }

}