package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        System.out.println(internet.connect("google.com"));
        System.out.println(internet.connect("xx.com"));
    }
}
