package com.p280ss.android.ugc.aweme.store;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.store.LocalStore.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.store.c */
public class C41961c {

    /* renamed from: a */
    private static volatile C41961c f109025a;

    /* renamed from: b */
    private List<C41962a> f109026b = new ArrayList();

    /* renamed from: c */
    private Handler f109027c = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.store.c$a */
    static class C41962a implements Runnable {

        /* renamed from: a */
        public C41964e f109028a;

        /* renamed from: b */
        private volatile boolean f109029b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo102978a() throws Exception {
            if (!this.f109029b) {
                this.f109028a.mo102981a();
            }
            return null;
        }

        public final void run() {
            C1592h.m7853a((Callable<TResult>) new C41963d<TResult>(this));
        }

        C41962a(C41964e eVar) {
            this.f109028a = eVar;
        }
    }

    private C41961c() {
    }

    /* renamed from: a */
    public static C41961c m133432a() {
        if (f109025a == null) {
            synchronized (C41961c.class) {
                if (f109025a == null) {
                    f109025a = new C41961c();
                }
            }
        }
        return f109025a;
    }

    /* renamed from: a */
    public final void mo102976a(String str) {
        C41962a a = m133431a(str, Type.COMMENT);
        if (a != null) {
            a.f109028a.mo102982b();
        }
    }

    /* renamed from: b */
    public final void mo102977b(String str) {
        C41962a a = m133431a(str, Type.PROFILE);
        if (a != null) {
            a.f109028a.mo102982b();
        }
    }

    /* renamed from: a */
    public final void mo102975a(C41964e eVar) {
        if (eVar.f109032b != null && !TextUtils.isEmpty(eVar.f109032b.getAid()) && eVar.f109033c != null) {
            C41962a aVar = new C41962a(eVar);
            this.f109026b.add(aVar);
            this.f109027c.postDelayed(aVar, (long) eVar.f109031a);
        }
    }

    /* renamed from: a */
    private C41962a m133431a(String str, Type type) {
        for (C41962a aVar : this.f109026b) {
            if (aVar != null && aVar.f109028a != null && aVar.f109028a.f109032b != null && aVar.f109028a.f109032b.getAid() != null && aVar.f109028a.f109032b.getAid().equals(str) && aVar.f109028a.f109033c == type) {
                return aVar;
            }
        }
        return null;
    }
}
