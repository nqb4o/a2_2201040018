package a2_2201040018;

public class PC {
    private String model;
    private int year;
    private String manufacturer;
    private Set<String> comps;

    public PC(String model, int year, String manufacturer, Set<String> comps) {
        if (isValidModel(model))
            this.model = model;
        else
            throw new IllegalArgumentException("Invalid model");

        if (isValidYear(year))
            this.year = year;
        else
            throw new IllegalArgumentException("Invalid year");

        if (isValidManufacturer(manufacturer))
            this.manufacturer = manufacturer;
        else
            throw new IllegalArgumentException("Invalid manufacturer");

        this.comps = comps;
    }

    public boolean isValidModel(String model) {
        return model != null && model.length() <= 20;
    }

    public boolean isValidYear(int year) {
        return year >= 1984;
    }

    public boolean isValidManufacturer(String manufacturer) {
        return manufacturer != null && manufacturer.length() <= 15;
    }

    // Getters and setters
    public void setModel(String model) {
        if (isValidModel(model))
            this.model = model;
        else
            throw new IllegalArgumentException("Invalid model");
    }
    public void setComps(Set<String> comps) {
        this.comps = comps;
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