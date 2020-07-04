package android.arch.paging;

import android.arch.paging.C0100h.C0103a;
import android.arch.paging.C0100h.C0105c;
import android.arch.paging.C0100h.C0106d;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.m */
final class C0122m<T> extends C0100h<T> implements C0109a {

    /* renamed from: a */
    public final C0113k<T> f259a;

    /* renamed from: b */
    public C0099a<T> f260b = new C0099a<T>() {
        /* renamed from: a */
        public final void mo179a(int i, C0098g<T> gVar) {
            boolean z;
            boolean z2;
            if (gVar.mo201b()) {
                C0122m.this.mo215g();
            } else if (!C0122m.this.mo214f()) {
                if (i == 0 || i == 3) {
                    if (C0122m.this.f199g.mo239b() == 0) {
                        C0122m.this.f199g.mo234a(gVar.f190b, gVar.f189a, gVar.f191c, gVar.f192d, C0122m.this.f198f.f219a, C0122m.this);
                    } else {
                        C0122m.this.f199g.mo236a(gVar.f192d, gVar.f189a, C0122m.this);
                    }
                    if (C0122m.this.f197e != null) {
                        boolean z3 = false;
                        if (C0122m.this.f199g.size() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && gVar.f190b == 0 && gVar.f192d == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int size = C0122m.this.size();
                        if (!z && ((i == 0 && gVar.f191c == 0) || (i == 3 && gVar.f192d + C0122m.this.f198f.f219a >= size))) {
                            z3 = true;
                        }
                        C0122m.this.mo207a(z, z2, z3);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("unexpected resultType");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo173a() {
        return false;
    }

    /* renamed from: b */
    public final C0083d<?, T> mo174b() {
        return this.f259a;
    }

    /* renamed from: c */
    public final Object mo177c() {
        return Integer.valueOf(this.f200h);
    }

    /* renamed from: b */
    public final void mo175b(int i) {
        mo208b(0, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo169a(int i) {
        this.f199g.mo233a(i, this.f198f.f220b, this.f198f.f219a, (C0109a) this);
    }

    /* renamed from: c */
    public final void mo178c(final int i) {
        this.f196d.execute(new Runnable() {
            public final void run() {
                if (!C0122m.this.mo214f()) {
                    int i = C0122m.this.f198f.f219a;
                    if (C0122m.this.f259a.mo185c()) {
                        C0122m.this.mo215g();
                        return;
                    }
                    int i2 = i * i;
                    C0122m.this.f259a.mo257a(3, i2, Math.min(i, C0122m.this.f199g.size() - i2), C0122m.this.f195c, C0122m.this.f260b);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo170a(int i, int i2) {
        mo209c(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo172a(C0100h<T> hVar, C0105c cVar) {
        C0108i<T> iVar = hVar.f199g;
        if (iVar.isEmpty() || this.f199g.size() != iVar.size()) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        int i = this.f198f.f219a;
        int i2 = this.f199g.f228a / i;
        int b = this.f199g.mo239b();
        int i3 = 0;
        while (i3 < b) {
            int i4 = i3 + i2;
            int i5 = 0;
            while (i5 < this.f199g.mo239b()) {
                int i6 = i4 + i5;
                if (!this.f199g.mo238a(i, i6) || iVar.mo238a(i, i6)) {
                    break;
                }
                i5++;
            }
            if (i5 > 0) {
                cVar.mo161b(i4 * i, i * i5);
                i3 += i5 - 1;
            }
            i3++;
        }
    }

    /* renamed from: a */
    public final void mo171a(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* renamed from: b */
    public final void mo176b(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    C0122m(C0113k<T> kVar, Executor executor, Executor executor2, C0103a<T> aVar, C0106d dVar, int i) {
        super(new C0108i(), executor, executor2, aVar, dVar);
        this.f259a = kVar;
        int i2 = this.f198f.f219a;
        this.f200h = i;
        if (this.f259a.mo185c()) {
            mo215g();
            return;
        }
        int max = Math.max(Math.round((float) (this.f198f.f222d / i2)), 2) * i2;
        this.f259a.mo258a(true, Math.max(0, Math.round((float) ((i - (max / 2)) / i2)) * i2), max, i2, this.f195c, this.f260b);
    }
}
