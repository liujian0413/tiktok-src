package com.bytedance.ies.net.cronet;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.connectionclass.C10081a;
import com.bytedance.frameworks.baselib.network.connectionclass.C10087c;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10153k;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.p670a.C12925a;
import com.bytedance.ttnet.p671c.C12955b;
import com.bytedance.ttnet.p671c.C12960e;
import com.toutiao.proxyserver.net.C46518f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.net.cronet.a */
public abstract class C10928a implements C10153k<C12955b> {

    /* renamed from: a */
    protected Context f29591a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26341a(long j, long j2, String str, String str2, String str3, C12955b bVar, Throwable th, JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26342a(long j, long j2, String str, String str2, String str3, C12955b bVar, JSONObject jSONObject);

    public C10928a(Context context) {
        C12955b.m37765b();
        this.f29591a = context;
    }

    /* renamed from: a */
    private static void m32055a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("nt_band_width", C10087c.m29957b().mo24735c());
                jSONObject.put("cdn_nt_band_width", C10081a.m29953a().mo24735c());
                jSONObject.put("cronet_open", C12925a.m37625a(C12961d.m37772a().mo31461a()).mo31415h());
                jSONObject.put("cronet_plugin_install", C12961d.m37772a().mo31468b());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m32053a(C12955b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            m32055a(jSONObject);
            try {
                jSONObject.put("requestStart", bVar.f27502e);
                jSONObject.put("responseBack", bVar.f27503f);
                jSONObject.put("completeReadResponse", bVar.f27504g);
                jSONObject.put("appLevelRequestStart", bVar.f27500c);
                jSONObject.put("beforeAllInterceptors", bVar.f27501d);
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
                if (bVar.f27522y != null) {
                    jSONObject.put("req_info", bVar.f27522y);
                }
                jSONObject.put("download", bVar.f27523z);
                if (bVar instanceof C46518f) {
                    jSONObject.put("player_id", ((C46518f) bVar).f119853C);
                    jSONObject.put("video_cache_use_ttnet", ((C46518f) bVar).f119854D);
                    jSONObject.put("video_cache_retry_count", ((C46518f) bVar).f119855E);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m32054a(Throwable th, JSONObject jSONObject) {
        if (th != null && jSONObject != null) {
            try {
                String message = th.getMessage();
                if (!C6319n.m19593a(message)) {
                    int length = message.length();
                    int indexOf = message.indexOf("ErrorCode=");
                    if (indexOf != -1) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = indexOf + 10; i < length; i++) {
                            char charAt = message.charAt(i);
                            if (!Character.isSpaceChar(charAt)) {
                                if (charAt != '-' && !Character.isDigit(charAt)) {
                                    break;
                                }
                                sb.append(charAt);
                            }
                        }
                        if (sb.length() > 0) {
                            jSONObject.put("cronet_error_code", sb.toString());
                        }
                    }
                    int indexOf2 = message.indexOf("InternalErrorCode=");
                    if (indexOf2 != -1) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i2 = indexOf2 + 18; i2 < length; i2++) {
                            char charAt2 = message.charAt(i2);
                            if (!Character.isSpaceChar(charAt2)) {
                                if (charAt2 != '-' && !Character.isDigit(charAt2)) {
                                    break;
                                }
                                sb2.append(charAt2);
                            }
                        }
                        if (sb2.length() > 0) {
                            jSONObject.put("cronet_internal_error_code", sb2.toString());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo24821a(long j, long j2, String str, String str2, C12955b bVar) {
        m32052a(j, j2, str, str2, bVar, (JSONObject) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo24822a(long j, long j2, String str, String str2, C12955b bVar, Throwable th) {
        m32051a(j, j2, str, str2, bVar, th, (JSONObject) null);
    }

    /* renamed from: a */
    private void m32052a(long j, long j2, String str, String str2, C12955b bVar, JSONObject jSONObject) {
        C12955b bVar2 = bVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject2 = new JSONObject();
            String str3 = str;
            if (str.contains("&config_retry=b")) {
                jSONObject2.put("log_config_retry", 1);
            }
            if (TextUtils.isEmpty(strArr[0]) && bVar2 != null) {
                strArr[0] = bVar2.f27498a;
                if (bVar2.f27499b != null) {
                    if (((C12960e) bVar2.f27499b).f34305n > 0) {
                        jSONObject2.put("index", ((C12960e) bVar2.f27499b).f34305n);
                    }
                    if (((C12960e) bVar2.f27499b).f34304m > 0) {
                        jSONObject2.put("httpIndex", ((C12960e) bVar2.f27499b).f34304m);
                    }
                }
            }
            m32053a(bVar2, jSONObject2);
            mo26342a(j, j2, str, str2, strArr[0], bVar, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m32051a(long j, long j2, String str, String str2, C12955b bVar, Throwable th, JSONObject jSONObject) {
        C12955b bVar2 = bVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(strArr[0]) && bVar2 != null) {
                strArr[0] = bVar2.f27498a;
                if (bVar2.f27499b != null) {
                    if (((C12960e) bVar2.f27499b).f34305n > 0) {
                        jSONObject2.put("index", ((C12960e) bVar2.f27499b).f34305n);
                    }
                    if (((C12960e) bVar2.f27499b).f34304m > 0) {
                        jSONObject2.put("httpIndex", ((C12960e) bVar2.f27499b).f34304m);
                    }
                }
            }
            m32054a(th, jSONObject2);
            m32053a(bVar2, jSONObject2);
            mo26341a(j, j2, str, str2, strArr[0], bVar, th, jSONObject2);
        } catch (Throwable unused) {
        }
    }
}
