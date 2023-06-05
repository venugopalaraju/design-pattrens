package creational.factory;

public class PortFactory {
    private Port port;

    public Port getPort(PortType portType){
        if (PortType.HTTP == portType) {
            port = new HttpPort();
        } else if (PortType.FTP == portType) {
            port = new FtpPort();
        }
        return port;
    }
}
