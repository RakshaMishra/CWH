package com.cwh.Array;

public class Array_cwh2 {
	public static void main(String[] args) {
		int []ar= {20,222,555,888,666};
		boolean check=false;
		for(int i=0;i<=4;i++)
		{
			if(ar[i]==22)
			{
				check=true;
				break;
			}
		}
		if(check)
		{
			System.out.println("value is present");
		}
		else
		{
			System.out.println("value is not present");
		}
	}

}
