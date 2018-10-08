/*
*References geeksforgeeks bubble sort algorithm.
*https://www.geeksforgeeks.org/bubble-sort/
*/
package HW2;

public class BubbleSort implements SortBehavior {
    @Override
    public int[] mathSort(int[] array) {
        System.out.println("\nBubble Sort");
        int saved = 0;
        for(int x = 0; x < array.length-1; x++){
            for(int y = 0; y < array.length-x-1; y++){
                if(array[y] > array[y+1]){
                    saved = array[y];
                    array[y-1] = array[y];
                    array[y] = saved;
                }
            }
        }
        return array;
    }
}
