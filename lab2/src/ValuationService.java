class ValuationService {
    public double calculateValuation(Estate estate) {

        double baseRate = 10000;
        return estate.getArea() * baseRate * estate.getTypeOfProperty() / estate.getFromCenterSector() ;
    }
}