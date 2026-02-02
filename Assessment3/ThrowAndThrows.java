public class ThrowAndThrows {
    public static void main(String[] args) {
        //throw only having a capacity to show one exception

        boolean data =true;
        if(data==false){
            throw new RuntimeException();
        }
        else System.out.println("no errors");

        try{
            fun();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("You ran the code");
        }


    }
    static void fun() throws ArrayIndexOutOfBoundsException{
        int arr[]=new int[10];
        System.out.println(arr[11]);
    }
}
