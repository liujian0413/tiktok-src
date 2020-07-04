package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
public final class abd {
    /* renamed from: a */
    public static String m45356a(String str, Context context, boolean z) {
        if ((((Boolean) bym.m50299d().mo41272a(C15585bw.f43796aq)).booleanValue() && !z) || !C14793ay.m42913s().mo39043a(context) || TextUtils.isEmpty(str)) {
            return str;
        }
        String e = C14793ay.m42913s().mo39050e(context);
        if (e == null) {
            return str;
        }
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43788ai)).booleanValue()) {
            String str2 = (String) bym.m50299d().mo41272a(C15585bw.f43789aj);
            if (str.contains(str2)) {
                if (C14793ay.m42895a().mo39180d(str)) {
                    C14793ay.m42913s().mo39049d(context, e);
                    return str.replace(str2, e);
                } else if (C14793ay.m42895a().mo39181e(str)) {
                    C14793ay.m42913s().mo39051e(context, e);
                    return str.replace(str2, e);
                }
            }
        } else if (!str.contains("fbs_aeid")) {
            if (C14793ay.m42895a().mo39180d(str)) {
                C14793ay.m42913s().mo39049d(context, e);
                return m45353a(str, "fbs_aeid", e).toString();
            } else if (C14793ay.m42895a().mo39181e(str)) {
                C14793ay.m42913s().mo39051e(context, e);
                return m45353a(str, "fbs_aeid", e).toString();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m45355a(String str, Context context) {
        if (!C14793ay.m42913s().mo39043a(context) || TextUtils.isEmpty(str)) {
            return str;
        }
        String e = C14793ay.m42913s().mo39050e(context);
        if (e == null || !C14793ay.m42895a().mo39181e(str)) {
            return str;
        }
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43788ai)).booleanValue()) {
            String str2 = (String) bym.m50299d().mo41272a(C15585bw.f43789aj);
            if (str.contains(str2)) {
                return str.replace(str2, e);
            }
        } else if (!str.contains("fbs_aeid")) {
            return m45353a(str, "fbs_aeid", e).toString();
        }
        return str;
    }

    /* renamed from: a */
    public static String m45354a(Uri uri, Context context) {
        if (!C14793ay.m42913s().mo39043a(context)) {
            return uri.toString();
        }
        String e = C14793ay.m42913s().mo39050e(context);
        if (e == null) {
            return uri.toString();
        }
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43788ai)).booleanValue()) {
            String str = (String) bym.m50299d().mo41272a(C15585bw.f43789aj);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                C14793ay.m42913s().mo39049d(context, e);
                return uri2.replace(str, e);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = m45353a(uri.toString(), "fbs_aeid", e);
            C14793ay.m42913s().mo39049d(context, e);
        }
        return uri.toString();
    }

    /* renamed from: a */
    private static Uri m45353a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        sb.append(str2);
        sb.append("=");
        sb.append(str3);
        sb.append("&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }
}
