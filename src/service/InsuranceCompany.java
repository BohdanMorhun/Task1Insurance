package service;

public class InsuranceCompany {

    public Derivative createDerivative(DerivRecepies rec){
        return new Derivative(rec);
    }
}


