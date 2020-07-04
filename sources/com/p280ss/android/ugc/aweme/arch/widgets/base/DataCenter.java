package com.p280ss.android.ugc.aweme.arch.widgets.base;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.DataCenter */
public class DataCenter extends C0063u {

    /* renamed from: g */
    private static ExecutorService f60907g;

    /* renamed from: a */
    public AtomicInteger f60908a = new AtomicInteger(0);

    /* renamed from: b */
    private Map<String, Object> f60909b = new HashMap();

    /* renamed from: c */
    private Map<String, C23084b<C23083a>> f60910c = new HashMap();

    /* renamed from: d */
    private C0043i f60911d;

    /* renamed from: e */
    private Thread f60912e;

    /* renamed from: f */
    private Handler f60913f = new Handler(Looper.getMainLooper());

    public void onCleared() {
        this.f60909b.clear();
        this.f60910c.clear();
        this.f60911d = null;
    }

    /* renamed from: b */
    private boolean m75852b() {
        if (this.f60912e == null) {
            this.f60912e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f60912e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static ExecutorService m75850a() {
        if (f60907g == null) {
            synchronized (WidgetManager.class) {
                if (f60907g == null) {
                    f60907g = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18994a("widgetinit").mo18996a());
                }
            }
        }
        return f60907g;
    }

    /* renamed from: a */
    public final DataCenter mo60131a(C0053p<C23083a> pVar) {
        for (C23084b removeObserver : this.f60910c.values()) {
            removeObserver.removeObserver(pVar);
        }
        return this;
    }

    /* renamed from: b */
    private C23084b<C23083a> m75851b(String str) {
        C23084b<C23083a> bVar = (C23084b) this.f60910c.get(str);
        if (bVar == null) {
            bVar = new C23084b<>();
            if (this.f60909b.containsKey(str)) {
                bVar.setValue(new C23083a(str, this.f60909b.get(str)));
            }
            this.f60910c.put(str, bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public final <T> T mo60135a(String str) {
        T t = this.f60909b.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final DataCenter mo60132a(String str, C0053p<C23083a> pVar) {
        return mo60133a(str, pVar, false);
    }

    /* renamed from: a */
    public static DataCenter m75849a(C0065w wVar, C0043i iVar) {
        DataCenter dataCenter = (DataCenter) wVar.mo147a(DataCenter.class);
        dataCenter.f60911d = iVar;
        return dataCenter;
    }

    /* renamed from: b */
    public final <T> T mo60136b(String str, T t) {
        if (!this.f60909b.containsKey(str)) {
            return t;
        }
        return mo60135a(str);
    }

    /* renamed from: a */
    public final DataCenter mo60134a(final String str, final Object obj) {
        if (!m75852b()) {
            this.f60913f.post(new Runnable() {
                public final void run() {
                    DataCenter.this.mo60134a(str, obj);
                }
            });
            return this;
        }
        while (this.f60908a.get() > 0) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            this.f60909b.put(str, obj);
            C0052o oVar = (C0052o) this.f60910c.get(str);
            if (oVar != null) {
                oVar.setValue(new C23083a(str, obj));
            }
        }
        return this;
    }

    /* renamed from: a */
    public final DataCenter mo60133a(String str, C0053p<C23083a> pVar, boolean z) {
        if (TextUtils.isEmpty(str) || pVar == null) {
            return this;
        }
        m75851b(str).mo60162a(this.f60911d, pVar, z);
        return this;
    }
}
