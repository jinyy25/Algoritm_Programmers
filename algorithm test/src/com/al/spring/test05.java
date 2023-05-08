package com.al.spring;
import java.util.*;

import javax.xml.stream.events.Characters;

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
	
	int[] arr3 = {1,3,2,5,4};

	
//	test1(arr1,arr2);
//	test2();
//	test3(2,5);
//	test5(45); 
	test6("hellos world");
	test7(arr3,3);
	test8("a",5);
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
	  
	  //같은 숫자는 싫어 
	    public static ArrayList<Integer>  test4(int []arr) {
	        ArrayList<Integer> answer = new ArrayList<>();
	    
	        
	        int dum=-1;
	        for(int i=0; i<arr.length; i++){                        
	            if(arr[i]!=dum){
	                answer.add(arr[i]);
	            }
	            dum=arr[i];
	        }

	        return answer;
	    }
	    
	    //3진법 뒤집
	   public static int test5 (int n) {
		    int answer =0;
		    
	        String a = Integer.toString(n,3);
	        String[] arr= a.split("");	     
	        ArrayList<String> li = new ArrayList<>();
	        
	        //뒤집
	        for(int i=arr.length-1; -1<i; i--) {	        	
	        	li.add(arr[i]);
	        }

	        String b=String.join("", li);   //list 변환  
	        answer = Integer.parseInt(b,3); //3진수 -> 10진법  
	 
		   return answer;
	   }

	   //이상한 문자 만들기  
	  public static String test6 (String s) {
	      String answer = "";
       	  String[] arr = s.split(""); 
       	  
       	  
		  int dum=0;
		  //짝수 : 대문자, 홀수 : 소문자  
		  for(int i=0; i<arr.length; i++) {
			  if(arr[i].equals(" ")) {
				  dum =0;
			  }else if(dum%2==0) {
				  arr[i]=(arr[i].toUpperCase());
				  dum++;
			  }else if(dum%2!=0) {
				  arr[i]=(arr[i].toLowerCase());
				  dum++;
			  }  
			  answer += arr[i];
		  }
         
		  return answer;
	  } 
	  
	  //예산  
	  public static int test7(int[] d, int budget) {
	        int answer = 0;        
	        
	        Arrays.sort(d);
	        int sum =0;
	        for(int a : d){
	            sum+=a;            
	            if(sum<=budget){
	              answer++;               
	            }
	        }
	        
	        
	        return answer;
	    }
	  
	  
	    public static String test8(String s, int n) {
	    	String answer = "";
	    	//65 => A  90 => Z
	        //97 => a  122 => z 
	        for(int i=0; i<s.length(); i++) {
	            char ch = s.charAt(i);
	             //공백
	            if(ch==' ') {
	                answer += ch;
	                continue;
	            }
	            //소문자
	            if(ch>='a' && ch<='z') { 
	                if(ch+n > 'z') {
	                    answer += (char)(ch-26+n);
	                }else {
	                    answer += (char)(ch+n);
	                }
	            //대문자
	            }else if(ch>='A' && ch<='Z') { 
	                if(ch+n > 'Z') {
	                    answer += (char)(ch-26+n);
	                }else {
	                    answer += (char)(ch+n);
	                }
	            }
	        }
	        return answer;
	    }
	  
	  
}



