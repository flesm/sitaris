import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Report> reportHistory = new ArrayList<>();
    private static ArrayList<User> specialists = new ArrayList<>();

    public static User getUserInput() {
        System.out.print("Увядзіце сваё імя: ");
        String name = scanner.nextLine();
        double id = Math.random()+100;
        boolean profi = false;

        return new User(id, name, profi);
    }

    public Estate getEstateInput() {
        System.out.print("Увядзіце плошчу нерухомасці (у кв. м): ");
        double area = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Увядзіце дальнасць сектара ад цэнтра (1 - цэнтр, 2 - 10-50 км, 3 - >50 км): ");
        int fromCenterSector = scanner.nextInt();
        System.out.print("Увядзіце тып нерухомасці (1 - кватэра/ 2 - дом): ");
        int typeOfProperty = scanner.nextInt();

        return new Estate(area, fromCenterSector, typeOfProperty);
    }

    public void displayReport(Report report) {
        System.out.println("Справаздача аб ацэке нерухомасці:");
        System.out.println("Імя карыстальніка: " + report.getUser().getName());
        System.out.println("Плошча нерухомасці: " + report.getEstate().getArea() + " кв.м");
        System.out.println("Дальнасць ад цэнтра: " + report.getEstate().getFromCenterSector());
        System.out.println("Тып нерухомасці: " + report.getEstate().getTypeOfProperty());
        System.out.println("Ацэначны кошт нерухомасці: " + report.getEstimatedPrice() + " BYN.");
    }

    private static void viewReportHistory() {
        System.out.println("Гісторыя справаздач:");
        if (reportHistory.isEmpty()) {
            System.out.println("Гісторыя пустая.");
        } else {
            for (Report report : reportHistory) {
                System.out.println("Справаздача для: " + report.getUser().getName() + " | Ацэначны кошт: " + report.getEstimatedPrice() + " BYN");
            }
        }
    }

    private static void sendSpecialistRequest() {
        System.out.print("Вы хочаце адправіць запыт на спецыяліста? (так/не): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("так")) {
            System.out.println("Запыт адпраўлены. Чакаем адабрэння...");
            System.out.print("Адобрыць карыстальніка як спецыяліста? (так/не): ");
            String approval = scanner.nextLine();
            if (approval.equalsIgnoreCase("так")) {
                User user = getUserInput();
                specialists.add(user);
                System.out.println("Карыстальнік адобраны як спецыяліст.");
            } else {
                System.out.println("Запыт адхілены.");
            }
        } else {
            System.out.println("Запыт адменены.");
        }
    }

    private static void viewSpecialistsList() {
        System.out.println("Спіс спецыялістаў:");
        if (specialists.isEmpty()) {
            System.out.println("Няма спецыялістаў.");
        } else {
            for (User user : specialists) {
                System.out.println("Спецыяліст: " + user.getName());
            }
        }
    }

    public static void displayMenu() {
        while (true) {
            System.out.println("1. Паглядзець гісторыю справаздач");
            System.out.println("2. Адправіць запыт на спецыяліста");
            System.out.println("3. Паглядзець спіс спецыялістаў");
            System.out.println("4. Паглядзець навіны");
            System.out.println("5. Паглядзець аналіз рынку");
            System.out.println("6. Ацаніць нерухомасць");
            System.out.print("Выберыце опцыю: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewReportHistory();
                    break;
                case 2:
                    sendSpecialistRequest();
                    break;
                case 3:
                    viewSpecialistsList();
                    break;
                case 4:
                    System.out.println("Навіны: Усе апошнія звесткі па рынку нерухомасці.");
                    break;
                case 5:
                    System.out.println("Аналіз рынку: Кошты на рынку нерухомасці выраслі на 10%.");
                    break;
                case 6:
                    ValuationService valuationService = new ValuationService();
                    ReportService reportService = new ReportService();
                    DatabaseService databaseService = new DatabaseService();
                    Router router = new Router(valuationService, reportService, databaseService);
                    UserInterface userInterface = new UserInterface();

                    User user = userInterface.getUserInput();
                    Estate estate = userInterface.getEstateInput();

                    Report report = router.routeData(user, estate);

                    reportHistory.add(report);

                    userInterface.displayReport(report);
                    break;
                default:
                    System.out.println("Некарэктны выбар, паспрабуйце зноў.");
            }
        }
    }
}
