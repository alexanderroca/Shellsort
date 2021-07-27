public class ShellSort {

    private int[] array;

    public ShellSort(int[] array) {
        this.array = array;
    }

    public void sort(int array[]){
        int length = array.length;

        for(int interval = length / 2; interval > 0; interval /= 2){
            for(int i = interval; i < length; i += 1){
                int aux = array[i];
                int j;
                for(j = i; j >= interval && array[j - interval] > aux; j -= interval)
                    array[j] = array[j - interval];
                array[j] = aux;
            }
        }   //for
    }

    public int[] getArray() {
        return array;
    }
}
