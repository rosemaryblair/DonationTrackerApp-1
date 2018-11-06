package rosieblair.donationtracker.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Location {

    private int id;
    private int key;
    private String name;
    private String latitude;
    private String longitude;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String locType;
    private String phoneNumber;
    private String website;
    private List<Item> inventory;
    private List<User> employeeList;

    public static final List<String> locTypes = Arrays.asList("DROPOFF", "STORE", "WAREHOUSE");

    public Location(int key, String name, String latitude, String longitude,
                    String streetAddress, String city, String state, String zipCode,
                    String locType, String phoneNumber, String website) {

        this.key = key;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.locType = locTypes.contains(locType) ? locType : locTypes.get(0);
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.inventory = new ArrayList<>();
        this.employeeList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLocType() {
        return locType;
    }
    public void setLocType(String locType) {
        this.locType = locType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Item> getInventory() {
        return inventory;
    }
    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public List<User> getEmployeeList() {
        return employeeList;
    }
    public void setEmployeeList(List<User> employeeList) {
        this.employeeList = employeeList;
    }

    public static List<String> getLocTypes() {
        return locTypes;
    }

}