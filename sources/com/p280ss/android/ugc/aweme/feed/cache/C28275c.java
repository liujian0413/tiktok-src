package com.p280ss.android.ugc.aweme.feed.cache;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.net.cronet.C10933d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.ttnet.INetworkApi;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3CountExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3Experiment;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3TimeExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.p1884io.C47984g;
import kotlin.reflect.C7595j;
import kotlin.text.C48038d;
import kotlin.text.C7634n;
import org.json.JSONObject;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.c */
public final class C28275c implements C28288d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f74525a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C28275c.class), "START_CACHE", "getSTART_CACHE()Lio/reactivex/disposables/Disposable;"))};

    /* renamed from: b */
    public static final C28275c f74526b = new C28275c();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile boolean f74527c;

    /* renamed from: d */
    private static volatile FeedItemList f74528d;

    /* renamed from: e */
    private static volatile boolean f74529e;

    /* renamed from: f */
    private static CountDownLatch f74530f = new CountDownLatch(1);

    /* renamed from: g */
    private static volatile String f74531g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static volatile boolean f74532h;

    /* renamed from: i */
    private static Object f74533i = new Object();

    /* renamed from: j */
    private static volatile boolean f74534j;

    /* renamed from: k */
    private static volatile boolean f74535k;

    /* renamed from: l */
    private static final C7541d f74536l = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C28276a.f74538a);

    /* renamed from: m */
    private static boolean f74537m;

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$a */
    static final class C28276a extends Lambda implements C7561a<C7321c> {

        /* renamed from: a */
        public static final C28276a f74538a = new C28276a();

        C28276a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m93030a();
        }

        /* renamed from: a */
        private static C7321c m93030a() {
            return C6405d.m19979d().mo19325f((C7326g<? super T>) C282771.f74539a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$b */
    static final class C28278b<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C28278b f74540a = new C28278b();

        C28278b() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C6759a.m20910a("cache_video_request_response", jSONObject);
                return C7581n.f20898a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$c */
    static final class C28279c<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C28279c f74541a = new C28279c();

        C28279c() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", C34943c.f91127w);
                C6759a.m20910a("cache_video_request_response", jSONObject);
                return C7581n.f20898a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$d */
    static final class C28280d<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C28280d f74542a = new C28280d();

        C28280d() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C6759a.m20910a("cache_feed_request", jSONObject);
                return C7581n.f20898a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$e */
    static final class C28281e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f74543a;

        C28281e(ObjectRef objectRef) {
            this.f74543a = objectRef;
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (((Integer) this.f74543a.element) == null) {
                    jSONObject.put("is_success", 1);
                } else {
                    jSONObject.put("is_success", 0);
                    jSONObject.put("errorCode", ((Integer) this.f74543a.element).intValue());
                }
                C6759a.m20910a("cache_feed_request_response", jSONObject);
                return C7581n.f20898a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$f */
    static final class C28282f<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C28282f f74544a = new C28282f();

        C28282f() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C6759a.m20910a("cache_video_request", jSONObject);
                return C7581n.f20898a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$g */
    static final class C28283g<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Exception f74545a;

        C28283g(Exception exc) {
            this.f74545a = exc;
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", C10933d.m32089a(this.f74545a, null));
                C6759a.m20910a("cache_video_request_response", jSONObject);
                return C7581n.f20898a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$h */
    static final class C28284h implements Runnable {

        /* renamed from: a */
        public static final C28284h f74546a = new C28284h();

        C28284h() {
        }

        public final void run() {
            try {
                C28275c.m93005h();
            } finally {
                C28275c.m93006i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$i */
    static final class C28285i implements Runnable {

        /* renamed from: a */
        public static final C28285i f74547a = new C28285i();

        C28285i() {
        }

        public final void run() {
            try {
                C28275c.m92997d();
                FeedItemList e = C28275c.f74526b.mo71958e();
                C28275c.f74526b.mo71951a(e);
                C28275c.f74526b.mo71955b(e);
            } finally {
                C28275c.f74532h = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$j */
    static final class C28286j<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C28286j f74548a = new C28286j();

        C28286j() {
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", 0);
                C6759a.m20910a("pull_out_cache_video", jSONObject);
                return C7581n.f20898a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.c$k */
    static final class C28287k<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ int f74549a;

        /* renamed from: b */
        final /* synthetic */ int f74550b;

        /* renamed from: c */
        final /* synthetic */ Integer f74551c;

        C28287k(int i, int i2, Integer num) {
            this.f74549a = i;
            this.f74550b = i2;
            this.f74551c = num;
        }

        public final Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", this.f74549a);
                jSONObject.put("is_timeout", this.f74550b);
                jSONObject.put("cache_num", this.f74551c);
                C6759a.m20910a("pull_out_cache_video", jSONObject);
                return C7581n.f20898a;
            } catch (Exception e) {
                return Integer.valueOf(Log.e("FeedCacheLoader", "", e));
            }
        }
    }

    private C28275c() {
    }

    /* renamed from: k */
    public static String m93007k() {
        return f74531g;
    }

    /* renamed from: n */
    private C7321c m93010n() {
        return (C7321c) f74536l.getValue();
    }

    /* renamed from: j */
    public final boolean mo71959j() {
        return f74527c;
    }

    /* renamed from: a */
    public final boolean mo71952a(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m93008l() {
        boolean z = f74535k;
        f74535k = false;
        return z;
    }

    /* renamed from: x */
    private static void m93020x() {
        C1592h.m7853a((Callable<TResult>) C28286j.f74548a);
    }

    /* renamed from: b */
    public final C7321c mo71953b() {
        return m93010n();
    }

    /* renamed from: i */
    public static void m93006i() {
        f74529e = true;
        f74530f.countDown();
    }

    /* renamed from: o */
    private final FeedItemList m93011o() {
        FeedItemList p = m93012p();
        if (p == null) {
            return m93013q();
        }
        return p;
    }

    /* renamed from: g */
    public static void m93003g() {
        if (!f74537m) {
            f74537m = true;
            C7258h.m22730c().execute(C28284h.f74546a);
        }
    }

    /* renamed from: m */
    public static void m93009m() {
        C7285c.m22838a(C6399b.m19921a(), "feed_video_cache", 0).edit().putLong("feed_video_cache_time", 0).apply();
    }

    /* renamed from: w */
    private static String m93019w() {
        return C7285c.m22838a(C6399b.m19921a(), "feed_video_cache", 0).getString("feed_video_group_key", null);
    }

    /* renamed from: c */
    public final void mo71956c() {
        if (!f74532h && m93018v()) {
            f74532h = true;
            C7258h.m22730c().execute(C28285i.f74547a);
        }
    }

    /* renamed from: a */
    public static boolean m92989a() {
        boolean z = f74534j;
        if (f74534j) {
            f74534j = false;
        }
        return z;
    }

    /* renamed from: f */
    public static FeedItemList m93001f() {
        ObjectRef objectRef = new ObjectRef();
        synchronized (f74533i) {
            objectRef.element = f74528d;
        }
        if (((FeedItemList) objectRef.element) != null) {
            f74534j = true;
            f74535k = true;
        }
        f74528d = null;
        return (FeedItemList) objectRef.element;
    }

    /* renamed from: s */
    private static void m93015s() {
        Editor edit = C7285c.m22838a(C6399b.m19921a(), "feed_video_cache", 0).edit();
        edit.putLong("feed_video_cache_time", System.currentTimeMillis());
        edit.putString("feed_video_group_key", "");
        edit.apply();
    }

    /* renamed from: t */
    private static Integer m93016t() {
        int a = C6384b.m19835a().mo15287a(FeedLoadCacheV3CountExperiment.class, true, "is_feed_load_cache_v3_count", C6384b.m19835a().mo15295d().is_feed_load_cache_v3_count, 2);
        if (a <= 0) {
            return Integer.valueOf(2);
        }
        return Integer.valueOf(a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0015] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p280ss.android.ugc.aweme.feed.model.FeedItemList m93013q() {
        /*
            r5 = this;
            java.lang.String r0 = "feed.json"
            java.io.File r0 = m93000e(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0058
            com.google.gson.stream.a r2 = new com.google.gson.stream.a     // Catch:{ Exception -> 0x004f, all -> 0x0047 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x004f, all -> 0x0047 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x004f, all -> 0x0047 }
            java.io.Reader r3 = (java.io.Reader) r3     // Catch:{ Exception -> 0x004f, all -> 0x0047 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004f, all -> 0x0047 }
            com.google.gson.e r3 = com.bytedance.ies.ugc.aweme.network.C10944e.m32113a()     // Catch:{ Exception -> 0x0050, all -> 0x0045 }
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r4 = com.p280ss.android.ugc.aweme.feed.model.FeedItemList.class
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4     // Catch:{ Exception -> 0x0050, all -> 0x0045 }
            java.lang.Object r3 = r3.mo15972a(r2, r4)     // Catch:{ Exception -> 0x0050, all -> 0x0045 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r3 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r3     // Catch:{ Exception -> 0x0050, all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            java.util.List r4 = r3.getItems()     // Catch:{ Exception -> 0x003d, all -> 0x0045 }
            if (r4 == 0) goto L_0x003f
            java.util.List r4 = r3.getItems()     // Catch:{ Exception -> 0x003d, all -> 0x0045 }
            int r4 = r4.size()     // Catch:{ Exception -> 0x003d, all -> 0x0045 }
            if (r4 > 0) goto L_0x0036
            goto L_0x003f
        L_0x0036:
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r2)
            r1 = r3
            goto L_0x0055
        L_0x003d:
            r1 = r3
            goto L_0x0050
        L_0x003f:
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r2)
            return r1
        L_0x0045:
            r0 = move-exception
            goto L_0x0049
        L_0x0047:
            r0 = move-exception
            r2 = r1
        L_0x0049:
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r2)
            throw r0
        L_0x004f:
            r2 = r1
        L_0x0050:
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r2)
        L_0x0055:
            r0.delete()
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.cache.C28275c.m93013q():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: r */
    private final void m93014r() {
        if (C6399b.m19921a() != null) {
            File cacheDir = C6399b.m19921a().getCacheDir();
            C7573i.m23582a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
            String absolutePath = cacheDir.getAbsolutePath();
            if (absolutePath != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append(File.separator);
                sb.append("feedCache");
                File file = new File(sb.toString());
                Integer num = null;
                if (file.exists()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        num = Integer.valueOf(listFiles.length);
                    }
                    C47984g.m148946e(file);
                }
                m92986a(1, 1, num);
            }
        }
    }

    /* renamed from: v */
    private static boolean m93018v() {
        SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "feed_video_cache", 0);
        long j = a.getLong("feed_video_cache_time", 0);
        int a2 = C6384b.m19835a().mo15287a(FeedLoadCacheV3TimeExperiment.class, true, "is_feed_load_cache_v3_time", C6384b.m19835a().mo15295d().is_feed_load_cache_v3_time, 0) * 3600000;
        String string = a.getString("feed_video_group_key", null);
        if (a2 <= 0 || (System.currentTimeMillis() - j < ((long) a2) && !TextUtils.isEmpty(string))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static void m92997d() {
        boolean z;
        if (C6399b.m19921a() != null && !TextUtils.isEmpty(f74531g)) {
            File cacheDir = C6399b.m19921a().getCacheDir();
            C7573i.m23582a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
            String absolutePath = cacheDir.getAbsolutePath();
            if (absolutePath != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append(File.separator);
                sb.append("feedCache");
                File file = new File(sb.toString());
                if (file.exists()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Collection arrayList = new ArrayList(listFiles.length);
                            for (File file2 : listFiles) {
                                String str = f74531g;
                                Boolean bool = null;
                                if (str != null) {
                                    CharSequence charSequence = str;
                                    C7573i.m23582a((Object) file2, "it");
                                    String name = file2.getName();
                                    C7573i.m23582a((Object) name, "it.name");
                                    bool = Boolean.valueOf(C7634n.m23776c(charSequence, (CharSequence) name, false));
                                }
                                if (bool == null || !bool.booleanValue()) {
                                    file2.delete();
                                }
                                arrayList.add(C7581n.f20898a);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static void m93005h() {
        if (C6384b.m19835a().mo15287a(FeedLoadCacheV3Experiment.class, true, "is_feed_load_cache_v3", C6384b.m19835a().mo15295d().is_feed_load_cache_v3, 0) == 1) {
            f74527c = true;
            synchronized (f74533i) {
                if (f74526b.m93017u()) {
                    FeedItemList o = f74526b.m93011o();
                    if (o == null) {
                        m93020x();
                        return;
                    }
                    if (!TextUtils.isEmpty(f74531g)) {
                        ArrayList arrayList = new ArrayList();
                        List items = o.getItems();
                        C7573i.m23582a((Object) items, "itemList.items");
                        Iterable<Aweme> iterable = items;
                        Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
                        for (Aweme aweme : iterable) {
                            String str = f74531g;
                            Boolean bool = null;
                            if (str != null) {
                                CharSequence charSequence = str;
                                C7573i.m23582a((Object) aweme, "it");
                                String aid = aweme.getAid();
                                C7573i.m23582a((Object) aid, "it.aid");
                                bool = Boolean.valueOf(C7634n.m23776c(charSequence, (CharSequence) aid, false));
                            }
                            if (bool != null && bool.booleanValue()) {
                                arrayList.add(aweme);
                            }
                            arrayList2.add(C7581n.f20898a);
                        }
                        o.items = arrayList;
                    }
                    m92986a(1, 0, Integer.valueOf(o.getItems().size()));
                    f74528d = o;
                    C28273a.m92979a(o);
                    StringBuilder sb = new StringBuilder("preloadCache end ");
                    Thread currentThread = Thread.currentThread();
                    C7573i.m23582a((Object) currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        if (r1.getItems().size() > 0) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c6, code lost:
        if (r1.getItems().size() > 0) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c8, code lost:
        m92986a(-2, 0, java.lang.Integer.valueOf(r1.getItems().size()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p280ss.android.ugc.aweme.feed.model.FeedItemList m93012p() {
        /*
            r7 = this;
            java.lang.String r0 = "feed.pb"
            java.io.File r0 = m93000e(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00e7
            r2 = -2
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x00b5, all -> 0x0084 }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x00b5, all -> 0x0084 }
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch:{ Throwable -> 0x00b5, all -> 0x0084 }
            com.squareup.wire.ProtoAdapter<com.ss.ugc.aweme.proto.aweme_v2_feed_response> r5 = com.p280ss.ugc.aweme.proto.aweme_v2_feed_response.ADAPTER     // Catch:{ Throwable -> 0x0082, all -> 0x0080 }
            java.lang.Object r5 = r5.decode(r4)     // Catch:{ Throwable -> 0x0082, all -> 0x0080 }
            com.ss.ugc.aweme.proto.aweme_v2_feed_response r5 = (com.p280ss.ugc.aweme.proto.aweme_v2_feed_response) r5     // Catch:{ Throwable -> 0x0082, all -> 0x0080 }
            if (r5 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.feed.model.FeedItemList r5 = com.p280ss.android.ugc.aweme.feed.api.C28225m.m92770a(r5, r1)     // Catch:{ Throwable -> 0x0082, all -> 0x0080 }
            if (r5 == 0) goto L_0x003e
            java.util.List r6 = r5.getItems()     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            if (r6 == 0) goto L_0x003e
            java.util.List r6 = r5.getItems()     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            int r6 = r6.size()     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            if (r6 > 0) goto L_0x0033
            goto L_0x003e
        L_0x0033:
            m92998d(r5)     // Catch:{ Throwable -> 0x003b, all -> 0x0038 }
            r1 = r5
            goto L_0x006d
        L_0x0038:
            r0 = move-exception
            r1 = r5
            goto L_0x0086
        L_0x003b:
            r1 = r5
            goto L_0x00b6
        L_0x003e:
            if (r5 == 0) goto L_0x0060
            java.util.List r0 = r5.getItems()
            if (r0 == 0) goto L_0x0060
            java.util.List r0 = r5.getItems()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0060
            java.util.List r0 = r5.getItems()
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            m92986a(r2, r3, r0)
            goto L_0x0067
        L_0x0060:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            m92986a(r2, r3, r0)
        L_0x0067:
            java.io.Closeable r4 = (java.io.Closeable) r4
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r4)
            return r1
        L_0x006d:
            if (r1 == 0) goto L_0x00d8
            java.util.List r5 = r1.getItems()
            if (r5 == 0) goto L_0x00d8
            java.util.List r5 = r1.getItems()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00d8
            goto L_0x00c8
        L_0x0080:
            r0 = move-exception
            goto L_0x0086
        L_0x0082:
            goto L_0x00b6
        L_0x0084:
            r0 = move-exception
            r4 = r1
        L_0x0086:
            if (r1 == 0) goto L_0x00a8
            java.util.List r5 = r1.getItems()
            if (r5 == 0) goto L_0x00a8
            java.util.List r5 = r1.getItems()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00a8
            java.util.List r1 = r1.getItems()
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            m92986a(r2, r3, r1)
            goto L_0x00af
        L_0x00a8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            m92986a(r2, r3, r1)
        L_0x00af:
            java.io.Closeable r4 = (java.io.Closeable) r4
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r4)
            throw r0
        L_0x00b5:
            r4 = r1
        L_0x00b6:
            if (r1 == 0) goto L_0x00d8
            java.util.List r5 = r1.getItems()
            if (r5 == 0) goto L_0x00d8
            java.util.List r5 = r1.getItems()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00d8
        L_0x00c8:
            java.util.List r5 = r1.getItems()
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            m92986a(r2, r3, r5)
            goto L_0x00df
        L_0x00d8:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            m92986a(r2, r3, r5)
        L_0x00df:
            java.io.Closeable r4 = (java.io.Closeable) r4
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r4)
            r0.delete()
        L_0x00e7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.cache.C28275c.m93012p():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: u */
    private final boolean m93017u() {
        if (!m93018v()) {
            SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "feed_video_cache", 0);
            String string = a.getString("feed_video_group_key", null);
            f74531g = string;
            m93006i();
            CharSequence charSequence = string;
            if (!TextUtils.isEmpty(charSequence)) {
                a.edit().putString("feed_video_group_key", null).apply();
                C7573i.m23582a((Object) string, "values");
                List b = C7634n.m23766b(charSequence, new char[]{','}, false, 0);
                if (b != null && (!b.isEmpty())) {
                    Iterable<String> iterable = b;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (String b2 : iterable) {
                        String b3 = f74526b.mo71954b(b2);
                        if (TextUtils.isEmpty(b3) || !new File(b3).exists()) {
                            m93020x();
                            f74531g = "";
                            return false;
                        }
                        arrayList.add(C7581n.f20898a);
                    }
                    return true;
                }
            }
        } else {
            m93014r();
        }
        return false;
    }

    /* renamed from: e */
    public final FeedItemList mo71958e() {
        FeedItemList feedItemList;
        C1592h.m7853a((Callable<TResult>) C28280d.f74542a);
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = null;
        try {
            feedItemList = ((IFeedApi) ServiceManager.get().getService(IFeedApi.class)).fetchFeedList(0, 0, 0, 0, null, null, 8, 0, "", null, null, 0, null);
            try {
                m92996c(feedItemList);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            feedItemList = null;
            objectRef.element = Integer.valueOf(C10933d.m32089a(e, null));
            C1592h.m7853a((Callable<TResult>) new C28281e<TResult>(objectRef));
            return feedItemList;
        }
        C1592h.m7853a((Callable<TResult>) new C28281e<TResult>(objectRef));
        return feedItemList;
    }

    /* renamed from: a */
    public static void m92987a(long j) {
        if (!f74529e) {
            try {
                f74530f.await(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m92996c(FeedItemList feedItemList) {
        if (feedItemList != null && !C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
            Iterator it = feedItemList.getItems().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (aweme != null && aweme.isLive()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: d */
    private static void m92998d(FeedItemList feedItemList) {
        if (feedItemList != null) {
            SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "feed_video_cache", 0);
            String string = a.getString("feed_cache_request_id", null);
            if (!TextUtils.isEmpty(string)) {
                feedItemList.setRequestId(string);
            }
            a.edit().putString("feed_cache_request_id", "").apply();
        }
    }

    /* renamed from: d */
    public static boolean m92999d(String str) {
        if (str == null || f74531g == null) {
            return false;
        }
        String str2 = f74531g;
        Boolean bool = null;
        if (str2 != null) {
            bool = Boolean.valueOf(C7634n.m23776c((CharSequence) str2, (CharSequence) str, false));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    private static File m93000e(String str) {
        if (C6399b.m19921a() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        File cacheDir = C6399b.m19921a().getCacheDir();
        C7573i.m23582a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
        sb.append(cacheDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("feedCache");
        sb.append(File.separator);
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    /* renamed from: f */
    private static void m93002f(String str) {
        if (!TextUtils.isEmpty(str)) {
            Editor edit = C7285c.m22838a(C6399b.m19921a(), "feed_video_cache", 0).edit();
            edit.putString("feed_cache_request_id", str);
            edit.apply();
        }
    }

    /* renamed from: g */
    private static void m93004g(String str) {
        if (C6399b.m19921a() != null && !TextUtils.isEmpty(str)) {
            SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "feed_video_cache", 0);
            String string = a.getString("feed_video_group_key", null);
            if (!TextUtils.isEmpty(string)) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(',');
                sb.append(str);
                str = sb.toString();
            }
            Editor edit = a.edit();
            edit.putString("feed_video_group_key", str);
            edit.apply();
        }
    }

    /* renamed from: b */
    public final String mo71954b(String str) {
        if (C6399b.m19921a() == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File cacheDir = C6399b.m19921a().getCacheDir();
        C7573i.m23582a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
        String absolutePath = cacheDir.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        sb.append(File.separator);
        sb.append("feedCache");
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo71957c(String str) {
        String str2;
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            String w = m93019w();
            CharSequence charSequence2 = w;
            if (!TextUtils.isEmpty(charSequence2)) {
                if (w == null) {
                    C7573i.m23580a();
                }
                if (str == null) {
                    C7573i.m23580a();
                }
                if (C7634n.m23776c(charSequence2, charSequence, false)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(',');
                    if (C7634n.m23721b(w, sb.toString(), false)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(',');
                        str2 = C7634n.m23719b(w, sb2.toString(), "", false);
                    } else if (C7634n.m23721b(w, str, false)) {
                        str2 = C7634n.m23719b(w, str, "", false);
                    } else {
                        StringBuilder sb3 = new StringBuilder(",");
                        sb3.append(str);
                        str2 = C7634n.m23719b(w, sb3.toString(), "", false);
                    }
                    C7285c.m22838a(C6399b.m19921a(), "feed_video_cache", 0).edit().putString("feed_video_group_key", str2).apply();
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m92993a(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71955b(com.p280ss.android.ugc.aweme.feed.model.FeedItemList r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x000f
            java.util.List r0 = r11.getItems()
            if (r0 == 0) goto L_0x000f
            java.util.List r0 = r11.getItems()
            r0.size()
        L_0x000f:
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "feed size = "
            r2.<init>(r3)
            if (r11 == 0) goto L_0x0031
            java.util.List r3 = r11.getItems()
            if (r3 == 0) goto L_0x0031
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            r2.append(r3)
            java.lang.Integer r2 = m93016t()
            if (r11 == 0) goto L_0x00fd
            java.util.List r11 = r11.getItems()
            if (r11 == 0) goto L_0x00fd
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C7525m.m23469a(r11, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r11 = r11.iterator()
            r4 = 0
            r5 = 0
        L_0x0056:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x00fc
            java.lang.Object r6 = r11.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r6
            if (r6 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.feed.model.Video r7 = r6.getVideo()
            if (r7 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.feed.model.Video r7 = r6.getVideo()
            java.lang.String r8 = "it.video"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r7 = r7.getPlayAddr()
            if (r7 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.feed.model.Video r7 = r6.getVideo()
            java.lang.String r8 = "it.video"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r7 = r7.getPlayAddr()
            java.lang.String r8 = "it.video.playAddr"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            java.util.List r7 = r7.getUrlList()
            if (r7 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.feed.model.Video r7 = r6.getVideo()
            java.lang.String r8 = "it.video"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r7 = r7.getPlayAddr()
            java.lang.String r8 = "it.video.playAddr"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            java.util.List r7 = r7.getUrlList()
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x00f5
            if (r2 == 0) goto L_0x00f5
            int r7 = r2.intValue()
            int r7 = kotlin.jvm.internal.C7573i.m23576a(r5, r7)
            if (r7 >= 0) goto L_0x00f5
            com.ss.android.ugc.aweme.feed.cache.c r7 = f74526b
            com.ss.android.ugc.aweme.feed.model.Video r8 = r6.getVideo()
            java.lang.String r9 = "it.video"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r8 = r8.getPlayAddr()
            java.lang.String r9 = "it.video.playAddr"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            java.util.List r8 = r8.getUrlList()
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r6.getAid()
            boolean r7 = r7.m92994a(r8, r9)
            r0.element = r7
            boolean r7 = r0.element
            if (r7 == 0) goto L_0x00f5
            int r5 = r5 + 1
            java.lang.String r7 = r6.getAid()
            r1.add(r7)
            java.lang.String r6 = r6.getAid()
            m93004g(r6)
        L_0x00f5:
            kotlin.n r6 = kotlin.C7581n.f20898a
            r3.add(r6)
            goto L_0x0056
        L_0x00fc:
            return
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.cache.C28275c.mo71955b(com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }

    /* renamed from: a */
    public final void mo71951a(FeedItemList feedItemList) {
        if (feedItemList != null && feedItemList.getItems() != null && feedItemList.getItems().size() > 0 && C6399b.m19921a() != null) {
            File cacheDir = C6399b.m19921a().getCacheDir();
            C7573i.m23582a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
            String absolutePath = cacheDir.getAbsolutePath();
            if (absolutePath != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append(File.separator);
                sb.append("feedCache");
                String sb2 = sb.toString();
                File file = new File(sb2);
                if (!file.exists()) {
                    file.mkdir();
                }
                if (!m92992a(feedItemList, sb2)) {
                    m92995b(feedItemList, sb2);
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m92992a(FeedItemList feedItemList, String str) {
        OutputStream outputStream;
        if (!(feedItemList == null || feedItemList.pbData == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append("feed.pb");
            File file = new File(sb.toString());
            if (m92993a(file)) {
                OutputStream outputStream2 = null;
                try {
                    outputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                    C42973bg.m136425a((Closeable) outputStream);
                    throw th;
                }
                try {
                    feedItemList.pbData.encode(outputStream);
                    m93015s();
                    m93002f(feedItemList.getRequestId());
                    C42973bg.m136425a((Closeable) outputStream);
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    C42973bg.m136425a((Closeable) outputStream);
                    throw th;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m92995b(FeedItemList feedItemList, String str) {
        FileOutputStream fileOutputStream;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append("feed.json");
        File file = new File(sb.toString());
        if (m92993a(file)) {
            String b = C10944e.m32113a().mo15979b((Object) feedItemList);
            if (!TextUtils.isEmpty(b)) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        C7573i.m23582a((Object) b, "value");
                        Charset charset = C48038d.f122880a;
                        if (b != null) {
                            byte[] bytes = b.getBytes(charset);
                            C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                            fileOutputStream.write(bytes);
                            m93015s();
                            C42973bg.m136425a((Closeable) fileOutputStream);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        C42973bg.m136425a((Closeable) fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        C42973bg.m136425a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                    C42973bg.m136425a((Closeable) fileOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    C42973bg.m136425a((Closeable) fileOutputStream);
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:44|43|47|48|(0)|42|58) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r5 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d9 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2 A[SYNTHETIC, Splitter:B:50:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8 A[SYNTHETIC, Splitter:B:53:0x00e8] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m92990a(com.bytedance.retrofit2.C12534t<com.bytedance.retrofit2.mime.TypedInput> r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r0 = r9.mo30512c()
            if (r0 == 0) goto L_0x00ef
            T r0 = r9.f33302b
            com.bytedance.retrofit2.mime.TypedInput r0 = (com.bytedance.retrofit2.mime.TypedInput) r0
            java.io.InputStream r0 = r0.mo10444in()
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.bytedance.retrofit2.a.d r3 = r9.f33301a
            r4 = 1
            if (r3 == 0) goto L_0x0090
            com.bytedance.retrofit2.a.d r3 = r9.f33301a
            java.lang.String r5 = "response.raw()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            java.util.List<com.bytedance.retrofit2.a.b> r3 = r3.f33121d
            if (r3 == 0) goto L_0x0090
            com.bytedance.retrofit2.a.d r3 = r9.f33301a
            java.lang.String r5 = "response.raw()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            java.util.List<com.bytedance.retrofit2.a.b> r3 = r3.f33121d
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0090
            com.bytedance.retrofit2.a.d r9 = r9.f33301a
            java.lang.String r3 = "response.raw()"
            kotlin.jvm.internal.C7573i.m23582a(r9, r3)
            java.util.List<com.bytedance.retrofit2.a.b> r9 = r9.f33121d
            java.lang.String r3 = "response.raw().headers"
            kotlin.jvm.internal.C7573i.m23582a(r9, r3)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C7525m.m23469a(r9, r5)
            r3.<init>(r5)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r9 = r9.iterator()
        L_0x005f:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0090
            java.lang.Object r5 = r9.next()
            com.bytedance.retrofit2.a.b r5 = (com.bytedance.retrofit2.p637a.C12461b) r5
            java.lang.String r6 = "Content-Length"
            java.lang.String r7 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r5, r7)
            java.lang.String r7 = r5.f33095a
            boolean r6 = kotlin.text.C7634n.m23717a(r6, r7, r4)
            if (r6 == 0) goto L_0x008a
            java.lang.String r5 = r5.f33096b     // Catch:{ Exception -> 0x008a }
            java.lang.String r6 = "it.value"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)     // Catch:{ Exception -> 0x008a }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x008a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x008a }
            r2 = r5
        L_0x008a:
            kotlin.n r5 = kotlin.C7581n.f20898a
            r3.add(r5)
            goto L_0x005f
        L_0x0090:
            if (r0 == 0) goto L_0x00ef
            java.lang.String r9 = r8.mo71954b(r10)
            if (r9 != 0) goto L_0x0099
            return r1
        L_0x0099:
            r10 = 0
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x00d9 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00d9 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x00d9 }
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch:{ Exception -> 0x00d9 }
            r10 = 0
        L_0x00a6:
            if (r10 < 0) goto L_0x00b4
            int r10 = r0.read(r3)     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            if (r10 <= 0) goto L_0x00a6
            r5.write(r3, r1, r10)     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            goto L_0x00a6
        L_0x00b2:
            r9 = move-exception
            goto L_0x00e6
        L_0x00b4:
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            long r9 = r10.length()     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x00cd
            com.ss.android.ugc.aweme.feed.cache.c$b r9 = com.p280ss.android.ugc.aweme.feed.cache.C28275c.C28278b.f74540a     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            java.util.concurrent.Callable r9 = (java.util.concurrent.Callable) r9     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            bolts.C1592h.m7853a(r9)     // Catch:{ Exception -> 0x00d4, all -> 0x00b2 }
            r1 = 1
        L_0x00cd:
            r5.close()     // Catch:{ Exception -> 0x00ef }
        L_0x00d0:
            r0.close()     // Catch:{ Exception -> 0x00ef }
            goto L_0x00ef
        L_0x00d4:
            r10 = r5
            goto L_0x00d9
        L_0x00d6:
            r9 = move-exception
            r5 = r10
            goto L_0x00e6
        L_0x00d9:
            com.ss.android.ugc.aweme.feed.cache.c$c r9 = com.p280ss.android.ugc.aweme.feed.cache.C28275c.C28279c.f74541a     // Catch:{ all -> 0x00d6 }
            java.util.concurrent.Callable r9 = (java.util.concurrent.Callable) r9     // Catch:{ all -> 0x00d6 }
            bolts.C1592h.m7853a(r9)     // Catch:{ all -> 0x00d6 }
            if (r10 == 0) goto L_0x00d0
            r10.close()     // Catch:{ Exception -> 0x00ef }
            goto L_0x00d0
        L_0x00e6:
            if (r5 == 0) goto L_0x00eb
            r5.close()     // Catch:{ Exception -> 0x00ee }
        L_0x00eb:
            r0.close()     // Catch:{ Exception -> 0x00ee }
        L_0x00ee:
            throw r9
        L_0x00ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.cache.C28275c.m92990a(com.bytedance.retrofit2.t, java.lang.String):boolean");
    }

    /* renamed from: a */
    private final boolean m92994a(String str, String str2) {
        C12534t tVar;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map linkedHashMap = new LinkedHashMap();
        Pair a = C10191k.m30270a(str, linkedHashMap);
        String str3 = (String) a.first;
        String str4 = (String) a.second;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return false;
        }
        C1592h.m7853a((Callable<TResult>) C28282f.f74544a);
        try {
            tVar = ((INetworkApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str3).mo26431b(false).mo26430a().mo26435a(INetworkApi.class)).downloadFile(false, -1, str4, linkedHashMap).execute();
        } catch (Exception e) {
            C1592h.m7853a((Callable<TResult>) new C28283g<TResult>(e));
            tVar = null;
        }
        if (tVar == null) {
            return false;
        }
        return m92990a(tVar, str2);
    }

    /* renamed from: a */
    private static void m92986a(int i, int i2, Integer num) {
        C1592h.m7853a((Callable<TResult>) new C28287k<TResult>(i, i2, num));
    }
}
