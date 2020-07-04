package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.p122a.C2369b;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.user.l */
public class C2380l implements C2369b {
    @C6593c(mo15949a = "diamond_icon")

    /* renamed from: a */
    public ImageModel f7834a;
    @C6593c(mo15949a = "icon")

    /* renamed from: b */
    public ImageModel f7835b;
    @C6593c(mo15949a = "next_icon")

    /* renamed from: c */
    public ImageModel f7836c;
    @C6593c(mo15949a = "next_name")

    /* renamed from: d */
    public String f7837d;
    @C6593c(mo15949a = "name")

    /* renamed from: e */
    public String f7838e;
    @C6593c(mo15949a = "total_diamond_count")

    /* renamed from: f */
    public long f7839f;
    @C6593c(mo15949a = "now_diamond")

    /* renamed from: g */
    public long f7840g;
    @C6593c(mo15949a = "next_diamond")

    /* renamed from: h */
    public long f7841h;
    @C6593c(mo15949a = "im_icon")

    /* renamed from: i */
    public ImageModel f7842i;
    @C6593c(mo15949a = "im_icon_with_level")

    /* renamed from: j */
    public ImageModel f7843j;
    @C6593c(mo15949a = "new_im_icon_with_level")

    /* renamed from: k */
    public ImageModel f7844k;
    @C6593c(mo15949a = "live_icon")

    /* renamed from: l */
    public ImageModel f7845l;
    @C6593c(mo15949a = "new_live_icon")

    /* renamed from: m */
    public ImageModel f7846m;
    @C6593c(mo15949a = "level")

    /* renamed from: n */
    public int f7847n;
    @C6593c(mo15949a = "grade_icon_list")

    /* renamed from: o */
    public List<C2376h> f7848o;
    @C6593c(mo15949a = "grade_describe")

    /* renamed from: p */
    public String f7849p;
    @C6593c(mo15949a = "this_grade_max_diamond")

    /* renamed from: q */
    public long f7850q;
    @C6593c(mo15949a = "this_grade_min_diamond")

    /* renamed from: r */
    public long f7851r;
    @C6593c(mo15949a = "background")

    /* renamed from: s */
    public ImageModel f7852s;
    @C6593c(mo15949a = "background_back")

    /* renamed from: t */
    public ImageModel f7853t;
    @C6593c(mo15949a = "upgrade_need_consume")

    /* renamed from: u */
    long f7854u;
    @C6593c(mo15949a = "grade_banner")

    /* renamed from: v */
    String f7855v;
    @C6593c(mo15949a = "pay_diamond_bak")

    /* renamed from: w */
    long f7856w;
    @C6593c(mo15949a = "next_privileges")

    /* renamed from: x */
    String f7857x;
    @C6593c(mo15949a = "score")

    /* renamed from: y */
    long f7858y;
    @C6593c(mo15949a = "screen_chat_type")

    /* renamed from: z */
    long f7859z;

    /* renamed from: a */
    public final long mo8730a() {
        return this.f7858y;
    }

    /* renamed from: b */
    public final ImageModel mo8698b() {
        return this.f7834a;
    }

    /* renamed from: c */
    public final ImageModel mo8699c() {
        return this.f7835b;
    }

    /* renamed from: d */
    public final ImageModel mo8700d() {
        return this.f7836c;
    }

    /* renamed from: e */
    public final String mo8701e() {
        return this.f7837d;
    }

    /* renamed from: f */
    public final String mo8702f() {
        return this.f7838e;
    }

    /* renamed from: g */
    public final long mo8703g() {
        return this.f7839f;
    }

    /* renamed from: h */
    public final long mo8704h() {
        return this.f7840g;
    }

    /* renamed from: i */
    public final long mo8705i() {
        return this.f7841h;
    }

    /* renamed from: j */
    public final ImageModel mo8706j() {
        return this.f7842i;
    }

    /* renamed from: m */
    public final ImageModel mo8709m() {
        return this.f7843j;
    }

    /* renamed from: n */
    public final int mo8710n() {
        return this.f7847n;
    }

    /* renamed from: o */
    public final ImageModel mo8711o() {
        return this.f7845l;
    }

    /* renamed from: p */
    public final List<C2376h> mo8712p() {
        return this.f7848o;
    }

    /* renamed from: q */
    public final String mo8713q() {
        return this.f7849p;
    }

    /* renamed from: r */
    public final long mo8714r() {
        return this.f7850q;
    }

    /* renamed from: s */
    public final long mo8715s() {
        return this.f7851r;
    }

    /* renamed from: t */
    public final ImageModel mo8716t() {
        return this.f7852s;
    }

    /* renamed from: u */
    public final ImageModel mo8717u() {
        return this.f7853t;
    }

    /* renamed from: k */
    public final ImageModel mo8707k() {
        if (this.f7844k != null) {
            return this.f7844k;
        }
        return this.f7843j;
    }

    /* renamed from: l */
    public final ImageModel mo8708l() {
        if (this.f7846m != null) {
            return this.f7846m;
        }
        return this.f7845l;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (this.f7834a != null) {
            i = this.f7834a.hashCode();
        } else {
            i = 0;
        }
        int i15 = i * 31;
        if (this.f7835b != null) {
            i2 = this.f7835b.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        if (this.f7836c != null) {
            i3 = this.f7836c.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        if (this.f7837d != null) {
            i4 = this.f7837d.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        if (this.f7838e != null) {
            i5 = this.f7838e.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (((((((i18 + i5) * 31) + ((int) (this.f7839f ^ (this.f7839f >>> 32)))) * 31) + ((int) (this.f7840g ^ (this.f7840g >>> 32)))) * 31) + ((int) (this.f7841h ^ (this.f7841h >>> 32)))) * 31;
        if (this.f7842i != null) {
            i6 = this.f7842i.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 31;
        if (this.f7843j != null) {
            i7 = this.f7843j.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        if (this.f7844k != null) {
            i8 = this.f7844k.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        if (this.f7845l != null) {
            i9 = this.f7845l.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        if (this.f7846m != null) {
            i10 = this.f7846m.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (((i23 + i10) * 31) + this.f7847n) * 31;
        if (this.f7848o != null) {
            i11 = this.f7848o.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 31;
        if (this.f7849p != null) {
            i12 = this.f7849p.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (((((i25 + i12) * 31) + ((int) (this.f7850q ^ (this.f7850q >>> 32)))) * 31) + ((int) (this.f7851r ^ (this.f7851r >>> 32)))) * 31;
        if (this.f7852s != null) {
            i13 = this.f7852s.hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (i26 + i13) * 31;
        if (this.f7853t != null) {
            i14 = this.f7853t.hashCode();
        }
        return i27 + i14;
    }

    /* renamed from: a */
    public static C2380l m10018a(C2369b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof C2380l) {
            C6600e a = C2317a.m9932a();
            return (C2380l) a.mo15974a(a.mo15979b((Object) bVar), C2380l.class);
        }
        C2380l lVar = new C2380l();
        lVar.m10019b(bVar);
        return lVar;
    }

    /* renamed from: b */
    private void m10019b(C2369b bVar) {
        ArrayList arrayList;
        this.f7834a = bVar.mo8698b();
        this.f7835b = bVar.mo8699c();
        this.f7836c = bVar.mo8700d();
        this.f7837d = bVar.mo8701e();
        this.f7838e = bVar.mo8702f();
        this.f7839f = bVar.mo8703g();
        this.f7840g = bVar.mo8704h();
        this.f7841h = bVar.mo8705i();
        this.f7842i = bVar.mo8706j();
        this.f7843j = bVar.mo8709m();
        this.f7844k = bVar.mo8707k();
        this.f7847n = bVar.mo8710n();
        this.f7845l = bVar.mo8711o();
        this.f7846m = bVar.mo8708l();
        if (bVar.mo8712p() != null) {
            arrayList = new ArrayList(bVar.mo8712p());
        } else {
            arrayList = null;
        }
        this.f7848o = arrayList;
        this.f7849p = bVar.mo8713q();
        this.f7850q = bVar.mo8714r();
        this.f7851r = bVar.mo8715s();
        this.f7852s = bVar.mo8716t();
        this.f7853t = bVar.mo8717u();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2380l lVar = (C2380l) obj;
        if (this.f7839f != lVar.f7839f || this.f7840g != lVar.f7840g || this.f7841h != lVar.f7841h || this.f7847n != lVar.f7847n) {
            return false;
        }
        if (this.f7834a == null ? lVar.f7834a != null : !this.f7834a.equals(lVar.f7834a)) {
            return false;
        }
        if (this.f7835b == null ? lVar.f7835b != null : !this.f7835b.equals(lVar.f7835b)) {
            return false;
        }
        if (this.f7836c == null ? lVar.f7836c != null : !this.f7836c.equals(lVar.f7836c)) {
            return false;
        }
        if (this.f7837d == null ? lVar.f7837d != null : !this.f7837d.equals(lVar.f7837d)) {
            return false;
        }
        if (this.f7838e == null ? lVar.f7838e != null : !this.f7838e.equals(lVar.f7838e)) {
            return false;
        }
        if (this.f7842i == null ? lVar.f7842i != null : !this.f7842i.equals(lVar.f7842i)) {
            return false;
        }
        if (this.f7843j == null ? lVar.f7843j != null : !this.f7843j.equals(lVar.f7843j)) {
            return false;
        }
        if (this.f7844k == null ? lVar.f7844k != null : !this.f7844k.equals(lVar.f7844k)) {
            return false;
        }
        if (this.f7845l == null ? lVar.f7845l != null : !this.f7845l.equals(lVar.f7845l)) {
            return false;
        }
        if (this.f7846m == null ? lVar.f7846m != null : !this.f7846m.equals(lVar.f7846m)) {
            return false;
        }
        if (this.f7848o == null ? lVar.f7848o != null : !this.f7848o.equals(lVar.f7848o)) {
            return false;
        }
        if (this.f7851r != lVar.f7851r || this.f7850q != lVar.f7850q) {
            return false;
        }
        if (this.f7852s == null ? lVar.f7852s != null : !this.f7852s.equals(lVar.f7852s)) {
            return false;
        }
        if (this.f7853t == null ? lVar.f7853t != null : !this.f7853t.equals(lVar.f7853t)) {
            return false;
        }
        if (this.f7849p != null) {
            return this.f7849p.equals(lVar.f7849p);
        }
        if (lVar.f7849p == null) {
            return true;
        }
        return false;
    }
}
