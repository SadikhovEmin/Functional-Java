package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionURLSupplier.get());
    }

    public static String getDBConnectionURL() {
        return "jdbc://localhost";
    }

    // lambda without parameters
    static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost";
}
