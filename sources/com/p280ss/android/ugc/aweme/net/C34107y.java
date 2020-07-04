package com.p280ss.android.ugc.aweme.net;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.retrofit2.p637a.C12461b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;

/* renamed from: com.ss.android.ugc.aweme.net.y */
public final class C34107y {
    /* renamed from: a */
    public static List<C12461b> m109783a(Headers headers) {
        if (headers == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : headers.names()) {
            arrayList.add(new C12461b(str, headers.get(str)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Headers m109784a(List<C12461b> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C12461b bVar : list) {
            hashMap.put(bVar.f33095a, bVar.f33096b);
        }
        return Headers.m23791of((Map<String, String>) hashMap);
    }
}
