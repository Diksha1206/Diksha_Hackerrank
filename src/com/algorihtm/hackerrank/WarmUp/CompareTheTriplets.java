package com.algorihtm.hackerrank.WarmUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		List<Integer> result = new ArrayList<Integer>();
		int aliceScore = 0, bobScore = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {

				aliceScore++;
			} else if (b.get(i) > a.get(i)) {
				bobScore++;
			}
		}
		result.add(aliceScore);
		result.add(bobScore);

		return result;

	}

	public static void main(String[] args) {

		List<Integer> alice = new ArrayList<>();
		alice.add(5);
		alice.add(6);
		alice.add(7);
		List<Integer> bob = new ArrayList<>();
		bob.add(3);
		bob.add(6);
		bob.add(10);
		
		List<Integer> result = compareTriplets(alice, bob);
		
		System.out.println(Arrays.toString(result.toArray()));
	}

}
