package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.i */
public final class C15326i {

    /* renamed from: a */
    private static Boolean f39596a;

    /* renamed from: b */
    private static Boolean f39597b;

    /* renamed from: c */
    private static Boolean f39598c;

    /* renamed from: d */
    private static Boolean f39599d;

    /* renamed from: a */
    public static boolean m44579a(Context context) {
        if (f39596a == null) {
            f39596a = Boolean.valueOf(C15333p.m44599f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f39596a.booleanValue();
    }

    /* renamed from: b */
    public static boolean m44580b(Context context) {
        return m44579a(context) && (!C15333p.m44602i() || (m44581c(context) && !C15333p.m44603j()));
    }

    /* renamed from: c */
    public static boolean m44581c(Context context) {
        if (f39597b == null) {
            f39597b = Boolean.valueOf(C15333p.m44600g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f39597b.booleanValue();
    }

    /* renamed from: d */
    public static boolean m44582d(Context context) {
        if (f39598c == null) {
            PackageManager packageManager = context.getPackageManager();
            f39598c = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f39598c.booleanValue();
    }

    /* renamed from: e */
    public static boolean m44583e(Context context) {
        if (f39599d == null) {
            f39599d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f39599d.booleanValue();
    }

    /* renamed from: a */
    public static boolean m44578a() {
        return "user".equals(Build.TYPE);
    }
}
