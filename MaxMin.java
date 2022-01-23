package com.maven;

public class MaxMin {
	public static int getMaxDiff(int[] a) {
		int diff = Integer.MIN_VALUE;
		int n = a.length;
		if(n==0) {
			return diff;
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if (a[j]>a[i]) {
					diff = Integer.max(diff, a[j]-a[i]);
				}
			}
		}
		return diff;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,12,20,30,25,40,32,31,50,60};
		int diff = getMaxDiff(a);
		if(diff!=Integer.MIN_VALUE) {
			System.out.println("the max diff id " + diff);
		}
	

	}

}
