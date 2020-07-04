package shark;

import kotlin.jvm.internal.C7573i;
import shark.C48747i.C48752c;
import shark.C48862x.C48863a;
import shark.C48862x.C48869g;
import shark.C48862x.C48870h;
import shark.C48862x.C48871i;

/* renamed from: shark.k */
public final class C48812k {

    /* renamed from: a */
    public final C48746h f124082a;

    /* renamed from: b */
    public final C48862x f124083b;

    /* renamed from: a */
    public final Boolean mo123576a() {
        if (this.f124083b instanceof C48863a) {
            return Boolean.valueOf(((C48863a) this.f124083b).f124220b);
        }
        return null;
    }

    /* renamed from: b */
    public final Integer mo123577b() {
        if (this.f124083b instanceof C48869g) {
            return Integer.valueOf(((C48869g) this.f124083b).f124225b);
        }
        return null;
    }

    /* renamed from: c */
    public final Long mo123578c() {
        if (this.f124083b instanceof C48870h) {
            return Long.valueOf(((C48870h) this.f124083b).f124226b);
        }
        return null;
    }

    /* renamed from: d */
    public final Long mo123579d() {
        if (this.f124083b instanceof C48871i) {
            return Long.valueOf(((C48871i) this.f124083b).f124227b);
        }
        return null;
    }

    /* renamed from: e */
    public final Long mo123580e() {
        if (!(this.f124083b instanceof C48871i) || ((C48871i) this.f124083b).mo123634a()) {
            return null;
        }
        return Long.valueOf(((C48871i) this.f124083b).f124227b);
    }

    /* renamed from: f */
    public final boolean mo123581f() {
        if (!(this.f124083b instanceof C48871i) || !((C48871i) this.f124083b).mo123634a()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo123582g() {
        if (!(this.f124083b instanceof C48871i) || ((C48871i) this.f124083b).mo123634a()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final C48747i mo123583h() {
        if (!(this.f124083b instanceof C48871i) || ((C48871i) this.f124083b).mo123634a()) {
            return null;
        }
        return this.f124082a.mo123471a(((C48871i) this.f124083b).f124227b);
    }

    /* renamed from: i */
    public final String mo123584i() {
        C48747i h = mo123583h();
        if (h != null) {
            C48752c d = h.mo123480d();
            if (d != null) {
                return d.mo123500k();
            }
        }
        return null;
    }

    public C48812k(C48746h hVar, C48862x xVar) {
        C7573i.m23587b(hVar, "graph");
        C7573i.m23587b(xVar, "holder");
        this.f124082a = hVar;
        this.f124083b = xVar;
    }
}
