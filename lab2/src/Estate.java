public class Estate {
    private double area;
    private int fromCenterSector;
    private int typeOfProperty;

    public Estate(double area, int fromCenterSector, int typeOfProperty) {
        this.area = area;
        this.fromCenterSector = fromCenterSector;
        this.typeOfProperty = typeOfProperty;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFromCenterSector() {
        return fromCenterSector;
    }

    public void setFromCenterSector(int fromCenterSector) {
        this.fromCenterSector = fromCenterSector;
    }

    public int getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(int typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }
}
