package com.mysample.app;

public class TestMaxZero {
	
	public static void main(String args[]) {
		
		int arr[][]  = {{1,1,0},{1,1,0},{1,1,0}};
		//MaxZero max = new MaxZero();
		
		System.out.println(MaxZero.columnWithMaxZero(arr, 3));
		
	}

}

class MaxZero{
	
	static int columnWithMaxZero(int a[][],int n) {
		
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0){
                    c[j]+=1;
                }
            }
        }
        
        int max = c[0];
        int index =0;
        for(int l=0;l<c.length;l++){
            if(c[l]>max){
                max=c[l];
                index=l;
            }
        }
		return index;
		
		
	}
	
}
