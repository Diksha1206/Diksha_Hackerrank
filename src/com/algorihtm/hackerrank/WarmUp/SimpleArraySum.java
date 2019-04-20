package com.algorihtm.hackerrank.WarmUp;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySum {

	/*
	 * Complete the simpleArraySum function below.
	 */
	public int simpleArraySum(int[] ar) {
		/*
		 * Write your code here.
		 */
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		
		//method 2
		int res = Arrays.stream(ar).sum();
		System.out.println(res);
		
		return sum;
	}

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
		SimpleArraySum a = new SimpleArraySum();
		int result = a.simpleArraySum(ar);
		System.out.println(result);
	}

}
