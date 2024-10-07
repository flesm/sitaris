public class Main {
    public static void main(String[] args) {
        ValuationService valuationService = new ValuationService();
        ReportService reportService = new ReportService();
        DatabaseService databaseService = new DatabaseService();
        Router router = new Router(valuationService, reportService, databaseService);
        UserInterface userInterface = new UserInterface();

        User user = userInterface.getUserInput();
        Estate estate = userInterface.getEstateInput();

        Report report = router.routeData(user, estate);

        userInterface.displayReport(report);
    }
}