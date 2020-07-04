package com.p280ss.android.ugc.aweme.p1048ax;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import p001a.p002a.p003a.p004a.C0001a;

/* renamed from: com.ss.android.ugc.aweme.ax.a */
public final class C23139a {

    /* renamed from: a */
    static final C23140a f61070a;

    /* renamed from: com.ss.android.ugc.aweme.ax.a$a */
    static class C23140a {
        C23140a() {
        }

        /* renamed from: a */
        public String mo60284a(Context context) {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/DCIM/Camera/");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a$b */
    static class C23141b extends C23140a {
        C23141b() {
        }

        /* renamed from: a */
        public final String mo60284a(Context context) {
            if (C0001a.m1a()) {
                return super.mo60284a(context);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/相机/");
            return sb.toString();
        }
    }

    static {
        if ("VIVO".equals(Build.BRAND.toUpperCase())) {
            f61070a = new C23141b();
        } else {
            f61070a = new C23140a();
        }
    }

    /* renamed from: a */
    public static String m76055a(Context context) {
        return f61070a.mo60284a(context);
    }
}
