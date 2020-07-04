package com.twitter.sdk.android.tweetui;

import android.net.Uri;
import android.text.TextUtils;
import com.C1642a;
import com.twitter.sdk.android.core.models.C46959o;
import java.util.Locale;

/* renamed from: com.twitter.sdk.android.tweetui.ar */
public final class C47030ar {
    /* renamed from: b */
    static C46959o m147049b(C46959o oVar) {
        if (oVar == null || oVar.f120451y == null) {
            return oVar;
        }
        return oVar.f120451y;
    }

    /* renamed from: c */
    static String m147051c(String str) {
        return C1642a.m8035a(Locale.US, "https://twitter.com/search?q=%%24%s&ref_src=twsrc%%5Etwitterkit", new Object[]{str});
    }

    /* renamed from: a */
    static boolean m147048a(C46959o oVar) {
        if (oVar == null || oVar.f120435i <= 0 || oVar.f120422D == null || TextUtils.isEmpty(oVar.f120422D.screenName)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static String m147050b(String str) {
        return C1642a.m8035a(Locale.US, "https://twitter.com/hashtag/%s?ref_src=twsrc%%5Etwitterkit", new Object[]{str});
    }

    /* renamed from: c */
    static boolean m147052c(C46959o oVar) {
        if (oVar.f120448v != null && oVar.f120426H == null && (oVar.f120430d == null || oVar.f120430d.f120490d == null || oVar.f120430d.f120490d.isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m147047a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C1642a.m8035a(Locale.US, "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit", new Object[]{"twitter_unknown"});
        }
        return C1642a.m8035a(Locale.US, "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit", new Object[]{str});
    }

    /* renamed from: a */
    static Uri m147046a(String str, long j) {
        String str2;
        if (j <= 0) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = C1642a.m8035a(Locale.US, "https://twitter.com/%s/status/%d?ref_src=twsrc%%5Etwitterkit", new Object[]{"twitter_unknown", Long.valueOf(j)});
        } else {
            str2 = C1642a.m8035a(Locale.US, "https://twitter.com/%s/status/%d?ref_src=twsrc%%5Etwitterkit", new Object[]{str, Long.valueOf(j)});
        }
        return Uri.parse(str2);
    }
}
