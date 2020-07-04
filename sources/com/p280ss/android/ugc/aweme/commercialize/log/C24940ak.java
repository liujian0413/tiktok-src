package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.commercialize.model.OpenAppBackLogParams;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ak */
public final class C24940ak implements C7162m {

    /* renamed from: a */
    public static final String f65775a = f65775a;

    /* renamed from: b */
    public static long f65776b;

    /* renamed from: c */
    public static String f65777c;

    /* renamed from: d */
    public static final C24941a f65778d = new C24941a(null);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.ak$a */
    public static final class C24941a {
        private C24941a() {
        }

        /* renamed from: a */
        public static String m81831a() {
            if (TextUtils.isEmpty(C24940ak.f65777c)) {
                SharePrefCache inst = SharePrefCache.inst();
                C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
                C22903bl openAppBackLogParams = inst.getOpenAppBackLogParams();
                C7573i.m23582a((Object) openAppBackLogParams, "SharePrefCache.inst().openAppBackLogParams");
                C24940ak.f65777c = (String) openAppBackLogParams.mo59877d();
            }
            return C24940ak.f65777c;
        }

        public /* synthetic */ C24941a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m81833a(String str) {
            C24940ak.f65777c = str;
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            inst.getOpenAppBackLogParams().mo59875b(str, true);
        }

        /* renamed from: a */
        public static void m81832a(OpenAppBackLogParams openAppBackLogParams) {
            if (openAppBackLogParams != null && !TextUtils.isEmpty(openAppBackLogParams.getTag()) && openAppBackLogParams.getAwemeRawAd() != null) {
                Context a = C6399b.m19921a();
                JSONObject h = C24976t.m82228h(a, openAppBackLogParams.getAwemeRawAd(), C24940ak.f65775a);
                long startTime = C24940ak.f65776b - openAppBackLogParams.getStartTime();
                if (startTime <= TimeUnit.HOURS.toMillis(24)) {
                    try {
                        h.put("duration", startTime);
                    } catch (JSONException unused) {
                    }
                    C24976t.m82071a(a, openAppBackLogParams.getTag(), C24940ak.f65775a, h, openAppBackLogParams.getAwemeRawAd());
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m81826a(OpenAppBackLogParams openAppBackLogParams) {
        C24941a.m81832a(openAppBackLogParams);
    }

    /* renamed from: a */
    public static final void m81827a(String str) {
        C24941a.m81833a(str);
    }

    /* renamed from: b */
    public final void mo18612b() {
    }

    /* renamed from: c */
    public final void mo18613c() {
    }

    /* renamed from: a */
    public final void mo18611a() {
        f65776b = System.currentTimeMillis();
        if (!TextUtils.isEmpty(C24941a.m81831a())) {
            C24941a.m81832a((OpenAppBackLogParams) new C6600e().mo15974a(C24941a.m81831a(), OpenAppBackLogParams.class));
            C24941a.m81833a("");
        }
    }
}
