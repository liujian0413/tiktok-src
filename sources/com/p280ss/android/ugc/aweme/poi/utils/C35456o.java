package com.p280ss.android.ugc.aweme.poi.utils;

import bolts.AggregateException;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.C1642a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.poi.model.C35106c;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.o */
public final class C35456o {

    /* renamed from: com.ss.android.ugc.aweme.poi.utils.o$a */
    public static class C35459a {

        /* renamed from: a */
        public String f92968a;

        /* renamed from: b */
        public long f92969b;

        /* renamed from: c */
        public String f92970c;
    }

    /* renamed from: b */
    public static void m114541b() {
        C6877n.m21407a("poi_log", "select_city", null);
    }

    /* renamed from: a */
    public static void m114535a() {
        C6869c a = C6869c.m21381a();
        a.mo16885a("status", Integer.valueOf(0));
        C6877n.m21407a("poi_log", "get_poi_detail", a.mo16888b());
    }

    /* renamed from: a */
    public static <TResult> C1592h<List<TResult>> m114534a(final Collection<? extends C1592h<TResult>> collection) {
        return m114540b(collection).mo6885c((C1591g<TResult, TContinuationResult>) new C1591g<Void, List<TResult>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<TResult> then(C1592h<Void> hVar) throws Exception {
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (C1592h e : collection) {
                    arrayList.add(e.mo6890e());
                }
                return arrayList;
            }
        });
    }

    /* renamed from: b */
    private static C1592h<Void> m114540b(Collection<? extends C1592h<?>> collection) {
        if (collection.size() == 0) {
            return C1592h.m7851a(null);
        }
        C1606i iVar = new C1606i();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        long currentTimeMillis = System.currentTimeMillis();
        for (C1592h hVar : collection) {
            final long j = currentTimeMillis;
            final Object obj2 = obj;
            final ArrayList arrayList2 = arrayList;
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            ArrayList arrayList3 = arrayList;
            C354582 r9 = r1;
            final AtomicInteger atomicInteger2 = atomicInteger;
            Object obj3 = obj;
            final C1606i iVar2 = iVar;
            C354582 r1 = new C1591g<Object, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<Object> hVar) {
                    C35456o.m114536a(hVar, System.currentTimeMillis() - j);
                    if (hVar.mo6889d()) {
                        synchronized (obj2) {
                            arrayList2.add(hVar.mo6891f());
                        }
                    }
                    if (hVar.mo6887c()) {
                        atomicBoolean2.set(true);
                    }
                    if (atomicInteger2.decrementAndGet() == 0) {
                        if (arrayList2.size() != 0) {
                            if (arrayList2.size() == 1) {
                                iVar2.mo6902b((Exception) arrayList2.get(0));
                            } else {
                                iVar2.mo6902b((Exception) new AggregateException(C1642a.m8035a(Locale.US, "There were %d exceptions.", new Object[]{Integer.valueOf(arrayList2.size())}), (List<? extends Throwable>) arrayList2));
                            }
                        } else if (atomicBoolean2.get()) {
                            iVar2.mo6901b();
                        } else {
                            iVar2.mo6903b(null);
                        }
                    }
                    return null;
                }
            };
            hVar.mo6875a((C1591g<TResult, TContinuationResult>) r9);
            arrayList = arrayList3;
            obj = obj3;
        }
        return iVar.f6010a;
    }

    /* renamed from: a */
    public static void m114539a(List<C35459a> list) {
        if (list.size() == 2) {
            C6869c a = C6869c.m21381a();
            long j = 0;
            for (C35459a aVar : list) {
                if (j <= aVar.f92969b) {
                    j = aVar.f92969b;
                }
                if ("poi_aweme".equalsIgnoreCase(aVar.f92968a)) {
                    a.mo16887a("ame_request_id", aVar.f92970c);
                    a.mo16886a("api_aweme", Long.valueOf(aVar.f92969b));
                } else {
                    a.mo16887a("poi_request_id", aVar.f92970c);
                    a.mo16886a("api_detail", Long.valueOf(aVar.f92969b));
                }
            }
            a.mo16886a("api_join", Long.valueOf(j));
            a.mo16885a("status", Integer.valueOf(1));
            C6877n.m21407a("poi_log", "get_poi_detail", a.mo16888b());
        }
    }

    /* renamed from: a */
    public static void m114538a(String str, JSONObject jSONObject) {
        C6877n.m21407a("poi_log", str, jSONObject);
    }

    /* renamed from: a */
    public static void m114536a(C1592h<Object> hVar, long j) {
        Object e = hVar.mo6890e();
        if (e != null) {
            if (e instanceof PoiDetail) {
                ((PoiDetail) e).setDuration(j);
                return;
            }
            if (e instanceof C35106c) {
                ((C35106c) e).f91794e = j;
            }
        }
    }

    /* renamed from: a */
    public static void m114537a(PoiDetail poiDetail, long j) {
        int i;
        C6869c a = C6869c.m21381a();
        a.mo16886a("api_detail", Long.valueOf(poiDetail.getDuration()));
        a.mo16886a("api_join", Long.valueOf(j));
        if (poiDetail != null) {
            i = 1;
            a.mo16887a("request_id", poiDetail.getRequestId());
        } else {
            i = 0;
        }
        a.mo16885a("status", Integer.valueOf(i));
        C6877n.m21407a("poi_log", "get_poi_detail", a.mo16888b());
    }
}
