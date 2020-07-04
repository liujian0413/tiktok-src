package com.bytedance.apm.p244g;

import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.net.HttpResponseException;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p252m.C6273b.C6276b;
import com.bytedance.apm.util.C6296u;
import com.bytedance.frameworks.core.thread.C6370a;
import com.bytedance.frameworks.core.thread.C6371c;
import com.bytedance.framwork.core.monitor.MonitorNetUtil;
import com.bytedance.framwork.core.monitor.MonitorNetUtil.CompressType;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.g.b */
public final class C6207b implements C6276b {

    /* renamed from: a */
    public static String f18274a = "https://log.snssdk.com/monitor/collect/c/exception";

    /* renamed from: d */
    public static final Object f18275d = new Object();

    /* renamed from: i */
    private static volatile C6207b f18276i;

    /* renamed from: j */
    private static volatile C6209a f18277j;

    /* renamed from: b */
    public volatile int f18278b;

    /* renamed from: c */
    public volatile JSONObject f18279c;

    /* renamed from: e */
    public final LinkedList<C6211d> f18280e = new LinkedList<>();

    /* renamed from: f */
    private volatile long f18281f;

    /* renamed from: g */
    private volatile boolean f18282g;

    /* renamed from: h */
    private volatile long f18283h;

    /* renamed from: k */
    private volatile C6205a f18284k;

    /* renamed from: com.bytedance.apm.g.b$a */
    public interface C6209a {
    }

    private C6207b() {
        C6273b.m19475a().mo15065a((C6276b) this);
        this.f18284k = new C6205a();
    }

    /* renamed from: a */
    public static C6207b m19278a() {
        if (f18276i == null) {
            synchronized (f18275d) {
                if (f18276i == null) {
                    f18276i = new C6207b();
                }
            }
        }
        return f18276i;
    }

    /* renamed from: b */
    public static boolean m19280b() {
        if (!ApmDelegate.getInstance().isConfigReady() || ApmDelegate.getInstance().getLogTypeSwitch("exception_filter_network")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m19282c() {
        this.f18281f = System.currentTimeMillis();
        C6370a.m19801a();
        C6370a.m19802a(new C6371c() {
            public final void run() {
                try {
                    LinkedList linkedList = new LinkedList();
                    synchronized (C6207b.f18275d) {
                        linkedList.addAll(C6207b.this.f18280e);
                        C6207b.this.f18280e.clear();
                        C6207b.this.f18278b = 0;
                    }
                    if (!linkedList.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        while (!linkedList.isEmpty()) {
                            C6211d dVar = (C6211d) linkedList.poll();
                            if (dVar != null) {
                                jSONArray.put(new JSONObject(dVar.f18287b));
                            }
                        }
                        jSONObject.put("data", jSONArray);
                        if (C6207b.this.f18279c == null) {
                            C6207b.this.f18279c = C6174c.m19152j();
                        }
                        jSONObject.put("header", C6207b.this.f18279c);
                        C6207b.this.mo14942a(C6207b.f18274a, jSONObject.toString());
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public static void m19279a(String str) {
        f18274a = str;
    }

    /* renamed from: b */
    private static boolean m19281b(String str) {
        return ApmDelegate.getInstance().getLogTypeSwitch(str);
    }

    /* renamed from: a */
    public final void mo7731a(long j) {
        try {
            if (this.f18284k != null) {
                this.f18284k.mo14939a();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - this.f18281f > 1200000 && this.f18278b > 0) || this.f18278b > 20) {
                m19282c();
            }
            if (this.f18282g && currentTimeMillis - this.f18283h > 1800000) {
                this.f18282g = false;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo14942a(String str, String str2) {
        try {
            if (ApmDelegate.getInstance().isConfigReady()) {
                MonitorNetUtil.m19814a(1048576, C6296u.m19536a(str, C6174c.m19151i()), str2.getBytes(), CompressType.GZIP, "application/json; charset=utf-8", true);
            }
        } catch (Throwable th) {
            int i = -1;
            if (th instanceof HttpResponseException) {
                i = ((HttpResponseException) th).getStatusCode();
            }
            if (i >= 500 && i <= 600) {
                this.f18283h = System.currentTimeMillis();
                this.f18282g = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo14943a(String str, String str2, String str3, boolean z) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    boolean z2 = false;
                    if (z) {
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.put("log_type", "log_exception");
                        if (str3 != null) {
                            if (str3.length() > 10240) {
                                jSONObject.put("extraMessage", str3.substring(0, VideoPreloadSizeExperiment.DEFAULT));
                            } else {
                                jSONObject.put("extraMessage", str3);
                            }
                        }
                        C6209a aVar = f18277j;
                    }
                    if (!ApmDelegate.getInstance().isConfigReady()) {
                        if (this.f18284k != null) {
                            this.f18284k.mo14940a(str, str2);
                        }
                        return;
                    }
                    boolean b = m19281b(str);
                    boolean serviceNameSwitch = ApmDelegate.getInstance().getServiceNameSwitch(str3);
                    if ((b || serviceNameSwitch) && !this.f18282g) {
                        synchronized (f18275d) {
                            int size = this.f18280e.size();
                            if (size >= 20) {
                                z2 = true;
                            }
                            this.f18280e.add(new C6211d(str, str2));
                            this.f18278b = size + 1;
                        }
                        if (z2) {
                            m19282c();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
