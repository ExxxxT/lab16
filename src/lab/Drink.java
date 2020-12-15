package lab;


public final class Drink implements Item{
    private final String NAME;
    private final Double COST;
    private final String DESCRIPTION;

    public Drink(String name, Double price, String description) {
        this.NAME = name;
        this.COST = price;
        this.DESCRIPTION = description;
    }

    public Drink(String name, String description) {
        this.NAME = name;
        this.DESCRIPTION = description;
        this.COST = 0.0;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Double getCost() {
        return COST;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    public static void main(String[] args) {
        String name = "abcd";
        String des = "EFG";
        double a = 5;
        Drink drink = new Drink(name, a, des);
        des = "three";
        System.out.println(name == drink.getName());
        System.out.println(des == drink.getDescription());
        System.out.println(a == drink.getCost());

    }
}