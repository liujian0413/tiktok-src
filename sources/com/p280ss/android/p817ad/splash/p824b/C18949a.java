package com.p280ss.android.p817ad.splash.p824b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetCommonParams;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.p280ss.android.p817ad.splash.C18948b;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.core.C19045k;
import com.p280ss.android.p817ad.splash.core.p830e.C19023a;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.b.a */
public class C18949a {

    /* renamed from: a */
    public static volatile boolean f51096a = true;

    /* renamed from: d */
    private static volatile C18949a f51097d;

    /* renamed from: b */
    public volatile boolean f51098b;

    /* renamed from: c */
    public volatile int f51099c;

    /* renamed from: e */
    private volatile boolean f51100e;

    private C18949a() {
    }

    /* renamed from: c */
    private boolean m61869c() {
        if (!this.f51100e || !f51096a) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m61871e() {
        if (this.f51099c <= 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C18949a m61865a() {
        if (f51097d == null) {
            synchronized (C18949a.class) {
                if (f51097d == null) {
                    f51097d = new C18949a();
                }
            }
        }
        return f51097d;
    }

    /* renamed from: b */
    public static JSONObject m61868b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C19025f.m62159f() == null) {
                return jSONObject;
            }
            String b = C19025f.m62159f().mo50357b();
            jSONObject.put("device_id", C19025f.m62106T());
            jSONObject.put("app_version", C19025f.m62103Q());
            jSONObject.put("channel", b);
            jSONObject.put("update_version_code", C19025f.m62102P());
            jSONObject.put("package_name", C19025f.m62096J().getPackageName());
            return jSONObject;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private static boolean m61870d() {
        boolean z;
        C18948b f = C19025f.m62159f();
        if (f == null) {
            return false;
        }
        String b = f.mo50357b();
        String T = C19025f.m62106T();
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(T)) {
            z = false;
        } else {
            z = true;
        }
        if (C19025f.m62096J().getApplicationContext() == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("is_ad_event", "1");
            } catch (JSONException unused) {
            }
            C19025f.m62115a(84378473382L, "splash_ad", "context_npe", jSONObject);
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private synchronized void m61866a(final C19045k kVar) {
        if (m61869c()) {
            if (C19025f.m62159f() != null) {
                if (C19025f.m62089C() != null) {
                    if (!m61870d()) {
                        this.f51098b = false;
                        m61867a(kVar, false);
                        return;
                    } else if (this.f51098b) {
                        m61867a(kVar, true);
                        return;
                    } else if (!m61871e()) {
                        m61867a(kVar, false);
                        return;
                    } else {
                        C19023a.m62084a().mo50518a(new Runnable() {
                            public final void run() {
                                try {
                                    if (!C18949a.this.f51098b) {
                                        String O = C19025f.m62101O();
                                        if (C19129h.m62707a()) {
                                            ArrayList arrayList = new ArrayList(2);
                                            arrayList.add("https://mon.isnssdk.com/monitor/appmonitor/v2/settings");
                                            arrayList.add("https://i.isnssdk.com/monitor/appmonitor/v2/settings");
                                            ArrayList arrayList2 = new ArrayList(2);
                                            arrayList2.add("https://mon.isnssdk.com/monitor/collect/");
                                            arrayList2.add("https://i.isnssdk.com/monitor/collect/");
                                            SDKMonitorUtils.setConfigUrl(O, arrayList);
                                            SDKMonitorUtils.setDeafultReportUrl(O, arrayList2);
                                        }
                                        SDKMonitorUtils.init(C19025f.m62096J().getApplicationContext(), O, C18949a.m61868b(), new IGetCommonParams() {
                                            public final String getSessionId() {
                                                return null;
                                            }
                                        });
                                    }
                                    C18949a.this.f51098b = true;
                                    C18949a.this.f51099c = 0;
                                    C18949a.m61867a(kVar, true);
                                } catch (Throwable th) {
                                    if ((th instanceof ClassNotFoundException) || (th instanceof NoClassDefFoundError)) {
                                        C18949a.f51096a = false;
                                    }
                                    C18949a.this.f51098b = false;
                                    C18949a.m61867a(kVar, false);
                                    C18949a.this.f51099c++;
                                    th.getMessage();
                                }
                            }
                        });
                        return;
                    }
                }
            }
            m61867a(kVar, false);
        }
    }

    /* renamed from: a */
    public static void m61867a(C19045k kVar, boolean z) {
        if (kVar != null) {
            if (z) {
                kVar.mo50368a(1, "");
            } else {
                kVar.mo50369b(0, "");
            }
        }
    }

    /* renamed from: a */
    public final void mo50361a(Exception exc, String str) {
        if (m61869c()) {
            try {
                String message = exc.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, message);
                    mo50364a("service_ad_exception", (JSONObject) null, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo50362a(final String str, int i, final JSONObject jSONObject) {
        if (m61869c()) {
            if (!this.f51098b) {
                m61866a(new C19045k() {
                    /* renamed from: b */
                    public final void mo50369b(int i, Object obj) {
                    }

                    /* renamed from: a */
                    public final void mo50368a(int i, Object obj) {
                        SDKMonitorUtils.getInstance(C19025f.m62101O()).monitorStatusRate(str, 1, jSONObject);
                    }
                });
            } else {
                SDKMonitorUtils.getInstance(C19025f.m62101O()).monitorStatusRate(str, i, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo50364a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (m61869c()) {
            if (!this.f51098b) {
                m61866a(new C19045k() {
                    /* renamed from: b */
                    public final void mo50369b(int i, Object obj) {
                    }

                    /* renamed from: a */
                    public final void mo50368a(int i, Object obj) {
                        SDKMonitorUtils.getInstance(C19025f.m62101O()).monitorDuration(str, jSONObject, jSONObject2);
                    }
                });
            } else {
                SDKMonitorUtils.getInstance(C19025f.m62101O()).monitorDuration(str, jSONObject, jSONObject2);
            }
        }
    }

    /* renamed from: b */
    public final void mo50365b(final String str, int i, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (m61869c()) {
            if (!this.f51098b) {
                m61866a(new C19045k() {
                    /* renamed from: b */
                    public final void mo50369b(int i, Object obj) {
                    }

                    /* renamed from: a */
                    public final void mo50368a(int i, Object obj) {
                        SDKMonitorUtils.getInstance(C19025f.m62101O()).monitorStatusAndDuration(str, 1, jSONObject, jSONObject2);
                    }
                });
            } else {
                SDKMonitorUtils.getInstance(C19025f.m62101O()).monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
            }
        }
    }

    /* renamed from: a */
    public final void mo50363a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (m61869c()) {
            Handler handler = new Handler(Looper.getMainLooper());
            final String str2 = str;
            final JSONObject jSONObject3 = jSONObject;
            C189522 r0 = new Runnable(0, null) {
                public final void run() {
                    C18949a.this.mo50365b(str2, 0, jSONObject3, null);
                }
            };
            handler.postDelayed(r0, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }
}
