package a2_2201040018;

import a2_2201040018.utils.NotPossibleException;

public class PC {
    private String model;
    private final int year;
    private final String manufacturer;
    private Set<String> comps;

    public PC(String model, int year, String manufacturer, Set<String> comps) {
        if (isValidModel(model))
            this.model = model;
        else
            throw new NotPossibleException("Invalid model");

        if (isValidYear(year))
            this.year = year;
        else
            throw new NotPossibleException("Invalid year");

        if (isValidManufacturer(manufacturer))
            this.manufacturer = manufacturer;
        else
            throw new NotPossibleException("Invalid manufacturer");

        if (isValidComps(comps))
            this.comps = comps;
        else
            throw new NotPossibleException("Invalid components");

    }

    private boolean isValidModel(String model) {
        return model != null && !model.isEmpty() && model.length() <= 20;
    }

    private boolean isValidYear(int year) {
        return year >= 1984;
    }

    private boolean isValidManufacturer(String manufacturer) {
        return manufacturer != null && !manufacturer.isEmpty() && manufacturer.length() <= 15;
    }

    private boolean isValidComps(Set<String> comps) {
        return !comps.isEmpty();
    }

    // Getters and setters
    public void setModel(String model) {
        if (isValidModel(model))
            this.model = model;
        else
            throw new NotPossibleException("Invalid model");
    }
    public void setComps(Set<String> comps) {
        if (isValidComps(comps))
            this.comps = comps;
        else
            throw new NotPossibleException("Invalid components");

    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public Set<String> getComps() {
        return comps;
    }
    @Override
    public String toString() {
        return "PC<" + model + ", " + year + ", " + manufacturer + ", " + comps + ">";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof PC))
            return false;

        PC otherPC = (PC) obj;

        return this.model.equals(otherPC.model) &&
                this.year == otherPC.year &&
                this.manufacturer.equals(otherPC.manufacturer) &&
                this.comps.equals(otherPC.comps);
    }
}