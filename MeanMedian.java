import java.util.ArrayList;
import java.util.PriorityQueue;

public class MeanandMedian {
        public static ArrayList<Integer> ans(int arr[]) {
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                for(int i=0;i< arr.length;i++){
                        pq.add(arr[i]);
                }
                for(int i = 0; i<arr.length;i++){
                        arr[i] = pq.remove();
                }
                ArrayList<Integer> ans = new ArrayList<>();
                int sum = 0;
                //Mean
                for(int i = 0;i< arr.length;i++){
                        sum+=arr[i];
                }
                ans.add(sum/ arr.length);

                //Median
                if(arr.length%2!=0){
                        ans.add(arr[Math.abs(arr.length)/2]);
                }
                else{
                        ans.add(arr[arr.length/2]);
                }
                return ans;
        }
        public static void main(String args[]){
                int arr[]  = {20,11,23,1,10,2};
                ArrayList<Integer> list = ans(arr);
                for(int i=0;i<list.size();i++){
                        System.out.println(list.get(i));
                }
        }
}
