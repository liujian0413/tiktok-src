package com.p280ss.android.ugc.network.observer;

import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.DnsResolveResult;
import com.p280ss.android.ugc.network.observer.bean.C44893a;
import com.p280ss.android.ugc.network.observer.bean.C44894b;
import com.p280ss.android.ugc.network.observer.bean.C44895c;
import com.p280ss.android.ugc.network.observer.bean.C44896d;
import com.p280ss.android.ugc.network.observer.bean.DetectorParam;
import com.p280ss.android.ugc.network.observer.p1748a.C44882a;
import com.p280ss.android.ugc.network.observer.p1748a.C44883b;
import com.p280ss.android.ugc.network.observer.p1748a.C44885c;
import com.p280ss.android.ugc.network.observer.p1749b.C44890a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.network.observer.a */
public final class C44880a implements Runnable {

    /* renamed from: a */
    public CopyOnWriteArrayList<Pair<C7563m<NetworkState, HashMap<String, HashMap<String, Object>>, C7581n>, C7562b<HashMap<String, Object>, C7581n>>> f115398a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public CopyOnWriteArrayList<Long> f115399b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final ArrayList<C44882a> f115400c = new ArrayList<>();

    /* renamed from: d */
    private HashMap<String, HashMap<String, Object>> f115401d = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, C44894b> f115402e = new HashMap<>();

    /* renamed from: f */
    private final DetectorParam f115403f;

    /* renamed from: g */
    private final C44895c f115404g;

    /* renamed from: com.ss.android.ugc.network.observer.a$a */
    static final class C44881a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f115405a;

        /* renamed from: b */
        final /* synthetic */ ObjectRef f115406b;

        /* renamed from: c */
        final /* synthetic */ long f115407c;

        /* renamed from: d */
        final /* synthetic */ ObjectRef f115408d;

        C44881a(String str, ObjectRef objectRef, long j, ObjectRef objectRef2) {
            this.f115405a = str;
            this.f115406b = objectRef;
            this.f115407c = j;
            this.f115408d = objectRef2;
        }

        public final void run() {
            Object obj;
            try {
                List b = C7634n.m23768b(this.f115405a, new String[]{":"}, false, 0);
                if (b.size() == 2) {
                    int parseInt = Integer.parseInt((String) b.get(1));
                    if (1 <= parseInt) {
                        if (65534 >= parseInt) {
                            ((ConcurrentHashMap) this.f115406b.element).put(this.f115405a, new Pair(Netecho.INSTANCE.resolveDns((String) b.get(0), this.f115407c), Integer.valueOf(parseInt)));
                            StringBuilder sb = new StringBuilder("dns return ");
                            Pair pair = (Pair) ((ConcurrentHashMap) this.f115406b.element).get(this.f115405a);
                            Integer num = null;
                            if (pair != null) {
                                obj = (DnsResolveResult) pair.getFirst();
                            } else {
                                obj = null;
                            }
                            sb.append(obj);
                            sb.append(" ");
                            Pair pair2 = (Pair) ((ConcurrentHashMap) this.f115406b.element).get(this.f115405a);
                            if (pair2 != null) {
                                num = (Integer) pair2.getSecond();
                            }
                            sb.append(num);
                        }
                    }
                }
            } catch (Throwable th) {
                ((CountDownLatch) this.f115408d.element).countDown();
                throw th;
            }
            ((CountDownLatch) this.f115408d.element).countDown();
        }
    }

    public final void run() {
        String str;
        m141614a(this.f115403f.getTargetList(), (long) this.f115403f.getDnsTimeout());
        long currentTimeMillis = System.currentTimeMillis();
        NetworkState networkState = NetworkState.UNKNOWN_STATUS;
        try {
            long j = -1;
            long j2 = -1;
            for (C44882a aVar : this.f115400c) {
                long currentTimeMillis2 = System.currentTimeMillis();
                C44893a a = aVar.mo107342a();
                if (aVar instanceof C44883b) {
                    j2 = System.currentTimeMillis() - currentTimeMillis2;
                } else if (aVar instanceof C44885c) {
                    j = System.currentTimeMillis() - currentTimeMillis2;
                }
                if (!Thread.interrupted()) {
                    networkState = a.f115439b;
                    if (!a.f115438a) {
                        break;
                    }
                } else {
                    return;
                }
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            if (networkState == NetworkState.NETWORK_GOOD) {
                C44897c.m141640a(currentTimeMillis3);
            }
            if (networkState == NetworkState.NO_NETWORK && this.f115402e.size() == 0) {
                networkState = NetworkState.UNKNOWN_STATUS;
                str = "2";
            } else {
                str = null;
            }
            long j3 = currentTimeMillis3 - currentTimeMillis;
            if (j3 > ((long) this.f115403f.getPingTimeout()) + ((long) this.f115403f.getTcpTimeout()) + 3000) {
                networkState = NetworkState.UNKNOWN_STATUS;
                str = "3";
            }
            this.f115401d.put("extra_info", C44890a.m141625a(str, this.f115404g));
            boolean z = false;
            for (Pair pair : this.f115398a) {
                ((C7563m) pair.getFirst()).invoke(networkState, this.f115401d);
                if (!z) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(C44896d.m141638j(), String.valueOf(networkState.ordinal()));
                    hashMap.put(C44896d.m141631c(), Long.valueOf(currentTimeMillis));
                    if (j != -1) {
                        hashMap.put(C44896d.m141634f(), Long.valueOf(j));
                    }
                    if (j2 != -1) {
                        hashMap.put(C44896d.m141633e(), Long.valueOf(j2));
                    }
                    hashMap.put(C44896d.m141635g(), Long.valueOf(j3));
                    hashMap.put(C44896d.m141639k(), this.f115401d);
                    ((C7562b) pair.getSecond()).invoke(hashMap);
                    z = true;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public C44880a(DetectorParam detectorParam, C44895c cVar) {
        C7573i.m23587b(detectorParam, "param");
        C7573i.m23587b(cVar, "localParam");
        this.f115403f = detectorParam;
        this.f115404g = cVar;
        this.f115400c.add(new C44883b(this.f115402e, this.f115401d, (long) this.f115403f.getPingTimeout()));
        this.f115400c.add(new C44885c(this.f115402e, this.f115401d, (long) this.f115403f.getTcpTimeout()));
    }

    /* renamed from: a */
    private final void m141614a(String[] strArr, long j) {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = new CountDownLatch(strArr.length);
        ObjectRef objectRef2 = new ObjectRef();
        objectRef2.element = new ConcurrentHashMap();
        for (String aVar : strArr) {
            C44881a aVar2 = new C44881a(aVar, objectRef2, j, objectRef);
            new Thread(aVar2).start();
        }
        try {
            ((CountDownLatch) objectRef.element).await(j + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        for (Entry entry : ((ConcurrentHashMap) objectRef2.element).entrySet()) {
            DnsResolveResult dnsResolveResult = (DnsResolveResult) ((Pair) entry.getValue()).getFirst();
            this.f115401d.put(entry.getKey(), new HashMap());
            HashMap hashMap = (HashMap) this.f115401d.get(entry.getKey());
            if (hashMap != null) {
                hashMap.put("dns_result", dnsResolveResult);
            }
            if (dnsResolveResult.getSuccess() && dnsResolveResult.getIp() != null) {
                Map map = this.f115402e;
                Object key = entry.getKey();
                String ip = ((DnsResolveResult) ((Pair) entry.getValue()).getFirst()).getIp();
                if (ip == null) {
                    C7573i.m23580a();
                }
                map.put(key, new C44894b(ip, ((Number) ((Pair) entry.getValue()).getSecond()).intValue()));
            }
        }
    }
}
