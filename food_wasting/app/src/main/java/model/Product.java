package model;

public class Product {
    int id;
    String img, title, composition;
    float price;

    public Product(int id, String img, String title, String composition, float price){
        this.id = id;
        this.title = title;
        this.img = img;
        this.composition = composition;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getComposition() {
        return composition;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
