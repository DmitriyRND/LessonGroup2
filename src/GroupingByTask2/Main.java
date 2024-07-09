package GroupingByTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();


        accounts.add(new Account("user1", 1000.0, true));
        accounts.add(new Account("user2", 500.0, false));
        accounts.add(new Account("user3", 1500.0, true));
        accounts.add(new Account("user4", -200.0, false));
        accounts.add(new Account("user5", -800.0, true));
        accounts.add(new Account("user6", 1200.0, false));
        accounts.add(new Account("user7", -300.0, true));
        accounts.add(new Account("user8", -400.0, false));
        accounts.add(new Account("user9", 900.0, true));
        accounts.add(new Account("user10", -100.0, false));

        Map<Boolean, List<Account>>  accountListMap = accounts.stream()
                    .collect(Collectors.groupingBy(account -> account.isPrem()));


        System.out.println(accountListMap);
        System.out.println("***************************************");

        Map<Double, List<Account>> doubleListMap = accounts.stream()
                .filter(Account::isPrem)
                .collect((Collectors.groupingBy(Account::getBalance)));

        System.out.println(doubleListMap);
        System.out.println("***************************************");

        accounts.removeIf(account -> account.getBalance() < 0 && !account.isPrem());
        accounts.forEach(System.out::println);
    }
}


