package com.p280ss.android.ugc.aweme.lancet;

import android.text.TextUtils;
import android.util.Patterns;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;

/* renamed from: com.ss.android.ugc.aweme.lancet.e */
public final class C32278e {
    /* renamed from: a */
    public static void m104800a(String str) {
        try {
            m104801b(str);
        } catch (Throwable th) {
            C2077a.m9161a(th, "H5UrlCheckLancet checkError");
        }
    }

    /* renamed from: b */
    private static void m104801b(String str) {
        boolean z;
        int i;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals("about:blank", str)) {
            if (!Patterns.WEB_URL.matcher(str).matches()) {
                C6877n.m21447a("h5_invalid_url", C6869c.m21381a().mo16887a("errorDesc", str).mo16888b());
                return;
            }
            int length = str.length();
            int i2 = 0;
            int i3 = 0;
            char c = '0';
            while (true) {
                z = true;
                if (i2 >= length) {
                    z = false;
                    break;
                }
                char charAt = str.charAt(i2);
                if (charAt == '?') {
                    i = 1;
                } else {
                    i = 0;
                }
                i3 += i;
                if (i3 > 1 || (charAt == c && (charAt == '&' || charAt == '?' || charAt == '='))) {
                    break;
                }
                i2++;
                c = charAt;
            }
            if (z) {
                C6877n.m21447a("h5_invalid_url", C6869c.m21381a().mo16887a("errorDesc", str).mo16888b());
            }
        }
    }
}
