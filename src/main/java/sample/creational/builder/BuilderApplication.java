package sample.creational.builder;

import sample.creational.builder.model.Address;
import sample.creational.builder.model.User;

import java.time.LocalDate;

public class BuilderApplication {
    public static void main(String[] args) {
        var user1 = new User.SimpleBuilder()
                .firstName("Vishal")
                .lastName("Moorthy")
                .age(32)
                .birthDate(LocalDate.now().minusYears(30))
                .address(new Address.Builder()
                        .street("Street")
                        .city("City")
                        .build())
                .build();


        var user2 = new User.InterfaceBuilder()
                .name("Vishal", "Moorthy")
                .setAge(30)
                .dob(LocalDate.now().minusYears(30))
                .address(new Address.Builder()
                        .street("Street")
                        .city("City")
                        .build())
                .build();
    }
}
