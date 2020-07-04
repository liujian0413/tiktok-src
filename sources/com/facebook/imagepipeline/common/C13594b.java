package com.facebook.imagepipeline.common;

import android.graphics.Bitmap.Config;
import com.C1642a;
import com.facebook.imagepipeline.decoder.C13629b;
import com.facebook.imagepipeline.p727n.C13834a;

/* renamed from: com.facebook.imagepipeline.common.b */
public final class C13594b {

    /* renamed from: l */
    private static final C13594b f36001l = m40004b().mo33151a();

    /* renamed from: a */
    public final int f36002a;

    /* renamed from: b */
    public final boolean f36003b;

    /* renamed from: c */
    public final int f36004c;

    /* renamed from: d */
    public final boolean f36005d;

    /* renamed from: e */
    public final boolean f36006e;

    /* renamed from: f */
    public final boolean f36007f;

    /* renamed from: g */
    public final boolean f36008g;

    /* renamed from: h */
    public final Config f36009h;

    /* renamed from: i */
    public final C13629b f36010i;

    /* renamed from: j */
    public final C13834a f36011j;

    /* renamed from: k */
    public final Object f36012k;

    /* renamed from: a */
    public static C13594b m40003a() {
        return f36001l;
    }

    /* renamed from: b */
    public static C13595c m40004b() {
        return new C13595c();
    }

    public final int hashCode() {
        int i;
        int ordinal = ((((((((((((this.f36002a * 31) + (this.f36003b ? 1 : 0)) * 31) + (this.f36005d ? 1 : 0)) * 31) + (this.f36006e ? 1 : 0)) * 31) + (this.f36007f ? 1 : 0)) * 31) + (this.f36008g ? 1 : 0)) * 31) + this.f36009h.ordinal()) * 31;
        int i2 = 0;
        if (this.f36010i != null) {
            i = this.f36010i.hashCode();
        } else {
            i = 0;
        }
        int i3 = (ordinal + i) * 31;
        if (this.f36011j != null) {
            i2 = this.f36011j.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return C1642a.m8035a(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s", new Object[]{Integer.valueOf(this.f36002a), Boolean.valueOf(this.f36003b), Boolean.valueOf(this.f36005d), Boolean.valueOf(this.f36006e), Boolean.valueOf(this.f36007f), Boolean.valueOf(this.f36008g), this.f36009h.name(), this.f36010i, this.f36011j});
    }

    public C13594b(C13595c cVar) {
        this.f36002a = cVar.f36013a;
        this.f36003b = cVar.f36014b;
        this.f36004c = cVar.f36015c;
        this.f36005d = cVar.f36016d;
        this.f36006e = cVar.f36017e;
        this.f36007f = cVar.f36018f;
        this.f36009h = cVar.f36020h;
        this.f36010i = cVar.f36021i;
        this.f36008g = cVar.f36019g;
        this.f36011j = cVar.f36022j;
        this.f36012k = cVar.f36023k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13594b bVar = (C13594b) obj;
        if (this.f36003b == bVar.f36003b && this.f36005d == bVar.f36005d && this.f36006e == bVar.f36006e && this.f36007f == bVar.f36007f && this.f36008g == bVar.f36008g && this.f36009h == bVar.f36009h && this.f36010i == bVar.f36010i && this.f36011j == bVar.f36011j) {
            return true;
        }
        return false;
    }
}
