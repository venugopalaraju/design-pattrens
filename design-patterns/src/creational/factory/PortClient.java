package creational.factory;

public class PortClient {
    public static void main(String[] args) {
        PortFactory portFactory = new PortFactory();
        Port httpPort = portFactory.getPort(PortType.HTTP);
        Port ftpPort = portFactory.getPort(PortType.FTP);
        System.out.println(httpPort.sendRequest(" http port"));
        System.out.println(ftpPort.sendRequest(" ftp port"));
    }
}
