package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class bae extends ayd<Integer, Object> {

    /* renamed from: a */
    public String f41307a;

    /* renamed from: b */
    public long f41308b;

    /* renamed from: c */
    public String f41309c;

    /* renamed from: d */
    public String f41310d;

    /* renamed from: e */
    public String f41311e;

    public bae(String str) {
        this();
        mo40302a(str);
    }

    public bae() {
        this.f41307a = "E";
        this.f41308b = -1;
        this.f41309c = "E";
        this.f41310d = "E";
        this.f41311e = "E";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40302a(String str) {
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        HashMap b = m47755b(str);
        if (b != null) {
            if (b.get(Integer.valueOf(0)) == null) {
                str2 = "E";
            } else {
                str2 = (String) b.get(Integer.valueOf(0));
            }
            this.f41307a = str2;
            if (b.get(Integer.valueOf(1)) == null) {
                j = -1;
            } else {
                j = ((Long) b.get(Integer.valueOf(1))).longValue();
            }
            this.f41308b = j;
            if (b.get(Integer.valueOf(2)) == null) {
                str3 = "E";
            } else {
                str3 = (String) b.get(Integer.valueOf(2));
            }
            this.f41309c = str3;
            if (b.get(Integer.valueOf(3)) == null) {
                str4 = "E";
            } else {
                str4 = (String) b.get(Integer.valueOf(3));
            }
            this.f41310d = str4;
            if (b.get(Integer.valueOf(4)) == null) {
                str5 = "E";
            } else {
                str5 = (String) b.get(Integer.valueOf(4));
            }
            this.f41311e = str5;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo40301a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f41307a);
        hashMap.put(Integer.valueOf(4), this.f41311e);
        hashMap.put(Integer.valueOf(3), this.f41310d);
        hashMap.put(Integer.valueOf(2), this.f41309c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f41308b));
        return hashMap;
    }
}
