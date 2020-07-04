package com.p280ss.android.ugc.aweme.flowfeed.p1254h;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.bytedance.common.utility.collection.C6307b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.j */
public final class C29376j {

    /* renamed from: a */
    public int f77409a;

    /* renamed from: b */
    public boolean f77410b;

    /* renamed from: c */
    public C29374h f77411c;

    /* renamed from: d */
    private RecyclerView f77412d;

    /* renamed from: e */
    private Set<C29382k> f77413e;

    /* renamed from: f */
    private C29381a f77414f;

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.h.j$a */
    public interface C29381a {
        /* renamed from: n */
        boolean mo58068n();
    }

    /* renamed from: f */
    public final void mo75121f() {
        this.f77413e.clear();
    }

    /* renamed from: i */
    private int m96495i() {
        if (this.f77411c != null) {
            return this.f77411c.mo75107a();
        }
        return 0;
    }

    /* renamed from: g */
    public final void mo75122g() {
        m96496j();
        mo75116b();
        mo75120e();
    }

    /* renamed from: h */
    public final void mo75123h() {
        m96496j();
        mo75116b();
        mo75119d();
    }

    /* renamed from: j */
    private void m96496j() {
        if (!C6307b.m19566a((Collection<T>) this.f77413e)) {
            for (C29382k kVar : this.f77413e) {
                kVar.f77419a = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo75118c() {
        if (!C6307b.m19566a((Collection<T>) this.f77413e)) {
            for (C29382k g : this.f77413e) {
                g.mo75132g();
            }
        }
    }

    /* renamed from: a */
    public final void mo75113a() {
        if (!C6307b.m19566a((Collection<T>) this.f77413e)) {
            for (C29382k kVar : this.f77413e) {
                boolean e = m96494e(kVar);
                if (e && !kVar.f77421c) {
                    kVar.f77421c = true;
                    kVar.mo75130e();
                } else if (!e && kVar.f77421c) {
                    kVar.f77421c = false;
                    kVar.mo75131f();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo75116b() {
        if (!C6307b.m19566a((Collection<T>) this.f77413e)) {
            for (C29382k kVar : this.f77413e) {
                if (m96493d(kVar) && !kVar.f77420b) {
                    kVar.f77420b = true;
                    kVar.mo75112b();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo75119d() {
        if (this.f77409a == 2 || C6307b.m19566a((Collection<T>) this.f77413e)) {
            return;
        }
        if (this.f77414f == null || this.f77414f.mo58068n()) {
            ArrayList arrayList = new ArrayList();
            for (C29382k kVar : this.f77413e) {
                if (m96492c(kVar)) {
                    if (kVar.f77419a != 16) {
                        kVar.f77419a = 16;
                        arrayList.add(kVar);
                    }
                } else if (kVar.f77419a == 16) {
                    kVar.f77419a = 32;
                    kVar.mo75110a();
                }
            }
            Collections.sort(arrayList, new Comparator<C29382k>() {
                /* renamed from: a */
                private static int m96508a(C29382k kVar, C29382k kVar2) {
                    return kVar2.mo75129d().bottom - kVar.mo75129d().bottom;
                }

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m96508a((C29382k) obj, (C29382k) obj2);
                }
            });
            for (int i = 0; i < arrayList.size(); i++) {
                C29382k kVar2 = (C29382k) arrayList.get(i);
                if (i == 0) {
                    kVar2.mo75127b(this.f77409a);
                } else {
                    kVar2.f77419a = 32;
                    kVar2.mo75110a();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo75120e() {
        if (this.f77409a == 2 || C6307b.m19566a((Collection<T>) this.f77413e)) {
            return;
        }
        if (this.f77414f == null || this.f77414f.mo58068n()) {
            ArrayList arrayList = new ArrayList();
            for (C29382k kVar : this.f77413e) {
                if (m96492c(kVar)) {
                    if (kVar.f77419a != 16) {
                        kVar.f77419a = 16;
                        arrayList.add(kVar);
                    }
                } else if (kVar.f77419a == 16) {
                    kVar.f77419a = 32;
                    kVar.mo75110a();
                }
            }
            Collections.sort(arrayList, new Comparator<C29382k>() {
                /* renamed from: a */
                private static int m96509a(C29382k kVar, C29382k kVar2) {
                    return kVar2.mo75129d().bottom - kVar.mo75129d().bottom;
                }

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m96509a((C29382k) obj, (C29382k) obj2);
                }
            });
            for (int i = 0; i < arrayList.size(); i++) {
                C29382k kVar2 = (C29382k) arrayList.get(i);
                if (i == 0) {
                    kVar2.mo75111a(this.f77409a);
                } else {
                    kVar2.f77419a = 32;
                    kVar2.mo75110a();
                }
            }
        }
    }

    public C29376j(RecyclerView recyclerView) {
        this(recyclerView, null, null);
    }

    /* renamed from: a */
    public final void mo75115a(C29382k kVar) {
        if (kVar != null) {
            kVar.mo75128c();
        }
        this.f77413e.add(kVar);
    }

    /* renamed from: b */
    public final void mo75117b(C29382k kVar) {
        if (kVar != null) {
            kVar.mo75128c();
        }
        this.f77413e.remove(kVar);
    }

    /* renamed from: a */
    public final void mo75114a(long j) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                C29376j.this.mo75120e();
            }
        }, 500);
    }

    /* renamed from: c */
    private boolean m96492c(C29382k kVar) {
        int top = ((this.f77412d.getTop() + this.f77412d.getBottom()) / 2) - m96495i();
        Rect d = kVar.mo75129d();
        if (d.top > top || d.bottom < top) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m96493d(C29382k kVar) {
        Rect d = kVar.mo75129d();
        int i = (d.top + d.bottom) / 2;
        if (Math.abs((i - this.f77412d.getBottom()) - m96495i()) <= 10 || Math.abs((i - this.f77412d.getTop()) - m96495i()) <= 10) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m96494e(C29382k kVar) {
        Rect d = kVar.mo75129d();
        int i = (d.top + d.bottom) / 2;
        if (i < this.f77412d.getTop() + m96495i() || i > this.f77412d.getBottom() + m96495i()) {
            return false;
        }
        return true;
    }

    public C29376j(RecyclerView recyclerView, C29374h hVar, C29381a aVar) {
        this.f77413e = new LinkedHashSet();
        this.f77409a = 0;
        this.f77411c = hVar;
        this.f77414f = aVar;
        this.f77412d = recyclerView;
        this.f77412d.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                C29376j.this.f77409a = i;
                if (C29376j.this.f77411c != null) {
                    C29376j.this.f77411c.mo75109b(recyclerView, i);
                }
                if (i == 0) {
                    if (C29376j.this.f77410b) {
                        C29376j.this.mo75120e();
                    }
                    C29376j.this.f77410b = false;
                    return;
                }
                if (i == 2) {
                    C29376j.this.f77410b = true;
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (C29376j.this.f77411c != null) {
                    C29376j.this.f77411c.mo75108a(recyclerView, i2);
                }
                if (C29376j.this.f77409a == 1) {
                    C29376j.this.mo75120e();
                }
                C29376j.this.mo75116b();
                C29376j.this.mo75113a();
                C29376j.this.mo75118c();
            }
        });
    }
}
