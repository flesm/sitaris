class Router {
    private ValuationService valuationService;
    private ReportService reportService;
    private DatabaseService databaseService;

    public Router(ValuationService valuationService, ReportService reportService, DatabaseService databaseService) {
        this.valuationService = valuationService;
        this.reportService = reportService;
        this.databaseService = databaseService;
    }

    public Report routeData(User user, Estate estate) {
        // Крок 1: Ацэнка нерухомасці
        double estimatedPrice = valuationService.calculateValuation(estate);

        // Крок 2: Стварэнне справаздачы
        Report report = reportService.createReport(user, estate, estimatedPrice);

        // Крок 3: Захаванне справаздачы ў БД
        databaseService.saveReport(report);

        return report;
    }
}