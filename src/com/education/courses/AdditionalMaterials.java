package com.education.courses;

public class AdditionalMaterials extends University {
    private String additionalMaterialsOne;
    private int ID;

    public static int counter = 0;

    public AdditionalMaterials(String additionalMaterialsOne, int ID) {
        this.additionalMaterialsOne = additionalMaterialsOne;
        this.ID = ++counter;
    }
}
