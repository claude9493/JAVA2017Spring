package exercise1;

import java.util.stream.Stream;

public class te {
	public static void main(String[] a){
		  Stream.generate(Math::random).limit(5).forEach(System.out::println);
	}
}
