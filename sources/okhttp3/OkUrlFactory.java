package okhttp3;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import okhttp3.internal.URLFilter;
import okhttp3.internal.huc.OkHttpURLConnection;
import okhttp3.internal.huc.OkHttpsURLConnection;

public final class OkUrlFactory implements Cloneable, URLStreamHandlerFactory {
    public OkHttpClient client;
    public URLFilter urlFilter;

    public final OkUrlFactory clone() {
        return new OkUrlFactory(this.client);
    }

    public final OkUrlFactory setClient(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
        return this;
    }

    public OkUrlFactory(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public final HttpURLConnection open(URL url) {
        return open(url, this.client.proxy);
    }

    public final URLStreamHandler createURLStreamHandler(final String str) {
        if (str.equals(WebKitApi.SCHEME_HTTP) || str.equals(WebKitApi.SCHEME_HTTPS)) {
            return new URLStreamHandler() {
                /* access modifiers changed from: protected */
                public int getDefaultPort() {
                    if (str.equals(WebKitApi.SCHEME_HTTP)) {
                        return 80;
                    }
                    if (str.equals(WebKitApi.SCHEME_HTTPS)) {
                        return 443;
                    }
                    throw new AssertionError();
                }

                /* access modifiers changed from: protected */
                public URLConnection openConnection(URL url) {
                    return OkUrlFactory.this.open(url);
                }

                /* access modifiers changed from: protected */
                public URLConnection openConnection(URL url, Proxy proxy) {
                    return OkUrlFactory.this.open(url, proxy);
                }
            };
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final HttpURLConnection open(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        OkHttpClient build = this.client.newBuilder().proxy(proxy).build();
        if (protocol.equals(WebKitApi.SCHEME_HTTP)) {
            return new OkHttpURLConnection(url, build, this.urlFilter);
        }
        if (protocol.equals(WebKitApi.SCHEME_HTTPS)) {
            return new OkHttpsURLConnection(url, build, this.urlFilter);
        }
        StringBuilder sb = new StringBuilder("Unexpected protocol: ");
        sb.append(protocol);
        throw new IllegalArgumentException(sb.toString());
    }
}
