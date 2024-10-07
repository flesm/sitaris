import java.io.FileWriter;
import java.io.IOException;

class DatabaseService {
    public void saveReport(Report report) {
        String filename = "report_" + report.getUser().getName() + ".txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Справаздача па ацэнцы нерухомасці:\n");
            writer.write("імя карыстальніка: " + report.getUser().getName() + "\n");
            writer.write("Плошча нерухомасці: " + report.getEstate().getArea() + " кв.м\n");
            writer.write("Дальнасць ад цэнтра: " + report.getEstate().getFromCenterSector() + "\n");
            writer.write("Тып нурухомасці: " + report.getEstate().getTypeOfProperty() + "\n");
            writer.write("Ацэначны кошт: " + report.getEstimatedPrice() + " руб.\n");
            System.out.println("Справаздача захавана: " + filename);
        } catch (IOException e) {
            System.out.println("Памылка пры захаванні справаздачы: " + e.getMessage());
        }
    }
}
