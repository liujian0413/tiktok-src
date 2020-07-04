package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ei */
public final class C16500ei extends C16679kp<C16500ei> {

    /* renamed from: a */
    public C16501ej[] f46193a;

    public C16500ei() {
        this.f46193a = C16501ej.m53788a();
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16500ei)) {
            return false;
        }
        C16500ei eiVar = (C16500ei) obj;
        if (!C16683kt.m54806a((Object[]) this.f46193a, (Object[]) eiVar.f46193a)) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return eiVar.f46593L == null || eiVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(eiVar.f46593L);
    }

    public final int hashCode() {
        return ((((getClass().getName().hashCode() + 527) * 31) + C16683kt.m54802a((Object[]) this.f46193a)) * 31) + ((this.f46593L == null || this.f46593L.mo43156a()) ? 0 : this.f46593L.hashCode());
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46193a != null && this.f46193a.length > 0) {
            for (C16501ej ejVar : this.f46193a) {
                if (ejVar != null) {
                    koVar.mo43138a(1, (C16684ku) ejVar);
                }
            }
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b();
        if (this.f46193a != null && this.f46193a.length > 0) {
            for (C16501ej ejVar : this.f46193a) {
                if (ejVar != null) {
                    b += C16678ko.m54760b(1, (C16684ku) ejVar);
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
            if (a == 10) {
                int a2 = C16687kx.m54816a(kmVar, 10);
                int length = this.f46193a == null ? 0 : this.f46193a.length;
                C16501ej[] ejVarArr = new C16501ej[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46193a, 0, ejVarArr, 0, length);
                }
                while (length < ejVarArr.length - 1) {
                    ejVarArr[length] = new C16501ej();
                    kmVar.mo43115a((C16684ku) ejVarArr[length]);
                    kmVar.mo43113a();
                    length++;
                }
                ejVarArr[length] = new C16501ej();
                kmVar.mo43115a((C16684ku) ejVarArr[length]);
                this.f46193a = ejVarArr;
            } else if (!super.mo43146a(kmVar, a)) {
                return this;
            }
        }
    }
}
