package Composite_RestaurantMenu;

import java.util.Calendar;
import java.util.Iterator;

public class DinerAlternativeMenuIterator implements MenuIterator {
    private MenuItem[] items;
    private int position;

    public DinerAlternativeMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        this.position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 2;
        return menuItem;
    }
}
