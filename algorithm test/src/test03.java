import java.util.*;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {11,22,55};
		String[] arr = {"p","o","s"};
		String[] arrString = {"sod", "eocd", "qixm", "adio", "soo"};
		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		int[] numList = {1,2,3,4};
		int[][] boom = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
		int[][]lines = {{0, 1}, {2, 5}, {3, 9}};
		String[] bab= {"aya", "yee", "u", "maa", "wyeoo"};
		int[][] dot1 = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		
		solution(5,6,7);
		solution1("123faf2");
		solution2("10","11");
		solution3(array);							//잘라서 배열로 저장하기 
		solution4("13221dsdgsdg123",3);
		solution5(array);
		solution6(arr,arrString);					//외계어사전  
		solution7(dots);						    //직사각형 넓이 구하기  
		solution8(dots);							//등수매기기  (순위알고리)
		solution9(11,22);							//유한소수 판별하기 (유클리드호제)
		solutio10(99);								//저주의 숫자 3
		solution11("gege","egeg");					//문자열밀기 
		solution12(numList);						//등차수열, 등비수열
//		solution13(3,12);							//연속된 수의 
		solution14(boom); 							//안전지대  		
		solution15(lines);							//겹치는 선분의 길이  
		solution16(bab);							//옹알이(1)
		solution17(dot1);							//평행  
	}
	
	
	//1.
	//CharAt(int i) - '0'을 통해 char형의 문자들을 int형으로 변환시킬 수 있다.
	//StringBuilder 이용하여 문자를 각각 자름
	private static int solution(int i, int j, int k) {
	        int answer = 0;
	        
	        //i 부터 j 까지 k 등장횟수
	        for(int a = i; a <= j; a++ ){
	            
	            StringBuilder sb = new StringBuilder();
	            sb.append(a);

	            for(int b = 0 ; b < sb.length(); b++){     
	        // System.out.println("sb:"+(sb.charAt(b)));
	                if((sb.charAt(b) - '0') == k){         
	                //System.out.println("k:"+k);
	                    answer++;
	                }
	            }            
	        }
	        System.out.println("1:"+answer);
	        return answer;
	    }
	
	
	
		//2.
		private static int  solution1(String st) {
		        int answer = 0;
		        //문자로 split
		        String[] chInt = st.split("[a-zA-Z]");
		        
		        //나눠진 문자열 더함
		        for(int i=0; i<chInt.length; i++){
		            //System.out.println("chInt:"+chInt[i]);
		            answer += !chInt[i].isEmpty() ? Integer.parseInt(chInt[i]) : 0;
		            
		        }
		        System.out.println("2:"+answer);
		        return answer;
		  }

		//3.
		private static String solution2(String bin1, String bin2) {
//			int i = 127;			 
//			String binaryString = Integer.toBinaryString(i); //2진수
//			String octalString = Integer.toOctalString(i);   //8진수
//			String hexString = Integer.toHexString(i);       //16진수
//			int binaryToDecimal = Integer.parseInt(binaryString, 2);
//			int binaryToOctal = Integer.parseInt(octalString, 8);
//			int binaryToHex = Integer.parseInt(hexString, 16);
			
	        // 2진수를 10진수로 변환 parseInt(String s, int radix) 
			String answer = "";
			int convert1 = Integer.parseInt(bin1, 2);
	        int convert2 = Integer.parseInt(bin2, 2);
	        int res = convert1 + convert2;
	    
	        // 2진수로 변환
	        answer = Integer.toBinaryString(res);
			
			return answer;
		}
		
		
		
		//3. 1번문제와 유사
		private static int solution3(int[] array) {
        int answer = 0;
        
        String a ="";
        for(int i =0 ; i<array.length; i++){
            System.out.println("i:"+array[i]);
            a = String.valueOf(array[i]);
            
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            
            for(int b = 0; b<sb.length(); b++){
                if((sb.charAt(b)) == '7'){
                    answer++;
                }
            }
            
        }
        
        return answer;
        }
		
		
		//4 잘라서 배열로 저장하기 
		private static String[] solution4(String my_str, int n) {
	        List<String> answer = new ArrayList();
	        String a = "";
	        int inx = (my_str.length() / n);        
	        
	        //n으로 나눠질경우
	        for(int i = 0 ;  i < inx; i++){
	             answer.add(my_str.substring(n*i,n*(i+1)));      
	        }
	
	        //n으로 안나눠질경우
	        if(my_str.length() % n != 0){
	           answer.add(my_str.substring((my_str.length()/n) * n)); 
	        }
	        System.out.println(answer);
	        
	        //String으로 Array 변환
	        return answer.toArray(new String[0]);
		}
		
		//5.
		private static int solution5(int[] sides) {
			int answer = 0;
	        //최댓값 : Max List의 경우  
	        //int max = Collections.max(sides);
	        //System.out.println(max);  // 5
			
			//제곱 
			answer=(int) Math.pow(1,2);
			System.out.println(answer);
			return 0;
		}
		
		
		//6. 외계어사전 
		private static int solution6(String[] spell, String[] dic) {		        
		    //-- concept      
	        //join 배열내용 합치기
	        //String.join(",", dic);
	         
	         
	         //문자열내 문자 정렬 
	         //String str = "badec"; 
	         //char[] charArr = str.toCharArray(); // String to Char Array
	         //Arrays.sort(charArr); // Char Array 알파벳 순 정렬
	         // Char Array to String
	         //String result = new String(charArr); // 또는 String.valueOf(charArr);
	         

		    //-- start
		    //참이면 1 거짓이면 2
	        //dic의 값들을 반복	
	        ArrayList<String> arr = new ArrayList<>();
	    
	        for(String a : dic){         
	            arr.add(a);            
	        }
	        
	        //spell 합쳐서 정렬
	        String sp = String.join("",spell);
	        char[] spArr=sp.toCharArray();
	        Arrays.sort(spArr);
	        String spSt = new String(spArr);
	        
	        
	        //dic 정렬        
	        for(int i =0; i < arr.size(); i++){

	            char[] charArr=arr.get(i).toCharArray();
	            Arrays.sort(charArr);
	            String rs = new String(charArr);
		        System.out.println("s"+rs);	            
	            //비교
	            if(rs.equals(spSt)){
	                return 1;
	            }
	            
	        }

	        
	        return 2;			
		}
		
		
		//6. 외계어사전 
		private static int solution7(int[][] dots) {
	        int answer = 0;
	        int minX = dots[0][0];
	        int minY = dots[0][1];
	        int maxX = dots[0][0];
	        int maxY = dots[0][1];
	        
	        for(int i = 1; i < dots.length; i++ ){
	            minX = Math.min(minX, dots[i][0]);
	            minY = Math.min(minY, dots[i][1]);
	            maxX = Math.max(maxX, dots[i][0]);
	            maxY = Math.max(maxY, dots[i][1]);
	        }
	        int[] answer1 = new int[5];

	        ArrayList<Float> arrAvg = new ArrayList<>();
	        System.out.println("check:"+answer1[1]);
	        
	        return  (maxX- minX) * (maxY-minY);
		}	
		
		
		
		//7. 등수매기 
		private static int[] solution8(int[][] score) {
		    int[] answer = new int[score.length];
	        ArrayList<Float> arrAvg = new ArrayList<>();
	        
	        
	        //등수 매기기
	        //0번 인수 1번 인수의 평균을 구하고 담은 배열을 정렬        
	        int avg = 0;
	        for(int i = 0 ; i< score.length; i++){            
	            arrAvg.add((float)((score[i][0] + score[i][1])/2.0));
	        }
	        
	   
	        //순위알고리즘        
	        for(int i=0 ; i<arrAvg.size(); i++){
	            answer[i] = 1;
	            for(int j=0 ; j<arrAvg.size(); j++){                
	                 if(arrAvg.get(i) < arrAvg.get(j)){
	                    answer[i] = answer[i] + 1;
	                 }   
	            }
	        }
      
	        
	        return answer;
		}	
		
		
		//8. 유한소수 판별하기 (유클리드호제)
		private static int solution9(int a, int b) {	
		        int answer = 1;
		        
		        //기약분수 만들기        
		        // int res=getGcd(a,b);
		        int mo = b/getGcd(a,b);
		        
		        
		        //모가 2 혹은 5가 존재할경우 유한소수
		        while(mo != 1){
		            if(mo % 2 == 0) mo /= 2;
		            else if (mo % 5 == 0) mo /=5;
		            else return 2;
		        }
		        
		        
		        return answer;
		}		    		  
		

		public static int getGcd(int a, int b){
		    if(b == 0) return a;
		    return getGcd(b, a%b);
		}
	
		
		//9. 저주의 숫자 3
		//for while 동시
		private static int solutio10(int n) {
	        int answer = 0;

	        for(int i=1; i<=n; i++){                
	            answer++;    
	            while(answer%3==0||String.valueOf(answer).contains("3")){
	                answer++;
	            }

	        }

	        return answer;
		}	
		
		
		
		//10. 문자열밀기
		//substring 활용 
		public static int solution11(String A, String B) {
	        int answer = 0;
	        
	        String tmpA = A;
	        for(int i = 0; i < A.length(); i++){
	            if(tmpA.equals(B)){
	                return answer;
	            }
	            String a = tmpA.substring(tmpA.length()-1);
	            tmpA = a + tmpA.substring(0, tmpA.length()-1);
	            answer++;
	        }
	        
	        return -1;
		}
		
		//11 다음에 올 숫자 (등비수열)   
	    public static int solution12(int[] common) {
	        int answer = 0;
	        
	        if((common[1] - common[0]) == (common[2]-common[1])){
	             answer = common[common.length-1] + (common[1] - common[0]);      
	        } else {
	            answer = common[common.length-1] * (common[1]/common[0]);
	        }
	        
	        return answer;
	    }
		
	    //12. 연속된 수의 합 
	    public static int[] solution13(int num, int total) {
	        int[] answer = {};
	        
	        //(x+1) + (x+2) + (x+3) = 12  
	        //결국 항식을 만들어 해결했다는 것..!  기본수학지식
	        int nSum = num * (1 + num) / 2;
	        int start = (total - nSum) / num;
	        
	        for(int i=1; i<num+1; i++){
	            answer[i - 1] = i + start;
	        }
	        
	        return answer;
	    }
	    
	    //13. 안전지대 
	    public static int solution14(int[][] board) {
	        int answer = 0;
	        // 먼저 판의 말을 만든다.
	        int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
	        int[] dy = {0, 1, 0, -1, -1, -1, 1, 1};
	        
	        int length = board.length;
	        
	        // 판을 만든다.
	        boolean[][] checkBoard = new boolean[length][length];
	        
	        for(int i =0; i < length; i++){
	            for(int j=0; j<length; j++){
	                boolean flag = true;
	                
	                for(int k=0; k<8; k++ ){
	                    int nx = i + dx[k];
	                    int ny = j + dy[k];
	                    if(board[i][j] == 1){
	                        checkBoard[i][j] = true;
	                    }
	                    if(nx >= 0 && nx < length && ny >= 0 && ny < length && board[nx][ny] == 1){
	                        checkBoard[i][j] = true;
	                    }
	                }
	            }
	        }
	        
	        for(int i = 0; i < checkBoard.length; i++){
	            for(int j = 0; j < checkBoard.length; j++){
	                if(!checkBoard[i][j]){
	                    answer++;
	                }
	            }
	        }
	        
	        return answer;
	    }
	    
	    //14. 겹치는 선분의 길이  
	    public static int solution15(int[][] lines) {
	        // 1. arr 배열 및 변수 초기화
	        int[] arr = new int[200];
	        int answer = 0;
	        
	        // 2. lines 정보를 arr 배열에 적용
	        for(int i = 0; i < lines.length; i++){
	            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++){
	             arr[j]++;   
	            }                
	                    
	        }

	        // 3. arr 배열에서 겹친 부분 세기
	        for(int i = 0; i < 200; i++){
	            if(arr[i] > 1){
	                answer++;
	            }
	        }                      
	        
	        return answer;
	        
	    }
	    
	    //15.옹알이(1)
	    public static String[] babblingArray = {"aya", "ye", "woo", "ma"};

	    public static int solution16(String[] babbling) {
	        int answer = 0;

	        for(String bab : babbling){
	            for(String str : babblingArray) {
	            	//한번만 제거  
	                bab = bab.replaceFirst(str, " ");
	            }
	            if(bab.replaceAll(" ","").equals("")) answer++;
	        }

	        return answer;
	    }
	    
	    //16. 평행 
	    public static int solution17(int[][] dots) { 
	        if(getInclination(dots[0],dots[1]) == getInclination(dots[3], dots[2]) 
	           || getInclination(dots[0],dots[3]) == getInclination(dots[1], dots[2]) 
	           || getInclination(dots[0],dots[2]) == getInclination(dots[1], dots[3])){
	            return 1;
	        }else{
	            return 0;              
	        }
	    }
	    //기울이 구하기  
	    public static double getInclination(int[] dot1, int[] dot2){
	        return (double)(dot1[1] - dot2[1]) / (dot1[0] - dot2[0]);
	    }
	    
		
}




