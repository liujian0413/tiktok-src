package com.p280ss.android.downloadlib.p868c;

import android.text.TextUtils;
import com.p280ss.android.downloadlib.activity.TTDelegateActivity;
import com.p280ss.android.downloadlib.addownload.C19491j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.downloadlib.c.e */
public final class C19519e {

    /* renamed from: a */
    private static Map<String, C19520a> f52810a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.ss.android.downloadlib.c.e$a */
    public interface C19520a {
        /* renamed from: a */
        void mo51485a();

        /* renamed from: a */
        void mo51486a(String str);
    }

    /* renamed from: b */
    public static boolean m64291b(String str) {
        return C19491j.m64225f().mo51362a(C19491j.m64206a(), str);
    }

    /* renamed from: a */
    public static void m64287a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C19520a c = m64292c(str);
            if (c != null) {
                c.mo51485a();
            }
        }
    }

    /* renamed from: c */
    private static C19520a m64292c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (C19520a) f52810a.remove(str);
    }

    /* renamed from: a */
    private static void m64288a(String str, C19520a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            f52810a.put(str, aVar);
        }
    }

    /* renamed from: a */
    public static void m64289a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C19520a c = m64292c(str);
            if (c != null) {
                c.mo51486a(str2);
            }
        }
    }

    /* renamed from: a */
    public static void m64290a(String[] strArr, C19520a aVar) {
        if (strArr != null && strArr.length > 0) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            m64288a(valueOf, aVar);
            TTDelegateActivity.m63989a(valueOf, strArr);
        }
    }
}
