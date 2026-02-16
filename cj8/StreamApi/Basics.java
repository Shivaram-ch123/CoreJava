package com.techouts.cj8.StreamApi;

public class Basics {
    public static void main(String[] args) {
        // to process the collections , Streams provide 2 different mechanisms
                                                        // 1. filter
                                                        // 2. map , etc...
        // these comes under java.util.Streams


        //step 1:
        //1. stream is only for processing , like a conveor belt or a machine
        //2. they never store data , they just do processing
        //3. Streams are lazy.They only work when we say them to work

        //step2:
        //1. CREATION : takes data from somewhere , wraps it with the Stream , then Stream is now ready to process   (here is the data)
        //2. INTERMEDIATE OPERATIONS : streams tell do this and this and this : ex map,filter,sorted ,etc....        (do these when i say go..)
        //3. Terminal operations : the actual work the stream starts do :                                            (Ok start executing now go...)



        //step3:
        // 1. source -> data
        // 2. intermediate -> They just prepare the data for the final step.



    }


}
