package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.C1642a;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25340d;
import java.net.URLEncoder;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bs */
public final class C25291bs {
    /* renamed from: a */
    public static void m83097a(Context context, String str) {
        C25340d.m83270a(str);
        C22912d.f60645e.mo59887a(context, m83096a(str, "trigger_by", "splash"), (String) null);
    }

    /* renamed from: a */
    private static String m83096a(String str, String str2, String str3) {
        String str4;
        String str5 = "%s%s%s=%s";
        Object[] objArr = new Object[4];
        objArr[0] = str;
        if (str.contains("?")) {
            str4 = "&";
        } else {
            str4 = "?";
        }
        objArr[1] = str4;
        objArr[2] = URLEncoder.encode(str2);
        objArr[3] = URLEncoder.encode(str3);
        return C1642a.m8034a(str5, objArr);
    }
}
