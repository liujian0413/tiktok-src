package org.chromium;

import com.ttnet.org.chromium.base.Reflect;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: org.chromium.e */
public class C48316e {

    /* renamed from: a */
    private static C48316e f123367a;

    /* renamed from: b */
    private Object f123368b;

    private C48316e() {
    }

    /* renamed from: A */
    public final String mo121713A() {
        return m149836c("getLanguage");
    }

    /* renamed from: B */
    public final String mo121714B() {
        return m149836c("getVersionName");
    }

    /* renamed from: C */
    public final String mo121715C() {
        return m149836c("getUpdateVersionCode");
    }

    /* renamed from: D */
    public final String mo121716D() {
        return m149836c("getManifestVersionCode");
    }

    /* renamed from: E */
    public final String mo121717E() {
        return m149836c("getStoreIdc");
    }

    /* renamed from: F */
    public final String mo121718F() {
        return m149836c("getRegion");
    }

    /* renamed from: G */
    public final String mo121719G() {
        return m149836c("getSysRegion");
    }

    /* renamed from: H */
    public final String mo121720H() {
        return m149836c("getCarrierRegion");
    }

    /* renamed from: I */
    public final String mo121721I() {
        return m149836c("getDPI");
    }

    /* renamed from: J */
    public final String mo121722J() {
        return m149836c("getRticket");
    }

    /* renamed from: d */
    public final String mo121736d() {
        return m149836c("getIId");
    }

    /* renamed from: e */
    public final String mo121737e() {
        return m149836c("getUserId");
    }

    /* renamed from: f */
    public final String mo121738f() {
        return m149836c("getAppId");
    }

    /* renamed from: g */
    public final String mo121739g() {
        return m149836c("getOSApi");
    }

    /* renamed from: h */
    public final String mo121740h() {
        return m149836c("getAbFlag");
    }

    /* renamed from: i */
    public final String mo121741i() {
        return m149836c("getDeviceId");
    }

    /* renamed from: j */
    public final String mo121742j() {
        return m149836c("getNetAccessType");
    }

    /* renamed from: k */
    public final String mo121743k() {
        return m149836c("getVersionCode");
    }

    /* renamed from: l */
    public final String mo121744l() {
        return m149836c("getDeviceType");
    }

    /* renamed from: m */
    public final String mo121745m() {
        return m149836c("getAppName");
    }

    /* renamed from: n */
    public final String mo121746n() {
        return m149836c("getChannel");
    }

    /* renamed from: o */
    public final String mo121747o() {
        return m149836c("getCityName");
    }

    /* renamed from: p */
    public final String mo121748p() {
        return m149836c("getOSVersion");
    }

    /* renamed from: q */
    public final String mo121749q() {
        return m149836c("getAbi");
    }

    /* renamed from: r */
    public final String mo121750r() {
        return m149836c("getDevicePlatform");
    }

    /* renamed from: s */
    public final String mo121751s() {
        return m149836c("getUUID");
    }

    /* renamed from: t */
    public final String mo121752t() {
        return m149836c("getOpenUdid");
    }

    /* renamed from: u */
    public final String mo121753u() {
        return m149836c("getResolution");
    }

    /* renamed from: v */
    public final String mo121754v() {
        return m149836c("getAbVersion");
    }

    /* renamed from: w */
    public final String mo121755w() {
        return m149836c("getAbClient");
    }

    /* renamed from: x */
    public final String mo121756x() {
        return m149836c("getAbFeature");
    }

    /* renamed from: y */
    public final String mo121757y() {
        return m149836c("getSsmix");
    }

    /* renamed from: z */
    public final String mo121758z() {
        return m149836c("getDeviceBrand");
    }

    /* renamed from: a */
    public static C48316e m149835a() {
        if (f123367a == null) {
            synchronized (C48316e.class) {
                if (f123367a == null) {
                    f123367a = new C48316e();
                }
            }
        }
        return f123367a;
    }

    /* renamed from: L */
    public final String mo121724L() {
        try {
            if (this.f123368b == null) {
                return null;
            }
            return (String) Reflect.m146422on(this.f123368b).call("getGetDomainDefaultJSON").get();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: M */
    public final String mo121725M() {
        try {
            if (this.f123368b == null) {
                return null;
            }
            return (String) Reflect.m146422on(this.f123368b).call("getBypassBOEJSON").get();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: K */
    public final Map<String, String> mo121723K() {
        try {
            if (this.f123368b == null) {
                return Collections.emptyMap();
            }
            return (Map) Reflect.m146422on(this.f123368b).call("getGetDomainDependHostMap").get();
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    /* renamed from: b */
    public final void mo121732b() {
        if (C48317f.m149883a().loggerDebug()) {
            C48317f.m149883a().loggerD("CronetAppProviderManager", "onColdStartFinish ");
        }
        try {
            if (this.f123368b != null) {
                Reflect.m146422on(this.f123368b).call("onColdStartFinish");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void mo121735c() {
        if (C48317f.m149883a().loggerDebug()) {
            C48317f.m149883a().loggerD("CronetAppProviderManager", "onTNCUpdateFailed ");
        }
        try {
            if (this.f123368b != null) {
                Reflect.m146422on(this.f123368b).call("onTNCUpdateFailed");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private String m149836c(String str) {
        try {
            if (this.f123368b == null) {
                return "";
            }
            return (String) Reflect.m146422on(this.f123368b).call(str).get();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final void mo121729a(String str) {
        if (C48317f.m149883a().loggerDebug()) {
            StringBuilder sb = new StringBuilder("onServerConfigUpdated json = ");
            sb.append(str);
            C48317f.m149883a().loggerD("CronetAppProviderManager", sb.toString());
        }
        try {
            if (this.f123368b != null) {
                Reflect.m146422on(this.f123368b).call("onServerConfigUpdated", new Class[]{String.class}, str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo121733b(int i) {
        if (C48317f.m149883a().loggerDebug()) {
            StringBuilder sb = new StringBuilder("onEffectiveConnectionTypeChanged type = ");
            sb.append(i);
            C48317f.m149883a().loggerD("CronetAppProviderManager", sb.toString());
        }
        try {
            if (this.f123368b != null) {
                Reflect.m146422on(this.f123368b).call("onEffectiveConnectionTypeChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo121727a(int i) {
        if (C48317f.m149883a().loggerDebug()) {
            StringBuilder sb = new StringBuilder("onTTNetStateChanged info int = ");
            sb.append(i);
            C48317f.m149883a().loggerD("CronetAppProviderManager", sb.toString());
        }
        try {
            if (this.f123368b != null) {
                Reflect.m146422on(this.f123368b).call("onTTNetStateChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo121734b(String str) {
        if (C48317f.m149883a().loggerDebug()) {
            StringBuilder sb = new StringBuilder("onTTNetDetectInfoChanged info str = ");
            sb.append(str);
            C48317f.m149883a().loggerD("CronetAppProviderManager", sb.toString());
        }
        try {
            if (this.f123368b != null) {
                Reflect.m146422on(this.f123368b).call("onTTNetDetectInfoChanged", new Class[]{String.class}, str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo121728a(Object obj) {
        if (obj != null) {
            try {
                Class cls = obj.getClass();
                if (cls != null) {
                    List<Class> a = C48320i.m149887a(cls);
                    if (a != null) {
                        if (!a.isEmpty()) {
                            for (Class name : a) {
                                if ("com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider".equals(name.getName())) {
                                    if (C48317f.m149883a().loggerDebug()) {
                                        C48317f.m149883a().loggerD("CronetAppProviderManager", "inject CronetAppProviderManager success");
                                    }
                                    this.f123368b = obj;
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo121726a(String str, Map<String, String> map) {
        if (C48317f.m149883a().loggerDebug()) {
            StringBuilder sb = new StringBuilder("onCallToAddSecurityFactor info url = ");
            sb.append(str);
            C48317f.m149883a().loggerD("CronetAppProviderManager", sb.toString());
        }
        try {
            if (this.f123368b == null) {
                return null;
            }
            return (Map) Reflect.m146422on(this.f123368b).call("onCallToAddSecurityFactor", new Class[]{String.class, Map.class}, str, map).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo121730a(String str, String str2) {
        if (C48317f.m149883a().loggerDebug()) {
            StringBuilder sb = new StringBuilder("Send monitor json = ");
            sb.append(str);
            sb.append(", log type =");
            sb.append(str2);
            C48317f.m149883a().loggerD("CronetAppProviderManager", sb.toString());
        }
        try {
            if (this.f123368b != null) {
                Reflect.m146422on(this.f123368b).call("sendAppMonitorEvent", new Class[]{String.class, String.class}, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo121731a(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4) {
        if (C48317f.m149883a().loggerDebug()) {
            C48317f.m149883a().loggerD("CronetAppProviderManager", "handleApiResult ");
        }
        try {
            if (this.f123368b != null) {
                Reflect.m146422on(this.f123368b).call("handleApiResult", new Class[]{Boolean.TYPE, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Boolean.valueOf(z), str, str2, str3, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Boolean.valueOf(z2), Long.valueOf(j11), Long.valueOf(j12), str4);
            }
        } catch (Throwable unused) {
        }
    }
}
