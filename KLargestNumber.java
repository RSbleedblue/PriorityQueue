import java.util.PriorityQueue;

public class KLargestElement {
    public static void KLargest(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        for(;i< arr.length;i++){
            int min  = pq.element();
            if(min<arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {9,4,8,7,11,3 };
        KLargest(arr,2);
    }
}
