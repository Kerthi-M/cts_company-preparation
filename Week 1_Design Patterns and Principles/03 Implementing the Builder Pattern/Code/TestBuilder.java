package builder_adapter;

public class TestBuilder {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGraphics("NVIDIA RTX 3080")
            .build();

        Computer officePC = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("512GB SSD")
            .build();

        System.out.println("Gaming PC Configuration:");
        gamingPC.showConfig();

        System.out.println("\nOffice PC Configuration:");
        officePC.showConfig();
    }
}
