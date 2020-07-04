package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bce extends bbg<bce> {

    /* renamed from: h */
    private static volatile bce[] f41422h;

    /* renamed from: c */
    public Integer f41423c;

    /* renamed from: d */
    public String f41424d;

    /* renamed from: e */
    public bca f41425e;

    /* renamed from: f */
    public Integer f41426f;

    /* renamed from: g */
    public String[] f41427g;

    /* renamed from: i */
    private bcc f41428i;

    /* renamed from: j */
    private Integer f41429j;

    /* renamed from: k */
    private int[] f41430k;

    /* renamed from: l */
    private String f41431l;

    /* renamed from: d */
    public static bce[] m48406d() {
        if (f41422h == null) {
            synchronized (bbk.f41370a) {
                if (f41422h == null) {
                    f41422h = new bce[0];
                }
            }
        }
        return f41422h;
    }

    public bce() {
        this.f41423c = null;
        this.f41424d = null;
        this.f41425e = null;
        this.f41428i = null;
        this.f41429j = null;
        this.f41430k = bbn.f41374a;
        this.f41431l = null;
        this.f41426f = null;
        this.f41427g = bbn.f41376c;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        bbf.mo40465a(1, this.f41423c.intValue());
        if (this.f41424d != null) {
            bbf.mo40468a(2, this.f41424d);
        }
        if (this.f41425e != null) {
            bbf.mo40467a(3, (bbl) this.f41425e);
        }
        if (this.f41430k != null && this.f41430k.length > 0) {
            for (int a : this.f41430k) {
                bbf.mo40465a(6, a);
            }
        }
        if (this.f41426f != null) {
            bbf.mo40465a(8, this.f41426f.intValue());
        }
        if (this.f41427g != null && this.f41427g.length > 0) {
            for (String str : this.f41427g) {
                if (str != null) {
                    bbf.mo40468a(9, str);
                }
            }
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a() + bbf.m48355b(1, this.f41423c.intValue());
        if (this.f41424d != null) {
            a += bbf.m48357b(2, this.f41424d);
        }
        if (this.f41425e != null) {
            a += bbf.m48356b(3, (bbl) this.f41425e);
        }
        if (this.f41430k != null && this.f41430k.length > 0) {
            int i = 0;
            for (int a2 : this.f41430k) {
                i += bbf.m48348a(a2);
            }
            a = a + i + (this.f41430k.length * 1);
        }
        if (this.f41426f != null) {
            a += bbf.m48355b(8, this.f41426f.intValue());
        }
        if (this.f41427g == null || this.f41427g.length <= 0) {
            return a;
        }
        int i2 = 0;
        int i3 = 0;
        for (String str : this.f41427g) {
            if (str != null) {
                i3++;
                i2 += bbf.m48350a(str);
            }
        }
        return a + i2 + (i3 * 1);
    }
}
