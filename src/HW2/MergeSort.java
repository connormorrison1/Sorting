package HW2;
/*This code had been influenced by code from Rajat Mishra
from https://www.geeksforgeeks.org/merge-sort/
 */
public class MergeSort implements SortBehavior {
    @Override
    public int[] mathSort(int [] array) {
        System.out.println("Merge sort");
        int mid = array.length/2;
        array = mathSort(array, 0, mid);
        array = mathSort(array, mid+1, array.length-1);
        array = merge(array,0,mid,array.length-1);
        return array;
    }
    private int[] mathSort(int[] array, int front, int back){
        if(front < back){
            int mid = (front + back)/2;
            array = mathSort(array,front, mid);
            array = mathSort(array, mid+1,back);
            array = merge(array, front, mid, back);
        }
        return array;
    }
    private int[] merge(int[] array, int front, int mid, int back){
        int firstHalf = mid-front+1;
        int secondHalf = back-mid;
        int firstArr[] = new int[firstHalf];
        int secondArr[] = new int[secondHalf];
        System.arraycopy(array,front,firstArr,0,firstHalf);
        System.arraycopy(array,mid+1,secondArr,0,secondHalf);
        int inital1 =0;
        int intital2 =0;
        int inital3 =front;
        while(inital1<firstHalf&&intital2<secondHalf){
            if(firstArr[inital1]<=secondArr[intital2]){
                array[inital3] = firstArr[inital1];
                inital1++;
            }else {
                array[inital3] = secondArr[intital2];
                intital2++;
            }
            inital3++;
        }
        while (inital1 < firstHalf){
            array[inital3] = firstArr[inital1];
            inital1++;
            inital3++;
        }
        while (intital2<secondHalf){
            array[inital3] = secondArr[intital2];
            intital2++;
            inital3++;
        }
        return array;
    }
}
/*This code had been influenced by code from Rajat Mishra
from https://www.geeksforgeeks.org/merge-sort/
 */