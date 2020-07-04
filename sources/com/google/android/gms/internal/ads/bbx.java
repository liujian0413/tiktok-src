package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchm.zza.zzc;
import java.io.IOException;

public final class bbx extends bbg<bbx> {

    /* renamed from: c */
    public Integer f41391c;

    /* renamed from: d */
    public String f41392d;

    /* renamed from: e */
    public String f41393e;

    /* renamed from: f */
    public bby f41394f;

    /* renamed from: g */
    public bce[] f41395g;

    /* renamed from: h */
    public String f41396h;

    /* renamed from: i */
    public bcd f41397i;

    /* renamed from: j */
    public bcf f41398j;

    /* renamed from: k */
    public String[] f41399k;

    /* renamed from: l */
    public String[] f41400l;

    /* renamed from: m */
    private zzc f41401m;

    /* renamed from: n */
    private String f41402n;

    /* renamed from: o */
    private Boolean f41403o;

    /* renamed from: p */
    private String[] f41404p;

    /* renamed from: q */
    private String f41405q;

    /* renamed from: r */
    private Boolean f41406r;

    /* renamed from: s */
    private Boolean f41407s;

    /* renamed from: t */
    private byte[] f41408t;

    public bbx() {
        this.f41391c = null;
        this.f41401m = null;
        this.f41392d = null;
        this.f41393e = null;
        this.f41402n = null;
        this.f41394f = null;
        this.f41395g = bce.m48406d();
        this.f41396h = null;
        this.f41397i = null;
        this.f41403o = null;
        this.f41404p = bbn.f41376c;
        this.f41405q = null;
        this.f41406r = null;
        this.f41407s = null;
        this.f41408t = null;
        this.f41398j = null;
        this.f41399k = bbn.f41376c;
        this.f41400l = bbn.f41376c;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f41392d != null) {
            bbf.mo40468a(1, this.f41392d);
        }
        if (this.f41393e != null) {
            bbf.mo40468a(2, this.f41393e);
        }
        if (this.f41395g != null && this.f41395g.length > 0) {
            for (bce bce : this.f41395g) {
                if (bce != null) {
                    bbf.mo40467a(4, (bbl) bce);
                }
            }
        }
        if (this.f41404p != null && this.f41404p.length > 0) {
            for (String str : this.f41404p) {
                if (str != null) {
                    bbf.mo40468a(6, str);
                }
            }
        }
        if (this.f41391c != null) {
            bbf.mo40465a(10, this.f41391c.intValue());
        }
        if (this.f41394f != null) {
            bbf.mo40467a(12, (bbl) this.f41394f);
        }
        if (this.f41396h != null) {
            bbf.mo40468a(13, this.f41396h);
        }
        if (this.f41397i != null) {
            bbf.mo40467a(14, (bbl) this.f41397i);
        }
        if (this.f41398j != null) {
            bbf.mo40467a(17, (bbl) this.f41398j);
        }
        if (this.f41399k != null && this.f41399k.length > 0) {
            for (String str2 : this.f41399k) {
                if (str2 != null) {
                    bbf.mo40468a(20, str2);
                }
            }
        }
        if (this.f41400l != null && this.f41400l.length > 0) {
            for (String str3 : this.f41400l) {
                if (str3 != null) {
                    bbf.mo40468a(21, str3);
                }
            }
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        if (this.f41392d != null) {
            a += bbf.m48357b(1, this.f41392d);
        }
        if (this.f41393e != null) {
            a += bbf.m48357b(2, this.f41393e);
        }
        if (this.f41395g != null && this.f41395g.length > 0) {
            int i = a;
            for (bce bce : this.f41395g) {
                if (bce != null) {
                    i += bbf.m48356b(4, (bbl) bce);
                }
            }
            a = i;
        }
        if (this.f41404p != null && this.f41404p.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f41404p) {
                if (str != null) {
                    i3++;
                    i2 += bbf.m48350a(str);
                }
            }
            a = a + i2 + (i3 * 1);
        }
        if (this.f41391c != null) {
            a += bbf.m48355b(10, this.f41391c.intValue());
        }
        if (this.f41394f != null) {
            a += bbf.m48356b(12, (bbl) this.f41394f);
        }
        if (this.f41396h != null) {
            a += bbf.m48357b(13, this.f41396h);
        }
        if (this.f41397i != null) {
            a += bbf.m48356b(14, (bbl) this.f41397i);
        }
        if (this.f41398j != null) {
            a += bbf.m48356b(17, (bbl) this.f41398j);
        }
        if (this.f41399k != null && this.f41399k.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (String str2 : this.f41399k) {
                if (str2 != null) {
                    i5++;
                    i4 += bbf.m48350a(str2);
                }
            }
            a = a + i4 + (i5 * 2);
        }
        if (this.f41400l == null || this.f41400l.length <= 0) {
            return a;
        }
        int i6 = 0;
        int i7 = 0;
        for (String str3 : this.f41400l) {
            if (str3 != null) {
                i7++;
                i6 += bbf.m48350a(str3);
            }
        }
        return a + i6 + (i7 * 2);
    }
}
