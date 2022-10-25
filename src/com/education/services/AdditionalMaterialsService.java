package com.education.services;

import com.education.courses.AdditionalMaterials;

public class AdditionalMaterialsService {

    public AdditionalMaterials createMaterials(String additionalMaterialsOne, int ID){
        return new AdditionalMaterials(additionalMaterialsOne,ID);
    }
}
