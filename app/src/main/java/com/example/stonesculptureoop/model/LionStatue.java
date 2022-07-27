package com.example.stonesculptureoop.model;

import java.io.Serializable;

public class LionStatue extends StoneSculpture implements Serializable {
    private String id;
    private Integer price;

    public LionStatue(String id, Integer price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String getStoneSculptureWeight() {
        return super.getStoneSculptureWeight();
    }

    @Override
    public void setStoneSculptureWeight(String stoneSculptureWeight) {
        super.setStoneSculptureWeight(stoneSculptureWeight);
    }

    @Override
    public String getStoneSculptureName() {
        return super.getStoneSculptureName();
    }

    @Override
    public void setStoneSculptureName(String stoneSculptureName) {
        super.setStoneSculptureName(stoneSculptureName);
    }

    @Override
    public String toString() {
        return "LionStatue{" +
                "id='" + id + '\'' +
                ", price=" + price +super.toString()+
                '}';
    }
}
