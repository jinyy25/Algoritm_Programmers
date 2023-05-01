package com.al.spring;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
	
	int[][] arr1 = new int[2][2];
	int[][] arr2 = new int[2][2];
	arr1[0][0]=300;
	arr1[0][1]=100;
	arr1[1][0]=200;
	arr1[1][1]=1;
	arr2[0][0]=300;
	arr2[0][1]=100;
	arr2[1][0]=200;
	arr2[1][1]=1;
	
//	test1(arr1,arr2);
//	test2();
	test3(2,5);
	}
	
	

	
	//2023.5.1
	//행렬의 덧셈  
    public static int[][] test1(int[][] arr1, int[][] arr2) {	
        
    	//열길이  
        for(int i=0; i<arr1.length; i++) {
        	
        	//행길이  
        	for(int j=0; j<arr1[0].length; j++) {        		
        		arr1[i][j] += arr2[i][j];
        	}        	
        	
        }
        
        return arr1;
    }
    
    
    //직사각형 별찍기 
    public static void test2() {
        
    	//Scanner Jvm 위에 나열 
    	//Constructs a new Scanner 
    	//that produces values scanned from the specified file. 
    	//Bytes from the file are converted into characters 
    	//using the underlying platform's default charset.
    	//String의 경우 : sc.nextLine();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        

        for(int i=0; i<b;i++){                         
            for(int j=0; j<a;j++){
                System.out.print("*");        
            }
            System.out.println(); 
        }
    	
    }

      //최대공약수와 최소공배수
	  public static int[] test3(int n, int m) {
		int[] answer = {};
		
		//최대공약수 : 0이아닌 공통된 약수중 가장 큰 수   		
		int c =getGcd(n,m);
		
		//최대공약수 : 최대공약수 나누기 두변수의 곱  
		int d = n*m/c;
		
		
		return answer;  
	  }
	  
	  public static int getGcd(int a,int b) {		    
		    // 1: 2,5
		    // 2: 5,2
		    // 3: 2,1
		    // 4: 1,2
		    // 5: 2,0
		  if(b==0) return a;		  
		  return getGcd(b, a%b);
	  }


}



