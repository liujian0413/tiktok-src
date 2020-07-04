package com.p280ss.android.ugc.aweme.feed;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import bolts.C1592h;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.ttnet.p671c.C12955b;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.newmedia.C19943j;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25344d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedCacheV2EnabledExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedCacheV2TimeExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28548b;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.C28571f;
import com.p280ss.android.ugc.aweme.feed.p1229e.C28300a;
import com.p280ss.android.ugc.aweme.feed.preload.C28662h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.C32330k;
import com.p280ss.android.ugc.aweme.metrics.p1393a.C33221a;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.share.seconditem.C38252a;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.i */
public final class C28434i {

    /* renamed from: a */
    public static Boolean f74971a = null;

    /* renamed from: b */
    public static boolean f74972b = false;

    /* renamed from: c */
    public static long f74973c = -1;

    /* renamed from: d */
    public static long f74974d = -1;

    /* renamed from: e */
    public static C28440b f74975e = null;

    /* renamed from: f */
    private static long f74976f = -1;

    /* renamed from: g */
    private static volatile Boolean f74977g = null;

    /* renamed from: h */
    private static long f74978h = -1;

    /* renamed from: i */
    private static List<Aweme> f74979i = new ArrayList();

    /* renamed from: j */
    private static Queue<Runnable> f74980j;

    /* renamed from: k */
    private static final long f74981k = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: l */
    private static String f74982l;

    /* renamed from: m */
    private static Throwable f74983m;

    /* renamed from: n */
    private static long f74984n;

    /* renamed from: o */
    private static C12955b f74985o;

    /* renamed from: p */
    private static JSONObject f74986p;

    /* renamed from: com.ss.android.ugc.aweme.feed.i$a */
    static class C28439a implements Callable {

        /* renamed from: a */
        private Callable f74991a;

        public final Object call() throws Exception {
            if (C6903bc.m21507z().mo57872a()) {
                return C28434i.m93480i();
            }
            C28434i.m93481j();
            Object c = C28662h.m94303a().mo73724a(4).mo73717c();
            if (C6399b.m19944t()) {
                C6857a.m21312e().mo16827b("feed_api_to_ui_response", false);
                C6857a.m21312e().mo16822a("feed_ui_response_to_post_msg", false);
                if (c == null) {
                    C28434i.m93459a(null, false, 0);
                } else if (!((FeedItemList) c).isFromLocalCache) {
                    return c;
                } else {
                    long a = C23338f.m76562a().mo60621a("key_feed_cache_time", 0);
                    if (System.currentTimeMillis() - a <= ((long) (C6384b.m19835a().mo15287a(FeedCacheV2TimeExperiment.class, true, "is_feed_load_cache_v2_time", C6384b.m19835a().mo15295d().is_feed_load_cache_v2_time, 0) * 3600000))) {
                        C28434i.m93459a(c, false, a);
                        return c;
                    }
                    C28434i.m93459a(c, true, a);
                }
                return this.f74991a.call();
            } else if (c == null || ((FeedItemList) c).isFromLocalCache) {
                return this.f74991a.call();
            } else {
                return c;
            }
        }

        C28439a(Callable callable) {
            this.f74991a = callable;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.i$b */
    static class C28440b extends Handler {

        /* renamed from: a */
        public Handler f74992a;

        /* renamed from: b */
        private boolean f74993b;

        /* renamed from: a */
        public final void mo72171a() {
            this.f74993b = true;
        }

        private C28440b(Handler handler) {
            this.f74992a = handler;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C28434i.f74971a = Boolean.valueOf(false);
            C28434i.f74975e = null;
            if (this.f74993b && message.obj != null && (message.obj instanceof FeedItemList)) {
                ((FeedItemList) message.obj).setReplaceFake();
            }
            this.f74992a.handleMessage(message);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.i$c */
    static class C28441c extends Handler {
        C28441c() {
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.obj == null) {
                C28434i.m93469b("load_empty_feed");
                C28434i.m93461a("no_response", "fake_failed");
            } else if (message.obj instanceof Exception) {
                C28434i.m93469b("exec_failed");
                C28434i.m93461a("no_response", "fake_failed");
            } else if (C28434i.m93475d()) {
                C28434i.f74975e.mo72171a();
                C28434i.f74975e.f74992a.sendMessage(Message.obtain(message));
                C28434i.f74971a = Boolean.valueOf(false);
                C28434i.f74975e = null;
                C28434i.m93469b("fake_response");
                C28434i.m93461a("no_response", "fake_response");
            } else {
                C28434i.m93469b("valid_response_received_after_do_fake");
                C28434i.m93461a("no_response", "valid_response");
            }
        }
    }

    /* renamed from: b */
    public static boolean m93471b() {
        return f74972b;
    }

    /* renamed from: l */
    public static Boolean m93483l() {
        return f74971a;
    }

    /* renamed from: n */
    public static Boolean m93485n() {
        return f74977g;
    }

    /* renamed from: a */
    public static void m93463a(List<Aweme> list, String str) throws Exception {
        if (m93482k()) {
            if (C6307b.m19566a((Collection<T>) list)) {
                m93470b("Aweme_Items_is_null", str);
                return;
            }
            Aweme aweme = (Aweme) list.get(0);
            if (aweme == null) {
                m93470b("Aweme_is_null", str);
            } else if (aweme.getVideo() == null) {
                m93470b("video_is_null", str);
            } else if (aweme.getVideo().getPlayAddr() == null) {
                m93470b("playAddr_is_null", str);
            } else if (C6307b.m19566a((Collection<T>) aweme.getVideo().getPlayAddr().getUrlList())) {
                m93470b("UrlList_is_null", str);
            } else if (TextUtils.isEmpty((CharSequence) aweme.getVideo().getPlayAddr().getUrlList().get(0))) {
                m93470b("first_video_url_is_null", str);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.IllegalArgumentException] */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v23, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r7v25 */
    /* JADX WARNING: type inference failed for: r7v26 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
      assigns: []
      uses: []
      mth insns count: 134
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m93464a(java.util.concurrent.Callable r7, android.os.Handler r8, int r9, int r10) {
        /*
            java.lang.Object r7 = r7.call()     // Catch:{ Exception -> 0x0006 }
            r0 = 0
            goto L_0x0008
        L_0x0006:
            r7 = move-exception
            r0 = r7
        L_0x0008:
            r1 = 6
            r2 = 4
            r3 = 0
            if (r8 == 0) goto L_0x0095
            if (r7 == 0) goto L_0x0095
            boolean r4 = r7 instanceof com.p280ss.android.ugc.aweme.feed.model.FeedItemList
            if (r4 == 0) goto L_0x0030
            r4 = r7
            com.ss.android.ugc.aweme.feed.model.FeedItemList r4 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r4
            if (r4 == 0) goto L_0x0030
            java.util.List r4 = r4.getItems()
            boolean r4 = com.bytedance.common.utility.collection.C6307b.m19566a(r4)
            if (r4 != 0) goto L_0x0030
            r4 = r7
            com.ss.android.ugc.aweme.feed.model.FeedItemList r4 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r4     // Catch:{ Throwable -> 0x0029 }
            m93467b(r4, r9)     // Catch:{ Throwable -> 0x0029 }
            goto L_0x0030
        L_0x0029:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            r7 = r0
        L_0x0030:
            java.lang.String r4 = "Feed0VVManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "start to post message,type:"
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r4, r5)
            android.os.Message r10 = r8.obtainMessage(r10)
            r10.obj = r7
            com.ss.android.ugc.aweme.splash.b r7 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80866p()
            boolean r7 = r7.mo102522a()
            if (r7 == 0) goto L_0x006c
            boolean r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r7 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.splash.b r7 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80866p()
            java.lang.Object r7 = r7.mo102523b()
            monitor-enter(r7)     // Catch:{ InterruptedException -> 0x006c }
            r4 = 5000(0x1388, double:2.4703E-320)
            r7.wait(r4)     // Catch:{ all -> 0x0069 }
            monitor-exit(r7)     // Catch:{ all -> 0x0069 }
            goto L_0x006c
        L_0x0069:
            r4 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0069 }
            throw r4     // Catch:{ InterruptedException -> 0x006c }
        L_0x006c:
            r8.sendMessageAtFrontOfQueue(r10)
            java.lang.String r7 = "Feed0VVManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "end to post message,type:"
            r8.<init>(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r7, r8)
            com.ss.android.ugc.aweme.ab.a r7 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            java.lang.String r8 = "feed_ui_response_to_post_msg"
            r7.mo16827b(r8, r3)
            com.ss.android.ugc.aweme.ab.a r7 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            java.lang.String r8 = "feed_ui_post_msg_to_feed_ui"
            r7.mo16822a(r8, r3)
            goto L_0x00d1
        L_0x0095:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "callHandler is null:"
            r9.<init>(r10)
            r10 = 1
            if (r8 != 0) goto L_0x00a1
            r8 = 1
            goto L_0x00a2
        L_0x00a1:
            r8 = 0
        L_0x00a2:
            r9.append(r8)
            java.lang.String r8 = ",result is null:"
            r9.append(r8)
            if (r7 != 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r10 = 0
        L_0x00ae:
            r9.append(r10)
            java.lang.String r7 = r9.toString()
            boolean r8 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            if (r8 == 0) goto L_0x00cc
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r9 = android.os.Looper.getMainLooper()
            r8.<init>(r9)
            com.ss.android.ugc.aweme.feed.l r9 = new com.ss.android.ugc.aweme.feed.l
            r9.<init>(r7)
            r8.post(r9)
        L_0x00cc:
            java.lang.String r8 = "Feed0VVManager"
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r1, r8, r7)
        L_0x00d1:
            boolean r7 = r0 instanceof java.lang.IllegalArgumentException
            if (r7 == 0) goto L_0x0148
            boolean r7 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            if (r7 == 0) goto L_0x00ec
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r7.<init>(r8)
            com.ss.android.ugc.aweme.feed.m r8 = new com.ss.android.ugc.aweme.feed.m
            r8.<init>(r0)
            r7.post(r8)
        L_0x00ec:
            java.lang.String r7 = "Feed0VVManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "commit#targetRunnable error:"
            r8.<init>(r9)
            java.lang.String r9 = r0.toString()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r1, r7, r8)
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r0)
            com.bytedance.p066a.p067a.p070b.p072b.C2077a.m9160a(r0)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0133 }
            r7.<init>()     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r8 = android.util.Log.getStackTraceString(r0)     // Catch:{ Throwable -> 0x0133 }
            int r9 = r8.length()     // Catch:{ Throwable -> 0x0133 }
            r10 = 4096(0x1000, float:5.74E-42)
            if (r9 <= r10) goto L_0x011e
            java.lang.String r8 = r8.substring(r3, r10)     // Catch:{ Throwable -> 0x0133 }
        L_0x011e:
            java.lang.String r9 = "error_stack"
            r7.put(r9, r8)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r8 = "errorType"
            java.lang.String r9 = "feed_load_error"
            r7.put(r8, r9)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r8 = "aweme_error_find_bug"
            com.p280ss.android.ugc.aweme.base.C6893q.m21447a(r8, r7)     // Catch:{ Throwable -> 0x0133 }
            com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ Throwable -> 0x0133 }
            return
        L_0x0133:
            r7 = move-exception
            java.lang.String r8 = "Feed0VVManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "report error:"
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r8, r7)
            return
        L_0x0148:
            if (r0 == 0) goto L_0x0162
            java.lang.String r7 = "Feed0VVManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "commit#targetRunnable error:"
            r8.<init>(r9)
            java.lang.String r9 = r0.toString()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r1, r7, r8)
            return
        L_0x0162:
            java.lang.String r7 = "Feed0VVManager"
            java.lang.String r8 = "commit#targetRunnable success"
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.C28434i.m93464a(java.util.concurrent.Callable, android.os.Handler, int, int):void");
    }

    /* renamed from: a */
    static final /* synthetic */ void m93462a(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    /* renamed from: a */
    public static void m93465a(boolean z) {
        if (f74977g == null) {
            f74977g = Boolean.valueOf(z);
        }
    }

    /* renamed from: g */
    public static long m93478g() {
        long j = f74976f;
        f74976f = 0;
        return j;
    }

    /* renamed from: c */
    public static boolean m93473c() {
        return C28544n.m93750a(C6399b.m19921a());
    }

    /* renamed from: h */
    public static void m93479h() {
        if (f74976f < 0) {
            f74976f = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: j */
    public static void m93481j() {
        ServiceManager.get().getService(IAwemeService.class);
        C28300a.m93094a();
    }

    /* renamed from: k */
    public static boolean m93482k() {
        if (C23338f.m76566d().mo60620a("cold_start_times", 0) <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private static void m93487p() {
        C23485m.m77117a(new Runnable() {
            public final void run() {
                if (C28434i.m93485n() != null && C28434i.m93485n().booleanValue()) {
                    C28434i.f74972b = true;
                    if (C28434i.f74971a == null) {
                        C28434i.m93469b("no_request");
                        C28434i.m93461a("no_request", "");
                    } else if (C28434i.m93475d()) {
                        C28434i.m93469b("no_repsonse");
                        C28434i.m93476e();
                    } else if (!C28434i.f74971a.booleanValue()) {
                        C28434i.m93469b("valid_response");
                    } else {
                        C28434i.m93469b("exception");
                    }
                }
            }
        }, 8000);
    }

    /* renamed from: a */
    public static void m93455a() {
        if (C6399b.m19944t() && C28580o.m93828a().booleanValue()) {
            f74978h = SystemClock.elapsedRealtime();
            m93487p();
        }
    }

    /* renamed from: d */
    public static boolean m93475d() {
        if (f74971a == null || !f74971a.booleanValue() || f74975e == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static void m93476e() {
        C23397p.m76735a().mo60807a(new C28441c(), new Callable() {
            public final Object call() throws Exception {
                FeedItemList feedItemList;
                String lowerCase = C32330k.m104885g().toLowerCase();
                Context a = C6399b.m19921a();
                StringBuilder sb = new StringBuilder("default_feed/");
                sb.append(lowerCase);
                sb.append(".json");
                String a2 = C28434i.m93454a(a, sb.toString());
                if (TextUtils.isEmpty(a2)) {
                    if (C6399b.m19947w()) {
                        a2 = C28434i.m93454a(C6399b.m19921a(), "default_feed/DEFAULT");
                    } else {
                        a2 = C28434i.m93454a(C6399b.m19921a(), "default_feed/us.json");
                    }
                }
                if (!TextUtils.isEmpty(a2)) {
                    feedItemList = (FeedItemList) JSON.parseObject(a2, FeedItemList.class);
                } else {
                    feedItemList = null;
                }
                if (!(feedItemList == null || feedItemList.getItems() == null)) {
                    ArrayList<Aweme> arrayList = new ArrayList<>(2);
                    int size = feedItemList.getItems().size();
                    int nextInt = new Random().nextInt(size);
                    int nextInt2 = new Random().nextInt(size);
                    if (nextInt2 == nextInt) {
                        nextInt2 = (nextInt + 1) % size;
                    }
                    arrayList.add(feedItemList.getItems().get(nextInt));
                    arrayList.add(feedItemList.getItems().get(nextInt2));
                    for (Aweme fakeResponse : arrayList) {
                        fakeResponse.setFakeResponse(true);
                    }
                    feedItemList.items = arrayList;
                }
                return feedItemList;
            }
        }, 0);
    }

    /* renamed from: o */
    private static boolean m93486o() {
        return C6384b.m19835a().mo15292a(FeedCacheV2EnabledExperiment.class, true, "is_feed_load_cache_v2", C6384b.m19835a().mo15295d().is_feed_load_cache_v2, false);
    }

    /* renamed from: f */
    public static void m93477f() {
        if (C6399b.m19944t() && f74978h != -1) {
            f74973c = SystemClock.elapsedRealtime() - f74978h;
            f74978h = -1;
            if (f74980j != null) {
                for (Runnable a : f74980j) {
                    C6726a.m20842a(a);
                }
                f74980j.clear();
                f74980j = null;
            }
        }
    }

    /* renamed from: i */
    public static FeedItemList m93480i() {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = C6399b.m19921a().getAssets().open("feed_response.json");
            try {
                byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable th) {
                        th = th;
                        C42973bg.m136425a((Closeable) inputStream);
                        C42973bg.m136425a((Closeable) byteArrayOutputStream);
                        throw th;
                    }
                }
                FeedItemList feedItemList = (FeedItemList) C10944e.m32113a().mo15974a(new String(byteArrayOutputStream.toByteArray()), FeedItemList.class);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 < f74981k) {
                    Thread.sleep(f74981k - currentTimeMillis2);
                }
                C42973bg.m136425a((Closeable) inputStream);
                C42973bg.m136425a((Closeable) byteArrayOutputStream);
                return feedItemList;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                C42973bg.m136425a((Closeable) inputStream);
                C42973bg.m136425a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            byteArrayOutputStream = null;
            C42973bg.m136425a((Closeable) inputStream);
            C42973bg.m136425a((Closeable) byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: m */
    public static void m93484m() {
        if (!TextUtils.isEmpty(f74982l)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("URL", f74982l);
                jSONObject.put("DNS", f74985o.f27507j);
                jSONObject.put("Connect", f74985o.f27508k);
                jSONObject.put("SSL", f74985o.f27509l);
                jSONObject.put("Request", f74985o.f27511n);
                jSONObject.put("Response", f74985o.f27512o);
                jSONObject.put("ttfbMs", f74985o.f27514q);
                jSONObject.put("total", f74985o.f27515r);
                jSONObject.put("extra", f74986p);
                jSONObject.put("exception", f74983m);
                jSONObject.put("requestInfo", f74985o);
                jSONObject.put("eTime", f74984n);
                jSONObject.put("network", NetworkUtils.getNetworkAccessType(C6399b.m19921a()));
            } catch (JSONException unused) {
            }
            C6877n.m21447a("feed_retry_e", jSONObject);
        }
    }

    /* renamed from: b */
    public static void m93469b(String str) {
        m93470b(str, "");
    }

    /* renamed from: c */
    static final /* synthetic */ void m93472c(String str) {
        throw new IllegalArgumentException(str);
    }

    /* renamed from: b */
    private static void m93468b(Runnable runnable) {
        if (f74973c != -1) {
            C6726a.m20842a(runnable);
            return;
        }
        if (f74980j == null) {
            f74980j = new LinkedBlockingQueue();
        }
        f74980j.offer(runnable);
    }

    /* renamed from: b */
    public static String m93466b(FeedItemList feedItemList) {
        StringBuilder sb = new StringBuilder();
        if (!C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
            for (Aweme aid : feedItemList.getItems()) {
                sb.append(aid.getAid());
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static String m93474d(String str) {
        if (f74979i.size() <= 0) {
            return "";
        }
        int size = f74979i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (TextUtils.equals(str, ((Aweme) f74979i.get(i)).getAid())) {
                ((Aweme) f74979i.get(i)).setCanCache(false);
                break;
            } else {
                i++;
            }
        }
        String str2 = "";
        for (int size2 = f74979i.size() - 1; size2 >= 0; size2--) {
            Aweme aweme = (Aweme) f74979i.get(size2);
            if (!aweme.getCanCache()) {
                break;
            }
            str2 = aweme.getAid();
        }
        return str2;
    }

    /* renamed from: a */
    public static void m93457a(FeedItemList feedItemList) {
        if (C6399b.m19944t() && m93486o() && feedItemList != null && !C6307b.m19566a((Collection<T>) feedItemList.getItems()) && !feedItemList.isFromLocalCache) {
            f74979i.clear();
            f74979i.addAll(feedItemList.getItems());
        }
        C28571f.m93809a(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public static void m93460a(String str) {
        if (C6399b.m19944t() && m93486o()) {
            C23338f.m76562a().mo60632b("feed_cached_index", m93474d(str));
        }
    }

    /* renamed from: a */
    public static void m93461a(final String str, final String str2) {
        m93468b((Runnable) new Runnable() {
            public final void run() {
                JSONObject b = new C6869c().mo16887a("fake_reason", str).mo16887a("fake_type", str2).mo16887a("has_network", String.valueOf(C28434i.m93473c())).mo16886a("mainCreate2ResumeDuration", Long.valueOf(C28434i.f74973c)).mo16886a("sMainActivityCreate2FeedRequestDuration", Long.valueOf(C28434i.f74974d)).mo16888b();
                C6907h.onEvent(MobClick.obtain().setEventName("fake_feed_response").setLabelName("perf_monitor").setJsonObject(b));
                C6907h.m21525a("fake_feed_response", b);
                C33221a.m107190a("fake_feed_response", b);
            }
        });
    }

    /* renamed from: b */
    private static void m93470b(final String str, final String str2) {
        m93468b((Runnable) new Runnable() {
            public final void run() {
                C6877n.m21447a("aweme_feed_0vv", new C6869c().mo16887a("message", str).mo16882a("network_connected", Boolean.valueOf(C28434i.m93473c())).mo16886a("mainCreate2ResumeDuration", Long.valueOf(C28434i.f74973c)).mo16886a("sMainActivityCreate2FeedRequestDuration", Long.valueOf(C28434i.f74974d)).mo16887a("requestId", str2).mo16888b());
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[SYNTHETIC, Splitter:B:14:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c A[SYNTHETIC, Splitter:B:22:0x002c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m93454a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x0029, all -> 0x0021 }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ IOException -> 0x0029, all -> 0x0021 }
            int r4 = r3.available()     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            r3.read(r4)     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            java.lang.String r2 = "utf-8"
            r1.<init>(r4, r2)     // Catch:{ IOException -> 0x002a, all -> 0x001f }
            if (r3 == 0) goto L_0x001e
            r3.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            return r1
        L_0x001f:
            r4 = move-exception
            goto L_0x0023
        L_0x0021:
            r4 = move-exception
            r3 = r0
        L_0x0023:
            if (r3 == 0) goto L_0x0028
            r3.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            throw r4
        L_0x0029:
            r3 = r0
        L_0x002a:
            if (r3 == 0) goto L_0x002f
            r3.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.C28434i.m93454a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private static void m93467b(FeedItemList feedItemList, int i) {
        C25329c.m83214a(feedItemList.getItems());
        C24671f.m80867q().mo64648a(feedItemList);
        C25329c.m83218b(feedItemList.getItems());
        C38252a.m122197a(feedItemList.getItems());
        m93458a(feedItemList, i);
        C25344d.m83279a(feedItemList.getItems());
        if (C19943j.m65779a() && feedItemList.localExtra != null) {
            C28300a.m93094a().mo71994a(feedItemList.getItems(), (String) feedItemList.localExtra.get("aweme_id"));
        }
    }

    /* renamed from: a */
    public static void m93458a(FeedItemList feedItemList, int i) {
        if (feedItemList.getItems() != null) {
            int size = feedItemList.getItems().size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme = (Aweme) feedItemList.getItems().get(i2);
                aweme.setRequestId(feedItemList.getRequestId());
                Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sb = new StringBuilder();
                sb.append(updateAweme.getAid());
                sb.append(i + 0);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), feedItemList.getRequestId(), i2);
                feedItemList.getItems().set(i2, updateAweme);
            }
        }
    }

    /* renamed from: a */
    public static void m93459a(Object obj, boolean z, long j) {
        String str;
        C22984d a = C22984d.m75611a();
        if (obj == null || !(obj instanceof FeedItemList)) {
            a.mo59973a("is_cache", "0").mo59973a("is_timeout", "0").mo59970a("cache_num", 0).mo59973a("group_id_list", "").mo59971a("cache_time", j);
        } else {
            C22984d a2 = a.mo59973a("is_cache", "1");
            String str2 = "is_timeout";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            FeedItemList feedItemList = (FeedItemList) obj;
            a2.mo59973a(str2, str).mo59970a("cache_num", feedItemList.getItems().size()).mo59973a("group_id_list", m93466b(feedItemList)).mo59971a("cache_time", j);
        }
        C6907h.m21524a("pull_out_cache_video", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m93456a(int i, C6309f fVar, Callable callable, int i2, boolean z) {
        Handler handler;
        if (!z || i != 0 || f74971a != null || fVar == 0) {
            handler = fVar;
        } else {
            f74971a = Boolean.valueOf(true);
            if (f74978h != -1) {
                f74974d = SystemClock.elapsedRealtime() - f74978h;
            }
            C28440b bVar = new C28440b(fVar);
            f74975e = bVar;
            callable = new C28439a(callable);
            handler = bVar;
        }
        if (C28548b.m93760b() && C28548b.m93759a(i)) {
            C28571f.m93808a((Handler) fVar);
        }
        C1592h.m7855a((Callable<TResult>) new C28512k<TResult>(new C28477j(callable, handler, i, i2)), (Executor) C7258h.m22730c());
    }
}
