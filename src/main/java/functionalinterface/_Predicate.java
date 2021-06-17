package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid.test("99455123456"));
        System.out.println(isPhoneNumberValid.and(containsNumber3).test("99455123456"));
        System.out.println(isPhoneNumberValid.or(containsNumber3).test("994551234567"));
        System.out.println(equality.test(3,3));
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber -> phoneNumber.startsWith("994") && phoneNumber.length() == 11;
    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
    static BiPredicate<Integer, Integer> equality = Integer::equals;
}
