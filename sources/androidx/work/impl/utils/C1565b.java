package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.C1642a;

/* renamed from: androidx.work.impl.utils.b */
public final class C1565b {
    /* renamed from: a */
    public static void m7652a(Context context, Class cls, boolean z) {
        String str;
        int i;
        String str2;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            String str3 = "%s %s";
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str2 = "enabled";
            } else {
                str2 = "disabled";
            }
            objArr[1] = str2;
            C1642a.m8034a(str3, objArr);
        } catch (Exception e) {
            String str4 = "%s could not be %s";
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (z) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            objArr2[1] = str;
            C1642a.m8034a(str4, objArr2);
            new Throwable[1][0] = e;
        }
    }
}
