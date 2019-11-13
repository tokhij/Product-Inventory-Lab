package models;

public class BubbleTea {
    //declare the variables
    private String flavor;
    private String size;
    private Integer qty;
    private Double price;

    public BubbleTea(String flavor, String size, Integer qty, Double price) {
        this.flavor = flavor;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public BubbleTea(){
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
