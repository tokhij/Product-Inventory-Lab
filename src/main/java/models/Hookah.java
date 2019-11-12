package models;

public class Hookah {
    //declare the variables
    private String brand;
    private Integer size;
    private int qty;
    private float price;


    // set the getters and setters for the variables to be accessible
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSize() {
        return size;
    }

    public int getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(float price) {
        this.price = price;
    }







}
