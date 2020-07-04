package com.p280ss.android.ugc.aweme.image;

import android.util.Log;
import com.facebook.common.p686c.C13288c;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.d */
public final class C32034d implements C13288c {

    /* renamed from: b */
    private static final C32034d f83797b = new C32034d();

    /* renamed from: a */
    public String f83798a = "unknown";

    /* renamed from: c */
    private int f83799c = 5;

    /* renamed from: a */
    public static C32034d m104015a() {
        return f83797b;
    }

    private C32034d() {
    }

    /* renamed from: a */
    public final void mo32539a(int i) {
        this.f83799c = i;
    }

    /* renamed from: b */
    public final boolean mo32544b(int i) {
        if (this.f83799c <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m104020b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            C6497a.m20180a(th, printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    /* renamed from: a */
    private static boolean m104018a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m104019a(Throwable th) {
        if (th == null || th.getMessage() == null || th.getMessage().length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo32542b(String str, String str2) {
        m104016a(3, str, str2);
    }

    /* renamed from: c */
    public final void mo32545c(String str, String str2) {
        m104016a(4, str, str2);
    }

    /* renamed from: d */
    public final void mo32547d(String str, String str2) {
        m104016a(5, str, str2);
    }

    /* renamed from: f */
    public final void mo32550f(String str, String str2) {
        m104016a(6, str, str2);
    }

    /* renamed from: e */
    public final void mo32549e(String str, String str2) {
        if (str2 != null && str2.contains("init FrescoTTNetFetcher")) {
            if (!C7163a.m22363a()) {
                StringBuilder sb = new StringBuilder("init FrescoTTNetFetcher ");
                sb.append(Log.getStackTraceString(new Throwable()));
                C6921a.m21555a(sb.toString());
            } else {
                throw new RuntimeException("Fresco 被错误初始化, 请联系@liujian.android");
            }
        }
        if (str2 != null && str2.contains("Fresco has already been initialized!")) {
            StringBuilder sb2 = new StringBuilder("Fresco has already been initialized! ");
            sb2.append(Log.getStackTraceString(new Throwable()));
            C6921a.m21555a(sb2.toString());
        }
        m104016a(6, str, str2);
    }

    /* renamed from: a */
    public final void mo32540a(String str, String str2) {
        m104016a(2, str, str2);
    }

    /* renamed from: a */
    private static void m104016a(int i, String str, String str2) {
        if (!m104018a((CharSequence) str)) {
            m104018a((CharSequence) str2);
        }
    }

    /* renamed from: d */
    public final void mo32548d(String str, String str2, Throwable th) {
        m104017a(6, str, str2, th);
    }

    /* renamed from: c */
    public final void mo32546c(String str, String str2, Throwable th) {
        m104017a(6, str, str2, th);
        if (str2 != null && str2.contains("Malformed escape pair")) {
            StringBuilder sb = new StringBuilder("ImageEncryptUtils failed:");
            sb.append(str2);
            C6921a.m21555a(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo32543b(String str, String str2, Throwable th) {
        m104017a(5, str, str2, th);
        if (th instanceof IllegalStateException) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!m104018a((CharSequence) str2)) {
                    jSONObject.put("errorField", str2);
                }
                jSONObject.put("errorDesc", m104020b(th));
                jSONObject.put("status", 1);
                C6893q.m21447a("aweme_image_error_log", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo32541a(String str, String str2, Throwable th) {
        m104017a(3, str, str2, th);
    }

    /* renamed from: a */
    private static void m104017a(int i, String str, String str2, Throwable th) {
        if (!m104018a((CharSequence) str) && !m104018a((CharSequence) str2)) {
            m104019a(th);
        }
    }
}
