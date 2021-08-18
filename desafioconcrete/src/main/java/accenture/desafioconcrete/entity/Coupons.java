package accenture.desafioconcrete.entity;

import java.time.LocalDate;

public class Coupons {

private String id;
private String description;
private String seller;
private String image;
private LocalDate expiresAt;

    public Coupons() {
    }

    public Coupons(String id, String description, String seller, String image, LocalDate expiresAt) {
        this.id = id;
        this.description = description;
        this.seller = seller;
        this.image = image;
        this.expiresAt = expiresAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDate expiresAt) {
        this.expiresAt = expiresAt;
    }
}
