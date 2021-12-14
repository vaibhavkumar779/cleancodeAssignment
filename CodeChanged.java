public class CodeChanged {
    static class NumberToCheck{
        int SmallestNumber;
        int LargestNumber;
    }

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
            if (array[i] > objCheck.LargestNumber) {
                objCheck.LargestNumber = array[TempNumber];
            } else if (array[TempNumber] < objCheck.SmallestNumber) {
                objCheck.SmallestNumber = array[TempNumber];
            }
        }
    }

    public static void main(String args[]){

        int givenArray[] = {1000, 11, 445, 1, 330, 3000};
        int arraySize = 6;

        NumberToCheck objCheck = findLargestSmallest(givenArray,arraySize);

        System.out.printf("\na is %d", objCheck.SmallestNumber);
        System.out.printf("\nb is %d", objCheck.LargestNumber);
    }

}