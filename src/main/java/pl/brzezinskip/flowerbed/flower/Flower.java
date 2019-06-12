package pl.brzezinskip.flowerbed.flower;

import java.util.Objects;

public class Flower {

    private String name;
    private String systematicName;
    private String family;
    private boolean oneAnnual;  //jednoroczny?

    public Flower(String name, String systematicName, String family, boolean oneAnnual) {
        this.name = name;
        this.systematicName = systematicName;
        this.family = family;
        this.oneAnnual = oneAnnual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystematicName() {
        return systematicName;
    }

    public void setSystematicName(String systematicName) {
        this.systematicName = systematicName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public boolean isOneAnnual() {
        return oneAnnual;
    }

    public void setOneAnnual(boolean oneAnnual) {
        this.oneAnnual = oneAnnual;
    }

    private String annual(){
        if (isOneAnnual()){
            return "tak";
        }else {
            return "nie";
        }
    }

    @Override
    public String toString() {
        return "Nazwa: " + getName() + " (łac. " + getSystematicName() + "), rodzina: " + getFamily() + ", jednoroczna: " + annual();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return oneAnnual == flower.oneAnnual &&
                Objects.equals(name, flower.name) &&
                Objects.equals(systematicName, flower.systematicName) &&
                Objects.equals(family, flower.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, systematicName, family, oneAnnual);
    }
}
