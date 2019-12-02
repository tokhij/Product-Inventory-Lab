package models;

import java.util.ArrayList;
import java.util.List;

public class Hookah {
    //declare the variables
    private Integer id;
    private String brand;
    private String size;
    private Double price;
    List<Hookah> hookahList = new ArrayList<Hookah>();

//    Hookah h1 = new Hookah();
//    Hookah h2 = new Hookah();
//    Hookah h3 = new Hookah();

    public Hookah(Integer id, String brand, String size){
        this.id = id;
        this.brand = brand;
        this.size = size;
        this.price = 100.00;
    }

    public Hookah() {
    }

    // set the getters and setters for the variables to be accessible
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }







}
