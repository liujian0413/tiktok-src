package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22988e;
import java.net.URLDecoder;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.j */
public final class C22997j {

    /* renamed from: a */
    private C22988e f60776a;

    public C22997j(C22988e eVar) {
        this.f60776a = eVar;
    }

    /* renamed from: a */
    public final Uri mo59987a(Activity activity, Uri uri) {
        boolean z;
        String queryParameter = uri.getQueryParameter("gd_label");
        String queryParameter2 = uri.getQueryParameter("params_url");
        String queryParameter3 = uri.getQueryParameter("utm_source");
        Intent intent = activity.getIntent();
        if (intent == null || !intent.hasExtra("al_applink_data")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f60776a.mo59977a("link_direct");
            this.f60776a.mo59978b("fb");
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            this.f60776a.mo59977a(queryParameter);
        }
        if (!TextUtils.isEmpty(queryParameter3)) {
            this.f60776a.mo59980d(queryParameter3);
        }
        if (TextUtils.isEmpty(queryParameter2)) {
            return uri;
        }
        return m75639a(uri, "params_url", URLDecoder.decode(queryParameter2));
    }

    /* renamed from: a */
    private static Uri m75639a(Uri uri, String str, String str2) {
        String str3;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str4 : queryParameterNames) {
            if (str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = uri.getQueryParameter(str4);
            }
            clearQuery.appendQueryParameter(str4, str3);
        }
        return clearQuery.build();
    }
}
