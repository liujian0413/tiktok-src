package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@C6505uv
public final class bte implements btm {

    /* renamed from: a */
    private final Object f43512a = new Object();

    /* renamed from: b */
    private final WeakHashMap<abj, btf> f43513b = new WeakHashMap<>();

    /* renamed from: c */
    private final ArrayList<btf> f43514c = new ArrayList<>();

    /* renamed from: d */
    private final Context f43515d;

    /* renamed from: e */
    private final zzbgz f43516e;

    /* renamed from: f */
    private final C15863mc f43517f;

    public bte(Context context, zzbgz zzbgz) {
        this.f43515d = context.getApplicationContext();
        this.f43516e = zzbgz;
        this.f43517f = new C15863mc(context.getApplicationContext(), zzbgz, (String) bym.m50299d().mo41272a(C15585bw.f43859c));
    }

    /* renamed from: a */
    public final void mo41281a(zzyz zzyz, abj abj) {
        mo41282a(zzyz, abj, abj.f39862b.getView());
    }

    /* renamed from: a */
    public final void mo41282a(zzyz zzyz, abj abj, View view) {
        mo41284a(zzyz, abj, (buq) new btl(view, abj), (ami) null);
    }

    /* renamed from: a */
    public final void mo41283a(zzyz zzyz, abj abj, View view, ami ami) {
        mo41284a(zzyz, abj, (buq) new btl(view, abj), ami);
    }

    /* renamed from: a */
    public final void mo41284a(zzyz zzyz, abj abj, buq buq, ami ami) {
        btf btf;
        synchronized (this.f43512a) {
            if (m50011e(abj)) {
                btf = (btf) this.f43513b.get(abj);
            } else {
                btf btf2 = new btf(this.f43515d, zzyz, abj, this.f43516e, buq);
                btf2.mo41291a((btm) this);
                this.f43513b.put(abj, btf2);
                this.f43514c.add(btf2);
                btf = btf2;
            }
            if (ami != null) {
                btf.mo41292a((bua) new btn(btf, ami));
            } else {
                btf.mo41292a((bua) new btr(btf, this.f43517f, this.f43515d));
            }
            if (abj.f39856Q) {
                btf.mo41290a(((Long) bym.m50299d().mo41272a(C15585bw.f43840bh)).longValue());
            } else {
                btf.mo41303g();
            }
        }
    }

    /* renamed from: e */
    private final boolean m50011e(abj abj) {
        boolean z;
        synchronized (this.f43512a) {
            btf btf = (btf) this.f43513b.get(abj);
            z = btf != null && btf.mo41299c();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo41279a(abj abj) {
        synchronized (this.f43512a) {
            btf btf = (btf) this.f43513b.get(abj);
            if (btf != null) {
                btf.mo41295b();
            }
        }
    }

    /* renamed from: a */
    public final void mo41280a(btf btf) {
        synchronized (this.f43512a) {
            if (!btf.mo41299c()) {
                this.f43514c.remove(btf);
                Iterator it = this.f43513b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == btf) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo41285b(abj abj) {
        synchronized (this.f43512a) {
            btf btf = (btf) this.f43513b.get(abj);
            if (btf != null) {
                btf.mo41300d();
            }
        }
    }

    /* renamed from: c */
    public final void mo41286c(abj abj) {
        synchronized (this.f43512a) {
            btf btf = (btf) this.f43513b.get(abj);
            if (btf != null) {
                btf.mo41301e();
            }
        }
    }

    /* renamed from: d */
    public final void mo41287d(abj abj) {
        synchronized (this.f43512a) {
            btf btf = (btf) this.f43513b.get(abj);
            if (btf != null) {
                btf.mo41302f();
            }
        }
    }
}
