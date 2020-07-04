package okhttp3.internal.huc;

import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.lancet.network.C7118e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Handshake;

abstract class DelegatingHttpsURLConnection extends HttpsURLConnection {
    private final HttpURLConnection delegate;

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_addRequestProperty */
        static void m149826x5a2787bc(HttpURLConnection httpURLConnection, String str, String str2) {
            URLConnection uRLConnection = httpURLConnection;
            if (C7118e.m22232a(uRLConnection)) {
                C7116a.m22226a(uRLConnection.getURL(), str, str2, "");
            } else if (C7163a.m22363a()) {
                C7116a.m22230b(uRLConnection.getURL(), str, str2, "");
            }
            httpURLConnection.addRequestProperty(str, str2);
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_getInputStream */
        static InputStream m149827xff4d584d(HttpURLConnection httpURLConnection) throws IOException {
            URLConnection uRLConnection = httpURLConnection;
            if (C7118e.m22232a(uRLConnection)) {
                C7116a.m22226a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            } else if (C7163a.m22363a()) {
                C7116a.m22230b(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            }
            return httpURLConnection.getInputStream();
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_setRequestProperty */
        static void m149828x963129db(HttpURLConnection httpURLConnection, String str, String str2) {
            URLConnection uRLConnection = httpURLConnection;
            if (C7118e.m22232a(uRLConnection)) {
                C7116a.m22226a(uRLConnection.getURL(), str, str2, "");
            } else if (C7163a.m22363a()) {
                C7116a.m22230b(uRLConnection.getURL(), str, str2, "");
            }
            httpURLConnection.setRequestProperty(str, str2);
        }
    }

    public abstract HostnameVerifier getHostnameVerifier();

    public abstract SSLSocketFactory getSSLSocketFactory();

    /* access modifiers changed from: protected */
    public abstract Handshake handshake();

    public abstract void setHostnameVerifier(HostnameVerifier hostnameVerifier);

    public abstract void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory);

    public void disconnect() {
        this.delegate.disconnect();
    }

    public boolean getAllowUserInteraction() {
        return this.delegate.getAllowUserInteraction();
    }

    public int getConnectTimeout() {
        return this.delegate.getConnectTimeout();
    }

    public Object getContent() throws IOException {
        return this.delegate.getContent();
    }

    public String getContentEncoding() {
        return this.delegate.getContentEncoding();
    }

    public int getContentLength() {
        return this.delegate.getContentLength();
    }

    public long getContentLengthLong() {
        return this.delegate.getContentLengthLong();
    }

    public String getContentType() {
        return this.delegate.getContentType();
    }

    public long getDate() {
        return this.delegate.getDate();
    }

    public boolean getDefaultUseCaches() {
        return this.delegate.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.delegate.getDoInput();
    }

    public boolean getDoOutput() {
        return this.delegate.getDoOutput();
    }

    public InputStream getErrorStream() {
        return this.delegate.getErrorStream();
    }

    public long getExpiration() {
        return this.delegate.getExpiration();
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.delegate.getHeaderFields();
    }

    public long getIfModifiedSince() {
        return this.delegate.getIfModifiedSince();
    }

    public InputStream getInputStream() throws IOException {
        return _lancet.m149827xff4d584d(this.delegate);
    }

    public boolean getInstanceFollowRedirects() {
        return this.delegate.getInstanceFollowRedirects();
    }

    public long getLastModified() {
        return this.delegate.getLastModified();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.delegate.getOutputStream();
    }

    public Permission getPermission() throws IOException {
        return this.delegate.getPermission();
    }

    public int getReadTimeout() {
        return this.delegate.getReadTimeout();
    }

    public String getRequestMethod() {
        return this.delegate.getRequestMethod();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.delegate.getRequestProperties();
    }

    public int getResponseCode() throws IOException {
        return this.delegate.getResponseCode();
    }

    public String getResponseMessage() throws IOException {
        return this.delegate.getResponseMessage();
    }

    public URL getURL() {
        return this.delegate.getURL();
    }

    public boolean getUseCaches() {
        return this.delegate.getUseCaches();
    }

    public String toString() {
        return this.delegate.toString();
    }

    public boolean usingProxy() {
        return this.delegate.usingProxy();
    }

    public void connect() throws IOException {
        this.connected = true;
        this.delegate.connect();
    }

    public String getCipherSuite() {
        Handshake handshake = handshake();
        if (handshake != null) {
            return handshake.cipherSuite.javaName;
        }
        return null;
    }

    public Principal getLocalPrincipal() {
        Handshake handshake = handshake();
        if (handshake != null) {
            return handshake.localPrincipal();
        }
        return null;
    }

    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        Handshake handshake = handshake();
        if (handshake != null) {
            return handshake.peerPrincipal();
        }
        return null;
    }

    public Certificate[] getLocalCertificates() {
        Handshake handshake = handshake();
        if (handshake == null) {
            return null;
        }
        List<Certificate> list = handshake.localCertificates;
        if (!list.isEmpty()) {
            return (Certificate[]) list.toArray(new Certificate[list.size()]);
        }
        return null;
    }

    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        Handshake handshake = handshake();
        if (handshake == null) {
            return null;
        }
        List<Certificate> list = handshake.peerCertificates;
        if (!list.isEmpty()) {
            return (Certificate[]) list.toArray(new Certificate[list.size()]);
        }
        return null;
    }

    public String getHeaderField(int i) {
        return this.delegate.getHeaderField(i);
    }

    public String getHeaderFieldKey(int i) {
        return this.delegate.getHeaderFieldKey(i);
    }

    public String getRequestProperty(String str) {
        return this.delegate.getRequestProperty(str);
    }

    public void setAllowUserInteraction(boolean z) {
        this.delegate.setAllowUserInteraction(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.delegate.setChunkedStreamingMode(i);
    }

    public void setConnectTimeout(int i) {
        this.delegate.setConnectTimeout(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.delegate.setDefaultUseCaches(z);
    }

    public void setDoInput(boolean z) {
        this.delegate.setDoInput(z);
    }

    public void setDoOutput(boolean z) {
        this.delegate.setDoOutput(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.delegate.setFixedLengthStreamingMode(i);
    }

    public void setIfModifiedSince(long j) {
        this.delegate.setIfModifiedSince(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.delegate.setInstanceFollowRedirects(z);
    }

    public void setReadTimeout(int i) {
        this.delegate.setReadTimeout(i);
    }

    public void setRequestMethod(String str) throws ProtocolException {
        this.delegate.setRequestMethod(str);
    }

    public void setUseCaches(boolean z) {
        this.delegate.setUseCaches(z);
    }

    DelegatingHttpsURLConnection(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.delegate = httpURLConnection;
    }

    public Object getContent(Class[] clsArr) throws IOException {
        return this.delegate.getContent(clsArr);
    }

    public String getHeaderField(String str) {
        return this.delegate.getHeaderField(str);
    }

    public void setFixedLengthStreamingMode(long j) {
        this.delegate.setFixedLengthStreamingMode(j);
    }

    public void addRequestProperty(String str, String str2) {
        _lancet.m149826x5a2787bc(this.delegate, str, str2);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.delegate.getHeaderFieldDate(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.delegate.getHeaderFieldInt(str, i);
    }

    public long getHeaderFieldLong(String str, long j) {
        return this.delegate.getHeaderFieldLong(str, j);
    }

    public void setRequestProperty(String str, String str2) {
        _lancet.m149828x963129db(this.delegate, str, str2);
    }
}
