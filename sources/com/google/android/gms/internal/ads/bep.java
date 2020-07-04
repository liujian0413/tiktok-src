package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class bep extends ayd<Integer, Long> {

    /* renamed from: a */
    public Long f41789a;

    /* renamed from: b */
    public Long f41790b;

    /* renamed from: c */
    public Long f41791c;

    /* renamed from: d */
    public Long f41792d;

    /* renamed from: e */
    public Long f41793e;

    /* renamed from: f */
    public Long f41794f;

    /* renamed from: g */
    public Long f41795g;

    /* renamed from: h */
    public Long f41796h;

    /* renamed from: i */
    public Long f41797i;

    /* renamed from: j */
    public Long f41798j;

    /* renamed from: k */
    public Long f41799k;

    public bep() {
    }

    public bep(String str) {
        mo40302a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40302a(String str) {
        HashMap b = m47755b(str);
        if (b != null) {
            this.f41789a = (Long) b.get(Integer.valueOf(0));
            this.f41790b = (Long) b.get(Integer.valueOf(1));
            this.f41791c = (Long) b.get(Integer.valueOf(2));
            this.f41792d = (Long) b.get(Integer.valueOf(3));
            this.f41793e = (Long) b.get(Integer.valueOf(4));
            this.f41794f = (Long) b.get(Integer.valueOf(5));
            this.f41795g = (Long) b.get(Integer.valueOf(6));
            this.f41796h = (Long) b.get(Integer.valueOf(7));
            this.f41797i = (Long) b.get(Integer.valueOf(8));
            this.f41798j = (Long) b.get(Integer.valueOf(9));
            this.f41799k = (Long) b.get(Integer.valueOf(10));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo40301a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f41789a);
        hashMap.put(Integer.valueOf(1), this.f41790b);
        hashMap.put(Integer.valueOf(2), this.f41791c);
        hashMap.put(Integer.valueOf(3), this.f41792d);
        hashMap.put(Integer.valueOf(4), this.f41793e);
        hashMap.put(Integer.valueOf(5), this.f41794f);
        hashMap.put(Integer.valueOf(6), this.f41795g);
        hashMap.put(Integer.valueOf(7), this.f41796h);
        hashMap.put(Integer.valueOf(8), this.f41797i);
        hashMap.put(Integer.valueOf(9), this.f41798j);
        hashMap.put(Integer.valueOf(10), this.f41799k);
        return hashMap;
    }
}
