package org.techouts;

public class CountPrimes {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++){

            //we neeed to check if this number is prime or not
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)count++;
                if(count>2)break;
            }

            if(count!=2){
                continue;
            }
            System.out.println(i);
        }
    }
}
