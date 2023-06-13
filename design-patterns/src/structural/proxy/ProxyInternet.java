package structural.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet{
    RealInternet realInternet = new RealInternet();
    List<String> bannedHosts = Arrays.asList("xx.com","xxx.com","xxxx.com");

    @Override
    public String connect(String host) {
        if(bannedHosts.contains(host)){
            return host+" was Banned by Govt";
        }
        return realInternet.connect(host);
    }
}
