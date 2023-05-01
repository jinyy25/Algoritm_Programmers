import java.util.*;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.Arrays;
public class memo {
	class Solution {
	    public int solution(int n) {
//	    	1. index
//	        int answer = 0;
//	        String a = "langers";
//	        a.indexOf(0);
//	        a.length()
//	        int[] num = {1,2,3,4};
//			num[1]= 1;

//	    	 2. copyOfRange	    	
//	        int index =3;
//	        String[] nArr = Arrays.copyOfRange(num, 0, index+1);
	    	
//	    	3. Math.max
//	        Integer.Min
//	        Math.max(1,2);

	    	// 4.toString
//	        String b =num.toString();

	    	// 5.strim()
//	        List<String> numList = Arrays.asList("1","3","4","5");
//	        numList.stream().max();
//	        Collections.max(numList);
//	        Collections.sort(numList);
//	        numList.indexOf(0);
	    	
	    	// 6.stream().boexed().collect()
//	        List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
//	       Collections.sort(list);
//	        List<Integer> coll = new ArrayList<>

	    	
	    	// 7. IntStream.range().filter.mapToObj.toArrayt(String[]::new);
//	       String[] nArr = Arrays.copyOfRange
//	       String[] newArray = IntStream.range(0, strArray.length)
//           .filter(idx -> idx != 2)
//           .mapToObj(idx -> strArray[idx])
//           .toArray(String[]::new);

		    // 8. 배열 요소제거방법
		      // 리스트이용
//		      int[] str = {10,20,30,40};
//		      List<Integer> num = Arrays.asList(str);
//		      List<Integer> num = new ArrayList<>(Array.asList(str));
//		      num.remove(2);
//		      str = num.toArray(new String[0]);
//		      	      
//		      // Stream 이용
//		      int[] str2 = {10,20,30,40};
//		      int[] num2 = IntStream.range(0, str2.length)
//		    		  .filter(idx -> idx !=2)
//		    		  .mapToObj(idx -> str2[idx])
//		    		  .toArray(String[]::new);
	        
	    	//*  list.add(0,'ran');  list의 제일 앞에 내용이 추가되며 데이터가 뒤로 밀린다!

	    	
	    		    	
	        // * 최빈값 테스트
//	        int temp[] = new int[array.length+1];
//	        int max = array[0];
//	        int cnt =0;     
//	        
//	        for(int i=0; i<array.length;i++){
//	            temp[array[i]]++;              
//	        }   
//	        
//	        for(int i=0; i<array.length; i++){           
//	            if(temp[i]>max){
//	                max = array[i];
//	                answer=i;          
//	                cnt++;               
//	            } 
//	            else if(1==array.length){
//	                answer=array[0];
//	            }
//	        }
//	        if(cnt>=2){
//	             answer=-1;   
//	        }
//	        for ( i= 1; i< arr.size(); i++)
//	            if (arr.get(i) == arr.get(i-1))
//	                  index[i] = index[i-1]+1;
//	    
	
//	 		int num,a =0;
//	    	Arrays.sort(arr, Collections.reverseOrder());
	    	
//	        ArrayList<Integer> result = new ArrayList<>();
//	        result.add(numbers.get(0));
//	        int count=1, maxCount=1;
//
//	        for(int i=1; i<numbers.size(); i++) {
//	            if(numbers.get(i-1)!= numbers.get(i)) {
//	                if(count>maxCount) {
//	                    maxCount=count;
//	                    result.clear();
//	                    result.add(numbers.get(i-1));
//	                }else if(count==maxCount) {
//	                    result.add(numbers.get(i-1));
//	                }
//
//	                count = 1;
//	            }else {
//	                count++;
//	            }
//	        }
	        
//	        int max = 0;
//
//	        for(int i=0; i<index.length; i++){
//	            if(index[i]>max){
//	                max= index[i];
//	                mode = i;
//	            } 
//	        }
//	    System.out.println("최빈값 : "+ mode +" , "+max+"번"); //3, 2번
//	       
//	      
	        
	    	
//	    * Array test
		List<Integer> num23 = new ArrayList<>();
//		num23.add(1);
//		num23.get
//		num23.las();
//		sports.set(sports.size()-2,"오늘 비오나?");
//		Arrays.sort(num23,Comparator.reverseOrder());
//		Collections.sort(num23);
//		Arrays.sort(num23, Comparator.reverseOrder()); // 내림차순
		
//		num23.sort(null);
//		num23.get(1);
//		num23.si
//		for(int i=0; i<num23.size();i++) {
//			
//		}
	       

	       

// * 배열회전
//List<Integer> tmp = new ArrayList<>();
//
//System.out.println("direction:"+direction);
//
//if(direction.equals("left")){                        
//    for(int i=0; i<numbers.length; i++){
//        tmp.add(numbers[i]);            
//    }
//    System.out.println("g:"+tmp);            
//    for(int j=1; j<=tmp.size();j++){
//        if(j<tmp.size()){
//          tmp.set(j-1,tmp.get(j));
//        }
//    }    
//    tmp.set(tmp.size()-1, numbers[0]);
//    
//} else if (direction.equals("right")){
//     tmp.add(null); 
//     for(int i=0; i<numbers.length; i++){
//        tmp.add(numbers[i]);                
//     }
//    System.out.println("g:"+tmp);
//    tmp.set(0, numbers[numbers.length-1]);
//    tmp.remove(numbers[numbers.length-1]);            
//}


//ArrayList<Integer> answer = new ArrayList<Integer>();
//
//for(int i=0; i<numbers.length; i++){
//    answer.add(numbers[i]);
//}
//
//int targetValue = 0;
//
//if(direction.equals("right")){
//    answer.add(0, numbers[numbers.length-1]);
//    answer.remove(answer.size()-1);
//
//}else{
//    answer.add(numbers[0]);
//    answer.remove(0);
//}
//
//return answer;
	       return 0;
	    }
	}
}
