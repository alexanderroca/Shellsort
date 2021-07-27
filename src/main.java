public class main {

    static void printArray(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int array[] = {12, 34, 54, 2, 3};
        ShellSort ss = new ShellSort(array);
        System.out.println("Array before sorting:");
        printArray(array);
        ss.sort(array);
        System.out.println("Array after sorting:");
        printArray(ss.getArray());
    }
}
