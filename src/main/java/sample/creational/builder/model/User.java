package sample.creational.builder.model;

import java.time.LocalDate;

public record User(
    String firstName,
    String lastName,
    Integer age,
    LocalDate birthDate,
    Address address
) {

    public static class SimpleBuilder {
        String firstName;
        String lastName;
        Integer age;
        LocalDate birthDate;
        Address address;

        public SimpleBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public SimpleBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public SimpleBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public SimpleBuilder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public SimpleBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(firstName, lastName, age, birthDate, address);
        }
    }

    public static class InterfaceBuilder implements Build, Name, Age, Dob, AddressB {

        String firstName;
        String lastName;
        Integer age;
        LocalDate birthDate;
        Address address;

        @Override
        public Age name(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }

        @Override
        public Dob setAge(int age) {
            this.age = age;
            return this;
        }

        @Override
        public AddressB dob(LocalDate dob) {
            this.birthDate = dob;
            return this;
        }

        @Override
        public Build address(Address address) {
            this.address = address;
            return this;
        }

        @Override
        public User build() {
            return new User(
                    firstName, lastName, age, birthDate, address
            );
        }

    }

    public interface Name {
        Age name(String firstName, String lastName);
    }

    public interface Age {
        Dob setAge(int age);
    }
    public interface Dob {
        AddressB dob(LocalDate dob);
    }
    public interface AddressB {
        Build address(Address address);
    }

    public interface Build {
        User build();
    }

}

