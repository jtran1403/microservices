package shipping.services;


import shipping.entities.Item;
import shipping.entities.ItemId;

public interface WeightByItemService {
    Item loadItem(ItemId itemId);
}
