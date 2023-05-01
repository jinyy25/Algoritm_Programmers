package com.al.spring;
import java.util.stream.Stream;
import java.util.*;

public class test02 {

	
// Stack 함수 이	
//	import java.util.*;
//	class Solution {
//	    public int solution(String s) {
//	        int answer = 0;
//	        
//	        String[] sArr = s.split(" ");
//	        Stack<Integer> stack = new Stack();
//	        
//	        for (String i : sArr) {
//	            if (i.equals("Z")) {
//	                if (stack.size()!=0){
//	                    stack.pop();
//	                }
//	            } else {
//		            int num = Integer.valueOf(i);
//		            stack.push(num);
//	            }
//	        }
//	        for (int i : stack) {
//	        	answer += i;
//	        }
//	        
//	        return answer;
//	    }
//	}
	
	
//	class Solution {
//		public int solution(String s) {
//			String[] arr = s.split(" ");
//			int answer = Integer.valueOf(arr[0]);
//			
//			for (int i = 1; i < arr.length; i++) {
//				if (arr[i].equals("Z")) {
//					answer -= Integer.valueOf(arr[i - 1]);
//				}else {
//					answer += Integer.valueOf(arr[i]);
//				} 
//			}
//			return answer;
//		}
//	}
	
//	Integer max = Collections.max(nums);
//	System.out.println(max);
//	System.out.println(nums.indexOf(max)+1);
	int a = 1254;
//	
    int[] digits = Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();
//int i = digits.hashCode();e

    

    
//programmers 369게
//   +""를 통해서 문자열로 변 
//    class Solution {
//        public int solution(int order) {
//            int answer = 0;
//
//            String str = order+"";
//
//            for(int i=0; i<str.length(); i++){
//                char c = str.charAt(i);
//                if(c=='3'||c=='6'||c=='9') answer++;
//            }
//
//            return answer;
//        }
//    }
	
}
