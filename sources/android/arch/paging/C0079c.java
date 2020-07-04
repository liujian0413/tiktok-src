package android.arch.paging;

import android.arch.paging.C0100h.C0103a;
import android.arch.paging.C0100h.C0105c;
import android.arch.paging.C0100h.C0106d;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.c */
final class C0079c<K, V> extends C0100h<V> implements C0109a {

    /* renamed from: a */
    public final C0078b<K, V> f138a;

    /* renamed from: b */
    public C0099a<V> f139b = new C0099a<V>() {
        /* renamed from: a */
        public final void mo179a(int i, C0098g<V> gVar) {
            boolean z;
            boolean z2;
            if (gVar.mo201b()) {
                C0079c.this.mo215g();
            } else if (!C0079c.this.mo214f()) {
                List<T> list = gVar.f189a;
                if (i == 0) {
                    C0079c.this.f199g.mo235a(gVar.f190b, list, gVar.f191c, gVar.f192d, C0079c.this);
                    if (C0079c.this.f200h == -1) {
                        C0079c.this.f200h = gVar.f190b + gVar.f192d + (list.size() / 2);
                    }
                } else if (i == 1) {
                    C0079c.this.f199g.mo240b(list, (C0109a) C0079c.this);
                } else if (i == 2) {
                    C0079c.this.f199g.mo237a(list, (C0109a) C0079c.this);
                } else {
                    StringBuilder sb = new StringBuilder("unexpected resultType ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (C0079c.this.f197e != null) {
                    boolean z3 = false;
                    if (C0079c.this.f199g.size() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && i == 2 && gVar.f189a.size() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z && i == 1 && gVar.f189a.size() == 0) {
                        z3 = true;
                    }
                    C0079c.this.mo207a(z, z2, z3);
                }
            }
        }
    };

    /* renamed from: l */
    private boolean f140l = false;

    /* renamed from: m */
    private boolean f141m = false;

    /* renamed from: n */
    private int f142n = 0;

    /* renamed from: o */
    private int f143o = 0;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo173a() {
        return true;
    }

    /* renamed from: b */
    public final C0083d<?, V> mo174b() {
        return this.f138a;
    }

    /* renamed from: c */
    public final Object mo177c() {
        return this.f138a.mo164a(this.f200h, this.f201i);
    }

    /* renamed from: h */
    private void m178h() {
        if (!this.f140l) {
            this.f140l = true;
            final int i = this.f199g.f228a + this.f199g.f230c;
            final Object e = this.f199g.mo243e();
            this.f196d.execute(new Runnable() {
                public final void run() {
                    if (!C0079c.this.mo214f()) {
                        if (C0079c.this.f138a.mo185c()) {
                            C0079c.this.mo215g();
                        } else {
                            C0079c.this.f138a.mo168b(i, e, C0079c.this.f198f.f219a, C0079c.this.f195c, C0079c.this.f139b);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: i */
    private void m179i() {
        if (!this.f141m) {
            this.f141m = true;
            final int i = ((this.f199g.f228a + this.f199g.f231d) - 1) + this.f199g.f230c;
            final Object f = this.f199g.mo244f();
            this.f196d.execute(new Runnable() {
                public final void run() {
                    if (!C0079c.this.mo214f()) {
                        if (C0079c.this.f138a.mo185c()) {
                            C0079c.this.mo215g();
                        } else {
                            C0079c.this.f138a.mo165a(i, f, C0079c.this.f198f.f219a, C0079c.this.f195c, C0079c.this.f139b);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo175b(int i) {
        mo208b(0, i);
    }

    /* renamed from: c */
    public final void mo178c(int i) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo169a(int i) {
        int i2 = this.f198f.f220b - (i - this.f199g.f228a);
        int i3 = (i + this.f198f.f220b) - (this.f199g.f228a + this.f199g.f231d);
        this.f142n = Math.max(i2, this.f142n);
        if (this.f142n > 0) {
            m178h();
        }
        this.f143o = Math.max(i3, this.f143o);
        if (this.f143o > 0) {
            m179i();
        }
    }

    /* renamed from: a */
    public final void mo170a(int i, int i2) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo172a(C0100h<V> hVar, C0105c cVar) {
        C0108i<T> iVar = hVar.f199g;
        int i = this.f199g.f233f - iVar.f233f;
        int i2 = this.f199g.f232e - iVar.f232e;
        int i3 = iVar.f229b;
        int i4 = iVar.f228a;
        if (iVar.isEmpty() || i < 0 || i2 < 0 || this.f199g.f229b != Math.max(i3 - i, 0) || this.f199g.f228a != Math.max(i4 - i2, 0) || this.f199g.f231d != iVar.f231d + i + i2) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i != 0) {
            int min = Math.min(i3, i);
            int i5 = i - min;
            int i6 = iVar.f228a + iVar.f231d;
            if (min != 0) {
                cVar.mo161b(i6, min);
            }
            if (i5 != 0) {
                cVar.mo160a(i6 + min, i5);
            }
        }
        if (i2 != 0) {
            int min2 = Math.min(i4, i2);
            int i7 = i2 - min2;
            if (min2 != 0) {
                cVar.mo161b(i4, min2);
            }
            if (i7 != 0) {
                cVar.mo160a(0, i7);
            }
        }
    }

    /* renamed from: a */
    public final void mo171a(int i, int i2, int i3) {
        this.f142n = (this.f142n - i2) - i3;
        this.f140l = false;
        if (this.f142n > 0) {
            m178h();
        }
        mo209c(i, i2);
        mo208b(0, i3);
        mo213e(i3);
    }

    /* renamed from: b */
    public final void mo176b(int i, int i2, int i3) {
        this.f143o = (this.f143o - i2) - i3;
        this.f141m = false;
        if (this.f143o > 0) {
            m179i();
        }
        mo209c(i, i2);
        mo208b(i + i2, i3);
    }

    C0079c(C0078b<K, V> bVar, Executor executor, Executor executor2, C0103a<V> aVar, C0106d dVar, K k, int i) {
        super(new C0108i(), executor, executor2, aVar, dVar);
        this.f138a = bVar;
        this.f200h = i;
        if (this.f138a.mo185c()) {
            mo215g();
            return;
        }
        this.f138a.mo166a(k, this.f198f.f222d, this.f198f.f219a, this.f198f.f221c, this.f195c, this.f139b);
    }
}
