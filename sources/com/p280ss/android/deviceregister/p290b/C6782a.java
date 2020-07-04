package com.p280ss.android.deviceregister.p290b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.bytedance.common.utility.C6319n;

/* renamed from: com.ss.android.deviceregister.b.a */
public final class C6782a {

    /* renamed from: a */
    public static boolean f19321a = false;

    /* renamed from: b */
    private static String[] f19322b = null;

    /* renamed from: c */
    private static String[] f19323c = null;

    /* renamed from: d */
    private static C6783a f19324d = null;

    /* renamed from: e */
    private static String f19325e = "ib.snssdk.com";

    /* renamed from: f */
    private static boolean f19326f;

    /* renamed from: com.ss.android.deviceregister.b.a$a */
    public interface C6783a {
        boolean getEncryptSwitch();
    }

    /* renamed from: c */
    public static boolean m21000c() {
        return f19321a;
    }

    /* renamed from: d */
    public static boolean m21001d() {
        return f19326f;
    }

    /* renamed from: e */
    public static boolean m21002e() {
        if (f19324d != null) {
            return f19324d.getEncryptSwitch();
        }
        return true;
    }

    /* renamed from: a */
    public static String[] m20996a() {
        if (f19322b != null && f19322b.length > 0 && !C6319n.m19593a(f19322b[0])) {
            return f19322b;
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(f19325e);
        sb.append("/service/2/device_register/");
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(f19325e);
        sb2.append("/service/2/device_register/");
        return new String[]{sb.toString(), sb2.toString()};
    }

    /* renamed from: b */
    public static String[] m20999b() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(f19325e);
        sb.append("/service/2/device_sdk/stats_collect/");
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(f19325e);
        sb2.append("/service/2/device_sdk/stats_collect/");
        String[] strArr = {sb.toString(), sb2.toString()};
        if (f19323c != null && f19323c.length > 0) {
            strArr = new String[f19323c.length];
            for (int i = 0; i < f19323c.length; i++) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f19323c[i]);
                sb3.append("/service/2/device_sdk/stats_collect/");
                strArr[i] = sb3.toString();
            }
        }
        return strArr;
    }

    /* renamed from: a */
    public static void m20993a(C6783a aVar) {
        f19324d = aVar;
    }

    /* renamed from: b */
    public static void m20997b(boolean z) {
        f19326f = z;
    }

    /* renamed from: a */
    public static void m20994a(boolean z) {
        f19321a = z;
    }

    /* renamed from: a */
    public static void m20995a(String[] strArr) {
        if (strArr != null && strArr.length > 0 && !C6319n.m19593a(strArr[0])) {
            f19322b = strArr;
            m20998b(strArr);
        }
    }

    /* renamed from: b */
    private static void m20998b(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (URLUtil.isNetworkUrl(str)) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String authority = parse.getAuthority();
                StringBuilder sb = new StringBuilder();
                sb.append(scheme);
                sb.append("://");
                sb.append(authority);
                String sb2 = sb.toString();
                if (URLUtil.isNetworkUrl(sb2)) {
                    int i2 = i + 1;
                    strArr2[i] = sb2;
                    i = i2;
                }
            }
        }
        if (i > 0) {
            String[] strArr3 = new String[i];
            System.arraycopy(strArr2, 0, strArr3, 0, i);
            f19323c = strArr3;
            return;
        }
        f19323c = null;
    }
}
