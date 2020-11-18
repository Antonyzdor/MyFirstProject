package by.belhard.j24.MyFirstProject.service;

import by.belhard.j24.MyFirstProject.dto.ATMGumDto;
import by.belhard.j24.MyFirstProject.model.ATMGum;

import java.sql.SQLException;

public class ATMGumService {


    public ATMGumDto getById(String input) throws SQLException, by.belhard.j24.MyFirstProject.repository.ItemNotFoundException {

        ATMGum ATMGum = by.belhard.j24.MyFirstProject.repository.ATMGumRepository.getById(Integer.parseInt(input));

        return ATMGumDto.builder()
                .id(by.belhard.j24.MyFirstProject.model.ATMGum.getId())
                .name(ATMGum.getName())
                .cash(by.belhard.j24.MyFirstProject.model.ATMGum.getCash())
                .build();
    }


}
