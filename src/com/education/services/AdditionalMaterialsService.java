package com.education.services;

import com.education.courses.AdditionalMaterials;

public class AdditionalMaterialsService {

    public static int countMaterials = 0;

    public void createMaterials(String additionalMaterialsOne, int ID){
        AdditionalMaterials additionalMaterials = new AdditionalMaterials(additionalMaterialsOne,ID);
        countMaterials++;
    }
}
