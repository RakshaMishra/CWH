package com.cwh.Array;

public class Array_cwh3 {
	public static void main(String[] args) {
		
		float [ ] ar= {10.0f,44.5f,99.0f,88.5f};
		float sum=0;
		for(int i=0;i<=3;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("the sum is "+sum);
		System.out.println("the average is "+sum/4);
	}
	

}
