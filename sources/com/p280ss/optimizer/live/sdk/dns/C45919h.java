package com.p280ss.optimizer.live.sdk.dns;

import com.p280ss.optimizer.live.sdk.dns.p1798a.C45911a;
import java.util.List;

/* renamed from: com.ss.optimizer.live.sdk.dns.h */
final class C45919h {

    /* renamed from: a */
    public final String f117378a;

    /* renamed from: b */
    public final List<C45911a> f117379b;

    /* renamed from: c */
    public final float f117380c;

    /* renamed from: d */
    public final float f117381d;

    C45919h(String str, List<C45911a> list, int i) {
        this.f117378a = str;
        this.f117379b = list;
        if (list == null || list.isEmpty()) {
            this.f117380c = 1.0f;
            this.f117381d = Float.MAX_VALUE;
            return;
        }
        this.f117380c = 1.0f - ((((float) list.size()) * 1.0f) / ((float) i));
        float f = 0.0f;
        for (C45911a aVar : list) {
            if (aVar != null) {
                f += aVar.f117366c;
            }
        }
        this.f117381d = f / ((float) list.size());
    }
}
