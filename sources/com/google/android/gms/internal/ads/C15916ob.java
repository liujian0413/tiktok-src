package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ob */
public final class C15916ob {

    /* renamed from: a */
    public final List<C15915oa> f44738a;

    /* renamed from: b */
    public final long f44739b;

    /* renamed from: c */
    public final List<String> f44740c;

    /* renamed from: d */
    public final List<String> f44741d;

    /* renamed from: e */
    public final List<String> f44742e;

    /* renamed from: f */
    public final List<String> f44743f;

    /* renamed from: g */
    public final List<String> f44744g;

    /* renamed from: h */
    public final boolean f44745h;

    /* renamed from: i */
    public final String f44746i;

    /* renamed from: j */
    public final long f44747j;

    /* renamed from: k */
    public final String f44748k;

    /* renamed from: l */
    public final int f44749l;

    /* renamed from: m */
    public final int f44750m;

    /* renamed from: n */
    public final long f44751n;

    /* renamed from: o */
    public final boolean f44752o;

    /* renamed from: p */
    public final boolean f44753p;

    /* renamed from: q */
    public final boolean f44754q;

    /* renamed from: r */
    public final boolean f44755r;

    /* renamed from: s */
    public int f44756s;

    /* renamed from: t */
    public int f44757t;

    /* renamed from: u */
    public boolean f44758u;

    public C15916ob(List<C15915oa> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f44738a = list;
        this.f44739b = j;
        this.f44740c = list2;
        this.f44741d = list3;
        this.f44742e = list4;
        this.f44743f = list5;
        this.f44744g = list6;
        this.f44745h = z;
        this.f44746i = str;
        this.f44747j = -1;
        this.f44757t = 1;
        this.f44750m = -1;
        this.f44751n = -1;
    }

    public C15916ob(String str) throws JSONException {
        this(new JSONObject(str));
    }

    public C15916ob(JSONObject jSONObject) throws JSONException {
        if (acd.m45776a(2)) {
            String str = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            acd.m45438a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                C15915oa oaVar = new C15915oa(jSONArray.getJSONObject(i2));
                boolean z = true;
                if (oaVar.mo41778a()) {
                    this.f44758u = true;
                }
                arrayList.add(oaVar);
                if (i < 0) {
                    Iterator it = oaVar.f44717c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.f44756s = i;
        this.f44757t = jSONArray.length();
        this.f44738a = Collections.unmodifiableList(arrayList);
        this.f44746i = jSONObject.optString("qdata");
        this.f44750m = jSONObject.optInt("fs_model_type", -1);
        long j = -1;
        this.f44751n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f44739b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.f44740c = C15924oj.m51487a(optJSONObject, "click_urls");
            this.f44741d = C15924oj.m51487a(optJSONObject, "imp_urls");
            this.f44742e = C15924oj.m51487a(optJSONObject, "downloaded_imp_urls");
            this.f44743f = C15924oj.m51487a(optJSONObject, "nofill_urls");
            this.f44744g = C15924oj.m51487a(optJSONObject, "remote_ping_urls");
            this.f44745h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            if (optLong > 0) {
                j = 1000 * optLong;
            }
            this.f44747j = j;
            zzbaz a = zzbaz.m52671a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.f44748k = null;
                this.f44749l = 0;
            } else {
                this.f44748k = a.f45667a;
                this.f44749l = a.f45668b;
            }
            this.f44752o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.f44753p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.f44754q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.f44755r = optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f44739b = -1;
        this.f44740c = null;
        this.f44741d = null;
        this.f44742e = null;
        this.f44743f = null;
        this.f44744g = null;
        this.f44747j = -1;
        this.f44748k = null;
        this.f44749l = 0;
        this.f44752o = false;
        this.f44745h = false;
        this.f44753p = false;
        this.f44754q = false;
        this.f44755r = false;
    }
}
