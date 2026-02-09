package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class NoStreamElementException extends Exception{
    NoStreamElementException(String message){
        super(message);
    }
}
public class OptionalExample {
    public static void main(String[] args)  {
        //if we want the count of the variables then
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);



        // so here if the stream having 0 elemnets then
        // the count will have null value so we use Optional and check if present
        Optional<Integer> optional =list.stream()
                                            .findFirst();
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
        else {
            System.out.println("The stream is empty");

            try{
                throw new NoStreamElementException("You dont have anything in your stream ");
            }catch (NoStreamElementException e){
                System.out.println(e);
            }
        }



    }
}
