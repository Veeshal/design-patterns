package sample.creational.builder.model;

public record Address(String street, String city) {
    public static class Builder {
        String street;
        String city;

        public Builder street(String street) {
            this.street = street;
            return this;
        }
        public Builder city(String city) {
            this.city = city;
            return this;
        }
        public Address build() {
            return new Address(street, city);
        }

    }
}
