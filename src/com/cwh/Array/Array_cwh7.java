package com.cwh.Array;

public class Array_cwh7 {
	public static void main(String[] args) {
		
		int []ar= {10,20,30,50,60};
		boolean sort=true;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				sort=false;
				break;
			}
		}
		
		if(sort)
		{
			System.out.println("the array is sorted");
		}
		else
		{
			System.out.println("the array is not sorted");
		}
			
	}

}
