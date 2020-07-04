package android.arch.paging;

import android.arch.lifecycle.C0031b;
import android.arch.lifecycle.LiveData;
import android.arch.p005a.p006a.C0002a;
import android.arch.paging.C0083d.C0084a;
import android.arch.paging.C0083d.C0085b;
import android.arch.paging.C0100h.C0103a;
import android.arch.paging.C0100h.C0104b;
import android.arch.paging.C0100h.C0106d;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.e */
public final class C0088e<Key, Value> {

    /* renamed from: a */
    private Key f161a;

    /* renamed from: b */
    private C0106d f162b;

    /* renamed from: c */
    private C0084a<Key, Value> f163c;

    /* renamed from: d */
    private C0103a f164d;

    /* renamed from: e */
    private Executor f165e = C0002a.m6c();

    /* renamed from: a */
    public final LiveData<C0100h<Value>> mo192a() {
        return m201a(this.f161a, this.f162b, this.f164d, this.f163c, C0002a.m5b(), this.f165e);
    }

    /* renamed from: a */
    public final C0088e<Key, Value> mo193a(C0103a<Value> aVar) {
        this.f164d = aVar;
        return this;
    }

    public C0088e(C0084a<Key, Value> aVar, C0106d dVar) {
        if (dVar != null) {
            this.f163c = aVar;
            this.f162b = dVar;
            return;
        }
        throw new IllegalArgumentException("PagedList.Config must be provided");
    }

    /* renamed from: a */
    private static <Key, Value> LiveData<C0100h<Value>> m201a(Key key, C0106d dVar, C0103a aVar, C0084a<Key, Value> aVar2, Executor executor, Executor executor2) {
        final Key key2 = key;
        final C0084a<Key, Value> aVar3 = aVar2;
        final C0106d dVar2 = dVar;
        final Executor executor3 = executor;
        final Executor executor4 = executor2;
        final C0103a aVar4 = aVar;
        C00891 r0 = new C0031b<C0100h<Value>>(executor2) {

            /* renamed from: m */
            private C0100h<Value> f172m;

            /* renamed from: n */
            private C0083d<Key, Value> f173n;

            /* renamed from: o */
            private final C0085b f174o = new C0085b() {
                /* renamed from: g_ */
                public final void mo187g_() {
                    C00891.this.mo101a();
                }
            };

            /* access modifiers changed from: private */
            /* renamed from: c */
            public C0100h<Value> mo102b() {
                Object obj = key2;
                if (this.f172m != null) {
                    obj = this.f172m.mo177c();
                }
                do {
                    if (this.f173n != null) {
                        this.f173n.mo184b(this.f174o);
                    }
                    this.f173n = aVar3.mo186a();
                    this.f173n.mo182a(this.f174o);
                    this.f172m = new C0104b(this.f173n, dVar2).mo224a(executor3).mo226b(executor4).mo222a(aVar4).mo223a(obj).mo225a();
                } while (this.f172m.mo214f());
                return this.f172m;
            }
        };
        return r0.f62b;
    }
}
