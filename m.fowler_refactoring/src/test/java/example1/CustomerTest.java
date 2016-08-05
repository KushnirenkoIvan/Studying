package example1;

import org.junit.Test;

public class CustomerTest {

    private Customer customer = new Customer("testCustomer");

    Movie regularMovie = new Movie("Wag the dog", 0);
    Movie newReleaseMovie = new Movie("Terminator", 1);
    Movie childrenMovie = new Movie("Chaggington", 2);

    Rental rental_regularMovie_0 = new Rental(regularMovie, 0);
    Rental rental_regularMovie_5 = new Rental(regularMovie, 5);
    Rental rental_regularMovie_10 = new Rental(regularMovie, -10);

    @Test
    public void statementNormalConditionsTest() {

    }

}