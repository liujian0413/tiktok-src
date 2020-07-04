package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class ber extends ayd<Integer, Long> {

    /* renamed from: a */
    public Long f41801a;

    /* renamed from: b */
    public Long f41802b;

    /* renamed from: c */
    public Long f41803c;

    /* renamed from: d */
    public Long f41804d;

    public ber() {
    }

    public ber(String str) {
        mo40302a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40302a(String str) {
        HashMap b = m47755b(str);
        if (b != null) {
            this.f41801a = (Long) b.get(Integer.valueOf(0));
            this.f41802b = (Long) b.get(Integer.valueOf(1));
            this.f41803c = (Long) b.get(Integer.valueOf(2));
            this.f41804d = (Long) b.get(Integer.valueOf(3));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo40301a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f41801a);
        hashMap.put(Integer.valueOf(1), this.f41802b);
        hashMap.put(Integer.valueOf(2), this.f41803c);
        hashMap.put(Integer.valueOf(3), this.f41804d);
        return hashMap;
    }
}
