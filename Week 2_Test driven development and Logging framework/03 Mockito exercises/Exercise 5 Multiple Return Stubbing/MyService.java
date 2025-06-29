package ex_3;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public int getId() {
        return api.getNextId();
    }
}
