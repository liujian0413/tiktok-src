package com.p280ss.android.p817ad.p818a.p822c;

import android.os.Handler;
import com.p280ss.android.p817ad.p818a.p819a.p820a.C18913a;
import java.util.HashMap;

/* renamed from: com.ss.android.ad.a.c.a */
public final class C18930a {

    /* renamed from: com.ss.android.ad.a.c.a$a */
    public interface C18933a {
        /* renamed from: a */
        void mo50324a(C18913a aVar);
    }

    /* renamed from: a */
    public static void m61793a(String str, HashMap<String, String> hashMap, String str2, int i, C18933a aVar) {
        final Handler handler = new Handler();
        final String str3 = str;
        final HashMap<String, String> hashMap2 = hashMap;
        final String str4 = str2;
        final int i2 = i;
        final C18933a aVar2 = aVar;
        C189311 r0 = new Runnable() {
            public final void run() {
                final C18913a a = C18935c.m61797a(str3, hashMap2, str4, i2);
                handler.post(new Runnable() {
                    public final void run() {
                        aVar2.mo50324a(a);
                    }
                });
            }
        };
        new Thread(r0).start();
    }
}
