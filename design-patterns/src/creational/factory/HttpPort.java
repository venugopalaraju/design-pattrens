package creational.factory;

public class HttpPort implements Port{
    @Override
    public String sendRequest(String requestBody) {
        return "received request"+requestBody;
    }
}
