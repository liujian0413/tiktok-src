package com.facebook.cache.common;

import com.facebook.common.util.C13335b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.cache.common.b */
public final class C13266b {
    /* renamed from: c */
    private static String m38804c(C13265a aVar) throws UnsupportedEncodingException {
        return C13335b.m39028a(aVar.mo32489a().getBytes("UTF-8"));
    }

    /* renamed from: b */
    public static String m38803b(C13265a aVar) {
        try {
            if (aVar instanceof C13267c) {
                return m38804c((C13265a) ((C13267c) aVar).f35161a.get(0));
            }
            return m38804c(aVar);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static List<String> m38802a(C13265a aVar) {
        try {
            if (aVar instanceof C13267c) {
                List<C13265a> list = ((C13267c) aVar).f35161a;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(m38804c((C13265a) list.get(i)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(m38804c(aVar));
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
