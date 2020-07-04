package com.p280ss.android.ugc.network.observer.p1748a;

import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.TcpDetectResult;
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

/* renamed from: com.ss.android.ugc.network.observer.a.c */
public final class C44885c implements C44882a {

    /* renamed from: a */
    public final long f115417a;

    /* renamed from: b */
    private final HashMap<String, C44894b> f115418b;

    /* renamed from: c */
    private final HashMap<String, HashMap<String, Object>> f115419c;

    /* renamed from: com.ss.android.ugc.network.observer.a.c$a */
    static final class C44886a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Entry f115420a;

        /* renamed from: b */
        final /* synthetic */ C44885c f115421b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f115422c;

        /* renamed from: d */
        final /* synthetic */ BooleanRef f115423d;

        /* renamed from: e */
        final /* synthetic */ ObjectRef f115424e;

        C44886a(Entry entry, C44885c cVar, ObjectRef objectRef, BooleanRef booleanRef, ObjectRef objectRef2) {
            this.f115420a = entry;
            this.f115421b = cVar;
            this.f115422c = objectRef;
            this.f115423d = booleanRef;
            this.f115424e = objectRef2;
        }

        public final void run() {
            try {
                TcpDetectResult detectTcp = Netecho.INSTANCE.detectTcp(((C44894b) this.f115420a.getValue()).f115440a, ((C44894b) this.f115420a.getValue()).f115441b, this.f115421b.f115417a);
                ((ConcurrentHashMap) this.f115422c.element).put(this.f115420a.getKey(), detectTcp);
                if (detectTcp.getSuccess()) {
                    this.f115423d.element = true;
                }
            } catch (Throwable th) {
                ((CountDownLatch) this.f115424e.element).countDown();
                throw th;
            }
            ((CountDownLatch) this.f115424e.element).countDown();
        }
    }

    /* renamed from: a */
    public final C44893a mo107342a() {
        NetworkState networkState;
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = new CountDownLatch(this.f115418b.size());
        BooleanRef booleanRef = new BooleanRef();
        booleanRef.element = false;
        ObjectRef objectRef2 = new ObjectRef();
        objectRef2.element = new ConcurrentHashMap();
        for (Entry aVar : this.f115418b.entrySet()) {
            C44886a aVar2 = new C44886a(aVar, this, objectRef2, booleanRef, objectRef);
            new Thread(aVar2).start();
        }
        try {
            ((CountDownLatch) objectRef.element).await(this.f115417a + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        boolean z = booleanRef.element;
        for (Entry entry : ((ConcurrentHashMap) objectRef2.element).entrySet()) {
            HashMap hashMap = (HashMap) this.f115419c.get(entry.getKey());
            if (hashMap != null) {
                hashMap.put("tcp_result", entry.getValue());
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

    public C44885c(HashMap<String, C44894b> hashMap, HashMap<String, HashMap<String, Object>> hashMap2, long j) {
        C7573i.m23587b(hashMap, "dnsMap");
        C7573i.m23587b(hashMap2, "resultMap");
        this.f115418b = hashMap;
        this.f115419c = hashMap2;
        this.f115417a = j;
    }
}
