package com.p280ss.android.ugc.aweme.poi.nearby.p1465ui;

import com.p280ss.android.ugc.aweme.poi.model.feed.C35111a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.poi.nearby.ui.a */
public final class C35134a {

    /* renamed from: a */
    public static final C35134a f91901a = new C35134a();

    /* renamed from: b */
    private static HashMap<String, C35111a> f91902b = new HashMap<>();

    private C35134a() {
    }

    /* renamed from: a */
    public static String m113344a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('/');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m113345a(String str, C35111a aVar) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && aVar != null) {
            f91902b.put(str, aVar);
        }
    }
}
