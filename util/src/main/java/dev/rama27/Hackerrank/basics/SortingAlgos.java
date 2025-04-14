package dev.rama27.Hackerrank.basics;

public class SortingAlgos {
    public static void main(String[] args){

        int[] a={42, 17, 88, 5, 63, 29, 91, 34, 7, 50, 11, 77, 23, 8, 99, 45, 60, 19, 37, 55};
//        bubbleSort(a);
        selectionSort(a);
        

    }

    public static void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static int[] bubbleSort(int[] arr){
        int len=arr.length;
        int temp;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArr(arr);
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        int len=arr.length;
        int temp;
        for(int i=0;i<len;i++){
            int mini=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        printArr(arr);
        return arr;
    }
}
