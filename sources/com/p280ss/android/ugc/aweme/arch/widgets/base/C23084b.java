package com.p280ss.android.ugc.aweme.arch.widgets.base;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.b */
public class C23084b<T> extends C0052o<T> {

    /* renamed from: c */
    private static Handler f60950c = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public int f60951a = -1;

    /* renamed from: b */
    private Map<C0053p, C23086a<T>> f60952b = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.b$a */
    class C23086a<R> implements C0053p<R> {

        /* renamed from: b */
        private int f60956b;

        /* renamed from: c */
        private C0053p<R> f60957c;

        /* renamed from: d */
        private boolean f60958d;

        public final void onChanged(R r) {
            if (this.f60958d || this.f60956b < C23084b.this.f60951a) {
                this.f60957c.onChanged(r);
            }
        }

        C23086a(int i, C0053p<R> pVar, boolean z) {
            this.f60956b = i;
            this.f60957c = pVar;
            this.f60958d = z;
        }
    }

    public void observeForever(C0053p<T> pVar) {
        mo60163a(pVar, false);
    }

    public void postValue(final T t) {
        f60950c.post(new Runnable() {
            public final void run() {
                C23084b.this.setValue(t);
            }
        });
    }

    public void setValue(T t) {
        this.f60951a++;
        super.setValue(t);
    }

    public void removeObserver(C0053p<T> pVar) {
        C23086a aVar = (C23086a) this.f60952b.remove(pVar);
        if (aVar != null) {
            super.removeObserver(aVar);
            return;
        }
        if (pVar instanceof C23086a) {
            C0053p pVar2 = null;
            Iterator it = this.f60952b.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (pVar.equals(entry.getValue())) {
                    pVar2 = (C0053p) entry.getKey();
                    super.removeObserver(pVar);
                    break;
                }
            }
            if (pVar2 != null) {
                this.f60952b.remove(pVar2);
            }
        }
    }

    public void observe(C0043i iVar, C0053p<T> pVar) {
        mo60162a(iVar, pVar, false);
    }

    /* renamed from: a */
    public final void mo60163a(C0053p<T> pVar, boolean z) {
        if (!this.f60952b.containsKey(pVar)) {
            C23086a aVar = new C23086a(this.f60951a, pVar, false);
            this.f60952b.put(pVar, aVar);
            super.observeForever(aVar);
        }
    }

    /* renamed from: a */
    public final void mo60162a(C0043i iVar, C0053p<T> pVar, boolean z) {
        if (!this.f60952b.containsKey(pVar)) {
            C23086a aVar = new C23086a(this.f60951a, pVar, z);
            this.f60952b.put(pVar, aVar);
            super.observe(iVar, aVar);
        }
    }
}
