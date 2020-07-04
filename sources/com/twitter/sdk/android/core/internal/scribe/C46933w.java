package com.twitter.sdk.android.core.internal.scribe;

import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.w */
public final class C46933w {
    /* renamed from: a */
    public static C46931v m146802a(C46908e eVar, String str, long j, String str2, String str3, List<ScribeItem> list) {
        char c;
        String str4 = eVar.f120280a;
        if (str4.hashCode() == 114757 && str4.equals("tfw")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            C46899aa aaVar = new C46899aa(eVar, j, str2, str3, list);
            return aaVar;
        }
        C46901ab abVar = new C46901ab(eVar, str, j, str2, str3, list);
        return abVar;
    }
}
