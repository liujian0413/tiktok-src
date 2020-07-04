package com.p280ss.android.pushmanager.app;

import android.content.Context;
import com.p280ss.android.pushmanager.C20071d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.app.c */
public final class C20044c {

    /* renamed from: a */
    private static C20045a f54238a;

    /* renamed from: b */
    private static C20046b f54239b;

    /* renamed from: com.ss.android.pushmanager.app.c$a */
    public interface C20045a {
        /* renamed from: a */
        void mo53663a(Context context);
    }

    /* renamed from: com.ss.android.pushmanager.app.c$b */
    public interface C20046b {
        /* renamed from: a */
        C20071d mo53664a();

        /* renamed from: a */
        void mo53665a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

        /* renamed from: b */
        Class mo53666b();

        /* renamed from: c */
        String mo53667c();

        /* renamed from: d */
        String mo53668d();

        /* renamed from: e */
        String mo53669e();

        /* renamed from: f */
        String mo53670f();

        /* renamed from: g */
        boolean mo53671g();

        /* renamed from: h */
        Map<String, String> mo53672h();
    }

    /* renamed from: a */
    public static C20045a m66004a() {
        return f54238a;
    }

    /* renamed from: b */
    public static C20046b m66007b() {
        return f54239b;
    }

    /* renamed from: a */
    public static void m66005a(C20045a aVar) {
        f54238a = aVar;
    }

    /* renamed from: a */
    public static void m66006a(C20046b bVar) {
        f54239b = bVar;
    }
}
