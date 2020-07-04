package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.common.util.concurrent.C18225b;
import com.google.common.util.concurrent.C18242e;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dv */
public class C39359dv<V> extends C18225b<V> {

    /* renamed from: a */
    private String f102241a;

    /* renamed from: b */
    private boolean f102242b;

    /* renamed from: c */
    private AtomicInteger f102243c = new AtomicInteger();

    /* renamed from: i */
    private LinkedHashMap<Runnable, Executor> f102244i = new LinkedHashMap<>();

    /* renamed from: d */
    public final int mo97925d() {
        return this.f102243c.get();
    }

    public C39359dv() {
    }

    public C39359dv(String str) {
        this.f102241a = str;
        this.f102242b = !TextUtils.isEmpty(str);
    }

    /* renamed from: a */
    public final void mo97923a(int i) {
        if (this.f102242b) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f102241a);
            sb.append(" ProgressiveFuture.setProgress:");
            sb.append(i);
            C41530am.m132285d(sb.toString());
        }
        this.f102243c.getAndSet(i);
        C18242e eVar = new C18242e();
        synchronized (this) {
            for (Entry entry : this.f102244i.entrySet()) {
                eVar.mo47110a((Runnable) entry.getKey(), (Executor) entry.getValue());
            }
        }
        eVar.mo47109a();
    }

    /* renamed from: c */
    private void m125721c(Runnable runnable, Executor executor) {
        if (this.f102243c.get() > 0) {
            executor.execute(runnable);
        }
    }

    /* renamed from: b */
    public final synchronized void mo97924b(Runnable runnable, Executor executor) {
        this.f102244i.put(runnable, executor);
        m125721c(runnable, executor);
    }
}
