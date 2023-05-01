
import java.util.*;

public class programmersTest {
	public static void main(String[] args) {
		
		//암호해독
//		String tmp = "asdasdasd";
//		String[] tmpArr = tmp.split("");
//		tmpArr.length;
//		= tmp.split(" ");	
//		List<String> tmp2= Arrays.asList(tmp);
//		ArrayList<Integer> intResult = new ArrayList<>();
//		intResult.add(1);
//		String joinString = String.join(", ", tmp2);
	
//	     for(int i=code-1;i<cipher.length();i+=code){
//	            answer+=cipher.charAt(i);
//	        }	
		
        //암호 배열로 나눔
//        String[] tmpArr = cipher.split("");
//        List<String> resArr = new ArrayList<>();
//        int multi = 0;
//        
//        for(int i =code-1; i<cipher.length(); i++){   
//            multi = (code*i);
//            if(multi<tmpArr.length){
//                resArr.add(tmpArr[multi]);
//            }                   
//        }
//        answer = String.join("",resArr);   
		
		

		
		//2023.02.20 영어가 싫어
//		import java.util.*;
//
//		class Solution {
//		    public long solution(String numbers) {
//	String numbers= "nine";
//		        long answer = 0;
//		        numbers = numbers.replace("zero","0");
//		        numbers = numbers.replace("one","1");
//		        numbers = numbers.replace("two","2");
//		        numbers = numbers.replace("three","3");
//		        numbers = numbers.replace("four","4");
//		        numbers = numbers.replace("five","5");
//		        numbers =  numbers.replace("six","6");
//		        numbers = numbers.replace("seven","7");
//		        numbers = numbers.replace("eight","8");
//		        numbers = numbers.replace("nine","9");
//		       
//		        answer = Long.parseLong(numbers);
//		        
//		        return answer;
//		    }
//		}
		// Long.parseLong : 메모리수가 int에 비해 크
		// Integer과 Long은 Null 이 가능하지만, int와 long은 Null이 불가
		
		
		//2023.02.20 인덱스 바꾸기
//	String my_string = "hello";
//	int num1 =1;
//	int num2 = 2;
//	Character answer = null;
//	Character answer2 = null;
//	answer= my_string.charAt(num1);
//	answer2= my_string.charAt(num2);
//
//	char[] charArr = my_string.toCharArray();
//	
//	answer = charArr[num1];
//	answer2 = charArr[num2];
//	
//	charArr[num2] = answer;
//	charArr[num1] = answer2;
//	
//	String n1 = "";
//	for(int i=0; i<charArr.length;i++) {
//	 n1+= charArr[i];
//	}
//	
		//다른풀이
//     String answer = "";
//
//	        char[] ch = my_string.toCharArray();
//
//	        ch[num1] = my_string.charAt(num2);
//	        ch[num2] = my_string.charAt(num1);
			
			//해당객체형으로 변환하여 반환 
//	        answer = String.valueOf(ch);

		//2023.02.22 한번만 등장한 문자
//		class Solution {
//		    public String solution(String s) {
//		        String answer = "";
//		        int[] arr = new int[26];
//		        for (int i = 0; i < 26; i++) {
//		            arr[i] = 0;
//		        }
//		        for (int i = 0; i < s.length(); i++) {
//		            arr[s.charAt(i) - 97] += 1;
//		        }
//		        for (int i = 0; i < 26; i++) {
//		            if (arr[i] == 1) {
//		                answer += (char)(i + 97);
//		            }
//		        }
//		        return answer;
//		    }
//		}
		
		
		//문자열 계산하기
		String my_string= "100 - 100";
		String b= my_string.replaceAll("[^0-9]", "");
		long tmp1=0;
		long tmp2=0;
		long answer = 0;
//형변
//		Integer.parseInt();
//		Integer.toString(answer);
//		String.valueOf();
//		Integer.valueOf()
//		Character.getNumericValue(); char -> int
//		
		//세가지 경우 100자리 10자리 1자리
        String[] str = my_string.split(" ");
        System.out.println(str[1]);
        boolean mode = true;
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                answer += Integer.parseInt(str[i]);
            } else {
                if (str[i].equals("+")) {
                    mode = true;
                } else if (str[i].equals("-")) {
                    mode = false;
                } else {
                    if (mode) {
                        answer += Integer.parseInt(str[i]);
                    } else {
                        answer -= Integer.parseInt(str[i]);
                    }
                }
            }
        }
        
//        import java.util.*;
//        class Solution {
//            public int solution(int[] numbers) {
//                int answer = 0;
//                
//                ArrayList<Integer> tmpPst = new ArrayList<>();
//                ArrayList<Integer> tmpNgt = new ArrayList<>();    
//                for(int a : numbers){
//                    if(a<0){
//                        tmpNgt.add(a);
//                    }else{
//                        tmpPst.add(a);
//                    }
//                }
//                
//                int tmp1=0;
//                int tmp2=0;
//                //음수 두개의경우
//                if(tmpNgt.size()>=2){
//                    Collections.sort(tmpNgt);            
//                    tmp1=tmpNgt.get(0)*tmpNgt.get(1);
//
//                //양수 두개의경우
//                }else if(tmpPst.size()>=2){
//                    Collections.sort(tmpPst, Collections.reverseOrder());     
//                    tmp2=tmpPst.get(0)*tmpPst.get(1);
//                }        
//                
//                //위의둘을 비교
//                if(tmp1>tmp2){
//                    answer = tmp1;
//                }else{
//                    answer = tmp2;
//                }
//                
//                return answer;
//            }
//        }   
        
		String tmp = "asdasdasd";
//		String[] tmpArr = tmp.split("");
        int num = 141414;
        ArrayList<String> tmpArr = new ArrayList<>();         
        tmpArr.add(null);
        
       tmp.toLowerCase();
       tmp.length();
//      Arrays.sort(tmp);
//       String str = "CADB";       
//       char[] chars = str.toCharArray();
//       Arrays.sort(chars);
//       str = new String(chars);

       System.out.println(str);
//       String tmp = String.valueOf(num);
//        Integer[] tmpArr = num.split("");
//        Arrays.split
	}
	
	
	
	public void plus() {
//		return
	}
	
}
