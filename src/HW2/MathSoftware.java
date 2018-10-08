package HW2;

public abstract class MathSoftware {
    SortBehavior sortBehavior;
    public MathSoftware(){

    }
    public int[] performSort(int[] array){
        return sortBehavior.mathSort(array);
    }
    public void setSortStrategy(SortBehavior sb){
        sortBehavior = sb;
    }
}
