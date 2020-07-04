package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.C13192m;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ha */
public final class C15726ha {

    /* renamed from: a */
    public static final C15742hq<ami> f44452a = C15727hb.f44470a;

    /* renamed from: b */
    public static final C15742hq<ami> f44453b = C15728hc.f44471a;

    /* renamed from: c */
    public static final C15742hq<ami> f44454c = C15729hd.f44472a;

    /* renamed from: d */
    public static final C15742hq<ami> f44455d = new C15732hg();

    /* renamed from: e */
    public static final C15742hq<ami> f44456e = new C15733hh();

    /* renamed from: f */
    public static final C15742hq<ami> f44457f = C15730he.f44473a;

    /* renamed from: g */
    public static final C15742hq<Object> f44458g = new C15734hi();

    /* renamed from: h */
    public static final C15742hq<ami> f44459h = new C15735hj();

    /* renamed from: i */
    public static final C15742hq<ami> f44460i = C15731hf.f44474a;

    /* renamed from: j */
    public static final C15742hq<ami> f44461j = new C15736hk();

    /* renamed from: k */
    public static final C15742hq<ami> f44462k = new C15737hl();

    /* renamed from: l */
    public static final C15742hq<aik> f44463l = new akw();

    /* renamed from: m */
    public static final C15742hq<aik> f44464m = new akx();

    /* renamed from: n */
    public static final C15742hq<ami> f44465n = new C15724gz();

    /* renamed from: o */
    public static final C15759ig f44466o = new C15759ig();

    /* renamed from: p */
    public static final C15742hq<ami> f44467p = new C15738hm();

    /* renamed from: q */
    public static final C15742hq<ami> f44468q = new C15739hn();

    /* renamed from: r */
    public static final C15742hq<ami> f44469r = new C15740ho();

    /* renamed from: a */
    static final /* synthetic */ void m50991a(anm anm, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            bdt z = anm.mo39764z();
            if (z != null) {
                z.f41732a.mo37776a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            acd.m45783e("Could not parse touch parameters from gmsg.");
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m50990a(ane ane, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            acd.m45783e("URL missing from httpTrack GMSG.");
        } else {
            new aep(ane.getContext(), ((ann) ane).mo39472k().f45677a, str).mo39129g();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m50992a(C15836lc lcVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            acd.m45783e("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            bdt z = ((anm) lcVar).mo39764z();
            if (z != null && z.mo40535a(parse)) {
                parse = z.mo40533a(parse, ((ane) lcVar).getContext(), ((ano) lcVar).getView(), ((ane) lcVar).mo39466d());
            }
        } catch (zzdh unused) {
            String str2 = "Unable to append parameter to URL: ";
            String valueOf = String.valueOf(str);
            acd.m45783e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        ane ane = (ane) lcVar;
        new aep(ane.getContext(), ((ann) lcVar).mo39472k().f45677a, abd.m45354a(parse, ane.getContext())).mo39129g();
    }

    /* renamed from: b */
    static final /* synthetic */ void m50993b(ane ane, Map map) {
        PackageManager packageManager = ane.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString(C42323i.f110089f);
                        String optString4 = jSONObject2.optString(C13192m.f34940a);
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String str = "Error parsing the url: ";
                                String valueOf = String.valueOf(optString7);
                                acd.m45778b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            acd.m45778b("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        acd.m45778b("Error parsing the intent data.", e3);
                    }
                }
                ((C15836lc) ane).mo39810a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((C15836lc) ane).mo39810a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((C15836lc) ane).mo39810a("openableIntents", new JSONObject());
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m50994c(ane ane, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            acd.m45783e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = ane.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((C15836lc) ane).mo39809a("openableURLs", (Map<String, ?>) hashMap);
    }
}
