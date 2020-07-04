package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class beg extends ayd<Integer, Long> {

    /* renamed from: a */
    public Long f41757a;

    /* renamed from: b */
    public Long f41758b;

    public beg() {
    }

    public beg(String str) {
        mo40302a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40302a(String str) {
        HashMap b = m47755b(str);
        if (b != null) {
            this.f41757a = (Long) b.get(Integer.valueOf(0));
            this.f41758b = (Long) b.get(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo40301a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f41757a);
        hashMap.put(Integer.valueOf(1), this.f41758b);
        return hashMap;
    }
}
