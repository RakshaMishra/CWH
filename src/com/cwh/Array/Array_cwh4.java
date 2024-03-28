package com.cwh.Array;
import java.util.Scanner;

public class Array_cwh4 {
	public static void main(String[] args) {
		int [] arr= {444,666,1432,888,68};
		int temp=0;
		int l=arr.length;
		int a= Math.floorDiv(arr.length ,2);
		for(int i=0;i<a;i++)
		{
			temp=arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1]=temp;
			
		}
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
