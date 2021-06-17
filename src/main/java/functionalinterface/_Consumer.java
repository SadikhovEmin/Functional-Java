package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Emin", "12345");
        greetCustomer(customer);
        greetCustomerConsumer.accept(customer);
        boolPhoneNumber.accept(customer, true);
        boolPhoneNumber.accept(customer, false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

    // Lambda
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName);

    static BiConsumer<Customer, Boolean> boolPhoneNumber = (customer, showPhoneNumber) ->
            System.out.println(customer.customerName + " " + (showPhoneNumber ? customer.customerPhoneNumber : ""));
}
