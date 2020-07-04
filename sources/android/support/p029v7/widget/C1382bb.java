package android.support.p029v7.widget;

import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0893e;
import android.support.p022v4.util.Pools.C0887a;
import android.support.p022v4.util.Pools.SimplePool;
import android.support.p029v7.widget.RecyclerView.C1267f.C1270c;
import android.support.p029v7.widget.RecyclerView.C1293v;

/* renamed from: android.support.v7.widget.bb */
final class C1382bb {

    /* renamed from: a */
    final ArrayMap<C1293v, C1383a> f5402a = new ArrayMap<>();

    /* renamed from: b */
    final C0893e<C1293v> f5403b = new C0893e<>();

    /* renamed from: android.support.v7.widget.bb$a */
    static class C1383a {

        /* renamed from: d */
        static C0887a<C1383a> f5404d = new SimplePool(20);

        /* renamed from: a */
        int f5405a;

        /* renamed from: b */
        C1270c f5406b;

        /* renamed from: c */
        C1270c f5407c;

        private C1383a() {
        }

        /* renamed from: a */
        static C1383a m6831a() {
            C1383a aVar = (C1383a) f5404d.acquire();
            if (aVar == null) {
                return new C1383a();
            }
            return aVar;
        }

        /* renamed from: b */
        static void m6833b() {
            do {
            } while (f5404d.acquire() != null);
        }

        /* renamed from: a */
        static void m6832a(C1383a aVar) {
            aVar.f5405a = 0;
            aVar.f5406b = null;
            aVar.f5407c = null;
            f5404d.release(aVar);
        }
    }

    /* renamed from: android.support.v7.widget.bb$b */
    interface C1384b {
        /* renamed from: a */
        void mo5658a(C1293v vVar);

        /* renamed from: a */
        void mo5659a(C1293v vVar, C1270c cVar, C1270c cVar2);

        /* renamed from: b */
        void mo5660b(C1293v vVar, C1270c cVar, C1270c cVar2);

        /* renamed from: c */
        void mo5661c(C1293v vVar, C1270c cVar, C1270c cVar2);
    }

    /* renamed from: b */
    static void m6815b() {
        C1383a.m6833b();
    }

    C1382bb() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6443a() {
        this.f5402a.clear();
        this.f5403b.mo3335c();
    }

    /* renamed from: h */
    public final void mo6456h(C1293v vVar) {
        mo6454f(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C1270c mo6448b(C1293v vVar) {
        return m6814a(vVar, 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C1270c mo6450c(C1293v vVar) {
        return m6814a(vVar, 8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1293v mo6442a(long j) {
        return (C1293v) this.f5403b.mo3327a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo6452d(C1293v vVar) {
        C1383a aVar = (C1383a) this.f5402a.get(vVar);
        if (aVar == null || (aVar.f5405a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo6453e(C1293v vVar) {
        C1383a aVar = (C1383a) this.f5402a.get(vVar);
        if (aVar == null) {
            aVar = C1383a.m6831a();
            this.f5402a.put(vVar, aVar);
        }
        aVar.f5405a |= 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo6454f(C1293v vVar) {
        C1383a aVar = (C1383a) this.f5402a.get(vVar);
        if (aVar != null) {
            aVar.f5405a &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo6455g(C1293v vVar) {
        int b = this.f5403b.mo3330b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (vVar == this.f5403b.mo3334c(b)) {
                this.f5403b.mo3329a(b);
                break;
            } else {
                b--;
            }
        }
        C1383a aVar = (C1383a) this.f5402a.remove(vVar);
        if (aVar != null) {
            C1383a.m6832a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6446a(C1384b bVar) {
        for (int size = this.f5402a.size() - 1; size >= 0; size--) {
            C1293v vVar = (C1293v) this.f5402a.mo3417b(size);
            C1383a aVar = (C1383a) this.f5402a.mo3422d(size);
            if ((aVar.f5405a & 3) == 3) {
                bVar.mo5658a(vVar);
            } else if ((aVar.f5405a & 1) != 0) {
                if (aVar.f5406b == null) {
                    bVar.mo5658a(vVar);
                } else {
                    bVar.mo5659a(vVar, aVar.f5406b, aVar.f5407c);
                }
            } else if ((aVar.f5405a & 14) == 14) {
                bVar.mo5660b(vVar, aVar.f5406b, aVar.f5407c);
            } else if ((aVar.f5405a & 12) == 12) {
                bVar.mo5661c(vVar, aVar.f5406b, aVar.f5407c);
            } else if ((aVar.f5405a & 4) != 0) {
                bVar.mo5659a(vVar, aVar.f5406b, null);
            } else if ((aVar.f5405a & 8) != 0) {
                bVar.mo5660b(vVar, aVar.f5406b, aVar.f5407c);
            }
            C1383a.m6832a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6447a(C1293v vVar) {
        C1383a aVar = (C1383a) this.f5402a.get(vVar);
        if (aVar == null || (aVar.f5405a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6444a(long j, C1293v vVar) {
        this.f5403b.mo3333b(j, vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6449b(C1293v vVar, C1270c cVar) {
        C1383a aVar = (C1383a) this.f5402a.get(vVar);
        if (aVar == null) {
            aVar = C1383a.m6831a();
            this.f5402a.put(vVar, aVar);
        }
        aVar.f5405a |= 2;
        aVar.f5406b = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo6451c(C1293v vVar, C1270c cVar) {
        C1383a aVar = (C1383a) this.f5402a.get(vVar);
        if (aVar == null) {
            aVar = C1383a.m6831a();
            this.f5402a.put(vVar, aVar);
        }
        aVar.f5407c = cVar;
        aVar.f5405a |= 8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6445a(C1293v vVar, C1270c cVar) {
        C1383a aVar = (C1383a) this.f5402a.get(vVar);
        if (aVar == null) {
            aVar = C1383a.m6831a();
            this.f5402a.put(vVar, aVar);
        }
        aVar.f5406b = cVar;
        aVar.f5405a |= 4;
    }

    /* renamed from: a */
    private C1270c m6814a(C1293v vVar, int i) {
        C1270c cVar;
        int a = this.f5402a.mo3413a((Object) vVar);
        if (a < 0) {
            return null;
        }
        C1383a aVar = (C1383a) this.f5402a.mo3418c(a);
        if (aVar == null || (aVar.f5405a & i) == 0) {
            return null;
        }
        aVar.f5405a &= i ^ -1;
        if (i == 4) {
            cVar = aVar.f5406b;
        } else if (i == 8) {
            cVar = aVar.f5407c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((aVar.f5405a & 12) == 0) {
            this.f5402a.mo3422d(a);
            C1383a.m6832a(aVar);
        }
        return cVar;
    }
}
