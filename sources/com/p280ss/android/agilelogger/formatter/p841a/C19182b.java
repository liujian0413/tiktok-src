package com.p280ss.android.agilelogger.formatter.p841a;

import com.p280ss.android.agilelogger.utils.C19209m;

/* renamed from: com.ss.android.agilelogger.formatter.a.b */
public final class C19182b implements C19181a {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo50910a(Object obj) {
        return m62888a((String[]) obj);
    }

    /* renamed from: a */
    private static String m62887a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 10);
        String[] split = str.split(C19209m.f51871a);
        int length = split.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(C19209m.f51871a);
            }
            String str2 = split[i];
            sb.append(9553);
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m62888a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                int i2 = i + 1;
                strArr2[i] = str;
                i = i2;
            }
        }
        if (i == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════════════════════════════════════════════════════════════");
        sb.append(C19209m.f51871a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(m62887a(strArr2[i3]));
            if (i3 != i - 1) {
                sb.append(C19209m.f51871a);
                sb.append("╟───────────────────────────────────────────────────────────────────────────────────────────────────");
                sb.append(C19209m.f51871a);
            } else {
                sb.append(C19209m.f51871a);
                sb.append("╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb.toString();
    }
}
