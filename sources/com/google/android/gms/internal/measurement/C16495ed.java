package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ed */
public final class C16495ed extends C16679kp<C16495ed> {

    /* renamed from: c */
    private static volatile C16495ed[] f46170c;

    /* renamed from: a */
    public String f46171a;

    /* renamed from: b */
    public String f46172b;

    /* renamed from: a */
    public static C16495ed[] m53765a() {
        if (f46170c == null) {
            synchronized (C16683kt.f46606b) {
                if (f46170c == null) {
                    f46170c = new C16495ed[0];
                }
            }
        }
        return f46170c;
    }

    public C16495ed() {
        this.f46171a = null;
        this.f46172b = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16495ed)) {
            return false;
        }
        C16495ed edVar = (C16495ed) obj;
        if (this.f46171a == null) {
            if (edVar.f46171a != null) {
                return false;
            }
        } else if (!this.f46171a.equals(edVar.f46171a)) {
            return false;
        }
        if (this.f46172b == null) {
            if (edVar.f46172b != null) {
                return false;
            }
        } else if (!this.f46172b.equals(edVar.f46172b)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return edVar.f46593L == null || edVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(edVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f46171a == null ? 0 : this.f46171a.hashCode())) * 31) + (this.f46172b == null ? 0 : this.f46172b.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46171a != null) {
            koVar.mo43139a(1, this.f46171a);
        }
        if (this.f46172b != null) {
            koVar.mo43139a(2, this.f46172b);
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46171a != null) {
            b += C16678ko.m54761b(1, this.f46171a);
        }
        return this.f46172b != null ? b + C16678ko.m54761b(2, this.f46172b) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f46171a = kmVar.mo43122c();
            } else if (a == 18) {
                this.f46172b = kmVar.mo43122c();
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
