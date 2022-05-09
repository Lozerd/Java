package SortingAlgorithms;

public class Sorting {
    public static void main(String[] args) {
        int[] array = new int[]{1,4,6,8,2,5,9};
        for (int i : array){
            System.out.printf("%d ", i);
        }
        quickSort(array, 0, array.length-1);
        System.out.println();
        for (int i : array){
            System.out.printf("%d ", i);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivot = arr[high];
            int pos = partition(arr, low, high, pivot);

            quickSort(arr, low, pos-1);
            quickSort(arr, pos+1, high);
        }
    }

    public static void swap(int[] arr, int pos1, int pos2) {
        int temp;
        temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        int i = low;
        int j = low;
        while( i <= high){
            if(arr[i] > pivot){
                i++;
            }
            else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return j-1;
    }
}
