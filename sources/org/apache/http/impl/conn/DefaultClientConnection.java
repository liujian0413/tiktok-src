package org.apache.http.impl.conn;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.net.Socket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.impl.SocketHttpClientConnection;
import org.apache.http.p1893io.HttpMessageParser;
import org.apache.http.p1893io.SessionInputBuffer;
import org.apache.http.p1893io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

public class DefaultClientConnection extends SocketHttpClientConnection implements OperatedClientConnection {
    private boolean connSecure;
    private final Log headerLog = LogFactory.getLog("org.apache.http.headers");
    private final Log log = LogFactory.getLog(getClass());
    private volatile boolean shutdown;
    private volatile Socket socket;
    private HttpHost targetHost;
    private final Log wireLog = LogFactory.getLog("org.apache.http.wire");

    public final Socket getSocket() {
        return this.socket;
    }

    public final boolean isSecure() {
        return this.connSecure;
    }

    public void close() throws IOException {
        this.log.debug("Connection closed");
        super.close();
    }

    public void shutdown() throws IOException {
        this.log.debug("Connection shut down");
        this.shutdown = true;
        super.shutdown();
        Socket socket2 = this.socket;
        if (socket2 != null) {
            socket2.close();
        }
    }

    public HttpResponse receiveResponseHeader() throws HttpException, IOException {
        Header[] allHeaders;
        HttpResponse receiveResponseHeader = super.receiveResponseHeader();
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            StringBuilder sb = new StringBuilder("Receiving response: ");
            sb.append(receiveResponseHeader.getStatusLine());
            log2.debug(sb.toString());
        }
        if (this.headerLog.isDebugEnabled()) {
            Log log3 = this.headerLog;
            StringBuilder sb2 = new StringBuilder("<< ");
            sb2.append(receiveResponseHeader.getStatusLine().toString());
            log3.debug(sb2.toString());
            for (Header header : receiveResponseHeader.getAllHeaders()) {
                Log log4 = this.headerLog;
                StringBuilder sb3 = new StringBuilder("<< ");
                sb3.append(header.toString());
                log4.debug(sb3.toString());
            }
        }
        return receiveResponseHeader;
    }

    public void sendRequestHeader(HttpRequest httpRequest) throws HttpException, IOException {
        Header[] allHeaders;
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            StringBuilder sb = new StringBuilder("Sending request: ");
            sb.append(httpRequest.getRequestLine());
            log2.debug(sb.toString());
        }
        super.sendRequestHeader(httpRequest);
        if (this.headerLog.isDebugEnabled()) {
            Log log3 = this.headerLog;
            StringBuilder sb2 = new StringBuilder(">> ");
            sb2.append(httpRequest.getRequestLine().toString());
            log3.debug(sb2.toString());
            for (Header header : httpRequest.getAllHeaders()) {
                Log log4 = this.headerLog;
                StringBuilder sb3 = new StringBuilder(">> ");
                sb3.append(header.toString());
                log4.debug(sb3.toString());
            }
        }
    }

    public void openCompleted(boolean z, HttpParams httpParams) throws IOException {
        assertNotOpen();
        if (httpParams != null) {
            this.connSecure = z;
            bind(this.socket, httpParams);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public void opening(Socket socket2, HttpHost httpHost) throws IOException {
        assertNotOpen();
        this.socket = socket2;
        this.targetHost = httpHost;
        if (this.shutdown) {
            socket2.close();
            throw new IOException("Connection already shutdown");
        }
    }

    public HttpMessageParser createResponseParser(SessionInputBuffer sessionInputBuffer, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        return new DefaultResponseParser(sessionInputBuffer, null, httpResponseFactory, httpParams);
    }

    public SessionInputBuffer createSessionInputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        if (i == -1) {
            i = VideoCacheReadBuffersizeExperiment.DEFAULT;
        }
        SessionInputBuffer createSessionInputBuffer = super.createSessionInputBuffer(socket2, i, httpParams);
        if (this.wireLog.isDebugEnabled()) {
            return new LoggingSessionInputBuffer(createSessionInputBuffer, new Wire(this.wireLog));
        }
        return createSessionInputBuffer;
    }

    public SessionOutputBuffer createSessionOutputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        if (i == -1) {
            i = VideoCacheReadBuffersizeExperiment.DEFAULT;
        }
        SessionOutputBuffer createSessionOutputBuffer = super.createSessionOutputBuffer(socket2, i, httpParams);
        if (this.wireLog.isDebugEnabled()) {
            return new LoggingSessionOutputBuffer(createSessionOutputBuffer, new Wire(this.wireLog));
        }
        return createSessionOutputBuffer;
    }

    public void update(Socket socket2, HttpHost httpHost, boolean z, HttpParams httpParams) throws IOException {
        assertOpen();
        if (httpHost == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (httpParams != null) {
            if (socket2 != null) {
                this.socket = socket2;
                bind(socket2, httpParams);
            }
            this.targetHost = httpHost;
            this.connSecure = z;
        } else {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
    }
}
