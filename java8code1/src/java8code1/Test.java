package java8code1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Test.occuraanceOfNumbers();
		
		Test.occuraanceOfWords();
		// frist 1
		String  input=" i miss you preeti always ";
		// convert into map
		Map< Character, Long> occurance=input.chars()
				//pass the lambda funcation
				.mapToObj(n->(char)n)
				//use funation  
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()
						));
		System.out.println(occurance);
		
				}
	
	
	public static void occuraanceOfWords()
	{
		List<String> fruits=Arrays.asList("mango","banana","mango","banana","ashok");
		Map<String, Long> updated_List=fruits.stream()
				.collect(Collectors.groupingBy(
						Function.identity(),
					Collectors.counting()
						));
		System.out.println(updated_List);
	}
	
	
//	occuraanceof number
	
	public static void occuraanceOfNumbers()
	{
		
		List<Integer> Number = Arrays.asList(1,33,24,5,6,6,6);
		
		Map<Integer, Long> update_number=Number.stream()
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(update_number);
	}
	
	

	
	
}
