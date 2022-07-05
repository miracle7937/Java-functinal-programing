package callback;

import java.util.function.Consumer;

public class _Main {

    public static void main(String[] args) {

        // first with value
        hello("Chukwude", null, (v)->{
            System.out.println("The value was not provided " + v);
        });

        //without value
        hello2("Chukwude", null, ()->{
            System.out.println("The value was not provided ");
        });
    }

    static  void  hello(String firstName, String lastName, Consumer<String> callBack){

        System.out.println(firstName);

        if (lastName != null){
            System.out.println(lastName);
        }else {
            callBack.accept(firstName);
        }

    }

    static  void  hello2(String firstName, String lastName, Runnable callBack){

        System.out.println(firstName);

        if (lastName != null){
            System.out.println(lastName);
        }else {
            callBack.run();
        }

    }

}
