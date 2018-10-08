package HW2;
/*This code had been influenced by code from Rajat Mishra
from https://www.geeksforgeeks.org/insertion-sort/
 */
public class InsertionSort implements SortBehavior{
    @Override
    public int[] mathSort(int[] array) {
        System.out.println("Insertion Sort");
        for(int i = 0; i <array.length; i++){
            int currVal = array[i];
            int indexBefore = i-1;
            while(indexBefore >= 0 && currVal < array[indexBefore]){
                array[indexBefore+1] = array[indexBefore];
                indexBefore--;
            }
            array[indexBefore+1] = currVal;
        }
        return  array;
    }
}
/*This code had been influenced by code from Rajat Mishra
from https://www.geeksforgeeks.org/insertion-sort/
 */
