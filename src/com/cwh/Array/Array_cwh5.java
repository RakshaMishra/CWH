package com.cwh.Array;

public class Array_cwh5 {
 public static void main(String[] args) {
	
	int []ar= {555,3,6666,9999,55};
	int max=0;
	for(int i=0;i<=4;i++)
	{
		if(ar[i]>max)
		{
			max=ar[i];
		}
	}
	System.out.println("the maximum value is "+max);
}
}
