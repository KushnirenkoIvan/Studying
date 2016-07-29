package example1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();

        String result = "Учет аренды для: " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //определить сумму для каждой строки
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2) {
                        thisAmount += (each.getDaysRented() - 2) * 15;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDREN:
                    thisAmount += 15;
                    if (each.getDaysRented() > 3) {
                        thisAmount += (each.getDaysRented() - 3) * 15;
                    }
                    break;
            }
            // добавить очки для активного арендатора
            frequentRenterPoints++;
            // бонус за аренду новинки на два дня
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            //показать результаты для этой аренды
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //добавить нижний колонтитул
        result += "Сумма задолженности составляет " + String.valueOf(totalAmount) + "\n";

        result += "Вы заработали " + String.valueOf(frequentRenterPoints) + " очков за активность";
        return result;
    }

    public static void main(String[] args) {
        Movie regularMovie = new Movie("Wag the dog", 0);
        Movie newReleaseMovie = new Movie("Terminator", 1);
        Movie childrenMovie = new Movie("Chaggington", 2);

        Rental rental = new Rental(regularMovie, 2);
        Rental rental_1 = new Rental(newReleaseMovie, 1);
        Rental rental_2 = new Rental(newReleaseMovie, 4);

        Customer customer = new Customer("John Doe");
        customer.addRental(rental);
        customer.addRental(rental_1);
        customer.addRental(rental_2);
        System.out.println(customer.statement());
    }
}