package com.p280ss.android.ugc.aweme.p1052b;

import android.view.View;
import com.p280ss.android.ugc.aweme.p1052b.C23150e.C23151a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.b.g */
public final class C23153g implements Runnable {

    /* renamed from: a */
    private WeakReference<C23151a> f61099a;

    /* renamed from: b */
    private WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> f61100b;

    public final void run() {
        C23151a aVar;
        WeakReference<C23151a> weakReference = this.f61099a;
        ConcurrentHashMap concurrentHashMap = null;
        if (weakReference != null) {
            aVar = (C23151a) weakReference.get();
        } else {
            aVar = null;
        }
        WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> weakReference2 = this.f61100b;
        if (weakReference2 != null) {
            concurrentHashMap = (ConcurrentHashMap) weakReference2.get();
        }
        if (aVar != null && concurrentHashMap != null) {
            for (Pair pair : aVar.f61096a) {
                Object first = pair.getFirst();
                int intValue = ((Number) pair.getSecond()).intValue();
                int intValue2 = ((Number) first).intValue();
                LinkedList linkedList = (LinkedList) concurrentHashMap.get(Integer.valueOf(intValue2));
                if (linkedList != null) {
                    if (linkedList.size() > intValue) {
                        synchronized (linkedList) {
                            int i = 0;
                            while (true) {
                                if (i >= intValue) {
                                    break;
                                } else if (((View) linkedList.poll()) == null) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        concurrentHashMap.remove(Integer.valueOf(intValue2));
                    }
                }
            }
        }
    }

    public C23153g(C23151a aVar, ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap) {
        C7573i.m23587b(aVar, "target");
        C7573i.m23587b(concurrentHashMap, "viewCaches");
        this.f61099a = new WeakReference<>(aVar);
        this.f61100b = new WeakReference<>(concurrentHashMap);
    }
}
