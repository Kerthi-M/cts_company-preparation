package Proxy;

public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("logo.png");
        Image image2 = new ProxyImage("banner.jpg");

        image1.display();
        System.out.println("------");
        image1.display();
        System.out.println("------");
        image2.display();
    }
}
