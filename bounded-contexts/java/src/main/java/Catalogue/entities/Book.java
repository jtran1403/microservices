package Catalogue.entities;

public class Book implements Item {
    @Override
    public ItemId itemId() {
        return null;
    }

    @Override
    public double weight() {
        return 0;
    }
}
