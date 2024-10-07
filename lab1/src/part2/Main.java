package part2;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartphone = new Smartphone("iPhone");
        smartphone.powerOn();
        ((CommunicationDevice) smartphone).transmitData("Hello from iPhone!");
        smartphone.powerOff();

        StorageDevice smartTV = new SmartTV("Samsung SmartTV", "55 inches");
        smartTV.powerOn();
        smartTV.storeData("New movie");
        smartTV.displayContent("Displaying movie from SmartTV storage.");
        System.out.println("Stored content: " + smartTV.retrieveData());
        smartTV.transmitData("Sharing content with another device.");
        smartTV.powerOff();

        SmartDisplayDevice smartDisplay = new SmartTV("LG Smart Display", "65 inches");
        smartDisplay.powerOn();
        smartDisplay.displayContent("Displaying content on LG Smart Display.");
        smartDisplay.transmitData("Transmitting data to another device.");
        smartDisplay.powerOff();
    }

    // I1
    interface SmartDevice {
        void powerOn();
        void powerOff();
    }

    // I2 ад I1
    interface CommunicationDevice extends SmartDevice {
        void transmitData(String data);
    }

    // I3 ад I2
    interface SmartDisplayDevice extends CommunicationDevice {
        void displayContent(String content);
    }

    // I4 ад I3
    interface StorageDevice extends SmartDisplayDevice {
        void storeData(String data);
        String retrieveData();
    }

    // AKL1 ад I2
    static abstract class AbstractCommunicationDevice implements CommunicationDevice {
        private String deviceName;

        public AbstractCommunicationDevice(String deviceName) {
            this.deviceName = deviceName;
        }

        public void powerOn() {
            System.out.println(deviceName + " is now powered on.");
        }

        public void powerOff() {
            System.out.println(deviceName + " is now powered off.");
        }

        public abstract void transmitData(String data);
    }

    // AKL2 ад AKL1 i I3
    static abstract class AbstractSmartDisplayDevice extends AbstractCommunicationDevice implements SmartDisplayDevice {
        private String screenSize;

        public AbstractSmartDisplayDevice(String deviceName, String screenSize) {
            super(deviceName);
            this.screenSize = screenSize;
        }

        public abstract void displayContent(String content);
    }

    // KL1 ад AKL1 i I1
    static class Smartphone extends AbstractCommunicationDevice implements SmartDevice {
        public Smartphone(String deviceName) {
            super(deviceName);
        }

        @Override
        public void transmitData(String data) {
            System.out.println("Smartphone is transmitting data: " + data);
        }
    }

    // KL2 ад AKL2 i I4
    static class SmartTV extends AbstractSmartDisplayDevice implements StorageDevice {
        private String storedData;

        public SmartTV(String deviceName, String screenSize) {
            super(deviceName, screenSize);
            storedData = "";
        }

        @Override
        public void displayContent(String content) {
            System.out.println("SmartTV is displaying: " + content);
        }

        @Override
        public void storeData(String data) {
            this.storedData = data;
            System.out.println("Data stored in SmartTV.");
        }

        @Override
        public String retrieveData() {
            return this.storedData;
        }

        @Override
        public void transmitData(String data) {
            System.out.println("SmartTV is transmitting data: " + data);
        }
    }
}
