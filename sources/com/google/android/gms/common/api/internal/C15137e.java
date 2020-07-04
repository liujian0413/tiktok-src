package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15226ar;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.C15271t;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.google.android.gms.common.api.internal.e */
public final class C15137e {

    /* renamed from: a */
    private static final Object f39180a = new Object();

    /* renamed from: b */
    private static C15137e f39181b;

    /* renamed from: c */
    private final String f39182c;

    /* renamed from: d */
    private final Status f39183d;

    /* renamed from: e */
    private final boolean f39184e;

    /* renamed from: f */
    private final boolean f39185f;

    private C15137e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.aa5));
        boolean z = true;
        if (identifier != 0) {
            if (resources.getInteger(identifier) == 0) {
                z = false;
            }
            this.f39185f = !z;
        } else {
            this.f39185f = false;
        }
        this.f39184e = z;
        String a = C15226ar.m44247a(context);
        if (a == null) {
            a = new C15271t(context).mo38614a("google_app_id");
        }
        if (TextUtils.isEmpty(a)) {
            this.f39183d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f39182c = null;
            return;
        }
        this.f39182c = a;
        this.f39183d = Status.f38867a;
    }

    /* renamed from: a */
    public static Status m44035a(Context context) {
        Status status;
        C15267r.m44385a(context, (Object) "Context must not be null.");
        synchronized (f39180a) {
            if (f39181b == null) {
                f39181b = new C15137e(context);
            }
            status = f39181b.f39183d;
        }
        return status;
    }

    /* renamed from: a */
    public static String m44037a() {
        return m44036a("getGoogleAppId").f39182c;
    }

    /* renamed from: b */
    public static boolean m44038b() {
        return m44036a("isMeasurementExplicitlyDisabled").f39185f;
    }

    /* renamed from: a */
    private static C15137e m44036a(String str) {
        C15137e eVar;
        synchronized (f39180a) {
            if (f39181b != null) {
                eVar = f39181b;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                throw new IllegalStateException(sb.toString());
            }
        }
        return eVar;
    }
}
