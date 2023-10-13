package Product;

import Product.ItemReward;

public class IronReward extends ItemReward {
    @Override
    public void open() {
        System.out.println("Iron");
    }
}
