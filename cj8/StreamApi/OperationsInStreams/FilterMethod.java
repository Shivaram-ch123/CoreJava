package com.techouts.cj8.StreamApi.OperationsInStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilterMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(20);
        arr.add(30);

        //filter
        Stream<Integer> stream1=arr.stream();
        stream1.filter(element -> (element%2==0))
                        .forEach(System.out::println);
        //map
        Stream<Integer> stream2=arr.stream();
        stream2.map(element -> (element%2==0))
                .forEach(System.out::println);
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        list.get(0).add(10);
        list.get(0).add(20);
        list.get(0).add(30);
        list.get(0).add(40);

        list.get(1).add(100);
        list.get(1).add(200);
        list.get(1).add(300);
        list.get(1).add(400);

        System.out.println(list.size());
        //flatmap
        Stream<ArrayList<Integer>> stream3=list.stream();
        stream3.flatMap(l1 -> l1.stream())
                .forEach(System.out::println);
        //Methods :
        //filter(): Filters elements based on a specified condition.
        //map(): Transforms each element in a stream to another value.
        //Sorted(): Sorts the elements of a stream.
        //Distinct(): Remove duplicates.
        //Skip(): Skip first n elements.

        //_______________________________________________________________________________________

                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

                // forEach
                numbers.stream().forEach(n -> System.out.print(n + " "));

                // collect
                Map<String,Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toMap(ele->ele+"",ele->0));
                System.out.println(evens);

                // reduce
                int sum = numbers.stream().reduce(0, (a,b) -> a + b);
                System.out.println(sum);

                // count
                long count = numbers.stream().filter(n -> n % 2 == 0).count();
                System.out.println(count);

                // anyMatch / allMatch / noneMatch
                System.out.println(numbers.stream().anyMatch(n -> n % 2 == 0));
                System.out.println(numbers.stream().allMatch(n -> n > 0));
                System.out.println(numbers.stream().noneMatch(n -> n < 0));

                // findFirst / findAny
                System.out.println(numbers.stream().filter(n -> n % 2 == 0).findFirst().get());
                System.out.println(numbers.stream().filter(n -> n % 2 == 0).findAny().get());


    }
}
