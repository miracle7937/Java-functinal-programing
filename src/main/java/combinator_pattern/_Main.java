package combinator_pattern;

import java.time.LocalDate;

public class _Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "Alice@gmail.com",
                "+07837889292", LocalDate.of(2000,2, 12)
        );

        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(  validatorService.isCustomerValid(customer));

    }
}
