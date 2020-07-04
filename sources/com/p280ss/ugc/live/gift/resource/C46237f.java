package com.p280ss.ugc.live.gift.resource;

import android.os.Handler;
import android.os.Looper;
import com.p280ss.ugc.live.gift.resource.exception.BaseGetResourceException;
import com.p280ss.ugc.live.gift.resource.p1827a.C46211b;
import com.p280ss.ugc.live.gift.resource.p1830d.C46229a;
import com.p280ss.ugc.live.gift.resource.p1830d.C46230b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.ugc.live.gift.resource.f */
public final class C46237f implements C46209a<String> {

    /* renamed from: f */
    private static C46237f f118846f;

    /* renamed from: a */
    public final Map<Long, C46242g> f118847a;

    /* renamed from: b */
    public final C46234e f118848b;

    /* renamed from: c */
    public final List<C46212b> f118849c = new ArrayList();

    /* renamed from: d */
    public int f118850d = 0;

    /* renamed from: e */
    public int f118851e = 0;

    /* renamed from: g */
    private final Deque<C46220c> f118852g = new ArrayDeque();

    /* renamed from: h */
    private final Handler f118853h;

    /* renamed from: c */
    public final void mo114191c() {
        this.f118847a.clear();
    }

    /* renamed from: d */
    public final C46211b mo114193d() {
        return this.f118848b.f118833a;
    }

    /* renamed from: a */
    public static C46237f m145177a() {
        if (f118846f != null) {
            return f118846f;
        }
        throw new IllegalStateException("GiftResourceManager is not initialized");
    }

    /* renamed from: e */
    private void m145180e() {
        this.f118852g.iterator();
        while (this.f118852g.peek() != null) {
            C46220c cVar = (C46220c) this.f118852g.poll();
            C46242g gVar = (C46242g) this.f118847a.get(Long.valueOf(cVar.f118812a));
            if (gVar != null) {
                for (C46228d a : gVar.f118865b) {
                    a.mo20663a(cVar.f118812a);
                }
                this.f118847a.remove(Long.valueOf(cVar.f118812a));
            }
        }
    }

    /* renamed from: b */
    public final void mo114190b() {
        if (this.f118850d < this.f118848b.f118836d && !this.f118852g.isEmpty()) {
            if (this.f118848b.f118837e <= 0 || this.f118851e < this.f118848b.f118837e) {
                this.f118850d++;
                mo114194d((C46220c) this.f118852g.poll());
                return;
            }
            m145180e();
            this.f118851e = 0;
        }
    }

    /* renamed from: a */
    public final void mo114187a(C46220c cVar) {
        mo114188a(cVar, (C46228d) null);
    }

    /* renamed from: d */
    public final void mo114194d(C46220c cVar) {
        this.f118848b.f118834b.mo20823a(cVar, this.f118848b).mo20821a(cVar, this);
    }

    /* renamed from: a */
    public static void m145179a(C46234e eVar) {
        if (f118846f == null) {
            f118846f = new C46237f(eVar);
        }
    }

    /* renamed from: f */
    public final void mo114196f(final C46220c cVar) {
        this.f118853h.postDelayed(new Runnable() {
            public final void run() {
                cVar.mo114172c();
                C46237f.this.mo114194d(cVar);
            }
        }, (long) this.f118848b.mo114176a());
    }

    private C46237f(C46234e eVar) {
        this.f118848b = eVar;
        this.f118847a = new HashMap();
        this.f118853h = new Handler(Looper.getMainLooper());
    }

    /* renamed from: g */
    private String m145181g(C46220c cVar) {
        String a = C46230b.m145165a(this.f118848b.f118833a.mo20651a(cVar));
        if (!cVar.f118816e) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(C46229a.m145162a(cVar.mo114170a()));
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return a;
    }

    /* renamed from: b */
    public final String mo114189b(C46220c cVar) {
        if (cVar == null) {
            return null;
        }
        if (mo114192c(cVar)) {
            return m145181g(cVar);
        }
        long j = cVar.f118812a;
        if (!this.f118847a.containsKey(Long.valueOf(j))) {
            this.f118847a.put(Long.valueOf(j), new C46242g(cVar));
            cVar.mo114172c();
            mo114194d(cVar);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo114192c(C46220c cVar) {
        if (cVar == null) {
            return false;
        }
        String a = C46230b.m145165a(this.f118848b.f118833a.mo20651a(cVar));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".fetched");
        return new File(sb.toString()).exists();
    }

    /* renamed from: a */
    public final void mo114186a(C46212b bVar) {
        if (bVar != null && !this.f118849c.contains(bVar)) {
            this.f118849c.add(bVar);
        }
    }

    /* renamed from: e */
    public final void mo114195e(C46220c cVar) {
        long j = cVar.f118812a;
        String g = m145181g(cVar);
        C46242g gVar = (C46242g) this.f118847a.get(Long.valueOf(j));
        if (gVar != null) {
            for (C46228d a : gVar.f118865b) {
                a.mo20664a(cVar.f118812a, g);
            }
        }
        this.f118847a.remove(Long.valueOf(j));
        for (C46212b a2 : this.f118849c) {
            a2.mo20627a(cVar.f118812a, cVar);
        }
        this.f118850d--;
        this.f118851e = 0;
        mo114190b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo114162a(final C46220c cVar, String str) {
        String a = C46230b.m145165a(this.f118848b.f118833a.mo20651a(cVar));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".fetched");
        try {
            new File(sb.toString()).createNewFile();
        } catch (IOException unused) {
        }
        this.f118853h.post(new Runnable() {
            public final void run() {
                C46237f.this.mo114195e(cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo114160a(final C46220c cVar, final int i) {
        this.f118853h.post(new Runnable() {
            public final void run() {
                C46242g gVar = (C46242g) C46237f.this.f118847a.get(Long.valueOf(cVar.f118812a));
                if (gVar != null) {
                    Iterator it = gVar.f118865b.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo114188a(C46220c cVar, C46228d dVar) {
        if (cVar != null) {
            if (!mo114192c(cVar)) {
                long j = cVar.f118812a;
                if (this.f118847a.containsKey(Long.valueOf(j))) {
                    if (cVar.f118817f) {
                        C46220c cVar2 = ((C46242g) this.f118847a.get(Long.valueOf(j))).f118864a;
                        if (cVar2 != null && this.f118852g.contains(cVar2)) {
                            this.f118852g.remove(cVar2);
                        }
                        cVar.mo114172c();
                        this.f118852g.addFirst(cVar);
                    }
                    if (dVar != null) {
                        ((C46242g) this.f118847a.get(Long.valueOf(j))).mo114201a(dVar);
                        return;
                    }
                    return;
                }
                C46242g gVar = new C46242g(cVar);
                if (dVar != null) {
                    gVar.mo114201a(dVar);
                }
                this.f118847a.put(Long.valueOf(j), gVar);
                cVar.mo114172c();
                if (cVar.f118817f) {
                    this.f118852g.addFirst(cVar);
                } else {
                    this.f118852g.add(cVar);
                }
                mo114190b();
            } else if (dVar != null) {
                dVar.mo20664a(cVar.f118812a, m145181g(cVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo114161a(final C46220c cVar, final BaseGetResourceException baseGetResourceException) {
        this.f118853h.post(new Runnable() {
            public final void run() {
                C46242g gVar = (C46242g) C46237f.this.f118847a.get(Long.valueOf(cVar.f118812a));
                if (gVar != null) {
                    if (cVar.f118818g < Math.max(cVar.f118813b.length, C46237f.this.f118848b.f118835c) - 1) {
                        C46237f.this.mo114196f(cVar);
                        return;
                    }
                    for (C46228d a : gVar.f118865b) {
                        a.mo20665a((Throwable) baseGetResourceException);
                    }
                }
                C46237f.this.f118847a.remove(Long.valueOf(cVar.f118812a));
                for (C46212b a2 : C46237f.this.f118849c) {
                    a2.mo20628a(baseGetResourceException);
                }
                C46237f.this.f118850d--;
                C46237f.this.f118851e++;
                C46237f.this.mo114190b();
            }
        });
    }
}
