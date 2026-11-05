package library.service;

import java.util.HashSet;
import java.util.Set;
import library.model.Lendable;

public class Customer {
    private final String name;
    private final Set<Lendable> checkedOutItems = new HashSet<>();

    public Customer(String name) {
        this.name = name;
    }

    public void checkOutItem(Lendable item) {
        if (checkedOutItems.add(item)) {
            item.borrow();
        }
    }

    public void returnItem(Lendable item) {
        if (checkedOutItems.remove(item)) {
            item.returnItem();
        }
    }
}
