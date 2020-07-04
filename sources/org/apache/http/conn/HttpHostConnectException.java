package org.apache.http.conn;

import java.net.ConnectException;
import org.apache.http.HttpHost;

public class HttpHostConnectException extends ConnectException {
    private static final long serialVersionUID = -3194482710275220224L;
    private final HttpHost host;

    public HttpHost getHost() {
        return this.host;
    }

    public HttpHostConnectException(HttpHost httpHost, ConnectException connectException) {
        StringBuilder sb = new StringBuilder("Connection to ");
        sb.append(httpHost);
        sb.append(" refused");
        super(sb.toString());
        this.host = httpHost;
        initCause(connectException);
    }
}
