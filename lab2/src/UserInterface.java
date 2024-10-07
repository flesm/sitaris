import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);

    public User getUserInput() {
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
}
