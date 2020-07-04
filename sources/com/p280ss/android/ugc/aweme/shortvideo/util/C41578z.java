package com.p280ss.android.ugc.aweme.shortvideo.util;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.z */
public final class C41578z {
    /* renamed from: a */
    public static <T> List<T> m132409a(List<T> list, C17427g<T, Boolean> gVar) {
        C17439m.m57962a(list);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) gVar.mo44914b(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
