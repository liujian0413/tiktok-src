package com.bytedance.framwork.core.sdkmonitor;

import android.text.TextUtils;
import com.bytedance.framwork.core.p517a.p521d.C10219a;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.a */
public final class C10241a {

    /* renamed from: a */
    public final LinkedList<C10248g> f27840a = new LinkedList<>();

    /* renamed from: b */
    public final LinkedList<C10243b> f27841b = new LinkedList<>();

    /* renamed from: c */
    private int f27842c = 50;

    /* renamed from: d */
    private boolean f27843d;

    /* renamed from: a */
    public final void mo24971a(final SDKMonitor sDKMonitor) {
        if (!this.f27843d) {
            this.f27843d = true;
            C10219a.m30335a().mo24932a((Runnable) new Runnable() {
                public final void run() {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    try {
                        synchronized (C10241a.this.f27840a) {
                            linkedList = new LinkedList(C10241a.this.f27840a);
                            C10241a.this.f27840a.clear();
                        }
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C10241a.m30365a(sDKMonitor, (C10248g) it.next());
                        }
                        synchronized (C10241a.this.f27841b) {
                            linkedList2 = new LinkedList(C10241a.this.f27841b);
                            C10241a.this.f27841b.clear();
                        }
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            C10241a.m30364a(sDKMonitor, (C10243b) it2.next());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo24972a(C10243b bVar) {
        synchronized (this.f27841b) {
            if (this.f27841b.size() > this.f27842c) {
                this.f27841b.poll();
            }
            this.f27841b.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo24973a(C10248g gVar) {
        synchronized (this.f27840a) {
            if (this.f27840a.size() > this.f27842c) {
                this.f27840a.poll();
            }
            this.f27840a.add(gVar);
        }
    }

    /* renamed from: a */
    public static void m30364a(SDKMonitor sDKMonitor, C10243b bVar) {
        if (bVar != null) {
            sDKMonitor.monitorCommonLogInternal(bVar.f27846a, bVar.f27847b, bVar.f27848c);
        }
    }

    /* renamed from: a */
    public static void m30365a(SDKMonitor sDKMonitor, C10248g gVar) {
        if (gVar != null && !TextUtils.isEmpty(gVar.f27851a)) {
            sDKMonitor.monitorService(gVar.f27851a, gVar.f27852b, gVar.f27853c, gVar.f27854d, gVar.f27855e, gVar.f27856f, gVar.f27857g);
        }
    }
}
