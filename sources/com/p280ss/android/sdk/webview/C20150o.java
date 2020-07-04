package com.p280ss.android.sdk.webview;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.sdk.webview.o */
public final class C20150o {

    /* renamed from: a */
    public final String f54527a;

    /* renamed from: b */
    public final String f54528b;

    /* renamed from: c */
    public String f54529c;

    /* renamed from: d */
    public long f54530d;

    /* renamed from: e */
    public final List<String> f54531e = new ArrayList();

    /* renamed from: f */
    public final List<String> f54532f = new ArrayList();

    /* renamed from: g */
    public final List<String> f54533g = new ArrayList();

    /* renamed from: a */
    public static String m66405a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    public C20150o(String str, String str2, String str3) {
        if (str2 == null) {
            str2 = "";
        }
        this.f54527a = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f54528b = str3;
        if (str == null) {
            str = "";
        }
        this.f54529c = str;
    }
}
