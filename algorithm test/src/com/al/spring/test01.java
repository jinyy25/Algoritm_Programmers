package com.al.spring;
import java.util.*;
import java.util.stream.Stream;

public class test01 {

	public static void main(String[] args) {
//		 char[] charArray = new char[100];
//		String n = "hello";
//		n.valueOf(1);
		ArrayList<Character> result = new ArrayList<>();
		ArrayList<Integer> intResult = new ArrayList<>();
//		intResult.get(;)
		//result.remo;
		//n.charAt(1).; 
		//n.toString().replaceAll(n, n).replaceAll(n, n);
		String[] al = {"a","b","c","d","e","f","g","h","i","j"};
		//al.i
		
		//Double n2=1.222;
		//n2.in;
		String str = "aaa123";
		String toInt = str.replaceAll("[^0-9]", "");
		toInt.charAt(0);
		//str.le
		//toInt.sp
		//char n3 = '1';
		//Character.getNumericValue(n3);
		//String n5 = "a";
		//int n23 = parse (int)n5;
		//Integer.parseInt(n5);


		//장군개미 5
		//병정개미 3
		//일개미 1
		// ex 체력 23 여치
		//최소한의 병력 몇마리의 개미?
		//5*x + 3*y + 1*z
		//int n =1;
		//for(int i=0; i<hp; i++){
		//     n *= i;
		//    if(hp==n){
		//            System.out.println("n1:"+n);      
		//    } else {
		//        n=n+(3*i);
		//        if(n==hp){                    
		//            System.out.println("n2:"+n);         
		//        }else{
		//            n=n+(3*i)+(1*i);                    
		//            // System.out.println("n3:"+n); 
		//            if(n==hp){
		//                answer = n;
		//                System.out.println("n3:"+n);  
		//            }
		//        }
		//        
		//    } 
		//}
		//answer = my_string.replaceAll("[aeiou]", "");
		//	Arrays.stream(rsp.split("")).map(s -> s.equals("2")?"0")
			
		int[][] numbers=new int[3][3];
		//이차원배열에 값 대입하기
		numbers[0][0]=300;
		numbers[0][1]=100;
		numbers[0][2]=200;
		numbers[1][0]=30;
		numbers[1][1]=20;
		numbers[1][2]=50;
		
		//이차원배열 출력하기
//		System.out.println(numbers[1][1]);
//		System.out.println(numbers);
//		System.out.println(numbers[0]);
		
		
		//숫자만추
		String re = "a1111222";
		String re1 = re.replaceAll("[^0-9]","");
		String[] answer = re1.split("");
//		String[] arr = re.split("").;
//        int answer1 = Integer.v valueOf(answer[0]); 
        
//		int[] in = Integer.parseInt(answer);
		 Integer[] newArr = Stream.of(answer).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
//		newArr. 
	 Arrays.sort(newArr);
	 //위과정 한번
//	 return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
		
		
	}
}
