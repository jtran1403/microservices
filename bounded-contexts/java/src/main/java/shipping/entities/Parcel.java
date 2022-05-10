package shipping.entities;

import java.util.List;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class Parcel {
    private final List<ParcelItem> items;

    public Parcel(List<ParcelItem> items) {
        this.items = items;
    }

    public List<ParcelItem> items() {
        return items;
    }
}
