package com.company;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        satellites = new HashSet<>();
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody satellite){
        return satellites.add(satellite);
    }

    @Override
    //public boolean equals(HeavenlyBody obj)
    // parsing obj of HeavenlyBody as an argument we are overloading the equals method and not overriding it
    // as to use the "equals" method for set addition we have to override the equals method.
    public final boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        if(obj==null || obj.getClass()!=this.getClass())
            return false;

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode()+57;
    }
}
