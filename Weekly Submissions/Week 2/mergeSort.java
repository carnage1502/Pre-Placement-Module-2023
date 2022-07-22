import java.util.*;
public class mergeSort {

    public static void divide(int[] arr,int start,int end){
        if(start>=end) return;
        int mid=start+(end-start) /2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr,start,mid,end);

    }

    public static void conquer(int[] arr,int start,int mid,int end){
        int[] merge=new int[end-start+1];
        int i1=start;
        int i2=mid+1;
        int x=0;

        while(i1 <= mid && i2<= end){
            if(arr[i1]<=arr[i2]) merge[x++]=merge[i1++];
            else merge[x++]=merge[i2++];
        }
        while(i1<=mid) merge[x++]=merge[i1++];

        while(i2<=end) merge[x++]=merge[i2++];

        for(int i=0,j=start;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        divide(arr, 0, n-1);

        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }    
}