package com.ecommerce.spring.demoecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@DynamicUpdate
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Product name is required")
    @Basic(optional = false)
    private String name;

    private Double price;

    private String pictureUrl;

    private String description;

    @ColumnDefault("0")
    private Integer categoryType;

    public Product(Long id, @NotNull(message = "Product name is required") String name, Double price, String description, String pictureUrl, Integer categoryType){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description= description;
        this.pictureUrl = pictureUrl;
        this.categoryType= categoryType;
    }

    public Product(){}

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String getPictureUrl(){
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl){
        this.pictureUrl = pictureUrl;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
