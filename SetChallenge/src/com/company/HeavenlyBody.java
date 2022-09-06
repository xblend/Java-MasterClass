package com.company;


import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;

    enum BodyTypes {
        PLANET,
        DWARF_PLANET,
        MOON
    }
    public static class Key{
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj)
        {
            if(this==obj)
                return true;
            if(obj==null || obj.getClass()!=this.getClass())
                return false;

            String objName = ((Key) obj).getName();
            BodyTypes objBodyType = ((Key) obj).getBodyType();

            return this.name.equals(objName) && this.bodyType.equals(objBodyType);
        }

        @Override
        public int hashCode() {
            return this.name.hashCode()+this.bodyType.hashCode()+57;
        }

        @Override
        public String toString() {
            return this.getName()+": "+this.getBodyType();
        }

    }


    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.key = new Key(name,bodyType);
        satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody satellite){
        return satellites.add(satellite);
    }

    public static Key makeKey(String keyName,BodyTypes keyBodyType){
        return new Key(keyName,keyBodyType);
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

        Key objKey = ((HeavenlyBody) obj).getKey();
        return this.key.equals(objKey);
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.toString()+", "+this.orbitalPeriod;
    }
}
