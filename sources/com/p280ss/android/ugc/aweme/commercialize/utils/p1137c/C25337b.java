package com.p280ss.android.ugc.aweme.commercialize.utils.p1137c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25335c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.b */
public final class C25337b {

    /* renamed from: a */
    public static final C25337b f66727a = new C25337b();

    private C25337b() {
    }

    /* renamed from: a */
    public static final boolean m83261a(Context context) {
        if (context == null || GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m83265a(Uri uri) {
        C7573i.m23587b(uri, "uri");
        if (!C25371n.m83464a(uri)) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && uri.getQueryParameter("url") != null) {
            Uri parse = Uri.parse(uri.getQueryParameter("url"));
            C7573i.m23582a((Object) parse, "Uri.parse(uri.getQueryParameter(\"url\"))");
            if (TextUtils.equals(parse.getHost(), "play.app.goo.gl")) {
                return true;
            }
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(uri.getQueryParameter("id"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m83262a(Context context, Uri uri) {
        String str;
        if (context == null) {
            return false;
        }
        if (uri != null) {
            str = uri.getScheme();
        } else {
            str = null;
        }
        if ((!C7573i.m23585a((Object) str, (Object) "market")) || !m83261a(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        return C25371n.m83445a(context, intent);
    }

    /* renamed from: a */
    public static final boolean m83264a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!m83261a(context)) {
            return C25335c.m83259a(context, str);
        }
        StringBuilder sb = new StringBuilder("market://details?id=");
        sb.append(str);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        return C25371n.m83445a(context, intent);
    }

    /* renamed from: b */
    public static final boolean m83266b(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return m83263a(context, uri, "com.google.android.gms");
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && uri.getQueryParameter("url") != null) {
            Uri parse = Uri.parse(uri.getQueryParameter("url"));
            C7573i.m23582a((Object) parse, "Uri.parse(uri.getQueryParameter(\"url\"))");
            if (TextUtils.equals(parse.getHost(), "play.app.goo.gl")) {
                Uri parse2 = Uri.parse(uri.getQueryParameter("url"));
                C7573i.m23582a((Object) parse2, "Uri.parse(uri.getQueryParameter(\"url\"))");
                return m83263a(context, parse2, "com.google.android.gms");
            }
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(uri.getQueryParameter("id"))) {
            return false;
        }
        return m83263a(context, uri, "com.android.vending");
    }

    /* renamed from: a */
    private static final boolean m83263a(Context context, Uri uri, String str) {
        if (!m83261a(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(str);
        intent.setData(uri);
        intent.addFlags(268435456);
        return C25371n.m83445a(context, intent);
    }
}
