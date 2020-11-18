package by.belhard.j24.MyFirstProject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private final String id;
    private final double cash;
    private final int quantity;

    public Item(String id,double cash,int quantity) {
        this.id = id;
        this.cash = cash;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Item{" +
                "id='"+ id +
                ", quantity=" + quantity +
                '}' + '\n';
    }

}
