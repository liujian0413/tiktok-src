package com.bytedance.p524g.p525a.p527b;

import android.util.SparseArray;
import com.bytedance.p524g.p525a.C10249a;
import com.bytedance.p524g.p525a.C10258b;
import com.bytedance.p524g.p525a.p529d.C10273a;
import com.bytedance.p524g.p525a.p529d.C10274b;
import com.google.android.play.core.splitinstall.C17133c;
import com.google.android.play.core.splitinstall.C17134d;
import com.google.android.play.core.splitinstall.C17135e;
import com.google.android.play.core.splitinstall.C17137g;
import com.google.android.play.core.splitinstall.C6563f;
import com.google.android.play.core.tasks.C17145a;
import com.google.android.play.core.tasks.C17146b;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.g.a.b.b */
public final class C10263b implements C10267c, C17137g {

    /* renamed from: b */
    public static volatile boolean f27886b;

    /* renamed from: a */
    public SparseArray<C10258b> f27887a = new SparseArray<>();

    /* renamed from: c */
    private ScheduledThreadPoolExecutor f27888c;

    /* renamed from: d */
    private C17133c f27889d;

    /* renamed from: e */
    private Queue<C10258b> f27890e = new LinkedList();

    /* renamed from: f */
    private Object f27891f = new Object();

    /* renamed from: g */
    private C10273a f27892g;

    /* renamed from: com.bytedance.g.a.b.b$a */
    class C10266a implements Runnable {

        /* renamed from: b */
        private C10258b f27898b;

        public final void run() {
            C10263b.this.mo24988a(this.f27898b);
        }

        public C10266a(C10258b bVar) {
            this.f27898b = bVar;
        }
    }

    /* renamed from: b */
    private void m30406b() {
        synchronized (this.f27891f) {
            if (this.f27888c.getQueue().isEmpty() && !f27886b) {
                mo24987a();
            }
        }
    }

    /* renamed from: a */
    public final void mo24987a() {
        synchronized (this.f27891f) {
            C10258b bVar = (C10258b) this.f27890e.poll();
            if (bVar != null) {
                f27886b = true;
                this.f27888c.schedule(new C10266a(bVar), bVar.f27877d, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: a */
    private void m30404a(String str) {
        mo24989a(str, 0);
    }

    /* renamed from: b */
    public final Set<String> mo24984b(C10249a aVar) {
        if (this.f27889d == null) {
            this.f27889d = C17134d.m56791a(aVar.f27859b.getApplicationContext());
            this.f27889d.mo44404a((C17137g) this);
        }
        if (this.f27892g == null) {
            this.f27892g = new C10274b(aVar.f27859b.getApplicationContext());
        }
        return this.f27889d.mo44407b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo15871a(C6563f fVar) {
        String str;
        int i = fVar.f18874a;
        int i2 = fVar.f18875b;
        List a = fVar.mo15926a();
        if (!a.isEmpty()) {
            str = (String) a.get(0);
        } else {
            str = null;
        }
        if (str != null) {
            if (i2 == 6) {
                f27886b = false;
                mo24989a(str, 300000);
                m30406b();
            } else if (i2 == 8) {
                f27886b = false;
                this.f27889d.mo44400a(i);
                mo24989a(str, 900000);
                m30406b();
            } else {
                if (i2 == 5) {
                    m30405a(str, "stage_installed");
                    f27886b = false;
                    m30406b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24983a(C10249a aVar) {
        if (this.f27888c == null) {
            this.f27888c = new ScheduledThreadPoolExecutor(1);
        }
        if (this.f27889d == null) {
            this.f27889d = C17134d.m56791a(aVar.f27859b.getApplicationContext());
            this.f27889d.mo44404a((C17137g) this);
        }
        if (this.f27892g == null) {
            this.f27892g = new C10274b(aVar.f27859b.getApplicationContext());
        }
        Set b = mo24984b(aVar);
        List<String> list = aVar.f27858a;
        if (list != null && !list.isEmpty()) {
            list.removeAll(b);
            if (!list.isEmpty()) {
                synchronized (this.f27891f) {
                    for (String a : list) {
                        m30404a(a);
                    }
                }
                m30406b();
            }
        }
    }

    /* renamed from: a */
    public final void mo24988a(final C10258b bVar) {
        if (this.f27889d != null && !mo24984b(null).contains(bVar.f27875b)) {
            this.f27889d.mo44401a(C17135e.m56792a().mo44410a(bVar.f27875b).mo44412a()).mo44417a((C17146b<? super TResult>) new C17146b<Integer>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo24986a(Integer num) {
                    C10263b.this.f27887a.put(num.intValue(), bVar);
                }
            }).mo44416a((C17145a) new C17145a() {
                /* renamed from: a */
                public final void mo24985a(Exception exc) {
                    C10263b.f27886b = false;
                    C10263b.this.mo24989a(bVar.f27875b, 300000);
                    C10263b.this.mo24987a();
                }
            });
            m30405a(bVar.f27875b, "stage_start_install");
        }
    }

    /* renamed from: a */
    private void m30405a(String str, String str2) {
        if (this.f27892g != null) {
            this.f27892g.mo24992a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo24989a(String str, long j) {
        synchronized (this.f27891f) {
            C10258b bVar = new C10258b(str);
            bVar.f27877d = j;
            this.f27890e.add(bVar);
        }
    }
}
