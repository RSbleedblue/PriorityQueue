/*
Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. 
All digits of the given array must be used to form the two numbers.

Any combination of digits may be used to form the two numbers to be summed. Leading zeroes are permitted.

If forming two numbers is impossible (i.e. when n==0) then the "sum" is the value of the only number that can be formed.

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        long res = minDigits(arr,size);
        System.out.println(res);
    }
    public static long minDigits(int arr[],int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: arr){
            pq.add(num);
        }
        if(n <= 1){
            return arr[0];
        }
        long num1 = 0;
        long num2 = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                num1 = (num1 * 10)+pq.poll();
            }
            else{
                num2 = (num2 * 10) + pq.poll();
            }
        }
        long ans = num1+num2;
        return ans;
    }
}
