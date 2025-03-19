package dev.rama27.Learn.Problems.Array;


public class SumExceptSelf1 {

    public static void main(String[] args){

        sum(new int[]{1,3,4,2,6});

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter no of elements in array: ");
//        int temp=scanner.nextInt();
//        int[] a= new int[temp];
//
//        for(int i=0;i<temp;i++){
//            a[i] = scanner.nextInt();
//        }
//        sum(a);

    }
    public static void sum(int[] arr){
        System.out.println("Given array is \n");
        printArr(arr);

        int len=arr.length;
        int s=0;
        for(int i=0; i<len;i++){// calculating sum of all
                                 // elements in array
            s+=arr[i];
        }

        for(int i=0;i<len;i++){
            arr[i]=s-arr[i];
        }

        System.out.println("SumExcept Self  array is :");

        printArr(arr);


    }

    private static void printArr(int[] arr){
        for (int i:arr) {
            System.out.println(i+" ");
        }
    }
}


