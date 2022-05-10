package shipping.entities;


public class ParcelItem {
    public final ItemId itemId;
    public final Quantity quantity;
    //public final double weight();

    public ParcelItem(ItemId itemId, Quantity quantity) {
        this.itemId = itemId;
        this.quantity = quantity;

    }

    public ItemId itemId() {
        return itemId;
    }
}
