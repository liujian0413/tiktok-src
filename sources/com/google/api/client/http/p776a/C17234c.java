package com.google.api.client.http.p776a;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.api.client.http.C17272u;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.policy.Policy;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.net.ProxySelector;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: com.google.api.client.http.a.c */
public final class C17234c extends C17272u {

    /* renamed from: b */
    public final HttpClient f48030b;

    /* renamed from: a */
    public final boolean mo44582a(String str) {
        return true;
    }

    public C17234c() {
        this(m57296c());
    }

    /* renamed from: c */
    private static DefaultHttpClient m57296c() {
        return m57294a(SSLSocketFactory.getSocketFactory(), m57297d(), ProxySelector.getDefault());
    }

    /* renamed from: d */
    private static HttpParams m57297d() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, VideoCacheReadBuffersizeExperiment.DEFAULT);
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, C34943c.f91127w);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(20));
        return basicHttpParams;
    }

    private C17234c(HttpClient httpClient) {
        this.f48030b = httpClient;
        HttpParams params = httpClient.getParams();
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        params.setBooleanParameter("http.protocol.handle-redirects", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C17232a mo44581a(String str, String str2) {
        HttpRequestBase httpRequestBase;
        if (str.equals(Policy.ACTION_DELETE)) {
            httpRequestBase = new HttpDelete(str2);
        } else if (str.equals("GET")) {
            httpRequestBase = new HttpGet(str2);
        } else if (str.equals("HEAD")) {
            httpRequestBase = new HttpHead(str2);
        } else if (str.equals("POST")) {
            httpRequestBase = new HttpPost(str2);
        } else if (str.equals("PUT")) {
            httpRequestBase = new HttpPut(str2);
        } else if (str.equals("TRACE")) {
            httpRequestBase = new HttpTrace(str2);
        } else if (str.equals("OPTIONS")) {
            httpRequestBase = new HttpOptions(str2);
        } else {
            httpRequestBase = new C17236e(str, str2);
        }
        return new C17232a(this.f48030b, httpRequestBase);
    }

    /* renamed from: a */
    private static DefaultHttpClient m57294a(SSLSocketFactory sSLSocketFactory, HttpParams httpParams, ProxySelector proxySelector) {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(WebKitApi.SCHEME_HTTP, PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(WebKitApi.SCHEME_HTTPS, sSLSocketFactory, 443));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(httpParams, schemeRegistry), httpParams);
        defaultHttpClient.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        if (proxySelector != null) {
            defaultHttpClient.setRoutePlanner(new ProxySelectorRoutePlanner(schemeRegistry, proxySelector));
        }
        return defaultHttpClient;
    }
}
