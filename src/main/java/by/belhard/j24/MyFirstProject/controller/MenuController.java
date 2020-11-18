package by.belhard.j24.MyFirstProject.controller;

import by.belhard.j24.MyFirstProject.dto.ATMGumDto;
import by.belhard.j24.MyFirstProject.service.ATMGumService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class MenuController {

    private final ATMGumService ATMGumService = new ATMGumService();

    public void start() {

        String in = "";

        while (!"e".equals(in)) {

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Выберите жевачку(1,2,3):");
                in = reader.readLine();
                ATMGumDto atmGumDto = ATMGumService.getById(in);
                if (atmGumDto != null) {
                    System.out.println("Введите название жевачки:");
                    in = reader.readLine();
                } else {
                    System.err.println("Нет такой жевачки");
                }
            } catch (IOException | SQLException | by.belhard.j24.MyFirstProject.repository.ItemNotFoundException e) {
                e.printStackTrace();
            }

        }

    }

}