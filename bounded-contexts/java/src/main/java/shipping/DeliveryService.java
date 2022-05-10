package shipping;

import shipping.entities.Parcel;
import shipping.entities.ParcelItem;
import shipping.entities.HasWeight;
import shipping.services.WeightByItemService;

public class DeliveryService {
    private final WeightByItemService catalogService;

    public DeliveryService(WeightByItemService catalogService) {
        this.catalogService = catalogService;
    }

    //TODO JImmy: sortir l'appel de catalog service en amont pour fail fast et sortir ça de la logique du domaine (catalogservice devrait être un adapter donc ext du domaine)
    public double calculateOrderWeight(Parcel cart) {
        return cart.items().stream()
                .map(ParcelItem::itemId)
                .map(catalogService::loadItem)
                .mapToDouble(HasWeight::weight)
                .sum();
    }
}
