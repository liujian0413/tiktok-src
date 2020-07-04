package com.p280ss.android.ugc.aweme.feed;

import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.api.C28216d;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28447b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.p1393a.C33221a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C43048db;
import com.p280ss.android.ugc.aweme.utils.OneTimeEnum;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.u */
public final class C28696u {

    /* renamed from: a */
    private long f75577a;

    /* renamed from: b */
    private Fragment f75578b;

    /* renamed from: c */
    private boolean f75579c = C43048db.m136578a().mo104720a(OneTimeEnum.FEED_REQ);

    /* renamed from: a */
    public final void mo73762a(int i, String str, FeedAppLogParams feedAppLogParams, Exception exc) {
        boolean l = C28275c.m93008l();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f75577a;
        long currentTimeMillis = System.currentTimeMillis();
        String d = C28580o.m93834d();
        String e = C28580o.m93835e();
        int i2 = l ? -1 : this.f75579c ? 1 : 0;
        C29029v vVar = r1;
        C29029v vVar2 = new C29029v(i, feedAppLogParams, exc, elapsedRealtime, String.valueOf(i2), str, d, e, l, currentTimeMillis);
        C1592h.m7855a((Callable<TResult>) vVar, (Executor) C6907h.m21516a());
        C28434i.m93479h();
        if (C28216d.f74331a != 0) {
            C1592h.m7855a(C29030w.f76471a, (Executor) C7258h.m22732e());
        }
        if (!l) {
            this.f75579c = false;
        }
        if (i == 1) {
            C28209am.m92726a(true);
        }
    }

    /* renamed from: a */
    public final void mo73764a(String str) {
        this.f75577a = SystemClock.elapsedRealtime();
        long a = C6914a.m21539a();
        long j = 0;
        if (a > 0) {
            j = SystemClock.elapsedRealtime() - a;
        }
        String l = Long.toString(j);
        C29057y yVar = new C29057y(this, C28580o.m93834d(), C28580o.m93835e(), str, l);
        C1592h.m7855a((Callable<TResult>) yVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public final void mo73763a(int i, String str, String str2, C28447b bVar) {
        ((IFeedLogger) ServiceManager.get().getService(IFeedLogger.class)).setFeedResponseEvent(i, str, str2, bVar, this.f75578b, this.f75577a);
    }

    /* renamed from: b */
    private boolean m94418b() {
        if (this.f75578b == null || this.f75578b.mUserVisibleHint) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m94412a() throws Exception {
        C6877n.m21407a("log_bean_copy_convert", "log_bean_copy_convert", C6869c.m21381a().mo16886a("spendTime", Long.valueOf(C28216d.f74331a)).mo16888b());
        C28216d.f74331a = 0;
        return null;
    }

    public C28696u(Fragment fragment) {
        this.f75578b = fragment;
    }

    /* renamed from: a */
    private static String m94415a(Exception exc) {
        if (exc == null) {
            return null;
        }
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message) || message.length() <= 200) {
            return message;
        }
        return message.substring(0, C34943c.f91127w);
    }

    /* renamed from: a */
    public final void mo73761a(int i, String str, FeedAppLogParams feedAppLogParams) {
        mo73762a(1, str, feedAppLogParams, (Exception) null);
    }

    /* renamed from: a */
    public static void m94417a(String str, String str2, int i) {
        ((IFeedLogger) ServiceManager.get().getService(IFeedLogger.class)).setFeedRequestEvent(str, str2, i);
    }

    /* renamed from: b */
    public final void mo73765b(int i, String str, FeedAppLogParams feedAppLogParams) {
        if (C6399b.m19944t()) {
            m94416a(i, feedAppLogParams, str);
            if (feedAppLogParams == null || feedAppLogParams.mData == null || !feedAppLogParams.mData.isFromLocalCache) {
                C29056x xVar = new C29056x(this, i, feedAppLogParams, SystemClock.elapsedRealtime() - this.f75577a, str, C28580o.m93834d());
                C1592h.m7855a((Callable<TResult>) xVar, (Executor) C6907h.m21516a());
            }
        }
    }

    /* renamed from: a */
    private void m94416a(int i, FeedAppLogParams feedAppLogParams, String str) {
        C29058z zVar = new C29058z(C43048db.m136578a().mo104720a(OneTimeEnum.FEED_FIRST_REQUEST_RESPONSE), i, SystemClock.elapsedRealtime() - C6914a.f19586a, feedAppLogParams, str, SystemClock.elapsedRealtime() - this.f75577a);
        C1592h.m7855a((Callable<TResult>) zVar, (Executor) C6907h.m21516a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo73760a(String str, String str2, String str3, String str4) throws Exception {
        JSONObject a = new C6909j().mo16966a("is_first", String.valueOf(this.f75579c ? 1 : 0)).mo16966a("feed_tab", str).mo16966a("top_activity", str2).mo16966a("request_method", str3).mo16966a("duration", str4).mo16967a();
        C6907h.onEvent(MobClick.obtain().setEventName("feed_request").setLabelName("perf_monitor").setJsonObject(a));
        C6907h.m21528b("feed_request", a);
        C33221a.m107190a("feed_request", a);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo73759a(int r6, com.p280ss.android.ugc.aweme.feed.model.FeedAppLogParams r7, long r8, java.lang.String r10, java.lang.String r11) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "0"
            r1 = 0
            r2 = -1
            r3 = 1
            if (r6 != r3) goto L_0x0079
            if (r7 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.feed.model.FeedItemList r3 = r7.mLastFeedItemList
            if (r3 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.feed.model.FeedItemList r3 = r7.mLastFeedItemList
            java.util.List r3 = r3.getItems()
            boolean r3 = com.bytedance.common.utility.collection.C6307b.m19566a(r3)
            if (r3 != 0) goto L_0x0079
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r7.mLastFeedItemList     // Catch:{ Exception -> 0x0067 }
            java.util.List r0 = r0.getItems()     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0067 }
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r0     // Catch:{ Exception -> 0x0067 }
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()     // Catch:{ Exception -> 0x0067 }
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddr()     // Catch:{ Exception -> 0x0067 }
            if (r1 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddr()     // Catch:{ Exception -> 0x0067 }
            java.util.List r1 = r1.getUrlList()     // Catch:{ Exception -> 0x0067 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0067 }
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getCover()     // Catch:{ Exception -> 0x0061 }
            if (r3 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getCover()     // Catch:{ Exception -> 0x0061 }
            java.util.List r3 = r3.getUrlList()     // Catch:{ Exception -> 0x0061 }
            boolean r3 = com.bytedance.common.utility.collection.C6307b.m19566a(r3)     // Catch:{ Exception -> 0x0061 }
            if (r3 != 0) goto L_0x0064
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCover()     // Catch:{ Exception -> 0x0061 }
            java.util.List r0 = r0.getUrlList()     // Catch:{ Exception -> 0x0061 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0061 }
            r2 = r0
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            goto L_0x0069
        L_0x0063:
            r1 = -1
        L_0x0064:
            r0 = r2
            r2 = r1
            goto L_0x006e
        L_0x0067:
            r0 = move-exception
            r1 = -1
        L_0x0069:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r0)
            r2 = r1
            r0 = -1
        L_0x006e:
            com.ss.android.ugc.aweme.feed.model.FeedItemList r1 = r7.mLastFeedItemList
            int r1 = r1.blockCode
            com.ss.android.ugc.aweme.feed.model.FeedItemList r7 = r7.mLastFeedItemList
            java.lang.String r7 = r7.getRequestId()
            goto L_0x007b
        L_0x0079:
            r7 = r0
            r0 = -1
        L_0x007b:
            com.ss.android.ugc.aweme.app.g.d r3 = new com.ss.android.ugc.aweme.app.g.d
            r3.<init>()
            java.lang.String r4 = "request_id"
            com.ss.android.ugc.aweme.app.g.d r7 = r3.mo59973a(r4, r7)
            java.lang.String r3 = "is_success"
            boolean r4 = r5.m94418b()
            if (r4 != 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r6 = 2
        L_0x0090:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.ss.android.ugc.aweme.app.g.d r6 = r7.mo59973a(r3, r6)
            java.lang.String r7 = "duration"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r7, r8)
            java.lang.String r7 = "is_first"
            boolean r8 = r5.f75579c
            java.lang.String r8 = java.lang.String.valueOf(r8)
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r7, r8)
            java.lang.String r7 = "request_method"
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r7, r10)
            java.lang.String r7 = "feed_tab"
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r7, r11)
            java.lang.String r7 = "video_num"
            java.lang.String r8 = java.lang.String.valueOf(r2)
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r7, r8)
            java.lang.String r7 = "image_num"
            java.lang.String r8 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r7, r8)
            java.lang.String r7 = "blockCode"
            java.lang.String r8 = java.lang.String.valueOf(r1)
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r7, r8)
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f60753a
            java.lang.String r7 = "feed_request_response_test"
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r7, r6)
            java.lang.String r7 = "feed_request_response_test_v3"
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r6)
            com.p280ss.android.ugc.aweme.app.C6877n.m21447a(r7, r8)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.C28696u.mo73759a(int, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams, long, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    static final /* synthetic */ Object m94414a(boolean z, int i, long j, FeedAppLogParams feedAppLogParams, String str, long j2) throws Exception {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_first", String.valueOf(z));
            jSONObject.put("is_success", String.valueOf(i));
            if (z) {
                jSONObject.put("app_to_success", String.valueOf(j));
            }
            if (feedAppLogParams == null || feedAppLogParams.mLastFeedItemList == null) {
                jSONObject.put("cache_count", TEVideoRecorder.FACE_BEAUTY_NULL);
                jSONObject.put("is_cache", TEVideoRecorder.FACE_BEAUTY_NULL);
                jSONObject.put("cache_time", TEVideoRecorder.FACE_BEAUTY_NULL);
            } else {
                boolean z2 = feedAppLogParams.mLastFeedItemList.isFromLocalCache;
                jSONObject.put("is_cache", String.valueOf(z2));
                String str4 = "cache_count";
                if (z2) {
                    str2 = String.valueOf(feedAppLogParams.mLastFeedItemList.getItems().size());
                } else {
                    str2 = "-1";
                }
                jSONObject.put(str4, str2);
                String str5 = "cache_time";
                if (z2) {
                    str3 = String.valueOf(C23338f.m76562a().mo60621a("key_feed_cache_time", 0));
                } else {
                    str3 = "";
                }
                jSONObject.put(str5, str3);
                if (z2) {
                    jSONObject.put("cache_aid", C28434i.m93466b(feedAppLogParams.mLastFeedItemList));
                }
            }
            jSONObject.put("request_method", str);
            jSONObject.put("duration", String.valueOf(j2));
        } catch (JSONException unused) {
        }
        C6877n.m21447a("feed_cache_response", jSONObject);
        return null;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008a */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ Exception -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[Catch:{ Exception -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0479  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m94413a(int r15, com.p280ss.android.ugc.aweme.feed.model.FeedAppLogParams r16, java.lang.Exception r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, long r25) throws java.lang.Exception {
        /*
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r20
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r5 = -1
            r6 = 0
            r7 = 1
            if (r0 != r7) goto L_0x01e6
            java.lang.String r8 = "flag"
            r4.put(r8, r7)     // Catch:{ JSONException -> 0x0016 }
        L_0x0016:
            if (r1 == 0) goto L_0x03f4
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = r1.mItems
            boolean r8 = com.bytedance.common.utility.collection.C6307b.m19566a(r8)
            if (r8 != 0) goto L_0x03f4
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = r1.mItems     // Catch:{ Exception -> 0x03f4 }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x03f4 }
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r8     // Catch:{ Exception -> 0x03f4 }
            if (r8 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.feed.model.Video r8 = r8.getVideo()     // Catch:{ Exception -> 0x03f4 }
            if (r8 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r9 = r8.getPlayAddr()     // Catch:{ Exception -> 0x03f4 }
            if (r9 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r9 = r8.getPlayAddr()     // Catch:{ Exception -> 0x03f4 }
            java.util.List r9 = r9.getUrlList()     // Catch:{ Exception -> 0x03f4 }
            int r9 = r9.size()     // Catch:{ Exception -> 0x03f4 }
            com.ss.android.ugc.aweme.base.model.UrlModel r10 = r8.getCover()     // Catch:{ Exception -> 0x0066 }
            if (r10 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.base.model.UrlModel r10 = r8.getCover()     // Catch:{ Exception -> 0x0066 }
            java.util.List r10 = r10.getUrlList()     // Catch:{ Exception -> 0x0066 }
            boolean r10 = com.bytedance.common.utility.collection.C6307b.m19566a(r10)     // Catch:{ Exception -> 0x0066 }
            if (r10 != 0) goto L_0x0064
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r8.getCover()     // Catch:{ Exception -> 0x0066 }
            java.util.List r8 = r8.getUrlList()     // Catch:{ Exception -> 0x0066 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x0066 }
            r5 = r9
            goto L_0x006a
        L_0x0064:
            r5 = r9
            goto L_0x0069
        L_0x0066:
            r5 = r9
            goto L_0x03f4
        L_0x0069:
            r8 = -1
        L_0x006a:
            com.ss.android.ugc.aweme.feed.model.FeedItemList r9 = r1.mLastFeedItemList     // Catch:{ Exception -> 0x01e3 }
            java.lang.Long r9 = r9.getNetworkInfoKey()     // Catch:{ Exception -> 0x01e3 }
            long r9 = r9.longValue()     // Catch:{ Exception -> 0x01e3 }
            com.ss.android.ugc.aweme.feed.api.k r9 = com.p280ss.android.ugc.aweme.feed.api.C28224l.m92768a(r9)     // Catch:{ Exception -> 0x01e3 }
            if (r9 == 0) goto L_0x03f5
            java.lang.String r10 = r9.f74336a     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = ""
            java.net.URL r12 = new java.net.URL     // Catch:{ MalformedURLException -> 0x008a }
            java.lang.String r13 = r9.f74338c     // Catch:{ MalformedURLException -> 0x008a }
            r12.<init>(r13)     // Catch:{ MalformedURLException -> 0x008a }
            java.lang.String r12 = r12.getHost()     // Catch:{ MalformedURLException -> 0x008a }
            r11 = r12
        L_0x008a:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x01e3 }
            r12.<init>(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r10 = "flag"
            r13 = 2
            r4.put(r10, r13)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r10 = "status_code"
            r13 = 200(0xc8, float:2.8E-43)
            r4.put(r10, r13)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r10 = "retry_times"
            java.lang.Integer r9 = r9.f74337b     // Catch:{ Exception -> 0x01e3 }
            r4.put(r10, r9)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "host"
            r4.put(r9, r11)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "redirect_times"
            java.lang.String r10 = "base"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "redirect_times"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "redirect_times"
            int r9 = r4.optInt(r9)     // Catch:{ Exception -> 0x01e3 }
            if (r9 <= 0) goto L_0x00eb
            java.lang.String r9 = "base"
            org.json.JSONObject r9 = r12.optJSONObject(r9)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r10 = "redirecting_list"
            org.json.JSONArray r9 = r9.optJSONArray(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r10 = "redirect_times"
            int r10 = r4.optInt(r10)     // Catch:{ Exception -> 0x01e3 }
            int r10 = r10 - r7
            java.lang.String r9 = r9.optString(r10)     // Catch:{ Exception -> 0x01e3 }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x01e3 }
            if (r10 != 0) goto L_0x00eb
            java.lang.String r10 = "host"
            java.lang.String r11 = "https?://"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.replaceAll(r11, r13)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r10, r9)     // Catch:{ Exception -> 0x01e3 }
        L_0x00eb:
            java.lang.String r9 = "socket_reuse"
            java.lang.String r10 = "socket"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "socket_reused"
            boolean r10 = r10.getBoolean(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "handshake"
            java.lang.String r10 = "ssl"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "handshake_type"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "conn_status"
            java.lang.String r10 = "ssl"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "connection_status"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "conn_info"
            java.lang.String r10 = "response"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "connection_info"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "rip"
            java.lang.String r10 = "socket"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "remote"
            java.lang.String r10 = r10.optString(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "ttfb"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "ttfb"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "dns"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "dns"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "inner"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "inner"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "origin"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "origin"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "proxy"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "proxy"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "tcp"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "tcp"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r9 = "dur"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r12.optJSONObject(r10)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "request"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r11 = "duration"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x01e3 }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x01e3 }
            goto L_0x03f5
        L_0x01e3:
            goto L_0x03f5
        L_0x01e6:
            if (r2 == 0) goto L_0x03e7
            java.lang.Class r8 = r17.getClass()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = r8.getSimpleName()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r9 = r17.getMessage()     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r10 = ""
            java.lang.String r11 = "https://"
            int r11 = r9.indexOf(r11)     // Catch:{ Exception -> 0x03f4 }
            r12 = 30
            if (r11 <= 0) goto L_0x0213
            java.lang.String r13 = "/"
            int r14 = r11 + 8
            int r13 = r9.indexOf(r13, r14)     // Catch:{ Exception -> 0x03f4 }
            if (r13 <= 0) goto L_0x022d
            int r11 = r13 - r11
            if (r11 >= r12) goto L_0x022d
            java.lang.String r10 = r9.substring(r14, r13)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x022d
        L_0x0213:
            java.lang.String r11 = "http://"
            int r11 = r9.indexOf(r11)     // Catch:{ Exception -> 0x03f4 }
            if (r11 <= 0) goto L_0x022d
            java.lang.String r13 = "/"
            int r14 = r11 + 7
            int r13 = r9.indexOf(r13, r14)     // Catch:{ Exception -> 0x03f4 }
            if (r13 <= 0) goto L_0x022d
            int r11 = r13 - r11
            if (r11 >= r12) goto L_0x022d
            java.lang.String r10 = r9.substring(r14, r13)     // Catch:{ Exception -> 0x03f4 }
        L_0x022d:
            java.lang.String r11 = "host"
            r4.put(r11, r10)     // Catch:{ Exception -> 0x03f4 }
            boolean r10 = r2 instanceof com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException     // Catch:{ Exception -> 0x03f4 }
            if (r10 == 0) goto L_0x03be
            r8 = r2
            com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException r8 = (com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException) r8     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = r8.getRequestLog()     // Catch:{ Exception -> 0x03f4 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x03f4 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "flag"
            r10 = 3
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "base"
            org.json.JSONObject r8 = r9.optJSONObject(r8)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r10 = "net_error"
            int r8 = r8.optInt(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r10 = "status_code"
            if (r8 >= 0) goto L_0x0259
            goto L_0x0265
        L_0x0259:
            java.lang.String r8 = "response"
            org.json.JSONObject r8 = r9.optJSONObject(r8)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "code"
            int r8 = r8.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
        L_0x0265:
            r4.put(r10, r8)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "load_state"
            java.lang.String r10 = "base"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "load_state"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "redirect_times"
            java.lang.String r10 = "base"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "redirect_times"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "redirect_times"
            int r8 = r4.optInt(r8, r6)     // Catch:{ Exception -> 0x03f4 }
            if (r8 <= 0) goto L_0x02b6
            java.lang.String r10 = "base"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "redirecting_list"
            org.json.JSONArray r10 = r10.optJSONArray(r11)     // Catch:{ Exception -> 0x03f4 }
            int r8 = r8 - r7
            java.lang.String r8 = r10.optString(r8)     // Catch:{ Exception -> 0x03f4 }
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x03f4 }
            if (r10 != 0) goto L_0x02b6
            java.lang.String r10 = "host"
            java.lang.String r11 = "https?://"
            java.lang.String r12 = ""
            java.lang.String r8 = r8.replaceAll(r11, r12)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r10, r8)     // Catch:{ Exception -> 0x03f4 }
        L_0x02b6:
            java.lang.String r8 = "conn_info"
            java.lang.String r10 = "response"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "connection_info"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "rip"
            java.lang.String r10 = "socket"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "remote"
            java.lang.String r10 = r10.optString(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "socket_reuse"
            java.lang.String r10 = "socket"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "socket_reused"
            boolean r10 = r10.getBoolean(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "handshake"
            java.lang.String r10 = "ssl"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "handshake_type"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "conn_status"
            java.lang.String r10 = "ssl"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "connection_status"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "conn_info"
            java.lang.String r10 = "response"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "connection_info"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "ttfb"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "ttfb"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "dns"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "dns"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "inner"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "inner"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "origin"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "origin"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "proxy"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "proxy"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "tcp"
            java.lang.String r10 = "timing"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "detailed_duration"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r11 = "tcp"
            int r10 = r10.optInt(r11)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r8 = "dur"
            java.lang.String r10 = "timing"
            org.json.JSONObject r9 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r10 = "request"
            org.json.JSONObject r9 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r10 = "duration"
            int r9 = r9.optInt(r10)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r9)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x03f4
        L_0x03be:
            java.lang.String r10 = "flag"
            r11 = 4
            r4.put(r10, r11)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r10 = "exception_type"
            r4.put(r10, r8)     // Catch:{ Exception -> 0x03f4 }
            boolean r8 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x03f4 }
            if (r8 != 0) goto L_0x03e1
            int r8 = r9.length()     // Catch:{ Exception -> 0x03f4 }
            r10 = 100
            if (r8 <= r10) goto L_0x03e1
            java.lang.String r8 = "err_msg"
            java.lang.String r9 = r9.substring(r6, r10)     // Catch:{ Exception -> 0x03f4 }
            r4.put(r8, r9)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x03f4
        L_0x03e1:
            java.lang.String r8 = "err_msg"
            r4.put(r8, r9)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x03f4
        L_0x03e7:
            java.lang.String r8 = "flag"
            r9 = 5
            r4.put(r8, r9)     // Catch:{  }
            java.lang.String r8 = "err_msg"
            java.lang.String r9 = "exception is null"
            r4.put(r8, r9)     // Catch:{  }
        L_0x03f4:
            r8 = -1
        L_0x03f5:
            r9 = 0
            if (r1 == 0) goto L_0x0407
            com.ss.android.ugc.aweme.feed.model.FeedItemList r10 = r1.mLastFeedItemList
            if (r10 == 0) goto L_0x0407
            com.ss.android.ugc.aweme.feed.model.FeedItemList r6 = r1.mLastFeedItemList
            int r6 = r6.blockCode
            com.ss.android.ugc.aweme.feed.model.FeedItemList r1 = r1.mLastFeedItemList
            java.lang.String r1 = r1.getRequestId()
            goto L_0x0408
        L_0x0407:
            r1 = r9
        L_0x0408:
            android.content.Context r10 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            if (r0 == r7) goto L_0x0415
            int r10 = com.p280ss.android.ugc.aweme.net.corenet.C34064i.m109693a(r10, r2)
            java.lang.String.valueOf(r10)
        L_0x0415:
            if (r0 == r7) goto L_0x041c
            java.lang.String r10 = m94415a(r17)
            goto L_0x041d
        L_0x041c:
            r10 = r9
        L_0x041d:
            com.ss.android.ugc.aweme.common.j r11 = new com.ss.android.ugc.aweme.common.j
            r11.<init>()
            java.lang.String r12 = "is_success"
            java.lang.String r13 = java.lang.String.valueOf(r15)
            com.ss.android.ugc.aweme.common.j r11 = r11.mo16966a(r12, r13)
            java.lang.String r12 = "duration"
            java.lang.String r13 = java.lang.String.valueOf(r18)
            com.ss.android.ugc.aweme.common.j r11 = r11.mo16966a(r12, r13)
            java.lang.String r12 = "is_first"
            com.ss.android.ugc.aweme.common.j r11 = r11.mo16966a(r12, r3)
            java.lang.String r12 = "request_method"
            r13 = r21
            com.ss.android.ugc.aweme.common.j r11 = r11.mo16966a(r12, r13)
            java.lang.String r12 = "feed_tab"
            r13 = r22
            com.ss.android.ugc.aweme.common.j r11 = r11.mo16966a(r12, r13)
            java.lang.String r12 = "top_activity"
            r13 = r23
            com.ss.android.ugc.aweme.common.j r11 = r11.mo16966a(r12, r13)
            java.lang.String r12 = "video_num"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.ss.android.ugc.aweme.common.j r5 = r11.mo16966a(r12, r5)
            java.lang.String r11 = "image_num"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            com.ss.android.ugc.aweme.common.j r5 = r5.mo16966a(r11, r8)
            java.lang.String r8 = "blockCode"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.ss.android.ugc.aweme.common.j r5 = r5.mo16966a(r8, r6)
            java.lang.String r6 = "err_code"
            if (r0 != r7) goto L_0x0479
            java.lang.String r2 = "-1"
            goto L_0x0485
        L_0x0479:
            android.content.Context r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            int r2 = com.p280ss.android.ugc.aweme.net.corenet.C34064i.m109693a(r8, r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x0485:
            com.ss.android.ugc.aweme.common.j r2 = r5.mo16966a(r6, r2)
            java.lang.String r5 = "err_msg"
            com.ss.android.ugc.aweme.common.j r2 = r2.mo16966a(r5, r10)
            java.lang.String r5 = "is_from_feed_cache"
            java.lang.String r6 = java.lang.String.valueOf(r24)
            com.ss.android.ugc.aweme.common.j r2 = r2.mo16966a(r5, r6)
            java.lang.String r5 = "request_id"
            com.ss.android.ugc.aweme.common.j r1 = r2.mo16966a(r5, r1)
            org.json.JSONObject r1 = r1.mo16967a()
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x04c4
            if (r0 != r7) goto L_0x04bd
            java.lang.String r0 = "succes_num"
            java.util.concurrent.atomic.AtomicInteger r2 = com.p280ss.android.ugc.aweme.feed.helper.C28413b.f74873d
            int r2 = r2.get()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.put(r0, r2)
            goto L_0x04c4
        L_0x04bd:
            java.lang.String r0 = "succes_num"
            java.lang.String r2 = "0"
            r1.put(r0, r2)
        L_0x04c4:
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "feed_request_response"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r2)
            java.lang.String r2 = "perf_monitor"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r2)
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            java.lang.String r2 = "net_info"
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x04dd }
        L_0x04dd:
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r0)
            java.lang.String r0 = "feed_request_response"
            com.p280ss.android.ugc.aweme.common.C6907h.m21528b(r0, r1)
            java.lang.String r0 = "feed_request_response"
            r2 = r25
            com.p280ss.android.ugc.aweme.metrics.p1393a.C33221a.m107191a(r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.C28696u.m94413a(int, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams, java.lang.Exception, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, long):java.lang.Object");
    }
}
