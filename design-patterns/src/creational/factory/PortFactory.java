package creational.factory;

public class PortFactory {
    private static PortFactory portFactory;
    private Port port;

    private PortFactory(){

    }

    public synchronized  static PortFactory getPortFactory(){
        if (null==portFactory)
        {
            portFactory = new PortFactory();
        }
        return portFactory;
    }

    public Port getPort(PortType portType){
        if (PortType.HTTP == portType) {
            port = new HttpPort();
        } else if (PortType.FTP == portType) {
            port = new FtpPort();
        }
        return port;
    }
}
