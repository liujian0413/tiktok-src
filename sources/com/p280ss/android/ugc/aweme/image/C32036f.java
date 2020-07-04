package com.p280ss.android.ugc.aweme.image;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.connectionclass.C10081a;
import com.bytedance.frameworks.baselib.network.connectionclass.C10087c;
import com.bytedance.framwork.core.monitor.MonitorNetUtil;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.C2072a;
import com.bytedance.ttnet.C12947b;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.p670a.C12925a;
import com.bytedance.ttnet.p671c.C12955b;
import com.bytedance.ttnet.p671c.C12960e;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.net.corenet.C34064i;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.f */
public final class C32036f implements C32043j {
    /* renamed from: a */
    private static void m104037a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("nt_band_width", C10087c.m29957b().mo24735c());
                jSONObject.put("cdn_nt_band_width", C10081a.m29953a().mo24735c());
                jSONObject.put("cronet_open", C12925a.m37625a(C6399b.m19921a()).mo31415h());
                jSONObject.put("cronet_plugin_install", C12961d.m37772a().mo31468b());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m104036a(C12955b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            m104037a(jSONObject);
            try {
                jSONObject.put("requestStart", bVar.f27502e);
                jSONObject.put("responseBack", bVar.f27503f);
                jSONObject.put("completeReadResponse", bVar.f27504g);
                jSONObject.put("appLevelRequestStart", bVar.f27500c);
                jSONObject.put("beforeAllInterceptors", bVar.f27501d);
                jSONObject.put("requestEnd", bVar.f27505h);
                jSONObject.put("recycleCount", bVar.f27506i);
                if (C12947b.m37743a()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
                if (bVar.f27519v == 0) {
                    jSONObject.put("timing_dns", bVar.f27507j);
                    jSONObject.put("timing_connect", bVar.f27508k);
                    jSONObject.put("timing_ssl", bVar.f27509l);
                    jSONObject.put("timing_send", bVar.f27510m);
                    jSONObject.put("timing_waiting", bVar.f27514q);
                    jSONObject.put("timing_receive", bVar.f27512o);
                    jSONObject.put("timing_total", bVar.f27515r);
                    jSONObject.put("timing_isSocketReused", bVar.f27513p);
                    jSONObject.put("timing_totalSendBytes", bVar.f27516s);
                    jSONObject.put("timing_totalReceivedBytes", bVar.f27517t);
                    jSONObject.put("timing_remoteIP", bVar.f27498a);
                    jSONObject.put("request_log", bVar.f27521x);
                }
                if (bVar.f27522y != null) {
                    jSONObject.put("req_info", bVar.f27522y);
                }
                jSONObject.put("download", bVar.f27523z);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo83008a(long j, long j2, String str, C12955b bVar, Throwable th, JSONObject jSONObject) {
        final long j3 = j;
        final long j4 = j2;
        final String str2 = str;
        final C12955b bVar2 = bVar;
        final Throwable th2 = th;
        C320371 r0 = new Callable<Object>(null) {
            public final Object call() throws Exception {
                C6893q.m21452b("aweme_image_api", "", C32036f.m104035a(false, j3, j4, str2, bVar2, th2));
                try {
                    String[] strArr = new String[1];
                    int a = C34064i.m109694a(th2, strArr);
                    if (C6319n.m19593a(strArr[0]) && bVar2 != null) {
                        strArr[0] = bVar2.f27498a;
                    }
                    JSONObject jSONObject = null;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    JSONObject jSONObject2 = jSONObject;
                    C32036f.m104036a(bVar2, jSONObject2);
                    C2072a.m9150b().mo7733b(str2, a, strArr[0], j3, jSONObject2);
                } catch (Throwable unused) {
                }
                return null;
            }
        };
        C1592h.m7853a((Callable<TResult>) r0);
    }

    /* renamed from: b */
    public final void mo83009b(long j, long j2, String str, C12955b bVar, Throwable th, JSONObject jSONObject) {
        C12955b bVar2 = bVar;
        C6893q.m21452b("aweme_image_api", "", m104035a(true, j, j2, str, bVar, (Throwable) null));
        try {
            String[] strArr = new String[1];
            if (C6319n.m19593a(strArr[0]) && bVar2 != null) {
                strArr[0] = bVar2.f27498a;
            }
            m104036a(bVar2, jSONObject);
            C2072a.m9150b().mo7733b(str, C34943c.f91127w, strArr[0], j, jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static JSONObject m104035a(boolean z, long j, long j2, String str, C12955b bVar, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                if (str.contains("&config_retry=b")) {
                    jSONObject.put("log_config_retry", 1);
                }
            } catch (Exception unused) {
            }
        }
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(strArr[0]) && bVar != null) {
            strArr[0] = bVar.f27498a;
            if (bVar.f27499b != null) {
                if (((C12960e) bVar.f27499b).f34305n > 0) {
                    jSONObject.put("index", ((C12960e) bVar.f27499b).f34305n);
                }
                if (((C12960e) bVar.f27499b).f34304m > 0) {
                    jSONObject.put("httpIndex", ((C12960e) bVar.f27499b).f34304m);
                }
            }
        }
        if (bVar != null) {
            jSONObject.put("requestStart", bVar.f27502e);
            jSONObject.put("responseBack", bVar.f27503f);
            jSONObject.put("completeReadResponse", bVar.f27504g);
            jSONObject.put("requestEnd", bVar.f27505h);
            jSONObject.put("recycleCount", bVar.f27506i);
            if (bVar.f27519v == 0) {
                jSONObject.put("timing_dns", bVar.f27507j);
                jSONObject.put("timing_connect", bVar.f27508k);
                jSONObject.put("timing_ssl", bVar.f27509l);
                jSONObject.put("timing_send", bVar.f27510m);
                jSONObject.put("timing_waiting", bVar.f27514q);
                jSONObject.put("timing_receive", bVar.f27512o);
                jSONObject.put("timing_total", bVar.f27515r);
                jSONObject.put("timing_isSocketReused", bVar.f27513p);
                jSONObject.put("timing_totalSendBytes", bVar.f27516s);
                jSONObject.put("timing_totalReceivedBytes", bVar.f27517t);
                jSONObject.put("timing_remoteIP", bVar.f27498a);
                jSONObject.put("request_log", bVar.f27521x);
            }
            jSONObject.put("download", bVar.f27523z);
        }
        if (C12947b.m37743a()) {
            jSONObject.put("netClientType", "CronetClient");
        } else {
            jSONObject.put("netClientType", "TTOkhttp3Client");
        }
        jSONObject.put("networkQuality", C10087c.m29957b().mo24735c().toString());
        jSONObject.put("downloadSpeed", (int) C10087c.m29957b().mo24736d());
        if (!z && th != null) {
            jSONObject.put("errorDesc", Log.getStackTraceString(th));
        }
        jSONObject.put("duration", j);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("uri", Uri.parse(str));
        }
        if (j2 > 0) {
            jSONObject.put("timestamp", j2);
        }
        int i = C34943c.f91127w;
        if (!z) {
            i = C34064i.m109694a(th, strArr);
        }
        jSONObject.put("status", i);
        if (!TextUtils.isEmpty(strArr[0])) {
            jSONObject.put("ip", strArr[0]);
        }
        jSONObject.put("network_type", MonitorNetUtil.m19812a(C6399b.m19921a().getApplicationContext()).getValue());
        return jSONObject;
    }
}
