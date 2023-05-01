import java.util.*;

import javax.sound.sampled.LineEvent.Type;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		String b = String.valueOf(a);
		String[] sp=b.split("");
		
		Integer.valueOf(sp[0]);

//		2023.04.18 lv1 푸는중  
//		박싱(boxing)은 기본 자료형의 데이터를 래퍼(wrapper) 클래스의 객체로 만드는 과정을 의미하며,
//		언박싱(un boxing)은 래퍼(wrapper) 클래스의 데이터를 기본 자료형으로 얻어내는 과정을 말한다.

//		valueOf() 와 parseInt() 의 차이점
//		Integer.valueOf("10") 은 Integer 타입으로 반환하고,  Wrapper Class : 래퍼 클래스는 기본자료형을 참조자료형처럼 사용할 수 있게 감싸주는 클래스
//		Integer.parseInt("10") 은 int 타입으로 반환한다.	    기본자료형  : 기본 자료형은 변수의 타입으로 쓸 수 있는 자료형
		
//		- 기본자료형과 참조자료형의 차이.
//		참조자료형은 Object class 를 상속받는 "객체"이다.
//		기본자료형은 메모리값이 정해져 있고 참조자료형은 사용하는 것에 따라 할당해야하는 메모리의 크기가 달라진다.
//		기본자료형은 null을 허용하지 않지만, 참조자료형의 기본 값은 null로, null을 허용한다.
//		수로 되어 있는 기본자료형(정수형 또는 실수형)같은 경우, 산술연산이(+-/* .. ) 가능하지만, 참조자료형은(=> 정수형 또는 실수형의 래퍼클래스 ) 불가능하다.
//		기본자료형은 보통 클래스의 변수로 선언되어 인스턴스 안에 포함되거나 , 모두 스택영역에 저장되지만 참조자료형은 객체이므로 힙(Heap)메모리에 저장된다.
		
//		- 래퍼 클래스가 필요한 순간.
//		객체 타입으로 저장해야할 때.
//		매개변수로 객체를 받아야할 때,
//		객체를 비교해야할 때.
//		null 값을 허용해주어야할 때.
//		제너릭에 사용하고 싶을 때. (=> 제너릭<> 에는 객체(class)을 담을 수 있기때문에 객체가 아닌 기본자료형은 사용할 수 없다.)
//		정수 <-> 문자 .. 등 변환이 필요할 때.
		
//		- 박싱과 언박싱 Boxing , Unboxing
//		말 그대로 기본자료형을 래퍼 클래스로 감싸줄때에는 boxing이라고 표현하고 , 반대의 경우 unboxing 이라고 표현한다.
//		주로 위에서 언급한 상황들에서 기본자료형들을 boxing 하여 래퍼클래스를 만들어준다.

		
		String s = "asdasd";
//		int . = 123123;
		

		String[] sp1=s.split("");
		String[] a1 = {"Jane", "Kim"};
		int[] num = {1,52,5,10};
		Math.min(num[0],num[1]);
		
//s.indexOf (s.length()/2, 2);
		
//		num.
//		num.length
		sol("ppmopm");
		solution(123123213);
		solution1(121);
		solution2("123123");
		solution3(14326);
		solution4(51);
		solution5(5,16);
		solution6(16);			
		solution7(a1);
		solution8(num,5);
		
		test1("Zbcdefg");
		test2(13,17);
		test3(3,20,4);
		test4("1111");
	}
	
	//문자열내 p와 y개수  
	public static boolean sol(String s) {
        boolean answer = true;
        
        //소문자  
        String lower = s.toLowerCase();
        String[] sp=lower.split("");
        int p = 0;
        int y = 0;
     
        
        for(int i=0; i<sp.length;i++){
            if(sp[i].equals("p")){
                p++;
            }else if(sp[i].equals("y")){
                y++;
            }                                    
        }
        
        if(p==y){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
	
	//자연수 뒤집어 배열로 만들기  
    public static ArrayList<Integer> solution(long n) {

        String tmp = String.valueOf(n);
        String[] tmp1 = tmp.split("");        
        ArrayList<Integer> arr = new ArrayList<>();
        
        //뒤집어서 add
        for(int i=tmp1.length-1; 0<=i; i--){
            arr.add(Integer.valueOf(tmp1[i]));            
        }                 
        
        return arr;
    }
    
    //정수 제곱근 판별  
    public static long solution1(long n) {
        long answer = 0;
       
        //Math.sqrt() : 제곱
        Double tmp = Math.sqrt(n);       
        
        //소수존재확인  
        if(tmp%1 == 0.0){
           //Math.pow() : 제곱
           answer =  (long)Math.pow(tmp+1,2);
        }else{
            answer = -1;
        }
        
        return answer;
    }
    
    //문자열 정수변환  
    public static int solution2(String s) {
//    s.charA
        return Integer.valueOf(s);
    }
    
     
    //정수 내림차순으로 배치하기  
    public static long solution3(long n) {
        long answer = 0;
        String tmp = String.valueOf(n);
        String[] tmp1 = tmp.split("");
        
        //역순배치 : Collections.reversOrder()
        Arrays.sort(tmp1,Collections.reverseOrder());
        answer = Long.valueOf(String.join("", tmp1));
        ArrayList<Integer> answer1 = new ArrayList<>();
       

        return answer;
    }
    
    //하샤드 수  
    public static boolean solution4(int x) {
        boolean answer = true;
        String tmp = String.valueOf(x);
        String[] tmp1 = tmp.split("");        
        
        int sum = 0;
        for(int i=0; i<tmp1.length; i++){
            sum+=Integer.valueOf(tmp1[i]);
        }
        
        if(x%sum==0){
            answer = true;
        }else{
            answer = false;
        }
        
            
        return answer;
    }
    
    //두정수 사이의 합 : 등차수열로도 풀이 가능 
    public static long solution5(int a, int b) {
        long answer = 0;
        
        int more = 0;
        int less = 0;
        
        if(a>b){
            more=a;
            less=b;
        }else if(b>a){
            more=b;
            less=a;
        } else {
            answer = a;
        }
        
        for(int i=less; i<=more; i++){
            answer+=i;
        }
        
        
        return answer;
    }

    
    //콜라츠 추측 
	public static int solution6(int num) {
	        
	        //long으로 overflow 방지 **
	        long n = num;
	        int answer = 0;
	        
	        while(n!=1){                      
	            answer++;
	            if(n%2==0){
	                n = n/2;
	            } else {
	                n = n*3+1;                 
	            }  
	            
	            if(answer==500){
	                answer = -1;
	                break;                
	            }
	
	        }
	        
	        return answer;
	    }
	
	
	//서울에서 김서방 찾기 
	public static String solution7(String[] seoul) {        
        String answer = "";
        for(int i=0; i<seoul.length; i++){             
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+ i +"에 있다";
            }
        }
        
        return answer;
    }
	
	
	//나누어 떨어지는 숫자 배열  
    public static ArrayList<Integer> solution8(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor ==0){                            
                answer.add(arr[i]);
            }
        }

        //ArrayList의 경우 Colletions.sort() / Collections.reversOrder()
        //일반배열의 경우 Arrays.sort(배열); 
        Collections.sort(answer);
        
        if(answer.isEmpty()){
            answer.add(-1);
        }

        return answer;
    }
    
    //핸드폰 번호 가리기  
    public static String solution9(String phone_number) {
        String answer = "";
        String[] pn = phone_number.split("");
        int lng = phone_number.length();
        ArrayList<String> arr = new ArrayList<>();

        
        for(int i=1; i<=lng; i++){
            if(i<=lng-4){
                arr.add("*");
            }else{
                arr.add(pn[i-1]);               
            }                                    
        }
        
       answer = String.join("",arr);

        
        return answer;
    }
    
    
    public static int solution10(int[] absolutes, boolean[] signs) {
        int answer = 0;
    
        
        for(int i=0; i<signs.length; i++){
            if(signs[i]==false){
                absolutes[i] =  absolutes[i] * -1;
            }
             answer+=absolutes[i];
        }
        

        return answer;
    }
    
    // 제일 작은 수 제거하기  
    public static int[] solution11(int[] arr) {        
        //최소
    	int min = arr[0];
        int index = 0;
        
        
        // 길이가 없을경우 -1 반
        if(arr.length == 1){
           int [] answer = {-1};
           return answer;
        
        // answer 다시선언 
        }else{   
            int[] answer = new int[arr.length-1];        
            
            //최소값 찾기 (갱신)  
            for(int i=0; i<arr.length;i++){
                min = Math.min(min, arr[i]);                 
            }                        
            
            //최소값일 경우 넣지 않기  
            for(int i=0; i<arr.length; i++){       
                if(arr[i] == min){
                     continue;
                }    
                answer[index++] = arr[i];                   
            }
            return answer;      
        }             
    }

    // 2023.04.29
    // 문자열 내림차순으로 배치하
    public static String test1(String s) {        
        String answer = "";
        
        //문자 분해
        String[] tmp= s.split("");
        
        //대문자는 본래 소문자 보다 앞선다 
        //add
        Arrays.sort(tmp,Collections.reverseOrder());  
        answer = String.join("",tmp);
    	
    	return null; 
    }
    
    // 약수의 개수와 덧셈  
    // 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
    // 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수
    public static int test2(int left, int right) {
        int answer = 0;
        
        //약수 구하기   Marh.sqrt() 로 가능한 내용이었다 ...   
        for(int i=left; i<=right; i++) {       
        	if(getSolve(i)%2 == 0) {
        		answer += i;        		
        	} else {
        		answer -= i;
        	}        		
        }
        
        
        return answer;
    }
    
    public static int getSolve(int a){
    	int count = 0;
    	for(int i=1; i<=a; i++) {
    		if(a%i ==0) {
    			count++;
    		}    		
    	}
    	
        return count;
    }


    
    //부족한 금액 계산하기 
    //새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다. 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
    //놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
    //단, 금액이 부족하지 않으면 0을 return 하세요.
    public static long test3(int price, int money, int count) {
       long answer = 0;
       long res =0;
       
       for(int i=1; i<=count ;i++) {    	    
    	   res += (price * i);   
       }
       
       answer=money-res;
       
       if(answer <0) {
    	   answer = Math.abs(answer);
       } else {
    	   answer = 0;
       } 
        
        return answer;
    }
        
    //문자열 다루기 
    public static boolean test4(String s) {                
        String[] tmp = s.split("");        
        String[] in = {"1","2","3","4","5","6","7","8","9"};
        int count = 0;
        for(int i=0; i<tmp.length;i++) {
	        for(int j=0; j<in.length;j++) {
	        	if(tmp[i].equals(in[j])) {
	        		count++;
	        	}
	        }		          
        }
    	System.out.println(tmp.length);        
    	System.out.println(count);
        
       //문제 잘 읽어 볼것 문자열 4 혹은 6이어야한다 ..
	   if(s.length() != 4 && s.length() != 6){
		 	System.out.println(false);
       }else if(count == tmp.length) {
        	System.out.println(true);
        }else {
        	System.out.println(false);	
        }
	   
	   //try catch 활용  
//	   if(s.length() == 4 || s.length() == 6){
//	          try{
//	              int x = Integer.parseInt(s);
//	              return true;
//	          } catch(NumberFormatException e){
//	              return false;
//	          }
//	      }
//	      else return false;
    	        
        return false;
    }
    
    

    
    
    
    
    
   
}







