package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ek */
public final class C16502ek extends C16679kp<C16502ek> {

    /* renamed from: a */
    public long[] f46236a;

    /* renamed from: b */
    public long[] f46237b;

    /* renamed from: c */
    public C16497ef[] f46238c;

    /* renamed from: d */
    public C16503el[] f46239d;

    public C16502ek() {
        this.f46236a = C16687kx.f46612b;
        this.f46237b = C16687kx.f46612b;
        this.f46238c = C16497ef.m53773a();
        this.f46239d = C16503el.m53795a();
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16502ek)) {
            return false;
        }
        C16502ek ekVar = (C16502ek) obj;
        if (!C16683kt.m54805a(this.f46236a, ekVar.f46236a) || !C16683kt.m54805a(this.f46237b, ekVar.f46237b) || !C16683kt.m54806a((Object[]) this.f46238c, (Object[]) ekVar.f46238c) || !C16683kt.m54806a((Object[]) this.f46239d, (Object[]) ekVar.f46239d)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return ekVar.f46593L == null || ekVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(ekVar.f46593L);
    }

    public final int hashCode() {
        return ((((((((((getClass().getName().hashCode() + 527) * 31) + C16683kt.m54801a(this.f46236a)) * 31) + C16683kt.m54801a(this.f46237b)) * 31) + C16683kt.m54802a((Object[]) this.f46238c)) * 31) + C16683kt.m54802a((Object[]) this.f46239d)) * 31) + ((this.f46593L == null || this.f46593L.mo43156a()) ? 0 : this.f46593L.hashCode());
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46236a != null && this.f46236a.length > 0) {
            for (long a : this.f46236a) {
                koVar.mo43136a(1, a);
            }
        }
        if (this.f46237b != null && this.f46237b.length > 0) {
            for (long a2 : this.f46237b) {
                koVar.mo43136a(2, a2);
            }
        }
        if (this.f46238c != null && this.f46238c.length > 0) {
            for (C16497ef efVar : this.f46238c) {
                if (efVar != null) {
                    koVar.mo43138a(3, (C16684ku) efVar);
                }
            }
        }
        if (this.f46239d != null && this.f46239d.length > 0) {
            for (C16503el elVar : this.f46239d) {
                if (elVar != null) {
                    koVar.mo43138a(4, (C16684ku) elVar);
                }
            }
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46236a != null && this.f46236a.length > 0) {
            int i = 0;
            for (long a : this.f46236a) {
                i += C16678ko.m54752a(a);
            }
            b = b + i + (this.f46236a.length * 1);
        }
        if (this.f46237b != null && this.f46237b.length > 0) {
            int i2 = 0;
            for (long a2 : this.f46237b) {
                i2 += C16678ko.m54752a(a2);
            }
            b = b + i2 + (this.f46237b.length * 1);
        }
        if (this.f46238c != null && this.f46238c.length > 0) {
            int i3 = b;
            for (C16497ef efVar : this.f46238c) {
                if (efVar != null) {
                    i3 += C16678ko.m54760b(3, (C16684ku) efVar);
                }
            }
            b = i3;
        }
        if (this.f46239d != null && this.f46239d.length > 0) {
            for (C16503el elVar : this.f46239d) {
                if (elVar != null) {
                    b += C16678ko.m54760b(4, (C16684ku) elVar);
                }
            }
        }
        return b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16684ku mo42654a(C16676km kmVar) throws IOException {
        while (true) {
            int a = kmVar.mo43113a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int a2 = C16687kx.m54816a(kmVar, 8);
                int length = this.f46236a == null ? 0 : this.f46236a.length;
                long[] jArr = new long[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46236a, 0, jArr, 0, length);
                }
                while (length < jArr.length - 1) {
                    jArr[length] = kmVar.mo43126e();
                    kmVar.mo43113a();
                    length++;
                }
                jArr[length] = kmVar.mo43126e();
                this.f46236a = jArr;
            } else if (a == 10) {
                int b = kmVar.mo43119b(kmVar.mo43124d());
                int i = kmVar.mo43130i();
                int i2 = 0;
                while (kmVar.mo43129h() > 0) {
                    kmVar.mo43126e();
                    i2++;
                }
                kmVar.mo43125d(i);
                int length2 = this.f46236a == null ? 0 : this.f46236a.length;
                long[] jArr2 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f46236a, 0, jArr2, 0, length2);
                }
                while (length2 < jArr2.length) {
                    jArr2[length2] = kmVar.mo43126e();
                    length2++;
                }
                this.f46236a = jArr2;
                kmVar.mo43123c(b);
            } else if (a == 16) {
                int a3 = C16687kx.m54816a(kmVar, 16);
                int length3 = this.f46237b == null ? 0 : this.f46237b.length;
                long[] jArr3 = new long[(a3 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f46237b, 0, jArr3, 0, length3);
                }
                while (length3 < jArr3.length - 1) {
                    jArr3[length3] = kmVar.mo43126e();
                    kmVar.mo43113a();
                    length3++;
                }
                jArr3[length3] = kmVar.mo43126e();
                this.f46237b = jArr3;
            } else if (a == 18) {
                int b2 = kmVar.mo43119b(kmVar.mo43124d());
                int i3 = kmVar.mo43130i();
                int i4 = 0;
                while (kmVar.mo43129h() > 0) {
                    kmVar.mo43126e();
                    i4++;
                }
                kmVar.mo43125d(i3);
                int length4 = this.f46237b == null ? 0 : this.f46237b.length;
                long[] jArr4 = new long[(i4 + length4)];
                if (length4 != 0) {
                    System.arraycopy(this.f46237b, 0, jArr4, 0, length4);
                }
                while (length4 < jArr4.length) {
                    jArr4[length4] = kmVar.mo43126e();
                    length4++;
                }
                this.f46237b = jArr4;
                kmVar.mo43123c(b2);
            } else if (a == 26) {
                int a4 = C16687kx.m54816a(kmVar, 26);
                int length5 = this.f46238c == null ? 0 : this.f46238c.length;
                C16497ef[] efVarArr = new C16497ef[(a4 + length5)];
                if (length5 != 0) {
                    System.arraycopy(this.f46238c, 0, efVarArr, 0, length5);
                }
                while (length5 < efVarArr.length - 1) {
                    efVarArr[length5] = new C16497ef();
                    kmVar.mo43115a((C16684ku) efVarArr[length5]);
                    kmVar.mo43113a();
                    length5++;
                }
                efVarArr[length5] = new C16497ef();
                kmVar.mo43115a((C16684ku) efVarArr[length5]);
                this.f46238c = efVarArr;
            } else if (a == 34) {
                int a5 = C16687kx.m54816a(kmVar, 34);
                int length6 = this.f46239d == null ? 0 : this.f46239d.length;
                C16503el[] elVarArr = new C16503el[(a5 + length6)];
                if (length6 != 0) {
                    System.arraycopy(this.f46239d, 0, elVarArr, 0, length6);
                }
                while (length6 < elVarArr.length - 1) {
                    elVarArr[length6] = new C16503el();
                    kmVar.mo43115a((C16684ku) elVarArr[length6]);
                    kmVar.mo43113a();
                    length6++;
                }
                elVarArr[length6] = new C16503el();
                kmVar.mo43115a((C16684ku) elVarArr[length6]);
                this.f46239d = elVarArr;
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
