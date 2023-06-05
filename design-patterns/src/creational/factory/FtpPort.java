package creational.factory;

public class FtpPort implements Port{
    @Override
    public String sendRequest(String requestBody) {
        return "received request"+requestBody;
    }
}
