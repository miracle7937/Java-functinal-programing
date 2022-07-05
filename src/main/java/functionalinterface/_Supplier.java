package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {


        System.out.println(getAddress());
        System.out.println(getAddressSupplier.get());
    }




   static Supplier<String> getAddressSupplier = ()->"JBC:localhost:3000/DB";
  static String getAddress(){
       return  "JBC:localhost:3000/DB";
    }
}
