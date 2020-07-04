package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ef */
public final class C16497ef extends C16679kp<C16497ef> {

    /* renamed from: c */
    private static volatile C16497ef[] f46178c;

    /* renamed from: a */
    public Integer f46179a;

    /* renamed from: b */
    public Long f46180b;

    /* renamed from: a */
    public static C16497ef[] m53773a() {
        if (f46178c == null) {
            synchronized (C16683kt.f46606b) {
                if (f46178c == null) {
                    f46178c = new C16497ef[0];
                }
            }
        }
        return f46178c;
    }

    public C16497ef() {
        this.f46179a = null;
        this.f46180b = null;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16497ef)) {
            return false;
        }
        C16497ef efVar = (C16497ef) obj;
        if (this.f46179a == null) {
            if (efVar.f46179a != null) {
                return false;
            }
        } else if (!this.f46179a.equals(efVar.f46179a)) {
            return false;
        }
        if (this.f46180b == null) {
            if (efVar.f46180b != null) {
                return false;
            }
        } else if (!this.f46180b.equals(efVar.f46180b)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return efVar.f46593L == null || efVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(efVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f46179a == null ? 0 : this.f46179a.hashCode())) * 31) + (this.f46180b == null ? 0 : this.f46180b.hashCode())) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46179a != null) {
            koVar.mo43135a(1, this.f46179a.intValue());
        }
        if (this.f46180b != null) {
            koVar.mo43142b(2, this.f46180b.longValue());
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46179a != null) {
            b += C16678ko.m54759b(1, this.f46179a.intValue());
        }
        return this.f46180b != null ? b + C16678ko.m54764c(2, this.f46180b.longValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46179a = Integer.valueOf(kmVar.mo43124d());
            } else if (a == 16) {
                this.f46180b = Long.valueOf(kmVar.mo43126e());
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
