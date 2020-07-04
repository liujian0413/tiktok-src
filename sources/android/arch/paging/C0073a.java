package android.arch.paging;

import android.arch.p005a.p006a.C0002a;
import android.arch.paging.C0100h.C0105c;
import android.support.p029v7.recyclerview.extensions.C1135a;
import android.support.p029v7.recyclerview.extensions.C1135a.C1136a;
import android.support.p029v7.util.AdapterListUpdateCallback;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.util.C1151b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.a */
public final class C0073a<T> {

    /* renamed from: a */
    public final C1151b f121a;

    /* renamed from: b */
    public final C1135a<T> f122b;

    /* renamed from: c */
    Executor f123c = C0002a.m5b();

    /* renamed from: d */
    C0077a<T> f124d;

    /* renamed from: e */
    public int f125e;

    /* renamed from: f */
    private boolean f126f;

    /* renamed from: g */
    private C0100h<T> f127g;

    /* renamed from: h */
    private C0100h<T> f128h;

    /* renamed from: i */
    private C0105c f129i = new C0105c() {
        /* renamed from: a */
        public final void mo160a(int i, int i2) {
            C0073a.this.f121a.mo253a(i, i2);
        }

        /* renamed from: b */
        public final void mo161b(int i, int i2) {
            C0073a.this.f121a.mo254a(i, i2, null);
        }
    };

    /* renamed from: android.arch.paging.a$a */
    interface C0077a<T> {
    }

    /* renamed from: a */
    public final int mo156a() {
        if (this.f127g != null) {
            return this.f127g.size();
        }
        if (this.f128h == null) {
            return 0;
        }
        return this.f128h.size();
    }

    /* renamed from: a */
    public final T mo157a(int i) {
        if (this.f127g != null) {
            this.f127g.mo210d(i);
            return this.f127g.get(i);
        } else if (this.f128h != null) {
            return this.f128h.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
    }

    /* renamed from: a */
    public final void mo158a(C0100h<T> hVar) {
        if (hVar != null) {
            if (this.f127g == null && this.f128h == null) {
                this.f126f = hVar.mo173a();
            } else if (hVar.mo173a() != this.f126f) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        if (hVar != this.f127g) {
            final int i = this.f125e + 1;
            this.f125e = i;
            if (hVar == null) {
                int a = mo156a();
                if (this.f127g != null) {
                    this.f127g.mo203a(this.f129i);
                    this.f127g = null;
                } else if (this.f128h != null) {
                    this.f128h = null;
                }
                this.f121a.mo255b(0, a);
            } else if (this.f127g == null && this.f128h == null) {
                this.f127g = hVar;
                hVar.mo204a(null, this.f129i);
                this.f121a.mo253a(0, hVar.size());
            } else {
                if (this.f127g != null) {
                    this.f127g.mo203a(this.f129i);
                    this.f128h = (C0100h) this.f127g.mo212e();
                    this.f127g = null;
                }
                if (this.f128h == null || this.f127g != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                final C0100h<T> hVar2 = this.f128h;
                final C0100h hVar3 = (C0100h) hVar.mo212e();
                Executor executor = this.f122b.f4087b;
                final C0100h<T> hVar4 = hVar;
                C00752 r1 = new Runnable() {
                    public final void run() {
                        final C1146b a = C0110j.m280a(hVar2.f199g, hVar3.f199g, C0073a.this.f122b.f4088c);
                        C0073a.this.f123c.execute(new Runnable() {
                            public final void run() {
                                if (C0073a.this.f125e == i) {
                                    C0073a.this.mo159a(hVar4, hVar3, a);
                                }
                            }
                        });
                    }
                };
                executor.execute(r1);
            }
        }
    }

    public C0073a(C1262a aVar, C1147c<T> cVar) {
        this.f121a = new AdapterListUpdateCallback(aVar);
        this.f122b = new C1136a(cVar).mo4537a();
    }

    /* renamed from: a */
    public final void mo159a(C0100h<T> hVar, C0100h<T> hVar2, C1146b bVar) {
        if (this.f128h == null || this.f127g != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        C0100h<T> hVar3 = this.f128h;
        this.f127g = hVar;
        this.f128h = null;
        C0110j.m281a(this.f121a, hVar3.f199g, hVar.f199g, bVar);
        hVar.mo204a((List<T>) hVar2, this.f129i);
    }
}
