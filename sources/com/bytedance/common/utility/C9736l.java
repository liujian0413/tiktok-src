package com.bytedance.common.utility;

import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import java.io.File;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.utility.l */
public final class C9736l {
    /* renamed from: a */
    public static byte[] m28686a(String str) {
        try {
            Signature[] b = m28687b(str);
            if (b == null) {
                return null;
            }
            return b[0].toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Signature[] m28687b(String str) {
        Object obj;
        Object obj2;
        try {
            Class cls = Class.forName("android.content.pm.PackageParser");
            Class[] clsArr = {String.class};
            Object[] objArr = {str};
            if (VERSION.SDK_INT > 19) {
                obj = cls.newInstance();
            } else {
                obj = cls.getConstructor(clsArr).newInstance(objArr);
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayMetrics.setToDefaults();
            if (VERSION.SDK_INT > 19) {
                Method declaredMethod = cls.getDeclaredMethod("parsePackage", new Class[]{File.class, Integer.TYPE});
                declaredMethod.setAccessible(true);
                obj2 = declaredMethod.invoke(obj, new Object[]{new File(str), Integer.valueOf(64)});
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod("parsePackage", new Class[]{File.class, String.class, DisplayMetrics.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                obj2 = declaredMethod2.invoke(obj, new Object[]{new File(str), str, displayMetrics, Integer.valueOf(64)});
            }
            cls.getDeclaredMethod("collectCertificates", new Class[]{obj2.getClass(), Integer.TYPE}).invoke(obj, new Object[]{obj2, Integer.valueOf(64)});
            return (Signature[]) obj2.getClass().getDeclaredField("mSignatures").get(obj2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
