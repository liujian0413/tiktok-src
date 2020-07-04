package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.C6174c;
import com.bytedance.apm.agent.instrumentation.okhttp3.MonitorRecorder;
import com.bytedance.apm.agent.instrumentation.p463io.CountingInputStream;
import com.bytedance.apm.agent.instrumentation.p463io.CountingOutputStream;
import com.bytedance.apm.agent.instrumentation.p463io.StreamCompleteEvent;
import com.bytedance.apm.agent.instrumentation.p463io.StreamCompleteListener;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionData;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public class HttpsURLConnectionExtension extends HttpsURLConnection {
    private static final AgentLog log = AgentLogManager.getAgentLog();
    public HttpsURLConnection impl;
    private TransactionState transactionState;

    public boolean getAllowUserInteraction() {
        return this.impl.getAllowUserInteraction();
    }

    public String getCipherSuite() {
        return this.impl.getCipherSuite();
    }

    public int getConnectTimeout() {
        return this.impl.getConnectTimeout();
    }

    public boolean getDefaultUseCaches() {
        return this.impl.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.impl.getDoInput();
    }

    public boolean getDoOutput() {
        return this.impl.getDoOutput();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.impl.getHostnameVerifier();
    }

    public boolean getInstanceFollowRedirects() {
        return this.impl.getInstanceFollowRedirects();
    }

    public Certificate[] getLocalCertificates() {
        return this.impl.getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.impl.getLocalPrincipal();
    }

    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.impl.getPeerPrincipal();
    }

    public Permission getPermission() throws IOException {
        return this.impl.getPermission();
    }

    public int getReadTimeout() {
        return this.impl.getReadTimeout();
    }

    public String getRequestMethod() {
        return this.impl.getRequestMethod();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.impl.getRequestProperties();
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.impl.getSSLSocketFactory();
    }

    public URL getURL() {
        return this.impl.getURL();
    }

    public boolean getUseCaches() {
        return this.impl.getUseCaches();
    }

    public String toString() {
        return this.impl.toString();
    }

    public boolean usingProxy() {
        return this.impl.usingProxy();
    }

    public void connect() throws IOException {
        getTransactionState();
        try {
            this.impl.connect();
        } catch (IOException e) {
            error(e);
            throw e;
        }
    }

    public String getContentEncoding() {
        getTransactionState();
        String contentEncoding = this.impl.getContentEncoding();
        checkResponse();
        return contentEncoding;
    }

    public int getContentLength() {
        getTransactionState();
        int contentLength = this.impl.getContentLength();
        checkResponse();
        return contentLength;
    }

    public String getContentType() {
        getTransactionState();
        String contentType = this.impl.getContentType();
        checkResponse();
        return contentType;
    }

    public long getDate() {
        getTransactionState();
        long date = this.impl.getDate();
        checkResponse();
        return date;
    }

    public long getExpiration() {
        getTransactionState();
        long expiration = this.impl.getExpiration();
        checkResponse();
        return expiration;
    }

    public Map<String, List<String>> getHeaderFields() {
        getTransactionState();
        Map<String, List<String>> headerFields = this.impl.getHeaderFields();
        checkResponse();
        return headerFields;
    }

    public long getIfModifiedSince() {
        getTransactionState();
        long ifModifiedSince = this.impl.getIfModifiedSince();
        checkResponse();
        return ifModifiedSince;
    }

    public long getLastModified() {
        getTransactionState();
        long lastModified = this.impl.getLastModified();
        checkResponse();
        return lastModified;
    }

    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        try {
            return this.impl.getServerCertificates();
        } catch (SSLPeerUnverifiedException e) {
            error(e);
            throw e;
        }
    }

    private void checkResponse() {
        if (!getTransactionState().isComplete()) {
            TransactionStateUtil.inspectAndInstrumentResponse(getTransactionState(), this.impl);
        }
    }

    private TransactionState getTransactionState() {
        if (this.transactionState == null) {
            this.transactionState = new TransactionState();
            TransactionStateUtil.inspectAndInstrument(this.transactionState, this.impl);
        }
        return this.transactionState;
    }

    public void disconnect() {
        if (this.transactionState != null && !this.transactionState.isComplete()) {
            addTransactionAndErrorData(this.transactionState);
        }
        this.impl.disconnect();
    }

    public OutputStream getOutputStream() throws IOException {
        final TransactionState transactionState2 = getTransactionState();
        try {
            CountingOutputStream countingOutputStream = new CountingOutputStream(this.impl.getOutputStream());
            countingOutputStream.addStreamCompleteListener(new StreamCompleteListener() {
                public void streamError(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState2.isComplete()) {
                        transactionState2.setBytesSent(streamCompleteEvent.getBytes());
                    }
                    HttpsURLConnectionExtension.this.error(streamCompleteEvent.getException());
                }

                public void streamComplete(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState2.isComplete()) {
                        String requestProperty = HttpsURLConnectionExtension.this.impl.getRequestProperty("content-length");
                        long bytes = streamCompleteEvent.getBytes();
                        if (requestProperty != null) {
                            try {
                                bytes = Long.parseLong(requestProperty);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        transactionState2.setBytesSent(bytes);
                        HttpsURLConnectionExtension.this.addTransactionAndErrorData(transactionState2);
                    }
                }
            });
            return countingOutputStream;
        } catch (IOException e) {
            error(e);
            throw e;
        }
    }

    public int getResponseCode() throws IOException {
        getTransactionState();
        try {
            int responseCode = this.impl.getResponseCode();
            checkResponse();
            return responseCode;
        } catch (IOException e) {
            error(e);
            throw e;
        }
    }

    public String getResponseMessage() throws IOException {
        getTransactionState();
        try {
            String responseMessage = this.impl.getResponseMessage();
            checkResponse();
            return responseMessage;
        } catch (IOException e) {
            error(e);
            throw e;
        }
    }

    public Object getContent() throws IOException {
        getTransactionState();
        try {
            Object content = this.impl.getContent();
            int contentLength = this.impl.getContentLength();
            if (contentLength >= 0) {
                TransactionState transactionState2 = getTransactionState();
                if (!transactionState2.isComplete()) {
                    transactionState2.setBytesReceived((long) contentLength);
                    addTransactionAndErrorData(transactionState2);
                }
            }
            return content;
        } catch (IOException e) {
            error(e);
            throw e;
        }
    }

    public InputStream getErrorStream() {
        getTransactionState();
        try {
            return new CountingInputStream(this.impl.getErrorStream(), true);
        } catch (Exception e) {
            log.error(e.toString());
            return this.impl.getErrorStream();
        }
    }

    public InputStream getInputStream() throws IOException {
        final TransactionState transactionState2 = getTransactionState();
        try {
            CountingInputStream countingInputStream = new CountingInputStream(this.impl.getInputStream());
            TransactionStateUtil.inspectAndInstrumentResponse(transactionState2, this.impl);
            countingInputStream.addStreamCompleteListener(new StreamCompleteListener() {
                public void streamError(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState2.isComplete()) {
                        transactionState2.setBytesReceived(streamCompleteEvent.getBytes());
                    }
                    HttpsURLConnectionExtension.this.error(streamCompleteEvent.getException());
                }

                public void streamComplete(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState2.isComplete()) {
                        long contentLength = (long) HttpsURLConnectionExtension.this.impl.getContentLength();
                        long bytes = streamCompleteEvent.getBytes();
                        if (contentLength < 0) {
                            contentLength = bytes;
                        }
                        transactionState2.setBytesReceived(contentLength);
                        HttpsURLConnectionExtension.this.addTransactionAndErrorData(transactionState2);
                    }
                }
            });
            return countingInputStream;
        } catch (IOException e) {
            error(e);
            throw e;
        }
    }

    public String getRequestProperty(String str) {
        return this.impl.getRequestProperty(str);
    }

    public void setAllowUserInteraction(boolean z) {
        this.impl.setAllowUserInteraction(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.impl.setChunkedStreamingMode(i);
    }

    public void setConnectTimeout(int i) {
        this.impl.setConnectTimeout(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.impl.setDefaultUseCaches(z);
    }

    public void setDoInput(boolean z) {
        this.impl.setDoInput(z);
    }

    public void setDoOutput(boolean z) {
        this.impl.setDoOutput(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.impl.setFixedLengthStreamingMode(i);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.impl.setHostnameVerifier(hostnameVerifier);
    }

    public void setIfModifiedSince(long j) {
        this.impl.setIfModifiedSince(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.impl.setInstanceFollowRedirects(z);
    }

    public void setReadTimeout(int i) {
        this.impl.setReadTimeout(i);
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.impl.setSSLSocketFactory(sSLSocketFactory);
    }

    public void setUseCaches(boolean z) {
        this.impl.setUseCaches(z);
    }

    public HttpsURLConnectionExtension(HttpsURLConnection httpsURLConnection) {
        super(httpsURLConnection.getURL());
        this.impl = httpsURLConnection;
    }

    public String getHeaderField(int i) {
        getTransactionState();
        String headerField = this.impl.getHeaderField(i);
        checkResponse();
        return headerField;
    }

    public String getHeaderFieldKey(int i) {
        getTransactionState();
        String headerFieldKey = this.impl.getHeaderFieldKey(i);
        checkResponse();
        return headerFieldKey;
    }

    public void setRequestMethod(String str) throws ProtocolException {
        try {
            this.impl.setRequestMethod(str);
        } catch (ProtocolException e) {
            error(e);
            throw e;
        }
    }

    public Object getContent(Class[] clsArr) throws IOException {
        getTransactionState();
        try {
            Object content = this.impl.getContent(clsArr);
            checkResponse();
            return content;
        } catch (IOException e) {
            error(e);
            throw e;
        }
    }

    public String getHeaderField(String str) {
        getTransactionState();
        String headerField = this.impl.getHeaderField(str);
        checkResponse();
        return headerField;
    }

    public void addTransactionAndErrorData(TransactionState transactionState2) {
        TransactionData end = transactionState2.end();
        MonitorRecorder.reportMonitorData(transactionState2, "httpurlconnection");
        if (C6174c.m19149g()) {
            StringBuilder sb = new StringBuilder("addTransactionAndErrorData: ");
            sb.append(end.toString());
            String[] strArr = {sb.toString()};
        }
    }

    public void error(Exception exc) {
        TransactionState transactionState2 = getTransactionState();
        TransactionStateUtil.setErrorCodeFromException(transactionState2, exc);
        if (!transactionState2.isComplete()) {
            TransactionStateUtil.inspectAndInstrumentResponse(transactionState2, this.impl);
            TransactionData end = transactionState2.end();
            MonitorRecorder.reportMonitorData(transactionState2, "httpurlconnection");
            if (C6174c.m19149g()) {
                StringBuilder sb = new StringBuilder("addTransactionAndErrorData: ");
                sb.append(end.toString());
                String[] strArr = {sb.toString()};
            }
        }
    }

    public void addRequestProperty(String str, String str2) {
        this.impl.addRequestProperty(str, str2);
    }

    public void setRequestProperty(String str, String str2) {
        this.impl.setRequestProperty(str, str2);
    }

    public long getHeaderFieldDate(String str, long j) {
        getTransactionState();
        long headerFieldDate = this.impl.getHeaderFieldDate(str, j);
        checkResponse();
        return headerFieldDate;
    }

    public int getHeaderFieldInt(String str, int i) {
        getTransactionState();
        int headerFieldInt = this.impl.getHeaderFieldInt(str, i);
        checkResponse();
        return headerFieldInt;
    }
}
