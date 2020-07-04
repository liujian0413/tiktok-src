package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class alk implements C15742hq<aik> {
    /* renamed from: a */
    private static Integer m46275a(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            acd.m45783e(sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        alb alb;
        aik aik = (aik) obj;
        if (acd.m45776a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            acd.m45777b(sb.toString());
        }
        if (map.containsKey("abort")) {
            if (!ala.m46250a(aik)) {
                acd.m45783e("Precache abort but no precache task running.");
            }
            return;
        }
        String str = (String) map.get("src");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    String str3 = "Malformed demuxed URL list for precache: ";
                    String valueOf2 = String.valueOf(str2);
                    acd.m45783e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (ala.m46251b(aik) != null) {
                acd.m45783e("Precache task is already running.");
                return;
            } else if (aik.mo39467e() == null) {
                acd.m45783e("Precache requires a dependency provider.");
                return;
            } else {
                aij aij = new aij((String) map.get("flags"));
                Integer a = m46275a(map, "player");
                if (a == null) {
                    a = Integer.valueOf(0);
                }
                alb = aik.mo39467e().f38328a.mo39640a(aik, a.intValue(), null, aij);
                new aky(aik, alb, str, strArr).mo39128c();
            }
        } else {
            aky b = ala.m46251b(aik);
            if (b != null) {
                alb = b.f40531b;
            } else {
                acd.m45783e("Precache must specify a source.");
                return;
            }
        }
        Integer a2 = m46275a(map, "minBufferMs");
        if (a2 != null) {
            alb.mo39659c(a2.intValue());
        }
        Integer a3 = m46275a(map, "maxBufferMs");
        if (a3 != null) {
            alb.mo39648a(a3.intValue());
        }
        Integer a4 = m46275a(map, "bufferForPlaybackMs");
        if (a4 != null) {
            alb.mo39660d(a4.intValue());
        }
        Integer a5 = m46275a(map, "bufferForPlaybackAfterRebufferMs");
        if (a5 != null) {
            alb.mo39661e(a5.intValue());
        }
    }
}
