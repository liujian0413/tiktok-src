package net.openid.appauth.p1888b;

import android.net.Uri;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.C48280n;

/* renamed from: net.openid.appauth.b.b */
public final class C48252b implements C48251a {

    /* renamed from: a */
    public static final C48252b f123236a = new C48252b();

    /* renamed from: b */
    private static final int f123237b = ((int) TimeUnit.SECONDS.toMillis(15));

    /* renamed from: c */
    private static final int f123238c = ((int) TimeUnit.SECONDS.toMillis(10));

    private C48252b() {
    }

    /* renamed from: a */
    public final HttpURLConnection mo120621a(Uri uri) throws IOException {
        C48280n.m149789a(uri, (Object) "url must not be null");
        C48280n.m149791a(WebKitApi.SCHEME_HTTPS.equals(uri.getScheme()), (Object) "only https connections are permitted");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(f123237b);
        httpURLConnection.setReadTimeout(f123238c);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
