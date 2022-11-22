package com.education.reposetories;

import com.education.courses.AdditionalMaterials;

public class AdditionalMaterialsRepository extends UniversityRepository {

    private int CAPACITY = 10;
    private AdditionalMaterials[] materialsArray = new AdditionalMaterials[CAPACITY];

    public void addMaterials(AdditionalMaterials additionalMaterials) {
        for (int i = 0; i < materialsArray.length; i++) {
            if (materialsArray[i] == null) {
                materialsArray[i] = additionalMaterials;
                break;
            }
            if (materialsArray[materialsArray.length - 1] != null) {
                magnifArray();
            }
        }
    }

    private void magnifArray() {
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        AdditionalMaterials[] tmpArrayMaterials = new AdditionalMaterials[CAPACITY];
        System.arraycopy(materialsArray, 0, tmpArrayMaterials, 0, tmpCapacity);
        materialsArray = tmpArrayMaterials;
    }

    public AdditionalMaterials[] getMaterialsArray() {
        return materialsArray;
    }
}

