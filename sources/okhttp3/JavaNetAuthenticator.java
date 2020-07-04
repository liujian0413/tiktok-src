package okhttp3;

import java.io.IOException;
import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import okhttp3.Request.Builder;

public final class JavaNetAuthenticator implements Authenticator {
    private InetAddress getConnectToInetAddress(Proxy proxy, HttpUrl httpUrl) throws IOException {
        if (proxy == null || proxy.type() == Type.DIRECT) {
            return InetAddress.getByName(httpUrl.host);
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }

    public final Request authenticate(Route route, Response response) throws IOException {
        boolean z;
        Route route2;
        PasswordAuthentication passwordAuthentication;
        String str;
        Response response2 = response;
        List challenges = response.challenges();
        Request request = response2.request;
        HttpUrl httpUrl = request.url;
        if (response2.code == 407) {
            route2 = route;
            z = true;
        } else {
            route2 = route;
            z = false;
        }
        Proxy proxy = route2.proxy;
        int size = challenges.size();
        for (int i = 0; i < size; i++) {
            Challenge challenge = (Challenge) challenges.get(i);
            if ("Basic".equalsIgnoreCase(challenge.scheme)) {
                if (z) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), getConnectToInetAddress(proxy, httpUrl), inetSocketAddress.getPort(), httpUrl.scheme, challenge.realm, challenge.scheme, httpUrl.url(), RequestorType.PROXY);
                } else {
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(httpUrl.host, getConnectToInetAddress(proxy, httpUrl), httpUrl.port, httpUrl.scheme, challenge.realm, challenge.scheme, httpUrl.url(), RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String basic = Credentials.basic(passwordAuthentication.getUserName(), new String(passwordAuthentication.getPassword()), challenge.charset);
                    Builder newBuilder = request.newBuilder();
                    if (z) {
                        str = "Proxy-Authorization";
                    } else {
                        str = "Authorization";
                    }
                    return newBuilder.header(str, basic).build();
                }
            }
        }
        return null;
    }
}
