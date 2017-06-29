package com.company;

public class OrdinaryPerson extends Person {

    private OrdinaryPerson(OrdinaryPersonBuilder ordinaryPersonBuilder){
        super(ordinaryPersonBuilder);
    }

    public static class OrdinaryPersonBuilder extends Person.Builder<OrdinaryPerson, OrdinaryPersonBuilder> {
        @Override
        public OrdinaryPerson build() {
            return new OrdinaryPerson(this);
        }
    }
}
