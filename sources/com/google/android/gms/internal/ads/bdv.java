package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class bdv extends ayd<Integer, Long> {

    /* renamed from: a */
    public long f41740a;

    /* renamed from: b */
    public long f41741b;

    public bdv() {
        this.f41740a = -1;
        this.f41741b = -1;
    }

    public bdv(String str) {
        this();
        mo40302a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo40301a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.f41740a));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f41741b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40302a(String str) {
        HashMap b = m47755b(str);
        if (b != null) {
            this.f41740a = ((Long) b.get(Integer.valueOf(0))).longValue();
            this.f41741b = ((Long) b.get(Integer.valueOf(1))).longValue();
        }
    }
}
