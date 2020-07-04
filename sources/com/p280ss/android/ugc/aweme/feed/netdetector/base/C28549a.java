package com.p280ss.android.ugc.aweme.feed.netdetector.base;

import android.util.Log;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.experiment.DetectorParamSettings;
import com.p280ss.android.ugc.network.observer.C44887b;
import com.p280ss.android.ugc.network.observer.NetworkState;
import com.p280ss.android.ugc.network.observer.bean.C44895c;
import com.p280ss.android.ugc.network.observer.bean.C44896d;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C47965i;
import kotlin.C7581n;
import kotlin.Result;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.base.a */
public abstract class C28549a implements C28555d {

    /* renamed from: a */
    public long f75194a = -1;

    /* renamed from: b */
    public Long f75195b;

    /* renamed from: c */
    public C28550a f75196c;

    /* renamed from: d */
    public boolean f75197d;

    /* renamed from: e */
    public boolean f75198e;

    /* renamed from: f */
    private long f75199f = -1;

    /* renamed from: g */
    private final C7563m<NetworkState, HashMap<String, HashMap<String, Object>>, C7581n> f75200g = new C28551b(this);

    /* renamed from: h */
    private final C7562b<HashMap<String, Object>, C7581n> f75201h = new C28552c(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.base.a$a */
    static final class C28550a {

        /* renamed from: a */
        public final NetworkState f75202a;

        /* renamed from: b */
        public final HashMap<String, HashMap<String, Object>> f75203b;

        public C28550a(NetworkState networkState, HashMap<String, HashMap<String, Object>> hashMap) {
            C7573i.m23587b(networkState, "networkState");
            C7573i.m23587b(hashMap, "detailMap");
            this.f75202a = networkState;
            this.f75203b = hashMap;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.base.a$b */
    static final class C28551b extends Lambda implements C7563m<NetworkState, HashMap<String, HashMap<String, Object>>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C28549a f75204a;

        C28551b(C28549a aVar) {
            this.f75204a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m93771a((NetworkState) obj, (HashMap) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m93771a(NetworkState networkState, HashMap<String, HashMap<String, Object>> hashMap) {
            C7573i.m23587b(networkState, "networkState");
            C7573i.m23587b(hashMap, "detailMap");
            if (!this.f75204a.f75197d) {
                this.f75204a.f75197d = true;
                this.f75204a.f75195b = Long.valueOf(System.currentTimeMillis());
                this.f75204a.f75196c = new C28550a(networkState, hashMap);
                StringBuilder sb = new StringBuilder("detectResultCallback -> networkState:");
                sb.append(networkState);
                sb.append(", detailMap:");
                sb.append(hashMap);
                sb.append('}');
                C28549a.m93761a(sb.toString());
                this.f75204a.mo73264a(networkState, hashMap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.base.a$c */
    static final class C28552c extends Lambda implements C7562b<HashMap<String, Object>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C28549a f75205a;

        C28552c(C28549a aVar) {
            this.f75205a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m93772a((HashMap) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m93772a(HashMap<String, Object> hashMap) {
            C7573i.m23587b(hashMap, "map");
            if (!this.f75205a.f75198e) {
                this.f75205a.f75198e = true;
                C22984d dVar = new C22984d();
                for (Entry entry : hashMap.entrySet()) {
                    dVar.mo59972a((String) entry.getKey(), entry.getValue());
                }
                C6907h.m21524a(C44896d.m141629a(), (Map) dVar.f60753a);
                StringBuilder sb = new StringBuilder("detectResultReportCallback -> networkState:");
                sb.append(hashMap);
                sb.append('}');
                C28549a.m93761a(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo73262a() {
        m93764g();
    }

    /* renamed from: a */
    public abstract void mo73263a(C22984d dVar);

    /* renamed from: a */
    public abstract void mo73264a(NetworkState networkState, HashMap<String, HashMap<String, Object>> hashMap);

    /* renamed from: b */
    public final void mo73265b() {
        mo73266c();
    }

    /* renamed from: f */
    private final void m93763f() {
        C44887b.m141621a(this.f75199f);
    }

    /* renamed from: e */
    private final long m93762e() {
        return C44887b.f115425a.mo107345a(DetectorParamSettings.getParameters(), new C44895c(C28580o.m93835e(), C28580o.m93834d()), this.f75200g, this.f75201h);
    }

    /* renamed from: d */
    public final void mo73267d() {
        try {
            C28549a aVar = this;
            aVar.f75197d = true;
            aVar.f75198e = true;
            aVar.m93763f();
            Result.m150902constructorimpl(C7581n.f20898a);
        } catch (Throwable th) {
            Result.m150902constructorimpl(C47965i.m148906a(th));
        }
    }

    /* renamed from: g */
    private void m93764g() {
        try {
            C28549a aVar = this;
            aVar.f75194a = System.currentTimeMillis();
            aVar.f75199f = aVar.m93762e();
            StringBuilder sb = new StringBuilder("requestStart -> Create NoNet-Detect. detector id : ");
            sb.append(aVar.f75199f);
            Result.m150902constructorimpl(Integer.valueOf(m93761a(sb.toString())));
        } catch (Throwable th) {
            Result.m150902constructorimpl(C47965i.m148906a(th));
        }
    }

    /* renamed from: c */
    public void mo73266c() {
        C7581n nVar;
        try {
            C28549a aVar = this;
            m93761a("requestFinish -> report and try to cancel NoNet-Detect");
            C28550a aVar2 = aVar.f75196c;
            if (aVar2 != null) {
                if (aVar2.f75202a == NetworkState.NO_NETWORK) {
                    C22984d a = new C22984d().mo59972a(C44896d.m141639k(), (Object) aVar2.f75203b);
                    C7573i.m23582a((Object) a, "builder");
                    aVar.mo73263a(a);
                    C6907h.m21524a(C44896d.m141630b(), (Map) a.f60753a);
                }
                nVar = C7581n.f20898a;
            } else {
                nVar = null;
            }
            Result.m150902constructorimpl(nVar);
        } catch (Throwable th) {
            Result.m150902constructorimpl(C47965i.m148906a(th));
        }
        mo73267d();
    }

    /* renamed from: a */
    public static int m93761a(String str) {
        return Log.d("NetDetectInterceptor", str);
    }
}
