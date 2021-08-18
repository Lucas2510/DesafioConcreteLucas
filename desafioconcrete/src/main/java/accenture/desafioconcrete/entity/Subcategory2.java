package accenture.desafioconcrete.entity;

import java.util.List;

public class Subcategory2 {
    private String id;
    private String name;
    private Integer relevance;
    private List<Subcategory3> subcategories;

    public Subcategory2() {
    }

    public Subcategory2(String id, String name, Integer relevance, List<Subcategory3> subcategories) {
        this.id = id;
        this.name = name;
        this.relevance = relevance;
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

    public List<Subcategory3> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Subcategory3> subcategories) {
        this.subcategories = subcategories;
    }
}
