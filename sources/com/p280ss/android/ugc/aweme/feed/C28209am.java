package com.p280ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.main.C33054j;
import com.p280ss.android.ugc.aweme.metrics.p1393a.C33221a;
import com.p280ss.android.ugc.aweme.p932aa.C21097b;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.am */
public class C28209am {

    /* renamed from: a */
    private static volatile boolean f74310a;

    /* renamed from: b */
    private static volatile boolean f74311b;

    /* renamed from: b */
    private static void m92727b() {
        if (f74310a) {
            m92725a("1");
        }
    }

    /* renamed from: a */
    private static void m92722a() {
        if (!f74311b) {
            synchronized (C28209am.class) {
                if (!f74311b) {
                    f74311b = true;
                    C6405d.m19976c().mo19325f(C28211ao.f74315a);
                    C28580o.m93831a(C28212ap.f74316a);
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m92723a(Activity activity) throws Exception {
        if (activity instanceof C33054j) {
            m92727b();
        }
    }

    /* renamed from: a */
    public static void m92726a(boolean z) {
        if (z) {
            m92722a();
        }
        if (f74310a != z) {
            f74310a = z;
        }
    }

    /* renamed from: a */
    public static void m92725a(String str) {
        if (f74310a && !TextUtils.isEmpty(str)) {
            C1592h.m7855a((Callable<TResult>) new C28210an<TResult>(C28580o.m93835e(), C28580o.m93834d(), str), (Executor) C6907h.m21516a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m92728b(PAGE page) {
        if (f74310a && PAGE.FEED != page) {
            m92725a("2");
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m92721a(String str, String str2, String str3) throws Exception {
        JSONObject a = new C6909j().mo16966a("top_activity", str).mo16966a("feed_tab", str2).mo16966a("err_code", str3).mo16967a();
        try {
            a.put("preloader_type", C43220a.m137073b());
        } catch (Exception e) {
            C2077a.m9160a((Throwable) e);
        }
        C6907h.onEvent(MobClick.obtain().setEventName("video_prepare_error").setLabelName("perf_monitor").setJsonObject(a));
        C6907h.m21525a("video_prepare_error", a);
        C33221a.m107190a("video_prepare_error", a);
        C21097b.m71144a("video_prepare_error", a);
        return null;
    }
}
