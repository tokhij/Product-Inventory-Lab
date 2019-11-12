package models;

public class Hookah {
    //declare the variables
    private String brand;
    private Integer size;
    private Integer qty;
    private Double price;


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

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Integer getQty() {
        return qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }







}
