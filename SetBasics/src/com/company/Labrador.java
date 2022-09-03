package com.company;

import java.util.Objects;

public class Labrador extends Dog {
    public Labrador(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
/*
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof Labrador) {
            String objName = ((Labrador) obj).getName();
            return this.getName().equals(objName);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }

 */
}
