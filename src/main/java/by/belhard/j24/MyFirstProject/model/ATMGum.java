package by.belhard.j24.MyFirstProject.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ATMGum {

    private final String name;
    private static int cash = 0;

    public ATMGum(int id, String name, int cash) {
        this.name = name;
        ATMGum.cash = cash;

    }

    public static int getId() {
        return getId();
    }


    public String getName() {
        return name;
    }

    public static int getCash() {
        return cash;
    }
}