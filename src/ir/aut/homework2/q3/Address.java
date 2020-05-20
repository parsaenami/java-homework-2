package ir.aut.homework2.hw3;

public class Address {
    private String block;
    private String street;
    private String apartmentNo;
    private String city;
    private String zipCode;

    public Address(String block, String street, String city, String zipCode) {
        this(block, street, Integer.toString(0), city, zipCode);
        this.block = block;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address(String block, String street, String apartmentNo, String city, String zipCode) {
        this.block = block;
        this.street = street;
        this.apartmentNo = apartmentNo;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(String apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String toString() {
        return this.block + " - " + this.street + " - " + this.apartmentNo + " - " + this.city + " - " + this.zipCode;
    }

    public boolean isEqual(Address address) {
        return block.equals(address.block) && street.equals(address.street) && apartmentNo.equals(address.apartmentNo) && city.equals(address.city) && zipCode.equals(address.zipCode);
    }
}
