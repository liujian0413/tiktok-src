package com.bytedance.polaris.p633a;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.polaris.C12332a;
import com.bytedance.polaris.depend.C12423d;
import com.bytedance.polaris.depend.C12424e;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p634b.C12368s;
import com.bytedance.polaris.p634b.C12370u;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.a.a */
public class C12335a implements C6310a {

    /* renamed from: c */
    private static volatile C12335a f32738c;

    /* renamed from: a */
    public final C6309f f32739a = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: b */
    public C12424e f32740b = C12428i.m36159i();

    /* renamed from: d */
    private Context f32741d = C12428i.m36153c();

    /* renamed from: e */
    private Map<String, Long> f32742e = new HashMap();

    /* renamed from: com.bytedance.polaris.a.a$a */
    class C12337a implements Runnable {

        /* renamed from: a */
        public final C12423d<JSONObject> f32747a;

        /* renamed from: c */
        private String f32749c;

        /* renamed from: d */
        private JSONObject f32750d;

        public final void run() {
            int i;
            JSONObject jSONObject;
            try {
                StringBuilder sb = new StringBuilder(C12428i.m36152b("/luckycat/tiktokm/v1/task/done"));
                sb.append("/");
                sb.append(this.f32749c);
                C12370u.m35932a(sb, true);
                if (this.f32750d != null) {
                    jSONObject = this.f32750d;
                } else {
                    jSONObject = new JSONObject();
                }
                String a = C12335a.this.f32740b.mo30315a(20480, sb.toString(), jSONObject.toString().getBytes("utf-8"), "application/json; charset=utf-8");
                C12335a.this.mo30178a(this.f32749c, a);
                if (C6319n.m19593a(a)) {
                    C12335a.this.mo30176a(10002, (String) null, this.f32747a);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(a);
                if (!C12368s.m35919a(jSONObject2)) {
                    C12335a.this.mo30176a(C12368s.m35920b(jSONObject2), jSONObject2.optString("err_tips"), this.f32747a);
                    return;
                }
                final JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                if (!(optJSONObject == null || C12335a.this.f32739a == null)) {
                    C12335a.this.f32739a.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            } catch (Throwable th) {
                if (th instanceof IOException) {
                    i = 10009;
                } else {
                    i = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
                }
                C12335a.this.mo30176a(i, (String) null, this.f32747a);
            }
        }

        C12337a(String str, C12423d<JSONObject> dVar, JSONObject jSONObject) {
            this.f32749c = str;
            this.f32747a = dVar;
            this.f32750d = jSONObject;
        }
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: c */
    private static boolean m35826c() {
        return C12332a.m35814a().mo30172e();
    }

    /* renamed from: a */
    public final void mo30175a() {
        if (this.f32742e != null) {
            this.f32742e.clear();
        }
    }

    /* renamed from: b */
    public static C12335a m35825b() {
        if (f32738c == null) {
            synchronized (C12335a.class) {
                if (f32738c == null) {
                    f32738c = new C12335a();
                }
            }
        }
        return f32738c;
    }

    private C12335a() {
    }

    /* renamed from: d */
    private static long m35827d() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        return instance.getTimeInMillis();
    }

    /* renamed from: a */
    private long m35824a(String str) {
        if (!TextUtils.isEmpty(str) && this.f32742e != null && this.f32742e.size() != 0 && this.f32742e.containsKey(str)) {
            return ((Long) this.f32742e.get(str)).longValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo30178a(String str, String str2) {
        try {
            if (m35826c() && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("data")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        long j = 0;
                        long optLong = optJSONObject.optLong("next_req_interval", 0);
                        long d = C12332a.m35814a().mo30171d();
                        if (optLong > d) {
                            optLong = d;
                        }
                        if (optLong >= 0) {
                            j = optLong;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        long d2 = m35827d();
                        long j2 = currentTimeMillis + (j * 1000);
                        if (j2 < d2) {
                            this.f32742e.put(str, Long.valueOf(j2));
                        } else {
                            this.f32742e.put(str, Long.valueOf(d2));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo30176a(final int i, final String str, final C12423d<JSONObject> dVar) {
        if (dVar != null) {
            this.f32739a.post(new Runnable() {
                public final void run() {
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo30177a(String str, C12423d<JSONObject> dVar, JSONObject jSONObject) {
        C12428i.m36159i();
        if (!this.f32740b.mo30323b()) {
            mo30176a(10003, (String) null, dVar);
        }
        if (!C12339b.m35832a(this.f32741d)) {
            mo30176a(10008, (String) null, dVar);
        }
        if (!m35826c() || System.currentTimeMillis() >= m35824a(str)) {
            C6304f.submitRunnable(new C12337a(str, dVar, jSONObject));
        } else {
            mo30176a(10010, (String) null, dVar);
        }
    }
}
