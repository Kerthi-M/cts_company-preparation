package Observer;
public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStockData("AAPL", 172.50);
        market.setStockData("GOOGL", 2850.75);
    }
}
