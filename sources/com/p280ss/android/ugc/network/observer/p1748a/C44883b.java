package com.p280ss.android.ugc.network.observer.p1748a;

import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.p280ss.android.ugc.network.observer.NetworkState;
import com.p280ss.android.ugc.network.observer.bean.C44893a;
import com.p280ss.android.ugc.network.observer.bean.C44894b;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.ObjectRef;

/* renamed from: com.ss.android.ugc.network.observer.a.b */
public final class C44883b implements C44882a {

    /* renamed from: a */
    public final long f115409a;

    /* renamed from: b */
    private final HashMap<String, C44894b> f115410b;

    /* renamed from: c */
    private final HashMap<String, HashMap<String, Object>> f115411c;

    /* renamed from: com.ss.android.ugc.network.observer.a.b$a */
    static final class C44884a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Entry f115412a;

        /* renamed from: b */
        final /* synthetic */ C44883b f115413b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f115414c;

        /* renamed from: d */
        final /* synthetic */ BooleanRef f115415d;

        /* renamed from: e */
        final /* synthetic */ ObjectRef f115416e;

        C44884a(Entry entry, C44883b bVar, ObjectRef objectRef, BooleanRef booleanRef, ObjectRef objectRef2) {
            this.f115412a = entry;
            this.f115413b = bVar;
            this.f115414c = objectRef;
            this.f115415d = booleanRef;
            this.f115416e = objectRef2;
        }

        public final void run() {
            try {
                IcmpDetectResult detectIcmp = Netecho.INSTANCE.detectIcmp(((C44894b) this.f115412a.getValue()).f115440a, this.f115413b.f115409a, 3);
                ((ConcurrentHashMap) this.f115414c.element).put(this.f115412a.getKey(), detectIcmp);
                if (detectIcmp.getSuccess()) {
                    this.f115415d.element = true;
                }
            } catch (Throwable th) {
                ((CountDownLatch) this.f115416e.element).countDown();
                throw th;
            }
            ((CountDownLatch) this.f115416e.element).countDown();
        }
    }

    /* renamed from: a */
    public final C44893a mo107342a() {
        NetworkState networkState;
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = new CountDownLatch(this.f115410b.size());
        BooleanRef booleanRef = new BooleanRef();
        booleanRef.element = false;
        ObjectRef objectRef2 = new ObjectRef();
        objectRef2.element = new ConcurrentHashMap();
        for (Entry aVar : this.f115410b.entrySet()) {
            C44884a aVar2 = new C44884a(aVar, this, objectRef2, booleanRef, objectRef);
            new Thread(aVar2).start();
        }
        try {
            ((CountDownLatch) objectRef.element).await(this.f115409a + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        boolean z = booleanRef.element;
        for (Entry entry : ((ConcurrentHashMap) objectRef2.element).entrySet()) {
            HashMap hashMap = (HashMap) this.f115411c.get(entry.getKey());
            if (hashMap != null) {
                hashMap.put("icmp_result", entry.getValue());
            }
        }
        boolean z2 = !z;
        if (z) {
            networkState = NetworkState.NETWORK_GOOD;
        } else {
            networkState = NetworkState.NO_NETWORK;
        }
        return new C44893a(z2, networkState);
    }

    public C44883b(HashMap<String, C44894b> hashMap, HashMap<String, HashMap<String, Object>> hashMap2, long j) {
        C7573i.m23587b(hashMap, "dnsMap");
        C7573i.m23587b(hashMap2, "resultMap");
        this.f115410b = hashMap;
        this.f115411c = hashMap2;
        this.f115409a = j;
    }
}
