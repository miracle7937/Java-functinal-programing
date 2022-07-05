package combinator_pattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService

{


    private boolean emailValidation(String email)  {

        return  email.contains("@");

    }
    private boolean phoneNumberValidation(String phoneNumber)  {
        return  phoneNumber.startsWith("+0");

    }
    private boolean isAdult(LocalDate  localDate)  {

        return Period.between(localDate, LocalDate.now()).getYears() > 18;

    }

    public boolean isCustomerValid(Customer customer){
        return  emailValidation(customer.getEmail()) &&
                phoneNumberValidation(customer.getPhoneNumber())
                && isAdult(customer.getDob());
    }

}
