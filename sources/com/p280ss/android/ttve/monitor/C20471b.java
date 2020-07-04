package com.p280ss.android.ttve.monitor;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p280ss.android.ttve.monitor.GPUModelDetector.C20468a;
import com.p280ss.android.ttve.monitor.GPUModelDetector.ENvGpuSubModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ttve.monitor.b */
public class C20471b {

    /* renamed from: a */
    public static List<String> f55310a = new ArrayList<String>() {
        {
            add("os_sdk_int");
            add("external_storage");
            add("screen_height");
            add("screen_width");
            add("storage");
            add("memory");
            add("cpu_core");
            add("cpu_freq");
        }
    };

    /* renamed from: b */
    private static boolean f55311b;

    /* renamed from: c */
    private static boolean f55312c;

    /* renamed from: d */
    private static String f55313d;

    /* renamed from: e */
    private static String f55314e;

    /* renamed from: f */
    private static String f55315f;

    /* renamed from: g */
    private static String f55316g;

    /* renamed from: h */
    private static String f55317h;

    /* renamed from: i */
    private static String f55318i;

    /* renamed from: j */
    private static String f55319j;

    /* renamed from: k */
    private static String f55320k;

    /* renamed from: l */
    private static String f55321l;

    /* renamed from: m */
    private static String f55322m;

    /* renamed from: n */
    private static String f55323n;

    /* renamed from: o */
    private static String f55324o;

    /* renamed from: p */
    private static String f55325p;

    /* renamed from: q */
    private static String f55326q;

    /* renamed from: r */
    private static String f55327r;

    /* renamed from: s */
    private static String f55328s;

    /* renamed from: t */
    private static String f55329t;

    /* renamed from: u */
    private static String f55330u;

    /* renamed from: v */
    private static String f55331v;

    /* renamed from: b */
    private static String m67910b() {
        if (VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    sb.append(strArr[i]);
                    if (i != strArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.CPU_ABI);
        sb2.append(",");
        sb2.append(Build.CPU_ABI2);
        return sb2.toString();
    }

    /* renamed from: a */
    public static Map<String, String> m67908a() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("model", f55313d);
        hashMap.put("cpu", f55314e);
        hashMap.put("cpu_freq", f55315f);
        hashMap.put("cpu_core", f55316g);
        hashMap.put("memory", f55317h);
        hashMap.put("storage", f55318i);
        hashMap.put("external_storage", f55319j);
        hashMap.put("screen_width", f55320k);
        hashMap.put("screen_height", f55321l);
        hashMap.put("os_sdk_int", f55322m);
        hashMap.put("appid", f55323n);
        hashMap.put("abi", f55324o);
        hashMap.put("locale", f55325p);
        hashMap.put("sim_operator", f55326q);
        hashMap.put("brand", f55327r);
        if (!f55312c) {
            C20468a b = GPUModelDetector.m67889a().mo55136b();
            ENvGpuSubModel eNvGpuSubModel = b.f55306b;
            int i = b.f55307c;
            if (eNvGpuSubModel == null) {
                str = "";
            } else {
                str = eNvGpuSubModel.name();
            }
            f55328s = str;
            f55329t = String.valueOf(i);
            f55330u = GPUModelDetector.m67893c();
            f55331v = "6.0.0.96";
            f55312c = true;
        }
        hashMap.put("gpu", f55328s);
        hashMap.put("gpu_ver", f55329t);
        hashMap.put("opengl_version", f55330u);
        hashMap.put("ve_version", f55331v);
        return hashMap;
    }

    /* renamed from: a */
    public static void m67909a(Context context) {
        if (!f55311b) {
            synchronized (C20471b.class) {
                if (!f55311b) {
                    m67911b(context.getApplicationContext());
                    f55311b = true;
                }
            }
        }
    }

    /* renamed from: b */
    private static void m67911b(Context context) {
        String str;
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(country)) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("_");
            sb.append(country.toUpperCase());
            str = sb.toString();
        }
        f55313d = Build.MODEL;
        f55314e = C20473c.m67913a();
        f55315f = C20473c.m67917b();
        f55316g = String.valueOf(C20473c.m67918c());
        f55317h = String.valueOf(C20473c.m67920d());
        f55318i = String.valueOf(C20473c.m67922e());
        f55319j = String.valueOf(C20473c.m67912a(context));
        f55322m = String.valueOf(VERSION.SDK_INT);
        f55320k = String.valueOf(C20473c.m67916b(context));
        f55321l = String.valueOf(C20473c.m67919c(context));
        f55323n = context.getPackageName();
        f55324o = m67910b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(language);
        sb2.append(str);
        f55325p = sb2.toString();
        f55326q = C20473c.m67921d(context);
        f55327r = Build.BRAND;
    }
}
