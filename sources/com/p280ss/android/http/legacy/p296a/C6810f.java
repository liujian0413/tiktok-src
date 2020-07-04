package com.p280ss.android.http.legacy.p296a;

import com.p280ss.android.http.legacy.C6809a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.http.legacy.a.f */
public final class C6810f implements Cloneable {

    /* renamed from: a */
    private List f19410a = new ArrayList(16);

    public final Object clone() throws CloneNotSupportedException {
        C6810f fVar = (C6810f) super.clone();
        fVar.f19410a = new ArrayList(this.f19410a);
        return fVar;
    }

    /* renamed from: a */
    public final C6809a[] mo16639a() {
        return (C6809a[]) this.f19410a.toArray(new C6809a[this.f19410a.size()]);
    }

    /* renamed from: a */
    public final void mo16638a(C6809a aVar) {
        this.f19410a.add(aVar);
    }

    /* renamed from: a */
    public final C6809a[] mo16640a(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f19410a.size(); i++) {
            C6809a aVar = (C6809a) this.f19410a.get(i);
            if (aVar.mo16635a().equalsIgnoreCase(str)) {
                arrayList.add(aVar);
            }
        }
        return (C6809a[]) arrayList.toArray(new C6809a[arrayList.size()]);
    }

    /* renamed from: b */
    public final C6809a mo16641b(String str) {
        for (int i = 0; i < this.f19410a.size(); i++) {
            C6809a aVar = (C6809a) this.f19410a.get(i);
            if (aVar.mo16635a().equalsIgnoreCase(str)) {
                return aVar;
            }
        }
        return null;
    }
}
