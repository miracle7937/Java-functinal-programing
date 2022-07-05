package optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional.ofNullable("").ifPresentOrElse(v->{
            System.out.println("it has value" + v);
        }, ()->{
            System.out.println("empty value");
        });
    }
}
