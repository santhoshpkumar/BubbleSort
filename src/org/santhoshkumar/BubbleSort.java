package org.santhoshkumar;

public class BubbleSort {
    int[] values;

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] a = {34,6,1,78,3,6,2,9,0};
        bs.values = a;
        bs.sort();
        bs.print();
    }

    public void print(){
        for(int data: values){
            System.out.print(data+" ");
        }
        System.out.println();
    }

    public void sort(){
        //Compare each item until the last but one element.
        // use either ( < array.length-1 ) or ( <= array.length-2 )
        // If only last element it is already in sorted order.
        for(int i =0; i < values.length-1; i ++){
            // Compare from end each adjacent element until the sorted element
            // in previous iteration which is why (j > i)
            for(int j = values.length-1 ; j > i; j--){
                if (values[j] < values[j-1]) {
                    swap(j, j - 1);
                }
            }
        }
    }

    private void swap(int from, int to){
        int temp = values[from];
        values[from] = values[to];
        values[to] = temp;
    }
}
