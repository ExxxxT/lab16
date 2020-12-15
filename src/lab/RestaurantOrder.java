package lab;


public class RestaurantOrder implements Order {
    private int size;
    private Item[] items;

    public RestaurantOrder(int size) {
        this.size = size;
        items = new Item[this.size];
    }

    @Override
    public boolean add(Item item) {
        if (item == null)
            return false;

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(String itemName) {
        if (itemName == null)
            return false;

        for (int i = 0; i < itemQuantity(); i++) {
            if (items[i].equals(itemName)) {
                items[i] = null;
                return true;
            }
        }

        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int counter = 0;

        for (int i = 0; i < itemQuantity(); i++) {
            if (items[i].equals(itemName)) {
                items[i] = null;
                counter++;
            }
        }

        return counter;
    }

    @Override
    public int itemQuantity() {
        int counter = 0;
        for (Item x : items) {
            if (x == null)
                break;
            counter++;
        }
        return counter;
    }

    @Override
    public int itemQuantity(String itemName) {
        int counter = 0;
        for (Item x : items) {
            if (x == null)
                break;
            if (x.getName().equals(itemName))
                counter++;
        }
        return counter;
    }

    @Override
    public Item[] getItems() {
        return items;
    }

    @Override
    public double costTotal() {
        double total = 0;
        for (Item x : items) {
            if (x == null)
                break;
            ;
            total += x.getCost();
        }

        return total;
    }

    @Override
    public String[] itemNames() {
        String[] names = new String[itemQuantity()];
        for (int i = 0; i < itemQuantity(); i++) {
            names[i] = items[i].getName();
        }
        return names;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        return null;
    }

    public static void main(String[] args) {
        RestaurantOrder order = new RestaurantOrder(5);
        Drink a1 = new Drink("Beer", 250.0, "Beer");
        Drink a2 = new Drink("Water", 100.0, "Voss");
        Drink a3 = new Drink("Wine", 870.0, "Red Wine");
        Drink a4 = new Drink("Sprite", 150.0, "Default");


        System.out.println(order.add(a1));
        System.out.println(order.add(a2));
        System.out.println(order.add(a3));
        System.out.println(order.add(a4));

        System.out.println(order.costTotal());

    }
}