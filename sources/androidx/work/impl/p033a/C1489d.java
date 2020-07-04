package androidx.work.impl.p033a;

import android.content.Context;
import androidx.work.impl.p033a.p034a.C1468a;
import androidx.work.impl.p033a.p034a.C1469b;
import androidx.work.impl.p033a.p034a.C1470c;
import androidx.work.impl.p033a.p034a.C1470c.C1471a;
import androidx.work.impl.p033a.p034a.C1472d;
import androidx.work.impl.p033a.p034a.C1473e;
import androidx.work.impl.p033a.p034a.C1474f;
import androidx.work.impl.p033a.p034a.C1475g;
import androidx.work.impl.p033a.p034a.C1476h;
import androidx.work.impl.p036b.C1501g;
import com.C1642a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.a.d */
public final class C1489d implements C1471a {

    /* renamed from: a */
    private final C1488c f5706a;

    /* renamed from: b */
    private final C1470c[] f5707b;

    /* renamed from: c */
    private final Object f5708c = new Object();

    /* renamed from: a */
    public final void mo6735a() {
        synchronized (this.f5708c) {
            for (C1470c a : this.f5707b) {
                a.mo6711a();
            }
        }
    }

    /* renamed from: c */
    public final void mo6716c(List<String> list) {
        synchronized (this.f5708c) {
            if (this.f5706a != null) {
                this.f5706a.mo6734b(list);
            }
        }
    }

    /* renamed from: a */
    public final void mo6736a(List<C1501g> list) {
        synchronized (this.f5708c) {
            for (C1470c a : this.f5707b) {
                a.mo6712a((C1471a) null);
            }
            for (C1470c a2 : this.f5707b) {
                a2.mo6713a(list);
            }
            for (C1470c a3 : this.f5707b) {
                a3.mo6712a((C1471a) this);
            }
        }
    }

    /* renamed from: b */
    public final void mo6715b(List<String> list) {
        synchronized (this.f5708c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (mo6737a(str)) {
                    C1642a.m8034a("Constraints met for %s", new Object[]{str});
                    arrayList.add(str);
                }
            }
            if (this.f5706a != null) {
                this.f5706a.mo6733a(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo6737a(String str) {
        C1470c[] cVarArr;
        synchronized (this.f5708c) {
            for (C1470c cVar : this.f5707b) {
                if (cVar.mo6714a(str)) {
                    C1642a.m8034a("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()});
                    return false;
                }
            }
            return true;
        }
    }

    public C1489d(Context context, C1488c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5706a = cVar;
        this.f5707b = new C1470c[]{new C1468a(applicationContext), new C1469b(applicationContext), new C1476h(applicationContext), new C1472d(applicationContext), new C1475g(applicationContext), new C1474f(applicationContext), new C1473e(applicationContext)};
    }
}
