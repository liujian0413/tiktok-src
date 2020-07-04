package com.p280ss.android.pushmanager.monitor;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.p530h.p531a.C10279a;
import com.p280ss.android.message.C19809a;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.pushmanager.monitor.exception.PushException;
import com.p280ss.android.pushmanager.monitor.exception.PushInitTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.monitor.b */
public final class C20081b {

    /* renamed from: a */
    private static C6310a f54302a = new C6310a() {
        public final void handleMsg(Message message) {
            C20081b.m66131a(message);
        }
    };

    /* renamed from: b */
    private static Handler f54303b;

    /* renamed from: c */
    private static volatile AtomicBoolean f54304c = new AtomicBoolean(false);

    /* renamed from: d */
    private static long f54305d;

    /* renamed from: e */
    private static volatile AtomicBoolean f54306e = new AtomicBoolean(false);

    /* renamed from: c */
    private static Handler m66134c() {
        if (f54303b == null) {
            f54303b = new C6309f(C20083c.m66140b(), f54302a);
        }
        return f54303b;
    }

    /* renamed from: a */
    public static void m66129a() {
        if (C20083c.m66139a()) {
            f54306e.set(true);
            if (C19826j.m65474c(C19809a.m65408a())) {
                f54305d = System.currentTimeMillis();
                m66134c().sendEmptyMessageDelayed(1, TimeUnit.SECONDS.toMillis(20));
                m66134c().sendEmptyMessageDelayed(2, TimeUnit.SECONDS.toMillis(30));
            }
        }
    }

    /* renamed from: b */
    public static void m66132b() {
        if (C20083c.m66139a()) {
            if (f54306e.get() || !C10279a.m30443a()) {
                if (f54304c.compareAndSet(false, true)) {
                    if (m66134c().hasMessages(1)) {
                        m66134c().removeMessages(1);
                    }
                    if (m66134c().hasMessages(2)) {
                        m66134c().removeMessages(2);
                    }
                    m66130a(0, System.currentTimeMillis() - f54305d);
                }
                return;
            }
            throw new PushException("调用时序错误，请先调用 MessageAppManager.inst().initOnApplication();然后再调用MessageAppManager.inst().handleAppLogUpdate()");
        }
    }

    /* renamed from: a */
    public static void m66131a(Message message) {
        if (message != null) {
            switch (message.what) {
                case 1:
                    m66130a(1, System.currentTimeMillis() - f54305d);
                    return;
                case 2:
                    m66130a(2, System.currentTimeMillis() - f54305d);
                    break;
            }
        }
    }

    /* renamed from: a */
    private static void m66130a(int i, long j) {
        m66133b(i, j);
        if (C10279a.m30443a() && i == 2) {
            throw new PushInitTimeoutException("Push 初始化超时");
        }
    }

    /* renamed from: b */
    private static void m66133b(int i, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("delta", j);
        } catch (JSONException unused2) {
        }
        C20083c.m66136a("push_monitor_applog_timeout", jSONObject, jSONObject2, null);
    }
}
