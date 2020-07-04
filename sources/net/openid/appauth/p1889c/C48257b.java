package net.openid.appauth.p1889c;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.openid.appauth.C48280n;

/* renamed from: net.openid.appauth.c.b */
public final class C48257b {
    /* renamed from: a */
    public static Uri m149695a(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    /* renamed from: b */
    private static String m149700b(String str) {
        C48280n.m149788a(str);
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException("Unable to encode using UTF-8");
        }
    }

    /* renamed from: a */
    public static String m149697a(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(m149700b((String) entry.getValue()));
            arrayList.add(sb.toString());
        }
        return TextUtils.join("&", arrayList);
    }

    /* renamed from: a */
    public static Long m149696a(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return Long.valueOf(Long.parseLong(queryParameter));
        }
        return null;
    }

    /* renamed from: a */
    public static List<Bundle> m149698a(Uri[] uriArr, int i) {
        C48280n.m149791a(true, (Object) "startIndex must be positive");
        if (uriArr == null || uriArr.length <= 1) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(uriArr.length - 1);
        for (int i2 = 1; i2 < uriArr.length; i2++) {
            if (uriArr[i2] == null) {
                C48254a.m149689c("Null URI in possibleUris list - ignoring", new Object[0]);
            } else {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.otherurls.URL", uriArr[i2]);
                arrayList.add(bundle);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m149699a(Builder builder, String str, Object obj) {
        if (obj != null && obj.toString() != null) {
            builder.appendQueryParameter(str, obj.toString());
        }
    }
}
