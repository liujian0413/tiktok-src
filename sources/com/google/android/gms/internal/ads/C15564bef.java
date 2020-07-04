package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.bef */
public final class C15564bef extends ayd<Integer, Object> {

    /* renamed from: a */
    public Long f41754a;

    /* renamed from: b */
    public Boolean f41755b;

    /* renamed from: c */
    public Boolean f41756c;

    public C15564bef() {
    }

    public C15564bef(String str) {
        mo40302a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40302a(String str) {
        HashMap b = m47755b(str);
        if (b != null) {
            this.f41754a = (Long) b.get(Integer.valueOf(0));
            this.f41755b = (Boolean) b.get(Integer.valueOf(1));
            this.f41756c = (Boolean) b.get(Integer.valueOf(2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo40301a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f41754a);
        hashMap.put(Integer.valueOf(1), this.f41755b);
        hashMap.put(Integer.valueOf(2), this.f41756c);
        return hashMap;
    }
}
