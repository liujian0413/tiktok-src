package com.p280ss.android.ugc.aweme.language;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.collect.C17995dt;
import com.p280ss.android.ugc.aweme.p1298i.C30421a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.setting.AppCurrentRegionSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.language.h */
public class C32326h extends C32330k {

    /* renamed from: a */
    static List<String> f84428a = Arrays.asList(new String[]{"JP", "HK", "ID", "MO", "TW", "KR", "VN", "TH", "PH", "MY", "SG", "KH", "LA", "MM", "CN"});

    /* renamed from: b */
    private static Set<String> f84429b = new HashSet();

    /* renamed from: c */
    private static Set<String> f84430c = new HashSet();

    /* renamed from: d */
    private static volatile String f84431d = "";

    /* renamed from: e */
    private static HashSet<String> f84432e;

    /* renamed from: f */
    private static Resources f84433f = null;

    /* renamed from: com.ss.android.ugc.aweme.language.h$a */
    public interface C32327a {
        /* renamed from: a */
        void mo83540a(String str);
    }

    /* renamed from: e */
    public static boolean m104881e() {
        return "ID".equalsIgnoreCase(m104885g());
    }

    /* renamed from: f */
    public static boolean m104882f() {
        return "US".equalsIgnoreCase(m104885g());
    }

    /* renamed from: c */
    public static boolean m104879c() {
        if ("RU".equalsIgnoreCase(m104886h()) || "RU".equalsIgnoreCase(m104885g())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m104880d() {
        if (Locale.KOREA.getCountry() == null || !Locale.KOREA.getCountry().equalsIgnoreCase(m104885g())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m104872a() {
        if (!TextUtils.isEmpty(f84431d)) {
            return f84431d;
        }
        synchronized (C32326h.class) {
            if (TextUtils.isEmpty(f84431d)) {
                f84431d = C10292j.m30480a().mo25015a(AppCurrentRegionSetting.class, "priority_region", C6384b.m19835a().mo15294c().getPriorityRegion());
            }
            if (TextUtils.isEmpty(f84431d)) {
                f84431d = m104885g();
            }
        }
        return f84431d;
    }

    /* renamed from: b */
    public static Map<String, String> m104878b() {
        if (!C7163a.m22363a() && !C32325g.m104870a()) {
            return null;
        }
        SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "test_setting", 0);
        HashMap hashMap = new HashMap();
        String string = a.getString("pref_province_name", "");
        if (!TextUtils.isEmpty(string)) {
            hashMap.put("province_name", string);
        }
        String string2 = a.getString("pref_province_id", "");
        if (!TextUtils.isEmpty(string2)) {
            hashMap.put("province_id", string2);
        }
        String string3 = a.getString("pref_city_name", "");
        if (!TextUtils.isEmpty(string3)) {
            hashMap.put("city_name", string3);
        }
        String string4 = a.getString("pref_city_id", "");
        if (!TextUtils.isEmpty(string4)) {
            hashMap.put("city_id", string4);
        }
        return hashMap;
    }

    static {
        f84429b.add("TW");
        f84429b.add("JP");
        f84429b.add("KR");
        f84429b.add("ID");
        f84429b.add("VN");
        f84429b.add("PH");
        f84429b.add("MY");
        f84429b.add("LA");
        f84429b.add("MM");
        f84429b.add("KH");
        f84429b.add("MO");
        f84429b.add("SG");
        f84429b.add("HK");
        f84429b.add("TH");
        f84429b.add("AU");
        f84429b.add("NZ");
        f84429b.add("SA");
        f84429b.add("AE");
        f84429b.add("KW");
        f84429b.add("BH");
        f84429b.add("QA");
        f84429b.add("OM");
        f84429b.add("MA");
        f84429b.add("DZ");
        f84429b.add("TN");
        f84429b.add("EG");
        f84429b.add("LB");
        f84429b.add("IQ");
        f84429b.add("JO");
        f84429b.add("SD");
        f84429b.add("DJ");
        f84429b.add("LY");
        f84429b.add("PS");
        f84429b.add("SY");
        f84429b.add("YE");
        f84429b.add("SO");
        f84429b.add("MR");
        f84429b.add("KM");
        f84429b.add("CZ");
        f84429b.add("RO");
        f84429b.add("HU");
        f84429b.add("SK");
        f84429b.add("SI");
        f84429b.add("HR");
        f84429b.add("BG");
        f84429b.add("ZA");
        f84429b.add("NG");
        f84429b.add("KE");
        f84429b.add("ET");
        f84429b.add("TZ");
        f84429b.add("UG");
        f84429b.add("GH");
        f84429b.add("SN");
        f84430c.add("BR");
        f84430c.add("US");
        f84430c.add("IN");
        f84430c.add("RU");
        f84430c.add("GB");
        f84430c.add("PT");
        f84430c.add("ES");
        f84430c.add("AU");
        f84430c.add("IT");
        f84430c.add("MX");
        f84430c.add("TR");
        f84430c.add("CA");
        f84430c.add("DE");
        f84430c.add("AR");
        f84430c.add("MN");
        f84430c.add("SA");
        f84430c.add("CO");
        f84430c.add("PL");
        f84430c.add("SE");
        f84430c.add("NO");
        f84430c.add("DK");
        f84430c.add("RO");
        f84430c.add("CZ");
        f84430c.add("FR");
        f84430c.add("NL");
        f84430c.add("BE");
        f84430c.add("IE");
        f84430c.add("LK");
        f84430c.add("PK");
        f84430c.add("BD");
        f84430c.add("TR");
        f84430c.add("EG");
        f84430c.add("AE");
        f84430c.add("KW");
        f84430c.add("MA");
        f84430c.add("DZ");
        f84430c.add("ZA");
        f84430c.addAll(f84429b);
        HashSet<String> hashSet = new HashSet<>();
        f84432e = hashSet;
        hashSet.add("EG");
        f84432e.add("SD");
        f84432e.add("DZ");
        f84432e.add("MA");
        f84432e.add("IQ");
        f84432e.add("SA");
        f84432e.add("YE");
        f84432e.add("SY");
        f84432e.add("TD");
        f84432e.add("TN");
        f84432e.add("SO");
        f84432e.add("LY");
        f84432e.add("JO");
        f84432e.add("ER");
        f84432e.add("AE");
        f84432e.add("LB");
        f84432e.add("MR");
        f84432e.add("KW");
        f84432e.add("OM");
        f84432e.add("QA");
        f84432e.add("DJ");
        f84432e.add("BH");
        f84432e.add("KM");
    }

    /* renamed from: a */
    private static String m104873a(Context context, int i) {
        Resources a = m104871a(context.getApplicationContext().getPackageManager(), context.getPackageName(), new Locale("zh", "CN"));
        if (a == null) {
            return "";
        }
        try {
            return a.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static void m104877a(Resources resources, Locale locale) {
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, null);
    }

    /* renamed from: a */
    private static Resources m104871a(PackageManager packageManager, String str, Locale locale) {
        try {
            Resources resourcesForApplication = packageManager.getResourcesForApplication(str);
            f84433f = resourcesForApplication;
            m104877a(resourcesForApplication, locale);
        } catch (NameNotFoundException unused) {
        }
        return f84433f;
    }

    /* renamed from: a */
    public static void m104875a(Activity activity, String str, C32327a aVar) {
        String str2;
        HashMap hashMap = new HashMap();
        C17995dt it = C30421a.m99405a().iterator();
        while (it.hasNext()) {
            C30421a aVar2 = (C30421a) it.next();
            if (aVar2 != null) {
                hashMap.put(aVar2.f79947c, m104873a((Context) activity, aVar2.f79945a));
            }
        }
        ArrayList arrayList = new ArrayList();
        C32329j jVar = null;
        ArrayList<String> arrayList2 = new ArrayList<>(f84430c);
        Collections.sort(arrayList2);
        for (String str3 : arrayList2) {
            if (hashMap.get(str3) == null) {
                str2 = "";
            } else {
                str2 = (String) hashMap.get(str3);
            }
            C32329j jVar2 = new C32329j(str2, str3);
            arrayList.add(jVar2);
            if (str3.equalsIgnoreCase(str)) {
                jVar = jVar2;
            }
        }
        RegionSelectDialog regionSelectDialog = new RegionSelectDialog(activity, arrayList, jVar);
        regionSelectDialog.f84401k = new C32328i(activity, aVar);
        regionSelectDialog.show();
    }

    /* renamed from: a */
    public static void m104876a(Context context, String str, C32329j jVar, C32329j jVar2) {
        SharedPreferences a = C7285c.m22838a(context, "test_setting", 0);
        a.edit().putString("pref_carrier", str).apply();
        if (jVar == null) {
            a.edit().putString("pref_province_id", "").apply();
            a.edit().putString("pref_province_name", "").apply();
        } else {
            a.edit().putString("pref_province_id", jVar.f84437b).apply();
            a.edit().putString("pref_province_name", jVar.f84436a).apply();
        }
        if (jVar2 == null) {
            a.edit().putString("pref_city_id", "").apply();
            a.edit().putString("pref_city_name", "").apply();
            return;
        }
        a.edit().putString("pref_city_id", jVar2.f84437b).apply();
        a.edit().putString("pref_city_name", jVar2.f84436a).apply();
    }

    /* renamed from: a */
    static final /* synthetic */ C7581n m104874a(Activity activity, C32327a aVar, C32329j jVar, C32329j jVar2, C32329j jVar3) {
        m104876a(activity, jVar.f84437b, jVar2, jVar3);
        if (aVar != null) {
            aVar.mo83540a(jVar.f84437b);
        }
        return C7581n.f20898a;
    }
}
