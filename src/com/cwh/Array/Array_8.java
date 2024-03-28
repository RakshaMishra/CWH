package com.cwh.Array;

public class Array_8 {
	public static void main(String[] args) {
		int []ar= {1,1,1,2,2,2,2,3,4,5,5};
		int l=2;
		int check=0;
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]==l)
			{
				check++;
			}
		}
		if(check==0)
		{
			System.out.println("the element is not present");
		}
		else
		{
			System.out.println("the element is present "+check+" times");
		}
	}

}
