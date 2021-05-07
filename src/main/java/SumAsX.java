//Given an array A[] and a number x, check for pair in A[] with sum as x

import java.util.HashSet;

public class SumAsX {
    public static void main(String[] args) {
        int A[] = {0, 1, 2, 3, 4, 5, 6};
        int sum = 6;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {

            int temp = sum - A[i];
            if (hashSet.contains(temp)) {
                System.out.println(" " + A[i] + " &" + temp + " ");
            } else {
                hashSet.add(A[i]);
            }
        }
    }
}
