package com.bytedance.frameworks.baselib.p511a;

import android.content.Context;
import java.io.UnsupportedEncodingException;

/* renamed from: com.bytedance.frameworks.baselib.a.d */
public final class C10076d {

    /* renamed from: a */
    private static C10078b f27418a = new C10077a();

    /* renamed from: b */
    private static boolean f27419b;

    /* renamed from: com.bytedance.frameworks.baselib.a.d$a */
    public static class C10077a implements C10078b {
        /* renamed from: a */
        public final boolean mo15063a(Context context) {
            return false;
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.a.d$b */
    public interface C10078b {
        /* renamed from: a */
        boolean mo15063a(Context context);
    }

    /* renamed from: a */
    static boolean m29938a(Context context) {
        return f27418a.mo15063a(context);
    }

    /* renamed from: a */
    public static void m29937a(C10078b bVar) {
        if (!f27419b) {
            f27418a = bVar;
            f27419b = true;
        }
    }

    /* renamed from: a */
    public static byte[] m29939a(String str) {
        byte[] bArr;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    bArr = str.getBytes("UTF-8");
                    return bArr;
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        bArr = null;
        return bArr;
    }
}
