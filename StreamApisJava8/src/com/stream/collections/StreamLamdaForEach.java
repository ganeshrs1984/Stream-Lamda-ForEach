package com.stream.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Stream API,Lamda and Foreach

public class StreamLamdaForEach {
	

	public static void main(String []args){
		
		List<Person>  person = new ArrayList<Person>();
		person.add(new Person("Iam18",18));
		person.add(new Person("Iam20",20)) ;
		person.add(new Person("Iam25",25)) ;
		person.add(new Person("Iam16",16));
		person.add(new Person("1am29",29));
		List<Person> above20 = person.stream()
		       .filter(e -> e.getAge() > 20)
		       .collect(Collectors.toList());
		       
		
		above20.forEach(it -> System.out.println("Name "+ it.getName() +  "Age "+ it.getAge()));
	
	

	
}

}