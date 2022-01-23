package com.maven.junit;

public class SumOfArrays {
	
	public int[] SumOfArrays() {
		int a[] = {34,56,78};
		int b[] = {43,65,50};
		int c[] = new int[3];
		
		for(int i=0; i<c.length;i++) {
			c[i] = a[i] + b[i];
		}
		
		return c;
		
		
	}

}
