package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

public class Library {
    private final List<Lendable> items = new ArrayList<>();

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    // Corrigé : ne retourne que les items non empruntés
    public List<Lendable> getAvailableItems() {
        List<Lendable> availableItems = new ArrayList<>();
        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

    // Plus d'affichage ni de instanceof : on retourne les descriptions
    public List<String> listAllItems() {
        List<String> descriptions = new ArrayList<>();
        for (Lendable item : items) {
            descriptions.add(item.getDescription());
        }
        return descriptions;
    }
}
