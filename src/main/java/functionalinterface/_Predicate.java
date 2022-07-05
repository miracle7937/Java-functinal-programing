package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("0847484484944"));
        System.out.println(isPhoneNumberValidPredicate.test("0847484484944"));
    }

   static  Predicate<String> isPhoneNumberValidPredicate = (phoneNumber)->
        phoneNumber.startsWith("0") && phoneNumber.length() >= 11
    ;

    static  boolean isPhoneNumberValid(String phoneNumber){
        return  phoneNumber.startsWith("0") && phoneNumber.length() >= 11;
    }
}
