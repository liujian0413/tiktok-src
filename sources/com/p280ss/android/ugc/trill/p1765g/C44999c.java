package com.p280ss.android.ugc.trill.p1765g;

import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.trill.g.c */
final /* synthetic */ class C44999c {
    /* renamed from: a */
    private static final String m141975a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    /* renamed from: a */
    public static final String m141976a(String str, List<? extends Object> list) {
        boolean z;
        String str2;
        C7573i.m23587b(list, "list");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            String a = m141975a(next);
            sb.append(a);
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && i != list.size() - 1) {
                if (str == null) {
                    str2 = ",";
                } else {
                    str2 = str;
                }
                sb.append(str2);
            }
            i = i2;
        }
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "builder.toString()");
        return sb2;
    }
}
