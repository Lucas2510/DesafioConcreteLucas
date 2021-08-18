package accenture.desafioconcrete.entity;


import java.util.List;

public class Categories {
    private String id;
    private String name;
    private Integer relevance;
    private List<Subcategory2> subcategories;

    public Categories() {
    }

    public Categories(String id, String name, Integer relevance, List<Subcategory2> subcategories) {
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

    public List<Subcategory2> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Subcategory2> subcategories) {
        this.subcategories = subcategories;
    }
}
