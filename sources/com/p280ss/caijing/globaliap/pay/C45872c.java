package com.p280ss.caijing.globaliap.pay;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.caijing.globaliap.pay.c */
public final class C45872c {

    /* renamed from: a */
    private static volatile boolean f117287a;

    /* renamed from: b */
    private static ConcurrentHashMap<String, Bundle> f117288b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ArrayList<String> f117289c;

    /* renamed from: d */
    private static Context f117290d;

    /* renamed from: b */
    public static Context m143951b() {
        return f117290d;
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f117289c = arrayList;
        arrayList.add("GOOGLE_PAY");
    }

    /* renamed from: a */
    public static synchronized String m143946a() {
        synchronized (C45872c.class) {
            if (f117287a) {
                return null;
            }
            f117287a = true;
            String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 15; i++) {
                sb.append(str.charAt(random.nextInt(62)));
            }
            String sb2 = sb.toString();
            f117288b.put(sb2, new Bundle());
            return sb2;
        }
    }

    /* renamed from: a */
    public static boolean m143948a(String str) {
        return f117289c.contains(str);
    }

    /* renamed from: a */
    public static void m143947a(Context context) {
        if (context != null && f117290d == null) {
            f117290d = context.getApplicationContext();
        }
    }

    /* renamed from: b */
    public static synchronized boolean m143953b(String str) {
        synchronized (C45872c.class) {
            if (!TextUtils.isEmpty(str)) {
                f117287a = false;
                if (!f117288b.containsKey(str)) {
                    StringBuilder sb = new StringBuilder("process ");
                    sb.append(str);
                    sb.append(" is not in processing");
                    return false;
                }
                f117288b.remove(str);
                return true;
            }
            throw new IllegalStateException("processId is null");
        }
    }

    /* renamed from: a */
    public static synchronized boolean m143949a(String str, String str2, Bundle bundle) {
        synchronized (C45872c.class) {
            Bundle bundle2 = (Bundle) f117288b.get(str);
            if (bundle2 == null) {
                return false;
            }
            if (bundle != null) {
                bundle2.putBundle(str2, bundle);
            }
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized String m143952b(String str, String str2, String str3) {
        synchronized (C45872c.class) {
            Bundle bundle = (Bundle) f117288b.get(str);
            if (bundle == null) {
                return str3;
            }
            String string = bundle.getString(str2, str3);
            return string;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m143950a(String str, String str2, String str3) {
        synchronized (C45872c.class) {
            Bundle bundle = (Bundle) f117288b.get(str);
            if (bundle == null) {
                return false;
            }
            bundle.putString(str2, str3);
            return true;
        }
    }
}
