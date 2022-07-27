package com.example.stonesculptureoop.model;

public class StoneSculpture {
    private String stoneSculptureWeight;
    private String stoneSculptureName;

    public String getStoneSculptureWeight() {
        return stoneSculptureWeight;
    }

    public void setStoneSculptureWeight(String stoneSculptureWeight) {
        this.stoneSculptureWeight = stoneSculptureWeight;
    }

    public String getStoneSculptureName() {
        return stoneSculptureName;
    }

    public void setStoneSculptureName(String stoneSculptureName) {
        this.stoneSculptureName = stoneSculptureName;
    }

    @Override
    public String toString() {
        return "StoneSculpture{" +
                "stoneSculptureWeight='" + stoneSculptureWeight + '\'' +
                ", stoneSculptureName='" + stoneSculptureName + '\'' +
                '}';
    }
}
