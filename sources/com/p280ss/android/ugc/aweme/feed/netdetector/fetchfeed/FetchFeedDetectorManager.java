package com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed;

import android.util.Log;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.experiment.DetectorNoticeTimeGapExperiment;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28548b;
import com.p280ss.android.ugc.aweme.feed.netdetector.base.C28555d;
import com.p280ss.android.ugc.network.observer.NetworkState;
import com.p280ss.android.ugc.network.observer.bean.C44896d;
import com.p280ss.android.ugc.network.observer.p1749b.C44891b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C47965i;
import kotlin.C7581n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager */
public final class FetchFeedDetectorManager implements C28564a {

    /* renamed from: a */
    public static final C28562a f75206a = new C28562a(null);

    /* renamed from: b */
    private final List<C28555d> f75207b = new ArrayList();

    /* renamed from: c */
    private C28555d f75208c;

    /* renamed from: d */
    private NetworkState f75209d;

    /* renamed from: e */
    private HashMap<String, HashMap<String, Object>> f75210e;

    /* renamed from: f */
    private C44891b f75211f;

    /* renamed from: g */
    private final FeedNullNetNotifyUIHelper f75212g = new FeedNullNetNotifyUIHelper();

    /* renamed from: h */
    private List<C7562b<Boolean, C7581n>> f75213h = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager$FeedNullNetNotifyUIHelper */
    static final class FeedNullNetNotifyUIHelper {

        /* renamed from: b */
        public static final C28557a f75214b = new C28557a(null);

        /* renamed from: a */
        public final AtomicBoolean f75215a = new AtomicBoolean(false);

        /* renamed from: c */
        private final AtomicLong f75216c = new AtomicLong(-1);

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager$FeedNullNetNotifyUIHelper$ActionType */
        public enum ActionType {
            SHOW_TOAST,
            SHOW_BAR,
            SHOW_NO_NET_SCREEN
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager$FeedNullNetNotifyUIHelper$a */
        public static final class C28557a {
            private C28557a() {
            }

            public /* synthetic */ C28557a(C7571f fVar) {
                this();
            }

            /* renamed from: a */
            public static void m93796a(ActionType actionType, NetworkState networkState, HashMap<String, HashMap<String, Object>> hashMap) {
                Object obj;
                C7581n nVar;
                String str;
                int i;
                C7573i.m23587b(actionType, "actionType");
                if (networkState != null && hashMap != null) {
                    try {
                        HashMap hashMap2 = (HashMap) hashMap.get("extra_info");
                        if (hashMap2 != null) {
                            Object obj2 = hashMap2.get("start_time");
                            if (obj2 != null && (obj2 instanceof Long)) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long longValue = currentTimeMillis - ((Number) obj2).longValue();
                                switch (C28565b.f75224a[actionType.ordinal()]) {
                                    case 1:
                                        str = "T";
                                        break;
                                    case 2:
                                        str = "B";
                                        break;
                                    case 3:
                                        str = "S";
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                Map linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("start_time", obj2);
                                linkedHashMap.put("show_notice_time", Long.valueOf(currentTimeMillis));
                                linkedHashMap.put("notice_time", Long.valueOf(longValue));
                                switch (C28565b.f75225b[networkState.ordinal()]) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 1;
                                        break;
                                    case 3:
                                        i = 2;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                linkedHashMap.put("detect_res", Integer.valueOf(i));
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("extra_info", linkedHashMap);
                                C6907h.m21524a(C44896d.m141629a(), (Map) new C22984d().mo59973a(C44896d.m141638j(), str).mo59972a(C44896d.m141639k(), (Object) hashMap3).f60753a);
                            }
                            nVar = C7581n.f20898a;
                        } else {
                            nVar = null;
                        }
                        obj = Result.m150902constructorimpl(nVar);
                    } catch (Throwable th) {
                        obj = Result.m150902constructorimpl(C47965i.m148906a(th));
                    }
                    Result.m150901boximpl(obj);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager$FeedNullNetNotifyUIHelper$b */
        static final class C28558b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ List f75217a;

            C28558b(List list) {
                this.f75217a = list;
            }

            public final void run() {
                for (C7562b invoke : this.f75217a) {
                    invoke.invoke(Boolean.valueOf(false));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager$FeedNullNetNotifyUIHelper$c */
        static final class C28559c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ FeedNullNetNotifyUIHelper f75218a;

            /* renamed from: b */
            final /* synthetic */ List f75219b;

            C28559c(FeedNullNetNotifyUIHelper feedNullNetNotifyUIHelper, List list) {
                this.f75218a = feedNullNetNotifyUIHelper;
                this.f75219b = list;
            }

            public final void run() {
                this.f75218a.f75215a.set(true);
                for (C7562b invoke : this.f75219b) {
                    invoke.invoke(Boolean.valueOf(true));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager$FeedNullNetNotifyUIHelper$d */
        static final class C28560d implements Runnable {

            /* renamed from: a */
            public static final C28560d f75220a = new C28560d();

            C28560d() {
            }

            public final void run() {
                C28571f.m93812c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager$FeedNullNetNotifyUIHelper$e */
        static final class C28561e implements Runnable {

            /* renamed from: a */
            public static final C28561e f75221a = new C28561e();

            C28561e() {
            }

            public final void run() {
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.fjr).mo25750a();
            }
        }

        /* renamed from: a */
        private final boolean m93788a() {
            boolean z;
            if (System.currentTimeMillis() - this.f75216c.get() < 60000) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m93787a("this action show has been limited because time is too short!");
            }
            return z;
        }

        /* renamed from: b */
        private final void m93791b() {
            this.f75216c.set(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder("updateShowTime ");
            sb.append(this.f75216c.get());
            m93787a(sb.toString());
        }

        /* renamed from: a */
        private static int m93787a(String str) {
            return Log.d("FetchFeedNetDetect", str);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m93790a(boolean z) {
            boolean z2;
            boolean b = C28548b.m93760b() & C28566c.m93802a(C6399b.m19921a());
            if (!z || !m93788a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            return z2 & b;
        }

        /* renamed from: a */
        public final void mo73275a(List<C7562b<Boolean, C7581n>> list) {
            C7573i.m23587b(list, "showTopNoticeBarUnits");
            try {
                this.f75215a.set(false);
                C23485m.m77116a(new C28558b(list));
                Result.m150902constructorimpl(C7581n.f20898a);
            } catch (Throwable th) {
                Result.m150902constructorimpl(C47965i.m148906a(th));
            }
        }

        /* renamed from: b */
        public final void mo73278b(NetworkState networkState, HashMap<String, HashMap<String, Object>> hashMap) {
            if (m93790a(false) && C28562a.m93797a() && C28562a.m93798b()) {
                m93787a("tryToShowNotNetScreenFeed");
                C23485m.m77116a(C28560d.f75220a);
                C28557a.m93796a(ActionType.SHOW_NO_NET_SCREEN, networkState, hashMap);
            }
        }

        /* renamed from: a */
        public final boolean mo73277a(NetworkState networkState, HashMap<String, HashMap<String, Object>> hashMap) {
            if (!m93790a(true)) {
                return false;
            }
            if ((!C28562a.m93798b() && !C28562a.m93797a()) || this.f75215a.get()) {
                return false;
            }
            m93787a("tryToShowToast");
            m93791b();
            C23485m.m77116a(C28561e.f75221a);
            C28557a.m93796a(ActionType.SHOW_TOAST, networkState, hashMap);
            return true;
        }

        /* renamed from: a */
        public final void mo73276a(List<C7562b<Boolean, C7581n>> list, NetworkState networkState, HashMap<String, HashMap<String, Object>> hashMap) {
            C7573i.m23587b(list, "showTopNoticeBarUnits");
            if (m93790a(false) && C28562a.m93798b()) {
                m93787a("toToShowNotifyBar");
                C23485m.m77116a(new C28559c(this, list));
                C28557a.m93796a(ActionType.SHOW_BAR, networkState, hashMap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager$a */
    public static final class C28562a {
        private C28562a() {
        }

        /* renamed from: a */
        public static boolean m93797a() {
            if (!C28571f.m93807a().booleanValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static boolean m93798b() {
            Boolean b = C28571f.m93810b();
            new StringBuilder("isInFirstOrLastFeed : ").append(b);
            C7573i.m23582a((Object) b, "NoNetDetectHelper.isInFi…is}\".logD()\n            }");
            return b.booleanValue();
        }

        public /* synthetic */ C28562a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager$b */
    static final class C28563b extends Lambda implements C7562b<Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FetchFeedDetectorManager f75222a;

        /* renamed from: b */
        final /* synthetic */ Integer f75223b;

        C28563b(FetchFeedDetectorManager fetchFeedDetectorManager, Integer num) {
            this.f75222a = fetchFeedDetectorManager;
            this.f75223b = num;
            super(1);
        }

        /* renamed from: a */
        private void m93799a(long j) {
            this.f75222a.mo73271a(this.f75223b);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m93799a(((Number) obj).longValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: a */
    public final synchronized void mo73268a() {
        m93779d();
    }

    /* renamed from: c */
    private final synchronized void m93778c() {
        Integer num;
        if (C28548b.m93760b()) {
            if (this.f75211f == null) {
                if (this.f75209d != null) {
                    C28555d dVar = this.f75208c;
                    if (dVar != null) {
                        num = Integer.valueOf(dVar.hashCode());
                    } else {
                        num = null;
                    }
                    C44891b bVar = new C44891b();
                    bVar.mo107347a(DetectorNoticeTimeGapExperiment.INSTANCE.getTimeGap(), new C28563b(this, num));
                    this.f75211f = bVar;
                }
            }
        }
    }

    /* renamed from: d */
    private synchronized void m93779d() {
        new StringBuilder("release all FetchFeedRequestDetectInterceptor size:").append(this.f75207b.size());
        try {
            FetchFeedDetectorManager fetchFeedDetectorManager = this;
            fetchFeedDetectorManager.f75212g.mo73275a(fetchFeedDetectorManager.f75213h);
            Result.m150902constructorimpl(C7581n.f20898a);
        } catch (Throwable th) {
            Result.m150902constructorimpl(C47965i.m148906a(th));
        }
        try {
            FetchFeedDetectorManager fetchFeedDetectorManager2 = this;
            fetchFeedDetectorManager2.f75208c = null;
            fetchFeedDetectorManager2.f75210e = null;
            fetchFeedDetectorManager2.f75209d = null;
            C44891b bVar = fetchFeedDetectorManager2.f75211f;
            if (bVar != null) {
                bVar.mo107346a();
            }
            fetchFeedDetectorManager2.f75211f = null;
            for (C28555d d : fetchFeedDetectorManager2.f75207b) {
                d.mo73267d();
            }
            fetchFeedDetectorManager2.f75207b.clear();
            Result.m150902constructorimpl(C7581n.f20898a);
        } catch (Throwable th2) {
            Result.m150902constructorimpl(C47965i.m148906a(th2));
            return;
        }
        return;
    }

    /* renamed from: b */
    public final synchronized void mo73273b() {
        try {
            if (C28548b.m93760b()) {
                C7581n nVar = null;
                if (this.f75212g.m93790a(true)) {
                    if (C28562a.m93798b() || C28562a.m93797a()) {
                        NetworkState networkState = this.f75209d;
                        if (networkState != null) {
                            StringBuilder sb = new StringBuilder("tryShowNoticeIfFetchFeedNoNet for net state `");
                            sb.append(networkState);
                            sb.append('`');
                            switch (C28567d.f75226a[networkState.ordinal()]) {
                                case 1:
                                case 2:
                                    this.f75212g.mo73277a(this.f75209d, this.f75210e);
                                    break;
                                case 3:
                                    if (this.f75212g.mo73277a(this.f75209d, this.f75210e)) {
                                        m93778c();
                                        break;
                                    }
                                    break;
                            }
                            nVar = C7581n.f20898a;
                        }
                        Result.m150902constructorimpl(nVar);
                    }
                }
            }
        } catch (Throwable th) {
            Result.m150902constructorimpl(C47965i.m148906a(th));
        }
    }

    /* renamed from: b */
    public final synchronized void mo73274b(C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "unit");
        this.f75213h.remove(bVar);
    }

    /* renamed from: a */
    public final synchronized void mo73269a(C28555d dVar) {
        C7573i.m23587b(dVar, "t");
        if (this.f75208c == null) {
            this.f75208c = dVar;
        }
        this.f75207b.add(dVar);
    }

    /* renamed from: a */
    public final synchronized void mo73272a(C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "unit");
        if (C28548b.m93760b()) {
            if (this.f75212g.f75215a.get()) {
                bVar.invoke(Boolean.valueOf(true));
            }
            this.f75213h.add(bVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo73271a(Integer num) {
        Object obj;
        if (C28548b.m93760b()) {
            if (C28562a.m93798b() || C28562a.m93797a()) {
                if (this.f75208c != null) {
                    C28555d dVar = this.f75208c;
                    if (dVar != null) {
                        obj = Integer.valueOf(dVar.hashCode());
                    } else {
                        obj = null;
                    }
                    if (C7573i.m23585a(obj, (Object) num)) {
                        NetworkState networkState = this.f75209d;
                        if (networkState != null) {
                            if (C28562a.m93797a()) {
                                new StringBuilder("isNoFeed timerToCheckFeedNull timeout and feed request is null. detectNetworkState:").append(networkState);
                                this.f75212g.mo73278b(this.f75209d, this.f75210e);
                            } else if (C28562a.m93798b()) {
                                new StringBuilder("isInFirstOrLastRecommendFeed timerToCheckFeedNull timeout and feed request is null. detectNetworkState:").append(networkState);
                                this.f75212g.mo73276a(this.f75213h, this.f75209d, this.f75210e);
                            } else {
                                new StringBuilder("nothing timerToCheckFeedNull timeout and feed request is null. detectNetworkState:").append(networkState);
                            }
                        }
                    }
                }
                this.f75211f = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo73270a(com.p280ss.android.ugc.aweme.feed.netdetector.base.C28555d r3, com.p280ss.android.ugc.network.observer.NetworkState r4, java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "requestDetectInterceptor"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "networkState"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "detailMap"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)     // Catch:{ all -> 0x0068 }
            boolean r0 = com.p280ss.android.ugc.aweme.feed.netdetector.C28548b.m93760b()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0018
            monitor-exit(r2)
            return
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "netDetectCallBack. detectNetworkState:"
            r0.<init>(r1)     // Catch:{ all -> 0x0068 }
            r0.append(r4)     // Catch:{ all -> 0x0068 }
            r1 = 46
            r0.append(r1)     // Catch:{ all -> 0x0068 }
            com.ss.android.ugc.aweme.feed.netdetector.base.d r0 = r2.f75208c     // Catch:{ all -> 0x0068 }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0066
            com.ss.android.ugc.network.observer.NetworkState r3 = r2.f75209d     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0066
            r2.f75209d = r4     // Catch:{ all -> 0x0068 }
            r2.f75210e = r5     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "netDetectCallBack. record detectNetworkState:"
            r3.<init>(r4)     // Catch:{ all -> 0x0068 }
            com.ss.android.ugc.network.observer.NetworkState r4 = r2.f75209d     // Catch:{ all -> 0x0068 }
            r3.append(r4)     // Catch:{ all -> 0x0068 }
            r3.append(r1)     // Catch:{ all -> 0x0068 }
            boolean r3 = com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager.C28562a.m93797a()     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0052
            boolean r3 = com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager.C28562a.m93798b()     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0066
        L_0x0052:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "netDetectCallBack. isInFirstOrLastFeed , show notify now. detectNetworkState:"
            r3.<init>(r4)     // Catch:{ all -> 0x0068 }
            com.ss.android.ugc.network.observer.NetworkState r4 = r2.f75209d     // Catch:{ all -> 0x0068 }
            r3.append(r4)     // Catch:{ all -> 0x0068 }
            r3.append(r1)     // Catch:{ all -> 0x0068 }
            r2.mo73273b()     // Catch:{ all -> 0x0068 }
            monitor-exit(r2)
            return
        L_0x0066:
            monitor-exit(r2)
            return
        L_0x0068:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager.mo73270a(com.ss.android.ugc.aweme.feed.netdetector.base.d, com.ss.android.ugc.network.observer.NetworkState, java.util.HashMap):void");
    }
}
