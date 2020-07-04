package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.internal.C15231d.C15234c;
import com.google.android.gms.common.internal.C15255l;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.ac */
final class C15052ac extends C15059aj {

    /* renamed from: a */
    final /* synthetic */ C15159z f38939a;

    /* renamed from: b */
    private final Map<C15028f, C15051ab> f38940b;

    public C15052ac(C15159z zVar, Map<C15028f, C15051ab> map) {
        this.f38939a = zVar;
        super(zVar, null);
        this.f38940b = map;
    }

    /* renamed from: a */
    public final void mo38287a() {
        C15255l lVar = new C15255l(this.f38939a.f39216d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C15028f fVar : this.f38940b.keySet()) {
            if (!((C15051ab) this.f38940b.get(fVar)).f38938c) {
                arrayList.add(fVar);
            } else {
                arrayList2.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = arrayList;
            int size = arrayList3.size();
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                i = lVar.mo38606a(this.f38939a.f39215c, (C15028f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            ArrayList arrayList4 = arrayList2;
            int size2 = arrayList4.size();
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                i = lVar.mo38606a(this.f38939a.f39215c, (C15028f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f38939a.f39213a.mo38314a((C15071av) new C15053ad(this, this.f38939a, new ConnectionResult(i, null)));
            return;
        }
        if (this.f38939a.f39225m) {
            this.f38939a.f39223k.mo44185r();
        }
        for (C15028f fVar2 : this.f38940b.keySet()) {
            C15234c cVar = (C15234c) this.f38940b.get(fVar2);
            if (lVar.mo38606a(this.f38939a.f39215c, fVar2) != 0) {
                this.f38939a.f39213a.mo38314a((C15071av) new C15054ae(this, this.f38939a, cVar));
            } else {
                fVar2.mo38211a(cVar);
            }
        }
    }
}
