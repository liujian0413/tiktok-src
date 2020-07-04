package org.apache.http.client.methods;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.utils.CloneUtils;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public abstract class HttpRequestBase extends AbstractHttpMessage implements Cloneable, AbortableHttpRequest, HttpUriRequest {
    private Lock abortLock = new ReentrantLock();
    private boolean aborted;
    private ClientConnectionRequest connRequest;
    private ConnectionReleaseTrigger releaseTrigger;
    private URI uri;

    public abstract String getMethod();

    public URI getURI() {
        return this.uri;
    }

    public ProtocolVersion getProtocolVersion() {
        return HttpProtocolParams.getVersion(getParams());
    }

    public void abort() {
        this.abortLock.lock();
        try {
            if (!this.aborted) {
                this.aborted = true;
                ClientConnectionRequest clientConnectionRequest = this.connRequest;
                ConnectionReleaseTrigger connectionReleaseTrigger = this.releaseTrigger;
                this.abortLock.unlock();
                if (clientConnectionRequest != null) {
                    clientConnectionRequest.abortRequest();
                }
                if (connectionReleaseTrigger != null) {
                    try {
                        connectionReleaseTrigger.abortConnection();
                    } catch (IOException unused) {
                    }
                }
            }
        } finally {
            this.abortLock.unlock();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        HttpRequestBase httpRequestBase = (HttpRequestBase) super.clone();
        httpRequestBase.abortLock = new ReentrantLock();
        httpRequestBase.aborted = false;
        httpRequestBase.releaseTrigger = null;
        httpRequestBase.connRequest = null;
        httpRequestBase.headergroup = (HeaderGroup) CloneUtils.clone(this.headergroup);
        httpRequestBase.params = (HttpParams) CloneUtils.clone(this.params);
        return httpRequestBase;
    }

    public RequestLine getRequestLine() {
        String str;
        String method = getMethod();
        ProtocolVersion protocolVersion = getProtocolVersion();
        URI uri2 = getURI();
        if (uri2 != null) {
            str = uri2.toASCIIString();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = "/";
        }
        return new BasicRequestLine(method, str, protocolVersion);
    }

    public void setURI(URI uri2) {
        this.uri = uri2;
    }

    public void setConnectionRequest(ClientConnectionRequest clientConnectionRequest) throws IOException {
        this.abortLock.lock();
        try {
            if (!this.aborted) {
                this.releaseTrigger = null;
                this.connRequest = clientConnectionRequest;
                return;
            }
            throw new IOException("Request already aborted");
        } finally {
            this.abortLock.unlock();
        }
    }

    public void setReleaseTrigger(ConnectionReleaseTrigger connectionReleaseTrigger) throws IOException {
        this.abortLock.lock();
        try {
            if (!this.aborted) {
                this.connRequest = null;
                this.releaseTrigger = connectionReleaseTrigger;
                return;
            }
            throw new IOException("Request already aborted");
        } finally {
            this.abortLock.unlock();
        }
    }
}
