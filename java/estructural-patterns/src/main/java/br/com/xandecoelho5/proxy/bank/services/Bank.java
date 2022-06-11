package br.com.xandecoelho5.proxy.bank.services;

import br.com.xandecoelho5.proxy.bank.model.User;

import java.util.HashMap;
import java.util.Map;

public class Bank implements BankOperations {
    private final Map<Long, User> userDatabase;

    public Bank() {
        userDatabase = new HashMap<>();
        userDatabase.put(123L, new User("User #1", 123L, "1234", 1000L));
        userDatabase.put(456L, new User("User #2", 456L, "9999", 200L));
    }

    @Override
    public void deposit(Long account, Long amount) {
        User user = userDatabase.get(account);
        if (user == null) {
            System.out.println("Invalid account");
            return;
        }
        user.setBalance(user.getBalance() + amount);
        System.out.printf("%s +%d. New Balance: %d%n",
                user.getName(), amount, user.getBalance());
    }

    @Override
    public void withdraw(Long account, String passwd, Long amount) {
        User user = userDatabase.get(account);
        if (!isUserValid(user, passwd)) return;

        if (user.getBalance() < amount) {
            System.out.println("You don't have enough resources");
            return;
        }
        user.setBalance(user.getBalance() - amount);
        System.out.printf("%s -%d. New Balance: %d%n", user.getName(), amount, user.getBalance());
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        User user = userDatabase.get(account);
        if (!isUserValid(user, oldPassword)) return;

        user.setPassword(newPassword);
        System.out.printf("%s's password updated successfuly!%n", user.getName());
    }

    private boolean isUserValid(User user, String password) {
        if (user == null) {
            System.out.println("Invalid account");
            return false;
        }
        if (!user.getPassword().equals(password)) {
            System.out.println("Wrong password");
            return false;
        }
        return true;
    }
}
