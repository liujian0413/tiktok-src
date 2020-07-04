package com.facebook.react.modules.network;

import android.os.Build.VERSION;
import com.facebook.common.p686c.C13286a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.TlsVersion;

public class OkHttpClientProvider {
    private static OkHttpClient sClient;
    private static OkHttpClientFactory sFactory;

    public static OkHttpClient getOkHttpClient() {
        if (sClient == null) {
            sClient = createClient();
        }
        return sClient;
    }

    public static OkHttpClient createClient() {
        if (sFactory != null) {
            return sFactory.createNewNetworkModuleClient();
        }
        return createClientBuilder().build();
    }

    public static Builder createClientBuilder() {
        return enableTls12OnPreLollipop(new Builder().connectTimeout(0, TimeUnit.MILLISECONDS).readTimeout(0, TimeUnit.MILLISECONDS).writeTimeout(0, TimeUnit.MILLISECONDS).cookieJar(new ReactCookieJarContainer()));
    }

    public static void replaceOkHttpClient(OkHttpClient okHttpClient) {
        sClient = okHttpClient;
    }

    public static void setOkHttpClientFactory(OkHttpClientFactory okHttpClientFactory) {
        sFactory = okHttpClientFactory;
    }

    public static Builder enableTls12OnPreLollipop(Builder builder) {
        if (VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19) {
            try {
                builder.sslSocketFactory(new TLSSocketFactory());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                C13286a.m38861c("OkHttpClientProvider", "Error while enabling TLS 1.2", (Throwable) e);
            }
        }
        return builder;
    }
}
