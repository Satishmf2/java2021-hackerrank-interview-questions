//Given an array A[] and a number x, check for pair in A[] with sum as x

import java.util.HashSet;

public class SumAsX {
    public static void main(String[] args) {
        int A[] = {1, 5, 7, -1, 5};
        int sum = 6;
        int count=0;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {

            int temp = sum - A[i];
            if (hashSet.contains(temp)) {
                System.out.println(" " + A[i] + " &" + temp + " ");
                count++;
            } else {
                hashSet.add(A[i]);
            }
        }
        System.out.println(count);
    }
}
