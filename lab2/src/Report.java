public class Report {
    private User user;
    private Estate estate;
    private double estimatedPrice;

    public Report(User user, Estate estate, double estimatedPrice) {
        this.user = user;
        this.estate = estate;
        this.estimatedPrice = estimatedPrice;
    }

    public User getUser() {
        return user;
    }

    public Estate getEstate() {
        return estate;
    }

    public double getEstimatedPrice() {
        return estimatedPrice;
    }
}
