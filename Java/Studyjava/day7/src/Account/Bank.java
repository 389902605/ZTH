package Account;

import java.util.Currency;

public class Bank {
    public static void main(String[] args) {
        Account  one = new Account();
        Customer two = new Customer();
        two.address = "123";
        two.name="123";
        two.haoMa=123123;
        two.number=7654321;

        one.Customer = two.name;
        one.cid = 123;
        one.balance=1768.9;

        one.getInof();
        two.say();
    }
}
