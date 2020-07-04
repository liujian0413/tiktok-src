package com.p280ss.android.ugc.aweme.feed.preload;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.feed.cache.C28289e;
import com.p280ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedCacheV2CountExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedCacheV2EnabledExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.j */
public final class C28666j extends C28653a<FeedItemList> {

    /* renamed from: f */
    private static volatile boolean f75520f;

    /* renamed from: b */
    public FeedItemList f75521b;

    /* renamed from: c */
    private int f75522c = -1;

    /* renamed from: d */
    private FeedItemList f75523d;

    /* renamed from: e */
    private C1592h f75524e;

    /* renamed from: d */
    public final void mo73718d() {
        this.f75524e = null;
    }

    /* renamed from: l */
    private static void m94320l() {
        File file = new File(C6399b.m19921a().getFilesDir(), "key_cold_start_feed_list_v2");
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: b */
    public final void mo73716b() {
        if (mo73723e() && this.f75524e == null) {
            this.f75524e = C1592h.m7855a((Callable<TResult>) new Callable<FeedItemList>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public FeedItemList call() throws Exception {
                    return C28666j.this.mo73714a();
                }
            }, (Executor) C7258h.m22730c());
        }
    }

    /* renamed from: h */
    public final void mo73733h() {
        if (this.f75521b == null) {
            this.f75524e = C1592h.m7855a((Callable<TResult>) new Callable<FeedItemList>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public FeedItemList call() throws Exception {
                    return C28666j.this.mo73732g();
                }
            }, (Executor) C7258h.m22730c());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|(2:10|11)|12|13|(1:15)|16|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001a */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022 A[Catch:{ Exception -> 0x0026 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p280ss.android.ugc.aweme.feed.model.FeedItemList mo73717c() {
        /*
            r1 = this;
            bolts.h r0 = r1.f75524e
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r1.f75521b
            if (r0 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r1.f75521b
            return r0
        L_0x000d:
            bolts.h r0 = r1.f75524e
            boolean r0 = r0.mo6882b()
            if (r0 != 0) goto L_0x001a
            bolts.h r0 = r1.f75524e     // Catch:{ InterruptedException -> 0x001a }
            r0.mo6892g()     // Catch:{ InterruptedException -> 0x001a }
        L_0x001a:
            bolts.h r0 = r1.f75524e     // Catch:{ Exception -> 0x0026 }
            boolean r0 = r0.mo6889d()     // Catch:{ Exception -> 0x0026 }
            if (r0 != 0) goto L_0x0026
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r1.f75521b     // Catch:{ Exception -> 0x0026 }
            r1.f75521b = r0     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            r1.mo73718d()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r1.f75521b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.preload.C28666j.mo73717c():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: e */
    public final boolean mo73723e() {
        if (C6399b.m19944t()) {
            return C6384b.m19835a().mo15292a(FeedCacheV2EnabledExperiment.class, true, "is_feed_load_cache_v2", C6384b.m19835a().mo15295d().is_feed_load_cache_v2, false);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final FeedItemList mo73714a() throws Exception {
        if (!mo73723e() || !C28672m.m94337a(C6399b.m19921a())) {
            return null;
        }
        FeedItemList j = m94318j();
        if (j != null && !C6307b.m19566a((Collection<T>) j.getItems())) {
            this.f75523d = j;
        }
        this.f75521b = j;
        return j;
    }

    /* renamed from: k */
    private static String m94319k() {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(C6399b.m19921a().getFilesDir(), "key_cold_start_feed_list_v2");
            if (!file.exists()) {
                C42973bg.m136425a((Closeable) null);
                C42973bg.m136425a((Closeable) null);
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            String str = new String(byteArrayOutputStream.toByteArray());
                            C42973bg.m136425a((Closeable) fileInputStream);
                            C42973bg.m136425a((Closeable) byteArrayOutputStream);
                            return str;
                        }
                    } catch (Exception unused) {
                        C42973bg.m136425a((Closeable) fileInputStream);
                        C42973bg.m136425a((Closeable) byteArrayOutputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        C42973bg.m136425a((Closeable) fileInputStream2);
                        C42973bg.m136425a((Closeable) byteArrayOutputStream);
                        throw th;
                    }
                }
            } catch (Exception unused2) {
                byteArrayOutputStream = null;
                C42973bg.m136425a((Closeable) fileInputStream);
                C42973bg.m136425a((Closeable) byteArrayOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                fileInputStream2 = fileInputStream;
                C42973bg.m136425a((Closeable) fileInputStream2);
                C42973bg.m136425a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
            byteArrayOutputStream = null;
            C42973bg.m136425a((Closeable) fileInputStream);
            C42973bg.m136425a((Closeable) byteArrayOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            C42973bg.m136425a((Closeable) fileInputStream2);
            C42973bg.m136425a((Closeable) byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: g */
    public final FeedItemList mo73732g() throws Exception {
        int i;
        if (!C28672m.m94337a(C6399b.m19921a())) {
            return null;
        }
        if (f75520f) {
            f75520f = false;
            return null;
        }
        if (C28434i.m93482k()) {
            i = 4;
        } else {
            i = 0;
        }
        C286671 r20 = r1;
        C286671 r1 = new C28289e() {
            /* renamed from: a */
            public final String mo71970a() {
                C6857a.m21312e().mo16822a("feed_wait_feed_cache", false);
                C28275c.m92987a(500);
                C6857a.m21312e().mo16827b("feed_wait_feed_cache", false);
                return C28275c.m93007k();
            }
        };
        FeedItemList fetchFeedList = ((IFeedApi) ServiceManager.get().getService(IFeedApi.class)).fetchFeedList(0, 0, 0, 6, null, null, i, 0, "", null, null, 0, r20);
        if (C28275c.f74526b.mo71959j() && fetchFeedList != null) {
            fetchFeedList.appendCache = C28275c.m92989a();
        }
        if (fetchFeedList != null) {
            BusinessComponentServiceUtils.getLiveStateManager().mo83746a(fetchFeedList.getItems());
        }
        this.f75521b = fetchFeedList;
        return fetchFeedList;
    }

    /* renamed from: j */
    private FeedItemList m94318j() {
        String a = C23338f.m76562a().mo60623a("feed_cached_index", "");
        int a2 = C6384b.m19835a().mo15287a(FeedCacheV2CountExperiment.class, true, "is_feed_load_cache_v2_count", C6384b.m19835a().mo15295d().is_feed_load_cache_v2_count, 0);
        FeedItemList feedItemList = null;
        if (a2 <= 0 || a2 > 3) {
            return null;
        }
        if (!TextUtils.isEmpty(a)) {
            String k = m94319k();
            if (!TextUtils.isEmpty(k)) {
                feedItemList = (FeedItemList) C10944e.m32113a().mo15974a(k, FeedItemList.class);
                if (!C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= feedItemList.getItems().size()) {
                            break;
                        } else if (TextUtils.equals(a, ((Aweme) feedItemList.getItems().get(i2)).getAid())) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    int i3 = a2 + i;
                    if (i3 > feedItemList.getItems().size()) {
                        i3 = feedItemList.getItems().size();
                    }
                    feedItemList.items = feedItemList.getItems().subList(i, i3);
                    feedItemList.isFromLocalCache = true;
                    this.f75522c = feedItemList.getItems().size();
                }
            }
        }
        return feedItemList;
    }

    /* renamed from: a */
    public static void m94313a(boolean z) {
        f75520f = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo73727a(FeedItemList feedItemList) throws Exception {
        try {
            m94311a((Aweme) feedItemList.getItems().get(0));
        } catch (Exception unused) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo73715a(Object obj) throws Exception {
        this.f75521b = (FeedItemList) obj;
    }

    /* renamed from: b */
    private static FeedItemList m94315b(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = new FeedItemList();
        feedItemList2.currentCity = feedItemList.currentCity;
        feedItemList2.extra = feedItemList.extra;
        feedItemList2.hasMore = feedItemList.hasMore;
        feedItemList2.maxCursor = feedItemList.maxCursor;
        feedItemList2.minCursor = feedItemList.minCursor;
        feedItemList2.refreshClear = feedItemList.isRefreshClear() ? 1 : 0;
        feedItemList2.setRequestId(feedItemList.getRequestId());
        feedItemList2.items = new ArrayList(feedItemList.getItems());
        return feedItemList2;
    }

    /* renamed from: a */
    private static void m94311a(Aweme aweme) {
        if (C13380c.m39173d()) {
            ImageRequest[] a = C23323e.m76520a(aweme.getVideo().getOriginCover(), (C13596d) null, Priority.HIGH, (C13842b) null);
            if (a != null && a.length != 0) {
                C13380c.m39172c().mo33173a(a[0], (Object) C6399b.m19921a(), Priority.LOW);
            }
        }
    }

    /* renamed from: a */
    private static void m94312a(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(C6399b.m19921a().getFilesDir(), "key_cold_start_feed_list_v2");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(str.getBytes());
                C42973bg.m136425a((Closeable) fileOutputStream2);
            } catch (Exception unused) {
                fileOutputStream = fileOutputStream2;
                C42973bg.m136425a((Closeable) fileOutputStream);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                C42973bg.m136425a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Exception unused2) {
            C42973bg.m136425a((Closeable) fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            C42973bg.m136425a((Closeable) fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private List<Aweme> m94310a(FeedItemList feedItemList, FeedItemList feedItemList2) {
        ArrayList arrayList = new ArrayList();
        int size = feedItemList2.getItems().size();
        for (int i = 0; i < size; i++) {
            Aweme aweme = (Aweme) feedItemList2.getItems().get(i);
            if (!m94314a(aweme.getAid(), feedItemList)) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m94316c(FeedItemList feedItemList, int i) {
        if (this.f75522c > 0) {
            if (this.f75523d != null && !C6307b.m19566a((Collection<T>) this.f75523d.getItems())) {
                feedItemList.items = m94310a(this.f75523d, feedItemList);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= feedItemList.getItems().size()) {
                    i2 = -1;
                    break;
                } else if (((Aweme) feedItemList.getItems().get(i2)).isAd()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0 && 4 - this.f75522c <= feedItemList.getItems().size()) {
                feedItemList.getItems().add(3 - this.f75522c, (Aweme) feedItemList.getItems().remove(i2));
            }
            this.f75522c = -1;
            this.f75523d = null;
        }
    }

    /* renamed from: b */
    public final void mo73730b(FeedItemList feedItemList, int i) {
        if (feedItemList != null && !C6307b.m19566a((Collection<T>) feedItemList.getItems()) && i == 0) {
            C1592h.m7853a((Callable<TResult>) new C28671l<TResult>(this, feedItemList));
        }
    }

    /* renamed from: a */
    private static boolean m94314a(String str, FeedItemList feedItemList) {
        int size = feedItemList.getItems().size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((Aweme) feedItemList.getItems().get(i)).getAid())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo73729a(FeedItemList feedItemList, int i) {
        if (mo73723e() && feedItemList != null && !C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
            m94316c(feedItemList, i);
            try {
                m94320l();
                FeedItemList b = m94315b(feedItemList);
                if (!C6307b.m19566a((Collection<T>) feedItemList.getItems()) && feedItemList.getItems().size() > 5) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < feedItemList.getItems().size() - 2; i2++) {
                        Aweme aweme = (Aweme) feedItemList.getItems().get(i2);
                        if (!aweme.isAd()) {
                            arrayList.add(aweme);
                        }
                    }
                    b.items = arrayList;
                    C23338f.m76562a().mo60630b("key_feed_cache_time", System.currentTimeMillis());
                    C1592h.m7853a((Callable<TResult>) new C28670k<TResult>(this, arrayList, b, feedItemList));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo73728a(List list, FeedItemList feedItemList, FeedItemList feedItemList2) throws Exception {
        try {
            if (C6307b.m19566a((Collection<T>) list)) {
                return null;
            }
            for (int i = 0; i < list.size(); i++) {
                m94311a((Aweme) list.get(i));
            }
            m94312a(C10944e.m32113a().mo15979b((Object) feedItemList));
            C28663i.m94306a().mo73726b();
            C28663i.m94306a().mo73725a(feedItemList2.getRequestId(), feedItemList2.logPb);
            return null;
        } catch (Exception unused) {
        }
    }
}
