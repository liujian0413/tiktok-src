package com.bytedance.ttnet.p265b;

import android.location.Address;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10132f;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10132f.C10133a;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10132f.C10134b;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10132f.C10136d;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10132f.C10137e;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10132f.C10138f;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.p670a.C12925a;
import com.bytedance.ttnet.p670a.C12937c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.b.a */
public abstract class C6482a implements ICronetAppProvider, ICronetDepend {

    /* renamed from: a */
    public C10132f f18800a;

    protected C6482a() {
    }

    /* renamed from: a */
    public void mo15804a(int i) {
    }

    /* renamed from: a */
    public void mo15805a(C10132f fVar) {
    }

    public String getAbClient() {
        return "";
    }

    public String getAbFeature() {
        return "";
    }

    public String getAbVersion() {
        return "";
    }

    public String getAppId() {
        return "-1";
    }

    public String getAppName() {
        return "";
    }

    public String getBypassBOEJSON() {
        return null;
    }

    public String getCarrierRegion() {
        return "";
    }

    public String getChannel() {
        return "";
    }

    public String getDeviceBrand() {
        return Build.BRAND;
    }

    public String getDeviceId() {
        return "";
    }

    public String getDevicePlatform() {
        return "android";
    }

    public String getDeviceType() {
        return Build.MODEL;
    }

    public String getGetDomainDefaultJSON() {
        return null;
    }

    public String getIId() {
        return "";
    }

    public String getOpenUdid() {
        return "";
    }

    public String getRegion() {
        return "";
    }

    public String getSsCookieKey() {
        return "X-SS-Cookie";
    }

    public String getSsmix() {
        return "a";
    }

    public String getStoreIdc() {
        return "";
    }

    public String getSysRegion() {
        return "";
    }

    public String getUUID() {
        return "";
    }

    public String getUserId() {
        return "";
    }

    public String getVersionName() {
        return "";
    }

    public void loggerD(String str, String str2) {
    }

    public void sendAppMonitorEvent(String str, String str2) {
    }

    public void setAdapter(ICronetDepend iCronetDepend) {
    }

    public String getAbFlag() {
        return String.valueOf("-1");
    }

    public String getManifestVersionCode() {
        return String.valueOf("-1");
    }

    public String getOSApi() {
        return String.valueOf(VERSION.SDK_INT);
    }

    public String getUpdateVersionCode() {
        return String.valueOf("-1");
    }

    public String getVersionCode() {
        return String.valueOf("-1");
    }

    public boolean loggerDebug() {
        return C6312h.m19578b();
    }

    public String getAbi() {
        if (VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return Build.SUPPORTED_ABIS[0];
    }

    public String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public String getNetAccessType() {
        return NetworkUtils.m19552f(C12961d.m37772a().mo31461a());
    }

    public String getRticket() {
        return String.valueOf(System.currentTimeMillis());
    }

    public final void onColdStartFinish() {
        new C6304f("NetWork-Event") {
            public final void run() {
                C12961d.m37783b();
            }
        }.start();
    }

    public final void onTNCUpdateFailed() {
        new C6304f("NetWork-Event") {
            public final void run() {
                C12937c.m37685a(C12961d.m37772a().mo31461a());
            }
        }.start();
    }

    public String getCityName() {
        Address a = C12961d.m37772a().mo31462a(C12961d.m37772a().mo31461a());
        if (a != null) {
            String locality = a.getLocality();
            if (!C6319n.m19593a(locality)) {
                return locality;
            }
        }
        return "";
    }

    public String getDPI() {
        int d = C9738o.m28716d(C12961d.m37772a().mo31461a());
        if (d > 0) {
            return String.valueOf(d);
        }
        return "";
    }

    public String getOSVersion() {
        try {
            String str = VERSION.RELEASE;
            if (str != null && str.length() > 10) {
                str = str.substring(0, 10);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public String getResolution() {
        String c = C9738o.m28715c(C12961d.m37772a().mo31461a());
        if (!C6319n.m19593a(c)) {
            return c;
        }
        return "";
    }

    public Map<String, String> getGetDomainDependHostMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] c = C12961d.m37772a().mo31469c();
        linkedHashMap.put("first", c[0]);
        linkedHashMap.put("second", c[1]);
        linkedHashMap.put("third", c[2]);
        Map f = C12961d.m37772a().mo31472f();
        if (f != null && !f.isEmpty()) {
            for (Entry entry : f.entrySet()) {
                if (entry != null) {
                    linkedHashMap.put(entry.getValue(), entry.getKey());
                }
            }
        }
        return linkedHashMap;
    }

    public void onEffectiveConnectionTypeChanged(final int i) {
        new C6304f("NetWork-Event") {
            public final void run() {
            }
        }.start();
    }

    public void onServerConfigUpdated(final String str) {
        try {
            new C6304f("NetWork-Event") {
                public final void run() {
                    try {
                        C12925a.m37625a(C12961d.m37772a().mo31461a()).mo31414h(str);
                    } catch (Throwable unused) {
                    }
                }
            }.start();
        } catch (Throwable unused) {
        }
    }

    public final void onTTNetStateChanged(final int i) {
        new C6304f("NetWork-Event") {
            public final void run() {
                C6482a.this.mo15804a(i);
            }
        }.start();
    }

    public final void onTTNetDetectInfoChanged(final String str) {
        if (!TextUtils.isEmpty(str)) {
            new C6304f("NetWork-Event") {
                public final void run() {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        C10132f fVar = new C10132f();
                        fVar.f27584a = jSONObject.getInt("source");
                        fVar.f27585b = jSONObject.getLong("timestamp");
                        fVar.f27586c = jSONObject.getInt("succ");
                        fVar.f27587d = jSONObject.getInt("fail");
                        fVar.f27588e = jSONObject.getInt("rank");
                        fVar.f27591h = jSONObject.getString("os");
                        fVar.f27592i = jSONObject.getString("os_version");
                        fVar.f27593j = jSONObject.getString("app_version");
                        fVar.f27594k = jSONObject.getInt("signal_strength");
                        fVar.f27595l = jSONObject.getString("wifi_ssid");
                        fVar.f27596m = jSONObject.getInt("wifi_frequency");
                        fVar.f27597n = jSONObject.getString("xg_mcc_mnc");
                        fVar.f27598o = jSONObject.getInt("xg_cid");
                        fVar.f27599p = jSONObject.getInt("xg_lac");
                        fVar.f27600q = jSONObject.getString("apn");
                        fVar.f27589f = jSONObject.getString("nettype");
                        JSONArray jSONArray = jSONObject.getJSONArray("result");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            Object obj = null;
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String string = jSONObject2.getString("type");
                            if ("http_get".equalsIgnoreCase(string)) {
                                obj = C10134b.m30089a(jSONObject2);
                            } else if ("ping".equalsIgnoreCase(string)) {
                                obj = C10137e.m30091a(jSONObject2);
                            } else if ("traceroute".equalsIgnoreCase(string)) {
                                obj = C10138f.m30092a(jSONObject2);
                            } else if ("dns_local".equalsIgnoreCase(string)) {
                                obj = C10136d.m30090a(jSONObject2);
                            } else if ("dns_http".equalsIgnoreCase(string)) {
                                obj = C10133a.m30088a(jSONObject2);
                            } else if ("dns_server".equalsIgnoreCase(string)) {
                                fVar.f27601r = jSONObject2.getString("clientip");
                                fVar.f27602s = jSONObject2.getString("localdns");
                            }
                            if (obj != null) {
                                fVar.f27590g.add(obj);
                            }
                        }
                        synchronized (this) {
                            C6482a.this.f18800a = fVar;
                        }
                        C6482a.this.mo15805a(fVar);
                    } catch (Throwable unused) {
                    }
                }
            }.start();
        }
    }

    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(entry.getValue());
            hashMap.put(entry.getKey(), arrayList);
        }
        return C10142f.m30099a(str, (Map) hashMap);
    }

    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4) {
        String str5 = str;
        long j13 = j;
        long j14 = j2;
        long j15 = j5;
        C10104a a = C10104a.m30002a();
        a.f27498a = str3;
        a.f27500c = j13;
        a.f27501d = j13;
        a.f27502e = j14;
        a.f27503f = j3;
        a.f27504g = j4;
        a.f27505h = j15;
        a.f27507j = j6;
        a.f27508k = j7;
        a.f27509l = j8;
        a.f27510m = j9;
        a.f27512o = j10;
        a.f27513p = z2;
        a.f27514q = j11;
        long j16 = j15 - j14;
        a.f27515r = j16;
        a.f27517t = j12;
        a.f27521x = str4;
        a.f27519v = 0;
        if (z) {
            C10142f.m30113a(str, j16, a);
            C10142f.m30101a(j16, j2, str, str2, a);
            return;
        }
        C10142f.m30114a(str, new Exception("Cronet internal request fail"), j16, a);
        C10142f.m30102a(j16, j2, str, str2, a, new Exception("Cronet internal request fail"));
    }
}
