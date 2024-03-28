package com.cwh.Array;

public class Array_cwh6 {
	public static void main(String[] args) {
		int []ar= {222,45,777,666,888};
		int min=98765432;
		for(int i=0;i<=4;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println("the minimum value is "+min);
	}

}
