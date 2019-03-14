package service;

public enum DerivRecepies {
    TOM("Tom", InsuranceRecipes.MEDICAL_INSURANCE_DISEASE, InsuranceRecipes.MEDICAL_INSURANCE_CUTS ),
    BEN("Ben", InsuranceRecipes.PROPERTY_INSURANCE_EXPLOSION, InsuranceRecipes.VEHICLE_INSURANCE_COLLISION),
    BOB("Bob", InsuranceRecipes.MEDICAL_INSURANCE_POISONING, InsuranceRecipes.PROPERTY_INSURANCE_FIRE);


    private String userName;
    private InsuranceRecipes[]rec;

    DerivRecepies(String userName, InsuranceRecipes... rec){
        this.userName = userName;
       this.rec = rec;
    }

    public String getUserName() {
        return userName;
    }

    public InsuranceRecipes [] getInsuranceRecipes() {
        return rec;
    }
}
