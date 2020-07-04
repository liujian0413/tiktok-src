package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16505en;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.google.android.gms.tagmanager.bj */
final class C17019bj {
    /* renamed from: a */
    static C16990ai<C16505en> m56503a(C16990ai<C16505en> aiVar, int... iArr) {
        for (int i : iArr) {
            if (C17017bh.m56493c((C16505en) aiVar.f47607a) instanceof String) {
                if (i != 12) {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unsupported Value Escaping: ");
                    sb.append(i);
                } else {
                    aiVar = m56502a(aiVar);
                }
            }
        }
        return aiVar;
    }

    /* renamed from: a */
    private static String m56504a(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    /* renamed from: a */
    private static C16990ai<C16505en> m56502a(C16990ai<C16505en> aiVar) {
        try {
            return new C16990ai<>(C17017bh.m56489a((Object) m56504a(C17017bh.m56490a((C16505en) aiVar.f47607a))), aiVar.f47608b);
        } catch (UnsupportedEncodingException unused) {
            return aiVar;
        }
    }
}
