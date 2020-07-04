package com.p280ss.android.ugc.aweme.net;

import bolts.C1592h;
import com.bytedance.ttnet.C12961d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.n */
public final class C34093n {

    /* renamed from: a */
    public static final C34093n f88850a = new C34093n();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f88851b = {"https://www.google.com/images/nav_logo.webp", "https://www.facebook.com/images/fb_icon_325x325.png"};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String[] f88852c = {"https://www.baidu.com", "https://www.taobao.com/favicon.ico"};

    /* renamed from: d */
    private static volatile boolean f88853d;

    /* renamed from: e */
    private static boolean f88854e;

    /* renamed from: f */
    private static long f88855f;

    /* renamed from: com.ss.android.ugc.aweme.net.n$a */
    static final class C34094a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ int f88856a;

        C34094a(int i) {
            this.f88856a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("detect_source", this.f88856a);
            jSONObject.put("detect_status", 1);
            jSONObject.put("detect_cost", 0);
            jSONObject.put("detect_start", 0);
            C6907h.m21528b("network_detect_result", jSONObject);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.n$b */
    static final class C34095b<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C34095b f88857a = new C34095b();

        C34095b() {
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m109762a());
        }

        /* renamed from: a */
        private static boolean m109762a() {
            String[] strArr;
            if (C30538p.m99745a()) {
                strArr = C34093n.f88851b;
            } else {
                strArr = C34093n.f88852c;
            }
            return C12961d.m37782a(strArr, 10, 1);
        }
    }

    private C34093n() {
    }

    /* renamed from: a */
    public static long m109755a() {
        return f88855f;
    }

    /* renamed from: b */
    public static void m109759b() {
        if (!f88854e && !f88853d) {
            f88854e = true;
            f88855f = System.currentTimeMillis();
            C1592h.m7853a((Callable<TResult>) C34095b.f88857a);
        }
    }

    /* renamed from: a */
    public static void m109757a(boolean z) {
        f88854e = false;
    }

    /* renamed from: a */
    public static void m109756a(int i) {
        if (!f88853d) {
            f88853d = true;
            C1592h.m7853a((Callable<TResult>) new C34094a<TResult>(1));
        }
    }
}
