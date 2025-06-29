package ex_3;

public class FileService {
    private FileReader reader;
    private FileWriter writer;

    public FileService(FileReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String processFile() {
        String data = reader.read();
        writer.write("Processed " + data);
        return "Processed " + data;
    }
}
