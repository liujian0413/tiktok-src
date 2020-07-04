package com.p280ss.android.ugc.aweme.feed;

import android.os.SystemClock;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.AppLog.ILogSessionHook;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.p */
public final class C28582p {

    /* renamed from: a */
    private static long f75257a;

    /* renamed from: b */
    private static boolean f75258b;

    /* renamed from: com.ss.android.ugc.aweme.feed.p$a */
    static class C28584a implements ILogSessionHook {
        private C28584a() {
        }

        public final void onLogSessionBatchEvent(long j, String str, JSONObject jSONObject) {
        }

        public final void onLogSessionTerminate(long j, String str, JSONObject jSONObject) {
        }

        public final void onLogSessionStart(long j) {
            C28582p.m93845c();
        }
    }

    /* renamed from: b */
    public static void m93844b() {
        f75257a = 0;
    }

    /* renamed from: a */
    public static void m93842a() {
        m93846d();
        f75257a = SystemClock.uptimeMillis();
    }

    /* renamed from: d */
    private static void m93846d() {
        if (!f75258b) {
            f75258b = true;
            TeaAgent.addSessionHook(new C28584a());
        }
    }

    /* renamed from: c */
    public static void m93845c() {
        String currentSessionId = AppLog.getCurrentSessionId();
        if (!C6405d.m19987h() && f75257a != 0 && SystemClock.uptimeMillis() - f75257a >= 20000) {
            m93843a(currentSessionId);
        }
    }

    /* renamed from: a */
    private static void m93843a(String str) {
        JSONObject a = new C6909j().mo16966a("0vv_session_id", str).mo16967a();
        C6907h.onEvent(MobClick.obtain().setEventName("0vv_hot_launch").setLabelName("perf_monitor").setJsonObject(a));
        C6907h.m21528b("0vv_hot_launch", a);
    }
}
