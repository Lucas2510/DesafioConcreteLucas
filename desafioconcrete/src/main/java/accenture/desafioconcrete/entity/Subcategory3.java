package accenture.desafioconcrete.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subcategory3 {
    private String id;
    private String name;
    private Integer relevance;
    private String largeImageUrl ;
    private String mediumImageUrl;
    private String smallImageUrl;
    private List<Subcategory4> subcategories;

    public Subcategory3() {
    }

    public Subcategory3(String id, String name, Integer relevance, String largeImageUrl, String mediumImageUrl, String smallImageUrl, List<Subcategory4> subcategories) {
        this.id = id;
        this.name = name;
        this.relevance = relevance;
        this.largeImageUrl = largeImageUrl;
        this.mediumImageUrl = mediumImageUrl;
        this.smallImageUrl = smallImageUrl;
        this.subcategories = subcategories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public void setRelevance(Integer relevance) {
        this.relevance = relevance;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public List<Subcategory4> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Subcategory4> subcategories) {
        this.subcategories = subcategories;
    }
}
