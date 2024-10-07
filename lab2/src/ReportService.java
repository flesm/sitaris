class ReportService {
    public Report createReport(User user, Estate estate, double estimatedPrice) {
        return new Report(user, estate, estimatedPrice);
    }
}