package shipping.api;

import shipping.DeliveryService;
import shipping.entities.Parcel;

// @RestController 
public class ShippingWeightController {

	// @Autowired
	DeliveryService delivery;

	// @GetMapping("/shippingweight")
	public Object shippingweight(/* @RequestParam */ Parcel parcel ) {

		return delivery.calculateOrderWeight(parcel);
	}
}
