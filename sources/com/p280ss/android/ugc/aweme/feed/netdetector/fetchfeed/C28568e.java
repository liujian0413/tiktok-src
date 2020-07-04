package com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.feed.netdetector.base.C28549a;
import com.p280ss.android.ugc.network.observer.NetworkState;
import com.p280ss.android.ugc.network.observer.bean.C44896d;
import com.p280ss.android.ugc.network.observer.p1749b.C44891b;
import java.util.HashMap;
import kotlin.C47965i;
import kotlin.C7581n;
import kotlin.Result;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.e */
public final class C28568e extends C28549a {

    /* renamed from: g */
    public static final C28569a f75227g = new C28569a(null);

    /* renamed from: f */
    public final C28564a f75228f;

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.e$a */
    public static final class C28569a {
        private C28569a() {
        }

        public /* synthetic */ C28569a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.e$b */
    static final class C28570b extends Lambda implements C7562b<Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C28568e f75229a;

        /* renamed from: b */
        final /* synthetic */ NetworkState f75230b;

        /* renamed from: c */
        final /* synthetic */ HashMap f75231c;

        C28570b(C28568e eVar, NetworkState networkState, HashMap hashMap) {
            this.f75229a = eVar;
            this.f75230b = networkState;
            this.f75231c = hashMap;
            super(1);
        }

        /* renamed from: a */
        private void m93806a(long j) {
            this.f75229a.f75228f.mo73270a(this.f75229a, this.f75230b, this.f75231c);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m93806a(((Number) obj).longValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: c */
    public final void mo73266c() {
        super.mo73266c();
        this.f75228f.mo73268a();
    }

    public C28568e(C28564a aVar) {
        C7573i.m23587b(aVar, "fetchFeedDetectorCallBack");
        this.f75228f = aVar;
    }

    /* renamed from: a */
    public final void mo73263a(C22984d dVar) {
        C7573i.m23587b(dVar, "builder");
        dVar.mo59971a(C44896d.m141632d(), this.f75194a);
        dVar.mo59971a(C44896d.m141637i(), System.currentTimeMillis() - this.f75194a);
        Long l = this.f75195b;
        if (l != null) {
            dVar.mo59971a(C44896d.m141636h(), l.longValue() - this.f75194a);
        }
    }

    /* renamed from: a */
    public final void mo73264a(NetworkState networkState, HashMap<String, HashMap<String, Object>> hashMap) {
        C7581n nVar;
        C7573i.m23587b(networkState, "networkState");
        C7573i.m23587b(hashMap, "detailMap");
        try {
            C28568e eVar = this;
            if (!hashMap.containsKey("extra_info")) {
                hashMap.put("extra_info", new HashMap());
            }
            HashMap hashMap2 = (HashMap) hashMap.get("extra_info");
            if (hashMap2 != null) {
                C7573i.m23582a((Object) hashMap2, "map");
                hashMap2.put("start_time", Long.valueOf(eVar.f75194a));
                nVar = C7581n.f20898a;
            } else {
                nVar = null;
            }
            Result.m150902constructorimpl(nVar);
        } catch (Throwable th) {
            Result.m150902constructorimpl(C47965i.m148906a(th));
        }
        if (networkState == NetworkState.NETWORK_GOOD || networkState == NetworkState.UNKNOWN_STATUS) {
            new C44891b().mo107347a(10000, new C28570b(this, networkState, hashMap));
        } else {
            this.f75228f.mo73270a(this, networkState, hashMap);
        }
    }
}
