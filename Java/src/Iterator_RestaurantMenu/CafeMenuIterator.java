package Iterator_RestaurantMenu;

import java.util.Iterator;
import java.util.Map;

public class CafeMenuIterator implements MenuIterator {
    private Map<String, MenuItem> menuItems;
    private Iterator<MenuItem> iterator;

    public CafeMenuIterator(Map<String, MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.iterator = menuItems.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }
}
