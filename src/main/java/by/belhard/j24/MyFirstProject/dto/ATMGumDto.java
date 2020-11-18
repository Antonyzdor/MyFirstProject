package by.belhard.j24.MyFirstProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ATMGumDto {

    private int id;
    private String name;
    private double cash;


    public static ATMGumDtoBuilder builder() {
        return new ATMGumDtoBuilder();
    }

    public Object getName() {
        return null;
    }

    public int getId() {
        return 0;
    }

    public boolean getCash() {
        return false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public final static class ATMGumDtoBuilder {

        private final ATMGumDto ATMGumDto = new ATMGumDto();

        public ATMGumDtoBuilder id(int id) {
            ATMGumDto.id = id;
            return this;
        }

        public ATMGumDtoBuilder name(String name) {
            ATMGumDto.name = name;
            return this;
        }

        public ATMGumDtoBuilder cash(int cash) {
           ATMGumDto.cash = cash;
            return this;
        }

        public ATMGumDto build() {
            return ATMGumDto;
        }
    }
}

