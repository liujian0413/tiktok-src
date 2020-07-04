package com.p280ss.android.ugc.aweme.metrics.p1393a;

import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.a.e */
public final class C33225e {

    /* renamed from: a */
    public static boolean f86484a = true;

    /* renamed from: b */
    public static boolean f86485b = true;

    /* renamed from: com.ss.android.ugc.aweme.metrics.a.e$a */
    public static class C33226a implements Callable {

        /* renamed from: a */
        private String f86486a;

        /* renamed from: b */
        private JSONObject f86487b;

        public final Object call() throws Exception {
            C6907h.m21525a(this.f86486a, this.f86487b);
            C33221a.m107190a(this.f86486a, this.f86487b);
            return null;
        }

        public C33226a(String str, JSONObject jSONObject) {
            this.f86486a = str;
            this.f86487b = jSONObject;
        }
    }
}
