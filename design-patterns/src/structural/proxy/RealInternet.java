package structural.proxy;

public class RealInternet implements Internet{
    @Override
    public String connect(String host) {
        return "Connected to ::"+host;
    }
}
