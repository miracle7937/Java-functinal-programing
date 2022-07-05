package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {


        greetCustomer( new Customer("Maria", "777777"));

        greetCustomerConsumer.accept( new Customer("Chukwude", "4657575  "));

    }

static Consumer<Customer>  greetCustomerConsumer = customer -> {
    System.out.println("hello " + customer.customerName +
            ", thanks for registering phone number "+ customer.customerPhoneNumber);
};
static  void  greetCustomer(Customer customer){
    System.out.println("hello " + customer.customerName +
            ", thanks for registering phone number "+ customer.customerPhoneNumber);
}
    record   Customer(String customerName, String customerPhoneNumber){

    }
}


