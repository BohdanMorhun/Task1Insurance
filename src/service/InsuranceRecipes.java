package service;

import model.entity.Risk;

public enum InsuranceRecipes {

    MEDICAL_INSURANCE_CUTS("Medical insurance for cuts", Risk.RISK_OF_CUTS),
    MEDICAL_INSURANCE_DISEASE("Medical insurance for disease", Risk.RISK_OF_DISEASE),
    MEDICAL_INSURANCE_POISONING("Medical insurance for poisoning", Risk.RISK_OF_POISONING),

    VEHICLE_INSURANCE_STEALING("Vehicle insurance for stealing", Risk.RISK_OF_STEALING),
    VEHICLE_INSURANCE_COLLISION("Vehicle insurance for collision", Risk.RISK_OF_COLLISION),

    PROPERTY_INSURANCE_FIRE("Property insurance for fire ", Risk.RISK_OF_FIRE),
    PROPERTY_INSURANCE_EXPLOSION("Property insurance for explosion", Risk.RISK_OF_EXPLOSION);

    private String name;
     private Risk  risk;

    InsuranceRecipes(String name, Risk risk) {
        this.name = name;
        this.risk = risk;
    }

    public String getName() {
        return name;
    }

    public Risk getRisk() {
        return risk;
    }
}
