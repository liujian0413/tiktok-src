package com.p280ss.ttvideoengine.p1813f;

import com.p280ss.ttvideoengine.p1813f.C46106j.C46107a;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.f.e */
public final class C46094e extends C46088a {

    /* renamed from: f */
    private static String f117959f = "https://203.107.1.4/131950/d?host=";

    /* renamed from: g */
    private static String f117960g = "https://dig.bdurl.net/q?host=";

    /* renamed from: h */
    private int f117961h = 2;

    /* renamed from: c */
    public final void mo112262c() {
        if (!this.f117936b) {
            this.f117936b = true;
            this.f117939e.mo112277a();
        }
    }

    /* renamed from: a */
    private String m144463a() {
        StringBuilder sb = new StringBuilder();
        if (this.f117961h == 2) {
            sb.append(f117960g);
        } else {
            sb.append(f117959f);
        }
        sb.append(this.f117937c);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo112260b() {
        String a = m144463a();
        Method[] declaredMethods = this.f117939e.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.f117939e.mo112279a(a, null, null, 0, new C46107a() {
                /* renamed from: a */
                public final void mo112153a(JSONObject jSONObject, C46117c cVar) {
                    C46094e.this.mo112271a(jSONObject, cVar);
                }
            });
        } else {
            this.f117939e.mo112278a(a, null, new C46107a() {
                /* renamed from: a */
                public final void mo112153a(JSONObject jSONObject, C46117c cVar) {
                    C46094e.this.mo112271a(jSONObject, cVar);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo112271a(JSONObject jSONObject, C46117c cVar) {
        C46117c cVar2;
        String str;
        String str2;
        if (cVar != null) {
            cVar.f118006c = "kTTVideoErrorDomainHTTPDNS";
            cVar2 = cVar;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            String str3 = "kTTVideoErrorDomainHTTPDNS";
            StringBuilder sb = new StringBuilder();
            if (this.f117961h == 2) {
                str = "TT_";
            } else {
                str = "ALI_";
            }
            sb.append(str);
            sb.append("HTTP dns empty");
            cVar2 = new C46117c(str3, -9997, sb.toString());
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                String str4 = "kTTVideoErrorDomainHTTPDNS";
                StringBuilder sb2 = new StringBuilder();
                if (this.f117961h == 2) {
                    str2 = "TT_";
                } else {
                    str2 = "ALI_";
                }
                sb2.append(str2);
                sb2.append("HTTP dns empty");
                cVar2 = new C46117c(str4, -9997, sb2.toString());
            } else {
                try {
                    jSONObject.put("time", System.currentTimeMillis());
                } catch (JSONException unused) {
                }
                mo112259a(jSONObject);
                return;
            }
        }
        mo112263c(cVar2);
    }

    public C46094e(String str, C46106j jVar, int i) {
        String str2;
        super(str, jVar);
        this.f117961h = i;
        String str3 = "HTTPDNS";
        StringBuilder sb = new StringBuilder("DNS use HTTPDNS");
        if (i == 2) {
            str2 = "_TT";
        } else {
            str2 = "_ALI";
        }
        sb.append(str2);
        C46123h.m144545a(str3, sb.toString());
    }
}
