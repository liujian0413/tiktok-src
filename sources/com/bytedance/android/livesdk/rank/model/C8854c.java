package com.bytedance.android.livesdk.rank.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.rank.model.c */
public class C8854c {

    /* renamed from: a */
    public List<C8857f> f24091a;

    /* renamed from: b */
    public String f24092b;

    /* renamed from: c */
    public int f24093c;

    /* renamed from: a */
    public static C8854c m26483a(C8852a aVar) {
        if (aVar == null) {
            return null;
        }
        List<C8857f> list = aVar.f24070c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        C8854c cVar = new C8854c();
        cVar.f24091a = new ArrayList(list);
        cVar.f24092b = aVar.f24081n;
        return cVar;
    }
}
