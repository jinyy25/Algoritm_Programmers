import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;
import  java.util.stream.IntStream;
public class streamPractice {
	public static void main(String[] args) {
		//1. Stream 배경 
		//Java 8 부터 지원 , 컬렉션에 저장되어 있는 요소들을 하나씩 순회하며 처리하는 코드 패턴  
		//람다식과 함께 사용가능하다
		//내부반복자를 통해 병렬처리가 쉽다
		//iterator 대체에 용이하다.  
		
		//2.사용법  		
		solution(5);
	} 

	private static int solution(int a) {
		//create stream  (stream object)
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> stream = list.stream();
		
		//stream 각요소를 반복하여 보여줌  
		stream.forEach(System.out::println);
		
		//array
		String[] array = new String[] {"a","b","c"};
		Stream<String> stream1 = Arrays.stream(array,1,3); //종료 인덱스는 포함되지 않음 (1은 포함되나 3은 제외) 
		
		//builder
		Stream<String> streamBuiulder = Stream.<String>builder()
                .add("Apple")
                .add("Banana")
                .add("Melon")
                .build();
		
		
		//Generator
		//.limit() 몇번 반복할지 정해줌 : 5번 반복실행 
		//무한대로 늘어나는 Stream에 제한을 주어야함  
		Stream<String> steamGenerator = Stream.generate(() -> "Hello").limit(5);
		
		
		//Iterator
		//인자를 넘겨 100 부터 10씩 증가  
		Stream<Integer> streamIterator = Stream.iterate(100, n -> n + 10).limit(5);
		
		
		//Empty		
		//참조 변수가 null일 경우 NullPoint 발생  
		Stream<String> streamEmpty = Stream.empty();
		
		//auto boxing , unboxing 해결
		IntStream intStream = IntStream.range(1, 10); //1~9
		LongStream longStream = LongStream.range(1, 10000); //1~9999	
		
		//제네릭을 이용한 클래스로 사용시 박싱처리  
		//Autoboxing :컴파러가 원시 타입(Primitive types)과 해당 객체 래퍼 클래스 간에 
		//수행하는 자동 변환을 말한다. 
		//예를 들어 int를 Integer로, double을 Double로 변환하는 식이다.
		Stream<Integer> streamBoxed = IntStream.range(1, 10).boxed();
		
		
		//Random() 
		DoubleStream streamDouble = new Random().doubles(3); // double 형 랜덤 숫자 3개 생성
		
		//문자열변환  
		IntStream streaChars = "Hello,World".chars(); //(72, 101, 108, 108, 111, 44, 87, 111, 114, 108, 100)
		
		//pattern 적용 
		//regex 정규표현
		Stream<String> streamPattern =  Pattern.compile(", ").splitAsStream("Apple,Banana,Melon");
		

		//Stream 합치기  
		Stream<String> streamF = Stream.of("Apple", "Banana", "Melon");
		Stream<String> streamS = Stream.of("Kim", "Lee", "Park");

		Stream<String> streamT = Stream.concat(streamF, streamS);
		// "Apple", "Banana", "Melon", "Kim", "Lee", "Park"
		streamT.forEach(System.out::println);
		
		
		
		//filter, 요소들을 조건을 거쳐 결과값을 도출시킴  
		Stream<Integer> streamFilter = IntStream.range(1, 10).boxed();
		streamFilter.filter(v -> ((v % 2) == 0)).forEach(System.out::println);
		
		int[] tmp = {0,1,2,3,4,5,6,7,8,9};
		
//		Lis<I>> numList = Arrays.asList("1","3","4","5");
//		int[]
//		numList.stream().filter(v -> ((v)))
		Arrays.asList(tmp);
//	     List<Integer> arr = Arrays.asList(tmp[]);
	        
//		IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
		String s ="asdasd";
		
//		IntStream.range(0,s.length()).filter(i->);
		// IntStream 선언
		// 범위 설정
		// 필터 걸기
		// 배열로 전환
		// 비교 안되는 값들 가져오기
		// 더하기 선언  
		IntStream.range(0, 10).filter(i -> Arrays.stream(tmp).noneMatch(num->i== num)).sum();
		
		  
		//Mapping, 하나의 특정값으로 변환시
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
		Stream<String> streamMapping = names.stream().map(String::toUpperCase);
		
		//Product 개체 수량
//		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
//				                new Product(14, "orange"),
//				                new Product(13, "lemon"),
//				                new Product(23, "bread"),
//				                new Product(13, "sugar"));
//		Stream<Integer> streamProduct = productList.stream().map(Product::getAmount);
		
		
		//작업한 결과를 하나의 String으로 이어붙힘
//		String listToString = productList.stream().map(Product::getName).collect(Collectors.joining());
		
		
		//flatMap, 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어줌  
		List<List<String>> list1 = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
		List<String> flatList = 
				  list1.stream()
				  .flatMap(Collection::stream)
				  .collect(Collectors.toList());// [a, b]
		
		
		//정렬
		IntStream.of(14, 11, 20, 39, 23)
		  .sorted()
		  .boxed()
		  .collect(Collectors.toList());
		
		//역순정렬 
		List<String> lang = 
				  Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

				lang.stream()
				  .sorted(Comparator.reverseOrder())
				  .collect(Collectors.toList());
		
		//Calculation 				
		long count = IntStream.of(1, 3, 5, 7, 9).count();
		long sum = LongStream.of(1, 3, 5, 7, 9).sum();
		OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
		OptionalInt max = IntStream.of(1, 3, 5, 7, 9).max();


		//Matching boolean 값으로 도출  
		List<String> names1 = Arrays.asList("Eric", "Elena", "Java");
		
		boolean anyMatch = names.stream()
		  .anyMatch(name1 -> name1.contains("a"));
		boolean allMatch = names.stream()
		  .allMatch(name1 -> name1.length() > 3);
		boolean noneMatch = names.stream()
		  .noneMatch(name1 -> name1.endsWith("s"));
		
		
		
		//https://futurecreator.github.io/2018/08/26/java-8-streams/
		
	
		
		return 0;
	}
}
