package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.el */
public final class C16503el extends C16679kp<C16503el> {

    /* renamed from: c */
    private static volatile C16503el[] f46240c;

    /* renamed from: a */
    public Integer f46241a;

    /* renamed from: b */
    public long[] f46242b;

    /* renamed from: a */
    public static C16503el[] m53795a() {
        if (f46240c == null) {
            synchronized (C16683kt.f46606b) {
                if (f46240c == null) {
                    f46240c = new C16503el[0];
                }
            }
        }
        return f46240c;
    }

    public C16503el() {
        this.f46241a = null;
        this.f46242b = C16687kx.f46612b;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16503el)) {
            return false;
        }
        C16503el elVar = (C16503el) obj;
        if (this.f46241a == null) {
            if (elVar.f46241a != null) {
                return false;
            }
        } else if (!this.f46241a.equals(elVar.f46241a)) {
            return false;
        }
        if (!C16683kt.m54805a(this.f46242b, elVar.f46242b)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return elVar.f46593L == null || elVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(elVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f46241a == null ? 0 : this.f46241a.hashCode())) * 31) + C16683kt.m54801a(this.f46242b)) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46241a != null) {
            koVar.mo43135a(1, this.f46241a.intValue());
        }
        if (this.f46242b != null && this.f46242b.length > 0) {
            for (long b : this.f46242b) {
                koVar.mo43142b(2, b);
            }
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46241a != null) {
            b += C16678ko.m54759b(1, this.f46241a.intValue());
        }
        if (this.f46242b == null || this.f46242b.length <= 0) {
            return b;
        }
        int i = 0;
        for (long a : this.f46242b) {
            i += C16678ko.m54752a(a);
        }
        return b + i + (this.f46242b.length * 1);
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46241a = Integer.valueOf(kmVar.mo43124d());
            } else if (a == 16) {
                int a2 = C16687kx.m54816a(kmVar, 16);
                int length = this.f46242b == null ? 0 : this.f46242b.length;
                long[] jArr = new long[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46242b, 0, jArr, 0, length);
                }
                while (length < jArr.length - 1) {
                    jArr[length] = kmVar.mo43126e();
                    kmVar.mo43113a();
                    length++;
                }
                jArr[length] = kmVar.mo43126e();
                this.f46242b = jArr;
            } else if (a == 18) {
                int b = kmVar.mo43119b(kmVar.mo43124d());
                int i = kmVar.mo43130i();
                int i2 = 0;
                while (kmVar.mo43129h() > 0) {
                    kmVar.mo43126e();
                    i2++;
                }
                kmVar.mo43125d(i);
                int length2 = this.f46242b == null ? 0 : this.f46242b.length;
                long[] jArr2 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f46242b, 0, jArr2, 0, length2);
                }
                while (length2 < jArr2.length) {
                    jArr2[length2] = kmVar.mo43126e();
                    length2++;
                }
                this.f46242b = jArr2;
                kmVar.mo43123c(b);
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
