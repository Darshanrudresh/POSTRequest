package com.sap.plm.config.Configmgt.dto;

public class Materialinfo {
    String MaterialID;
    String MaterialName;
    String Plant;
    String AlternativeBOM;
    String BOMApplication;

    public String getMaterialID() {
        return MaterialID;
    }

    public void setMaterialID(String materialID) {
        MaterialID = materialID;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public void setMaterialName(String materialName) {
        MaterialName = materialName;
    }

    public String getPlant() {
        return Plant;
    }

    public void setPlant(String plant) {
        Plant = plant;
    }

    public String getAlternativeBOM() {
        return AlternativeBOM;
    }

    public void setAlternativeBOM(String alternativeBOM) {
        AlternativeBOM = alternativeBOM;
    }

    public String getBOMApplication() {
        return BOMApplication;
    }

    public void setBOMApplication(String BOMApplication) {
        this.BOMApplication = BOMApplication;
    }

    @Override
    public String toString() {
        return "Materialinfo{" +
                "MaterialID='" + MaterialID + '\'' +
                ", MaterialName='" + MaterialName + '\'' +
                ", Plant='" + Plant + '\'' +
                ", AlternativeBOM='" + AlternativeBOM + '\'' +
                ", BOMApplication='" + BOMApplication + '\'' +
                '}';
    }
}
