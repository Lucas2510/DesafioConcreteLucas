package accenture.desafioconcrete.entity;

public class Subcategory4 {
    private String id;
    private String name;
    private Integer relevance;

    public Subcategory4() {
    }

    public Subcategory4(String id, String name, Integer relevance) {
        this.id = id;
        this.name = name;
        this.relevance = relevance;
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
}
